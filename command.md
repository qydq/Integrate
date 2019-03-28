window   


msconfig修改系统引导

### adb命令

说明：一下两种情况是一样的

adb shell rm -rf /data/app/com.huawei.recsys/base.apk

adb shell

rm -rf /data/app/com.huawei.recsys/base.apk



1.命令窗口快捷打开windows+R

2.查看是否连接手机

>adb devices

2.将设备改为可读可写

>adb remount 

显示remount succeeded就代表命令执行成功；

3.进入指定的device的shell

>adb shell

或者

adb -s ********* shell

4.查看当前目录命令

>pwd 

5.adb 查看所有安装的包

>pm list packages

6.根据某个关键字查找包

>pm list packages | grep tencent

7.查看包安装位置

>pm list packages -f
>pm list packages -f | grep tencent
>adb shell pm list packages -f | grep tencent

8.adb push

(1).把E盘folder文件夹 拷贝到设备sdcard目录xfolder下（xfolder为新建

>adb push E:\sunst\folder /sdcard/xfolder

Tips：folder中的文件love.txt也放进去在xfolder目录

(2).将folder下的文件夹拷贝到机器sunst文件夹中

>adb push E:\sunst\folder\. /sdcard/sunst

(3).将folder整个文件拷贝到sunst文件夹中

>adb push E:\sunst\. /sdcard/sunst

(4).将文件love.txt拷贝到sunst文件夹中并重新命名为newlovet.txt

>adb push E:\sunst\test.txt sdcard/sunst/copytest.txt

9.adb pull

adb pull sdcard/sunst/copytest.txt E:/sunst/
adb pull sdcard/sunst/copytest.txt E:\sunst\xixi.txt 并重命名

adb pull /data/app/com.tencent.tbs-1/base.apk ~ 直接把设备文件拷贝到根目录

adb pull sdcard\sunst\copytest.txt（错误写法)

备注：不管是pull还是push对device来说，目录路径使用反斜杠


10.adb命令查询apk是否在运行

linux下：adb shell ps | grep [apk包名]
windows下：adb shell ps | findstr [apk包名]

执行命令后如果有显示你搜索的apk包名，那说明正在运行，否则就是没有运行

11.当前目录下查找文件

（1）查找文件中带有should_search_name字段
>find . -name "*.java" | xargs grep -ir "should_search_name"

（2）查找文件

>find . -name "sunst"

>find . -name "*un*"#使用通配符

说明:find命令用于查找文件，后面的“."代表当前目录，-name是find命令的参数，后面接要搜索的文件名。

12.adb查看当前栈顶Activity

>adb shell dumpsys activity | grep "Run"


