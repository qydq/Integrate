## 65. Android中常见的4种线程池
使用线程池能够给我们带来很多好处：

>1.通过线程池中线程的重用，减少创建和销毁线程的性能开销。
>2.能够控制线程池中的并发数，否则会因为大量的线程争夺CPU资源造成阻塞。
>3.线程池能够对线程进行管理，比如使用ScheduledThreadPool来设置N秒后执行任务，并且M毫秒循环执行一次。

Executor作为一个接口，它的具体实现就是ThreadPoolExecutor，android中的线程池都是直接或间接通过配置ThreadPoolExecutor来实现不同特性的线程池，下面看一下ThreadPoolExector的构造方法
```
public ThreadPoolExecutor(
//核心线程数，除非allowCoreThreadTimeOut被设置为true，否则它闲着也不会死
int corePoolSize,
//最大线程数，活动线程数量超过它，后续任务就会排队
int maximumPoolSize,
//超时时长，作用于非核心线程（allowCoreThreadTimeOut被设置为true时也会同时作用于核心线程），闲置超时便被回收
long keepAliveTime,
//枚举类型，设置keepAliveTime的单位，有TimeUnit.MILLISECONDS(ms)、TimeUnit.SECONDS(ms)==
TimeUnit unit,
//缓冲任务队列，线程池的execute方法会将Runnable对象存储起来
BlockingQueue<Runnable> workQueue,
//线程工厂接口，只有一个new Thread(Runnable r)方法，可以为线程池创建新线程
ThreadFactory threadFactory
) 
```
分析一下ThreadPoolExecutor执行任务时的过程是怎么样的，currentSize表示线程池中当前线程数量
1.如果currentSize<corePoolSize，直接启动一个核心线程并执行任务
2.如果currentSize>=corePoolSize，并且workQueue未满时，添加进来的任务会被安排到workQueue中等待执行
3.workQueue已满，但是currentSize<maxmumPoolSize会立即开启一个非核心线程来执行任务
4.当currentSize>corePoolSize，workQueue已满，currentSize>maximumPoolSize时，调用Handler默认抛出RejectExecutionException异常

ThreadPoolExecutor是线程池的真正实现者，由此引出android中的4类具有不同特征的线程池，分别是：
>FixThreadPool  
>SingleThreadExecutor  
>CacheThreadPool  
>ScheduleThreadPool

###FixThreadPool
FixThreadPool只有核心线程，并且数量固定，也不会被回收，所有线程都活动时，因为队列没有大小限制，新任务会等待执行。由于线程不会被回收，FixThreadPool会很快响应外界请求
具体使用：
```
public static ExecutorService newFixThreadPool(int nThreads){
	return new ThreadPoolExecutor(nThreads,nThreads,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
}
Executor.newFixThreadPool(5).execute(r);
```
###SingleThreadPool
SingleThreadPool只有一个核心线程，确保所任务都在同一线程按顺序完成，因此不需要处理线程同步的问题
具体使用：
```
public static ExecutorService newSingleThreadPool (int nThreads){
	return new FinalizableDelegatedExecutorService ( new ThreadPoolExecutor (1, 1, 0, TimeUnit. MILLISECONDS, new LinkedBlockingQueue<Runnable>()) );
}
Executors.newSingleThreadPool().execute(r);
```
###CachedThreadPool
CachedThreadPool只有非核心线程，最大线程数非常大，所有线程都活动时，会为新任务创建新线程，否则利用空闲线程处理任务。

Tips:

60s空闲时间，过了就会被回收，所以线程池中有0个线程的可能
```
public static ExecutorService newCachedThreadPool(int nThreads){
	return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit. SECONDS, new SynchronousQueue<Runnable>());
}
Executors.newCachedThreadPool().execute(r);
```
Tips:

任务队列SynchronousQueue相当于一个空集合，导致任何任务都会被立即执行
比较适合执行大量的耗时较少的任务

###ScheduledThreadPool
4个里面唯一一个有延迟执行和周期重复执行的线程池
```
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize){
return new ScheduledThreadPoolExecutor(corePoolSize);
}
public ScheduledThreadPoolExecutor(int corePoolSize){
	super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedQueue ());
}
```
//具体使用，延迟1秒执行，每隔2秒执行一次Runnable r

Executors.newScheduledThreadPool (5).scheduleAtFixedRate(r, 1000, 2000, TimeUnit.MILLISECONDS);

核心线程数固定，非核心线程（闲着没活干会被立即回收）数没有限制。
从上面代码也可以看出，ScheduledThreadPool主要用于执行定时任务以及有固定周期的重复任务


