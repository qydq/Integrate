#### (8).adb push
* 把E盘folder文件夹 拷贝到设备sdcard目录xfolder下（xfolder为新建
>adb push E:\sunst\folder /sdcard/xfolder

Tips：folder中的文件love.txt也放进去在xfolder目录

* 将folder下的文件夹拷贝到机器sunst文件夹中
>adb push E:\sunst\folder\. /sdcard/sunst

* 将folder整个文件拷贝到sunst文件夹中
>adb push E:\sunst\. /sdcard/sunst

* 将文件love.txt拷贝到sunst文件夹中并重新命名为newlovet.txt
>adb push E:\sunst\test.txt sdcard/sunst/copytest.txt