## 66. NFC简单总结
NFC（Near Field Communication，近场通信）是一种数据传输技术。与Wi-Fi、蓝牙、红外线等数据传输技术的一个主要差异就是有效距离一般不能超过4厘米。但是NFC传输速度要比红外快。
华为钱包NFC是内置于芯片里面的，可以通过NFC刷手机、完成坐公交，地铁，结账等点对点付款的场景。其它比如身份识别、门钥匙==，这里面就涉及到NFC通信技术##
### NFC的工作模式
NFC支持如下3种工作模式：读卡器模式（Reader/writer mode）、仿真卡模式(Card Emulation Mode)、点对点模式（P2P mode）。

（1）读卡器模式
数据在NFC芯片中，可以简单理解成“刷标签”。本质上就是通过支持NFC的手机或其它电子设备从带有NFC芯片的标签、贴纸、名片等媒介中读写信息。通常NFC标签是不需要外部供电的。当支持NFC的外设向NFC读写数据时，它会发送某种磁场，而这个磁场会自动的向NFC标签供电。

（2）仿真卡模式
数据在支持NFC的手机或其它电子设备中，可以简单理解成“刷手机”。本质上就是将支持NFC的手机或其它电子设备当成借记卡、公交卡、门禁卡等IC卡使用。基本原理是将相应IC卡中的信息凭证封装成数据包存储在支持NFC的外设中 。
在使用时还需要一个NFC射频器（相当于刷卡器）。将手机靠近NFC射频器，手机就会接收到NFC射频器发过来的信号，在通过一系列复杂的验证后，将IC卡的相应信息传入NFC射频器，最后这些IC卡数据会传入NFC射频器连接的电脑，并进行相应的处理（如电子转帐、开门等操作）。

（3）点对点模式
该模式与蓝牙、红外差不多，用于不同NFC设备之间进行数据交换，不过这个模式已经没有有“刷”的感觉了。其有效距离一般不能超过4厘米，但传输建立速度要比红外和蓝牙技术快很多，传输速度比红外块得多，如过双方都使用Android4.2，NFC会直接利用蓝牙传输。这种技术被称为Android Beam。所以使用Android Beam传输数据的两部设备不再限于4厘米之内。
点对点模式的典型应用是两部支持NFC的手机或平板电脑实现数据的点对点传输，例如，交换图片或同步设备联系人。因此，通过NFC，多个设备如数字相机，计算机，手机之间，都可以快速连接，并交换资料或者服务。


差异性对比图：
|对比项	| NFC	| 蓝牙	|  红外 |
|--------------|----------------------------|------------------------|----------------------| 
|网络类型	|点对点	|单点对多点	|点对点|
|有效距离	|<=0.1m	|<=10m，最新的蓝牙4.0有效距离可达100m	|一般在1m以内，热技术连接，不稳定|
|传输速度	|最大424kbps	最大24Mbps	|慢速115.2kbps，|快速4Mbps|
|建立时间	|<0.1s	|6s	|0.5s|
|安全性	|安全，硬件实现	|安全，软件实现	|不安全，使用IRFM时除外|
|通信模式	|主动-主动/被动	|主动-主动	|主动-主动|
|成本	|低|	中	|低|

Android对NFC的支持
不同的NFC标签之间差异很大，有的只支持简单的读写操作，有时还会采用支持一次性写入的芯片，将NFC标签设计成只读的。当然，也存在一些复杂的NFC标签，例如，有一些NFC标签可以通过硬件加密的方式限制对某一区域的访问。还有一些标签自带操作环境，允许NFC设备与这些标签进行更复杂的交互。这些标签中的数据也会采用不同的格式。但Android SDK API主要支持NFC论坛标准（Forum Standard），这种标准被称为NDEF（NFC Data Exchange Format，NFC数据交换格式）。
（1）NDEF数据的操作
Android SDK API支持如下3种NDEF数据的操作：

1）从NFC标签读取NDEF格式的数据。
2）向NFC标签写入NDEF格式的数据。
3）通过Android Beam技术将NDEF数据发送到另一部NFC设备。

用于描述NDEF格式数据的两个类：

1）NdefMessage：描述NDEF格式的信息，实际上我们写入NFC标签的就是NdefMessage对象。
2）NdefRecord：描述NDEF信息的一个信息段，一个NdefMessage可能包含一个或者多个NdefRecord。

NdefMessage和NdefRecord是Android NFC技术的核心类，无论读写NDEF格式的NFC标签，还是通过Android Beam技术传递Ndef格式的数据，都需要这两个类。
（2）非NDEF数据的操作
对于某些特殊需求，可能要存任意的数据，对于这些数据，我们就需要自定义格式。这些数据格式实际上就是普通的字节流，至于字节流中的数据代表什么，就由开发人员自己定义了。
（3）编写NFC程序的基本步骤

Step 1: 设置权限，限制Android版本、安装的设备
<uses-sdk android:minSdkVersion="14"/>
<user-permission android:name="android.permission.NFC"/>
<uses-feature android:name="android.hardware.nfc" android:required="true"/>
Step 2:定义可接收Tag的Activity

Activity清单需要配置一下launchMode属性：
<activity
    android:name=".TagTextActivity"
    android:launchMode="singleTop"/>
```
/**
 * 1.子类需要在onCreate方法中做Activity初始化。
 * 2.子类需要在onNewIntent方法中进行NFC标签相关操作。
 *   当launchMode设置为singleTop时，第一次运行调用onCreate方法，
 *   第二次运行将不会创建新的Activity实例，将调用onNewIntent方法
 *   所以我们获取intent传递过来的Tag数据操作放在onNewIntent方法中执行
 *   如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的onNewIntent())
 *   只要NFC标签靠近就执行
 */
public class BaseNfcActivity extends AppCompatActivity {
    private NfcAdapter mNfcAdapter;
    private PendingIntent mPendingIntent;
    /**
     * 启动Activity，界面可见时
     */
    @Override
    protected void onStart() {
        super.onStart();
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        //一旦截获NFC消息，就会通过PendingIntent调用窗口
        mPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, getClass()), 0);
    }
    /**
     * 获得焦点，按钮可以点击
     */
    @Override
    public void onResume() {
        super.onResume();
        //设置处理优于所有其他NFC的处理
        if (mNfcAdapter != null)
            mNfcAdapter.enableForegroundDispatch(this, mPendingIntent, null, null);
    }
    /**
     * 暂停Activity，界面获取焦点，按钮可以点击
     */
    @Override
    public void onPause() {
        super.onPause();
        //恢复默认状态
        if (mNfcAdapter != null)
            mNfcAdapter.disableForegroundDispatch(this);
    }
}
```

注意：通常来说，所有处理NFC的Activity都要设置launchMode属性为singleTop或者singleTask，保证了无论NFC标签靠近手机多少次，Activity实例只有一个。


向NFC标签写入数据一般分为三步：

1）获取Tag对象
```
Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
```
2）判断NFC标签的数据类型（通过Ndef.get方法）
```
Ndef ndef = Ndef.get(tag);```
3）写入数据
```
ndef.writeNdefMessage(ndefMessage);
```
完整代码
```
public class RunAppActivity extends BaseNfcActivity{
    private String mPackageName = "com.android.mms";//短信
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onNewIntent(Intent intent) {
        if (mPackageName == null)
            return;
        //1.获取Tag对象
        Tag detectedTag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
        writeNFCTag(detectedTag);
    }
    /**
     * 往标签写数据的方法
     *
     * @param tag
     */
    public void writeNFCTag(Tag tag) {
        if (tag == null) {
            return;
        }
        NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{NdefRecord
                .createApplicationRecord(mPackageName)});
        //转换成字节获得大小
        int size = ndefMessage.toByteArray().length;
        try {
            //2.判断NFC标签的数据类型（通过Ndef.get方法）
            Ndef ndef = Ndef.get(tag);
            //判断是否为NDEF标签
            if (ndef != null) {
                ndef.connect();
                //判断是否支持可写
                if (!ndef.isWritable()) {
                    return;
                }
                //判断标签的容量是否够用
                if (ndef.getMaxSize() < size) {
                    return;
                }
                //3.写入数据
                ndef.writeNdefMessage(ndefMessage);
                Toast.makeText(this, "写入成功", Toast.LENGTH_SHORT).show();
            } else { //当我们买回来的NFC标签是没有格式化的，或者没有分区的执行此步
                //Ndef格式类
                NdefFormatable format = NdefFormatable.get(tag);
                //判断是否获得了NdefFormatable对象，有一些标签是只读的或者不允许格式化的
                if (format != null) {
                    //连接
                    format.connect();
                    //格式化并将信息写入标签
                    format.format(ndefMessage);
                    Toast.makeText(this, "写入成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "写入失败", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e) {
        }
    }
}
```
NFC标签贴近手机背面，自动写入数据，此时退出所有程序，返回桌面，然后再将NFC标签贴近手机背面，将会看到自动打开了“短信”。
----------------------

NFC标签让Android自动打开网页

首先我们创建一个NdefRecord，Android已经为我们提供好了这样的方法：
```
//直接接受一个Uri
public NdefRecord createUri(String uriString); 
//接受一个Uri的对象
public NdefRecord createUri(Uri uri);  
```
实现代码对比上面-利用NFC标签让Android自动运行程序-只是修改了writeNFCTag方法中
```
NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{NdefRecord
        .createApplicationRecord(mPackageName)});
```
修改为：
```
NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{NdefRecord
        .createUri(Uri.parse("http://www.baidu.com"))});
```

上面这个功能还是比较有用的，例如我们往某些商品上贴上NFC标签，里面写入该商品的详细介绍网页Uri，当用户贴近商品时，就会自动打开该商品的详情介绍。

如果想要了解NFC标签的数据格式内容，大家可以关注我的知乎主页： https://zhihu.com/people/qydq

找到：NDEF文本格式深度解析（未完成）