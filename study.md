<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://zhihu.com/people/qydq)*

- [让人眼前一亮的Android面试题集锦（持续更新） !](#%E8%AE%A9%E4%BA%BA%E7%9C%BC%E5%89%8D%E4%B8%80%E4%BA%AE%E7%9A%84android%E9%9D%A2%E8%AF%95%E9%A2%98%E9%9B%86%E9%94%A6%E6%8C%81%E7%BB%AD%E6%9B%B4%E6%96%B0-)
- [android面试宝典1：技术篇↘](#android%E9%9D%A2%E8%AF%95%E5%AE%9D%E5%85%B81%E6%8A%80%E6%9C%AF%E7%AF%87%E2%86%98)
  - [* 一：大厂经典问题（必须掌握）](#-%E4%B8%80%E5%A4%A7%E5%8E%82%E7%BB%8F%E5%85%B8%E9%97%AE%E9%A2%98%E5%BF%85%E9%A1%BB%E6%8E%8C%E6%8F%A1)
  - [* 二：基础专业技能（java，android基础知识）](#-%E4%BA%8C%E5%9F%BA%E7%A1%80%E4%B8%93%E4%B8%9A%E6%8A%80%E8%83%BDjavaandroid%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86)
  - [* 三：android进阶（含源码分析）](#-%E4%B8%89android%E8%BF%9B%E9%98%B6%E5%90%AB%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90)
  - [* 四：手写代码（如算法类）](#-%E5%9B%9B%E6%89%8B%E5%86%99%E4%BB%A3%E7%A0%81%E5%A6%82%E7%AE%97%E6%B3%95%E7%B1%BB)
  - [* 五：项目经验（项目介绍，技术点rxJava，retrofit，rxbinding，databinding，性能优化，加载大图，以及一些最新的技术）](#-%E4%BA%94%E9%A1%B9%E7%9B%AE%E7%BB%8F%E9%AA%8C%E9%A1%B9%E7%9B%AE%E4%BB%8B%E7%BB%8D%E6%8A%80%E6%9C%AF%E7%82%B9rxjavaretrofitrxbindingdatabinding%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96%E5%8A%A0%E8%BD%BD%E5%A4%A7%E5%9B%BE%E4%BB%A5%E5%8F%8A%E4%B8%80%E4%BA%9B%E6%9C%80%E6%96%B0%E7%9A%84%E6%8A%80%E6%9C%AF)
- [一：大厂经典问题（必须掌握）](#%E4%B8%80%E5%A4%A7%E5%8E%82%E7%BB%8F%E5%85%B8%E9%97%AE%E9%A2%98%E5%BF%85%E9%A1%BB%E6%8E%8C%E6%8F%A1)
  - [必须掌握的经典问题](#%E5%BF%85%E9%A1%BB%E6%8E%8C%E6%8F%A1%E7%9A%84%E7%BB%8F%E5%85%B8%E9%97%AE%E9%A2%98)
  - [对比联系知识点](#%E5%AF%B9%E6%AF%94%E8%81%94%E7%B3%BB%E7%9F%A5%E8%AF%86%E7%82%B9)
  - [腾讯SNG（一二面）](#%E8%85%BE%E8%AE%AFsng%E4%B8%80%E4%BA%8C%E9%9D%A2)
  - [今日头条(一面)](#%E4%BB%8A%E6%97%A5%E5%A4%B4%E6%9D%A1%E4%B8%80%E9%9D%A2)
  - [小米（一二面）](#%E5%B0%8F%E7%B1%B3%E4%B8%80%E4%BA%8C%E9%9D%A2)
  - [阿里​](#%E9%98%BF%E9%87%8C%E2%80%8B)
- [二：基础专业技能（java，android基础知识）](#%E4%BA%8C%E5%9F%BA%E7%A1%80%E4%B8%93%E4%B8%9A%E6%8A%80%E8%83%BDjavaandroid%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86)
  - [1. Android介绍](#1-android%E4%BB%8B%E7%BB%8D)
  - [2. Android系统架构](#2-android%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84)
    - [(1). 系统应用层](#1-%E7%B3%BB%E7%BB%9F%E5%BA%94%E7%94%A8%E5%B1%82)
    - [(2). Java API 框架层](#2-java-api-%E6%A1%86%E6%9E%B6%E5%B1%82)
    - [(3). Android系统运行层](#3-android%E7%B3%BB%E7%BB%9F%E8%BF%90%E8%A1%8C%E5%B1%82)
    - [(4). 硬件抽象层（Hardware Abstraction Layer）](#4-%E7%A1%AC%E4%BB%B6%E6%8A%BD%E8%B1%A1%E5%B1%82hardware-abstraction-layer)
    - [(5). Linux内核层](#5-linux%E5%86%85%E6%A0%B8%E5%B1%82)
  - [3. Android的Context](#3-android%E7%9A%84context)
  - [4. Java基础知识面试（数据类型）](#4-java%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86%E9%9D%A2%E8%AF%95%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)
  - [5. 设计模式（单例，工厂，观察者。作用，使用场景）](#5-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E5%8D%95%E4%BE%8B%E5%B7%A5%E5%8E%82%E8%A7%82%E5%AF%9F%E8%80%85%E4%BD%9C%E7%94%A8%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF)
  - [6. 常用的Java设计模式，（手写单列设计模式，饿汉式，懒汉式区别，）线程安全，validate关键字的作用](#6-%E5%B8%B8%E7%94%A8%E7%9A%84java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E6%89%8B%E5%86%99%E5%8D%95%E5%88%97%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E9%A5%BF%E6%B1%89%E5%BC%8F%E6%87%92%E6%B1%89%E5%BC%8F%E5%8C%BA%E5%88%AB%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8validate%E5%85%B3%E9%94%AE%E5%AD%97%E7%9A%84%E4%BD%9C%E7%94%A8)
  - [7. java中的左移，右移位运算](#7-java%E4%B8%AD%E7%9A%84%E5%B7%A6%E7%A7%BB%E5%8F%B3%E7%A7%BB%E4%BD%8D%E8%BF%90%E7%AE%97)
  - [8.面试题——常见5种运行时异常](#8%E9%9D%A2%E8%AF%95%E9%A2%98%E5%B8%B8%E8%A7%815%E7%A7%8D%E8%BF%90%E8%A1%8C%E6%97%B6%E5%BC%82%E5%B8%B8)
  - [9. Android的四大组件是哪些，它们的作用](#9-android%E7%9A%84%E5%9B%9B%E5%A4%A7%E7%BB%84%E4%BB%B6%E6%98%AF%E5%93%AA%E4%BA%9B%E5%AE%83%E4%BB%AC%E7%9A%84%E4%BD%9C%E7%94%A8)
  - [10. Activity的生命周期](#10-activity%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F)
  - [11. 如果后台的Activity由于某原因被系统回收了，如何在被系统回收之前保存当前状态？](#11-%E5%A6%82%E6%9E%9C%E5%90%8E%E5%8F%B0%E7%9A%84activity%E7%94%B1%E4%BA%8E%E6%9F%90%E5%8E%9F%E5%9B%A0%E8%A2%AB%E7%B3%BB%E7%BB%9F%E5%9B%9E%E6%94%B6%E4%BA%86%E5%A6%82%E4%BD%95%E5%9C%A8%E8%A2%AB%E7%B3%BB%E7%BB%9F%E5%9B%9E%E6%94%B6%E4%B9%8B%E5%89%8D%E4%BF%9D%E5%AD%98%E5%BD%93%E5%89%8D%E7%8A%B6%E6%80%81)
  - [12. Activity的启动模式有哪些？是什么含义？](#12-activity%E7%9A%84%E5%90%AF%E5%8A%A8%E6%A8%A1%E5%BC%8F%E6%9C%89%E5%93%AA%E4%BA%9B%E6%98%AF%E4%BB%80%E4%B9%88%E5%90%AB%E4%B9%89)
  - [13. 如何退出Activity？如何安全退出已调用多个Activity的Application？](#13-%E5%A6%82%E4%BD%95%E9%80%80%E5%87%BAactivity%E5%A6%82%E4%BD%95%E5%AE%89%E5%85%A8%E9%80%80%E5%87%BA%E5%B7%B2%E8%B0%83%E7%94%A8%E5%A4%9A%E4%B8%AAactivity%E7%9A%84application)
  - [14. 请介绍下Android中常用的五种布局](#14-%E8%AF%B7%E4%BB%8B%E7%BB%8D%E4%B8%8Bandroid%E4%B8%AD%E5%B8%B8%E7%94%A8%E7%9A%84%E4%BA%94%E7%A7%8D%E5%B8%83%E5%B1%80)
  - [15. Android中的动画有哪几类，它们的特点和区别是什么](#15-android%E4%B8%AD%E7%9A%84%E5%8A%A8%E7%94%BB%E6%9C%89%E5%93%AA%E5%87%A0%E7%B1%BB%E5%AE%83%E4%BB%AC%E7%9A%84%E7%89%B9%E7%82%B9%E5%92%8C%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88)
  - [16. 什么情况会导致Force Close ？如何避免？能否捕获导致其的异常？](#16-%E4%BB%80%E4%B9%88%E6%83%85%E5%86%B5%E4%BC%9A%E5%AF%BC%E8%87%B4force-close-%E5%A6%82%E4%BD%95%E9%81%BF%E5%85%8D%E8%83%BD%E5%90%A6%E6%8D%95%E8%8E%B7%E5%AF%BC%E8%87%B4%E5%85%B6%E7%9A%84%E5%BC%82%E5%B8%B8)
  - [17. 什么是ANR 如何避免它？](#17-%E4%BB%80%E4%B9%88%E6%98%AFanr-%E5%A6%82%E4%BD%95%E9%81%BF%E5%85%8D%E5%AE%83)
  - [18. 运行时权限与文件系统权限的区别](#18-%E8%BF%90%E8%A1%8C%E6%97%B6%E6%9D%83%E9%99%90%E4%B8%8E%E6%96%87%E4%BB%B6%E7%B3%BB%E7%BB%9F%E6%9D%83%E9%99%90%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [19. Android dvm的进程和Linux的进程, 应用程序的进程是否为同一个概念](#19-android-dvm%E7%9A%84%E8%BF%9B%E7%A8%8B%E5%92%8Clinux%E7%9A%84%E8%BF%9B%E7%A8%8B-%E5%BA%94%E7%94%A8%E7%A8%8B%E5%BA%8F%E7%9A%84%E8%BF%9B%E7%A8%8B%E6%98%AF%E5%90%A6%E4%B8%BA%E5%90%8C%E4%B8%80%E4%B8%AA%E6%A6%82%E5%BF%B5)
  - [20. Java虚拟机和Dalvik虚拟机的区别](#20-java%E8%99%9A%E6%8B%9F%E6%9C%BA%E5%92%8Cdalvik%E8%99%9A%E6%8B%9F%E6%9C%BA%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [21. 什么是嵌入式实时操作系统, Android 操作系统属于实时操作系统吗?](#21-%E4%BB%80%E4%B9%88%E6%98%AF%E5%B5%8C%E5%85%A5%E5%BC%8F%E5%AE%9E%E6%97%B6%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F-android-%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F%E5%B1%9E%E4%BA%8E%E5%AE%9E%E6%97%B6%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F%E5%90%97)
  - [22. 一条最长的短信息约占多少byte?](#22-%E4%B8%80%E6%9D%A1%E6%9C%80%E9%95%BF%E7%9A%84%E7%9F%AD%E4%BF%A1%E6%81%AF%E7%BA%A6%E5%8D%A0%E5%A4%9A%E5%B0%91byte)
  - [23. 如何将SQLite数据库(dictionary.db文件)与apk文件一起发布**](#23-%E5%A6%82%E4%BD%95%E5%B0%86sqlite%E6%95%B0%E6%8D%AE%E5%BA%93dictionarydb%E6%96%87%E4%BB%B6%E4%B8%8Eapk%E6%96%87%E4%BB%B6%E4%B8%80%E8%B5%B7%E5%8F%91%E5%B8%83)
  - [24. 如何打开res aw目录中的数据库文件?](#24-%E5%A6%82%E4%BD%95%E6%89%93%E5%BC%80res-aw%E7%9B%AE%E5%BD%95%E4%B8%AD%E7%9A%84%E6%95%B0%E6%8D%AE%E5%BA%93%E6%96%87%E4%BB%B6)
  - [25. DDMS和TraceView的区别?](#25-ddms%E5%92%8Ctraceview%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [26. Java中如何引用本地语言](#26-java%E4%B8%AD%E5%A6%82%E4%BD%95%E5%BC%95%E7%94%A8%E6%9C%AC%E5%9C%B0%E8%AF%AD%E8%A8%80)
  - [27. JNI编程](#27-jni%E7%BC%96%E7%A8%8B)
    - [什么是NDK](#%E4%BB%80%E4%B9%88%E6%98%AFndk)
    - [什么是JNI](#%E4%BB%80%E4%B9%88%E6%98%AFjni)
    - [JNI使用](#jni%E4%BD%BF%E7%94%A8)
  - [28. Android里的Intent传递的数据有大小限制吗，如何解决？](#28-android%E9%87%8C%E7%9A%84intent%E4%BC%A0%E9%80%92%E7%9A%84%E6%95%B0%E6%8D%AE%E6%9C%89%E5%A4%A7%E5%B0%8F%E9%99%90%E5%88%B6%E5%90%97%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3)
  - [29. MVC设计模式](#29-mvc%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F)
  - [30. MVP设计模式](#30-mvp%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F)
    - [引入的场景](#%E5%BC%95%E5%85%A5%E7%9A%84%E5%9C%BA%E6%99%AF)
    - [MVP的介绍](#mvp%E7%9A%84%E4%BB%8B%E7%BB%8D)
    - [MVP作用](#mvp%E4%BD%9C%E7%94%A8)
      - [（1） Activity 代码变得更加简洁](#1-activity-%E4%BB%A3%E7%A0%81%E5%8F%98%E5%BE%97%E6%9B%B4%E5%8A%A0%E7%AE%80%E6%B4%81)
      - [（2）方便进行单元测试](#2%E6%96%B9%E4%BE%BF%E8%BF%9B%E8%A1%8C%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95)
    - [MVP使用示例](#mvp%E4%BD%BF%E7%94%A8%E7%A4%BA%E4%BE%8B)
      - [Step 1/编写Model逻辑](#step-1%E7%BC%96%E5%86%99model%E9%80%BB%E8%BE%91)
      - [Step 2/编写View逻辑](#step-2%E7%BC%96%E5%86%99view%E9%80%BB%E8%BE%91)
      - [Step 3/编写presenter逻辑(重点关注)](#step-3%E7%BC%96%E5%86%99presenter%E9%80%BB%E8%BE%91%E9%87%8D%E7%82%B9%E5%85%B3%E6%B3%A8)
  - [31. ListView的优化方案](#31-listview%E7%9A%84%E4%BC%98%E5%8C%96%E6%96%B9%E6%A1%88)
  - [32. RecyclerView使用过吗？](#32-recyclerview%E4%BD%BF%E7%94%A8%E8%BF%87%E5%90%97)
  - [33. Android的数据存储方式](#33-android%E7%9A%84%E6%95%B0%E6%8D%AE%E5%AD%98%E5%82%A8%E6%96%B9%E5%BC%8F)
    - [（1）使用SharedPreferences存储数据](#1%E4%BD%BF%E7%94%A8sharedpreferences%E5%AD%98%E5%82%A8%E6%95%B0%E6%8D%AE)
      - [sp写数据](#sp%E5%86%99%E6%95%B0%E6%8D%AE)
      - [sp读数据](#sp%E8%AF%BB%E6%95%B0%E6%8D%AE)
    - [（2）文件存储数据](#2%E6%96%87%E4%BB%B6%E5%AD%98%E5%82%A8%E6%95%B0%E6%8D%AE)
    - [（3）网络存储数据](#3%E7%BD%91%E7%BB%9C%E5%AD%98%E5%82%A8%E6%95%B0%E6%8D%AE)
    - [（4）ContentProvider](#4contentprovider)
      - [1、ContentProvider简介](#1contentprovider%E7%AE%80%E4%BB%8B)
      - [2、Uri类简介](#2uri%E7%B1%BB%E7%AE%80%E4%BB%8B)
      - [3、UriMatcher、ContentUrist和ContentResolver简介](#3urimatchercontenturist%E5%92%8Ccontentresolver%E7%AE%80%E4%BB%8B)
  - [34. Activity的启动过程（不要回答生命周期）](#34-activity%E7%9A%84%E5%90%AF%E5%8A%A8%E8%BF%87%E7%A8%8B%E4%B8%8D%E8%A6%81%E5%9B%9E%E7%AD%94%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F)
  - [35. Android进程间通信IPC机制Binder简单介绍](#35-android%E8%BF%9B%E7%A8%8B%E9%97%B4%E9%80%9A%E4%BF%A1ipc%E6%9C%BA%E5%88%B6binder%E7%AE%80%E5%8D%95%E4%BB%8B%E7%BB%8D)
  - [36. Android进程保活（不死进程）](#36-android%E8%BF%9B%E7%A8%8B%E4%BF%9D%E6%B4%BB%E4%B8%8D%E6%AD%BB%E8%BF%9B%E7%A8%8B)
  - [37. Android进程间通信的几种实现方式](#37-android%E8%BF%9B%E7%A8%8B%E9%97%B4%E9%80%9A%E4%BF%A1%E7%9A%84%E5%87%A0%E7%A7%8D%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F)
    - [什么是RPC](#%E4%BB%80%E4%B9%88%E6%98%AFrpc)
    - [什么是IPC](#%E4%BB%80%E4%B9%88%E6%98%AFipc)
    - [Android进程间通信](#android%E8%BF%9B%E7%A8%8B%E9%97%B4%E9%80%9A%E4%BF%A1)
      - [（1）Bundle （对应于四大组件）](#1bundle-%E5%AF%B9%E5%BA%94%E4%BA%8E%E5%9B%9B%E5%A4%A7%E7%BB%84%E4%BB%B6)
      - [（2）文件共享](#2%E6%96%87%E4%BB%B6%E5%85%B1%E4%BA%AB)
      - [（3）ContentProvider（基于Binder）](#3contentprovider%E5%9F%BA%E4%BA%8Ebinder)
      - [（4）AIDL Service（基于Binder）](#4aidl-service%E5%9F%BA%E4%BA%8Ebinder)
      - [（5）Messenger（基于Binder）](#5messenger%E5%9F%BA%E4%BA%8Ebinder)
      - [（6）Socket（网络）](#6socket%E7%BD%91%E7%BB%9C)
  - [38. 理解序列化吗，Android为什么引入Parcelable？](#38-%E7%90%86%E8%A7%A3%E5%BA%8F%E5%88%97%E5%8C%96%E5%90%97android%E4%B8%BA%E4%BB%80%E4%B9%88%E5%BC%95%E5%85%A5parcelable)
  - [39. 什么是Service以及描述下它的生命周期。Service有哪些启动方法，有什么区别，怎样停用Service？](#39-%E4%BB%80%E4%B9%88%E6%98%AFservice%E4%BB%A5%E5%8F%8A%E6%8F%8F%E8%BF%B0%E4%B8%8B%E5%AE%83%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9Fservice%E6%9C%89%E5%93%AA%E4%BA%9B%E5%90%AF%E5%8A%A8%E6%96%B9%E6%B3%95%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%E6%80%8E%E6%A0%B7%E5%81%9C%E7%94%A8service)
    - [启动方法](#%E5%90%AF%E5%8A%A8%E6%96%B9%E6%B3%95)
    - [生命周期](#%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F)
  - [40. 注册广播有几种方式，这些方式有何优缺点？请谈谈Android引入广播机制的用意](#40-%E6%B3%A8%E5%86%8C%E5%B9%BF%E6%92%AD%E6%9C%89%E5%87%A0%E7%A7%8D%E6%96%B9%E5%BC%8F%E8%BF%99%E4%BA%9B%E6%96%B9%E5%BC%8F%E6%9C%89%E4%BD%95%E4%BC%98%E7%BC%BA%E7%82%B9%E8%AF%B7%E8%B0%88%E8%B0%88android%E5%BC%95%E5%85%A5%E5%B9%BF%E6%92%AD%E6%9C%BA%E5%88%B6%E7%9A%84%E7%94%A8%E6%84%8F)
    - [注册广播](#%E6%B3%A8%E5%86%8C%E5%B9%BF%E6%92%AD)
      - [注册广播方式](#%E6%B3%A8%E5%86%8C%E5%B9%BF%E6%92%AD%E6%96%B9%E5%BC%8F)
      - [注册广播区别](#%E6%B3%A8%E5%86%8C%E5%B9%BF%E6%92%AD%E5%8C%BA%E5%88%AB)
    - [发送广播](#%E5%8F%91%E9%80%81%E5%B9%BF%E6%92%AD)
      - [广播发送方式](#%E5%B9%BF%E6%92%AD%E5%8F%91%E9%80%81%E6%96%B9%E5%BC%8F)
      - [发送广播区别](#%E5%8F%91%E9%80%81%E5%B9%BF%E6%92%AD%E5%8C%BA%E5%88%AB)
    - [广播发送和接收的原理](#%E5%B9%BF%E6%92%AD%E5%8F%91%E9%80%81%E5%92%8C%E6%8E%A5%E6%94%B6%E7%9A%84%E5%8E%9F%E7%90%86)
  - [41. BroadcastReceiver与LocalBroadcastReceiver有什么区别？](#41-broadcastreceiver%E4%B8%8Elocalbroadcastreceiver%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB)
  - [***42. Service和Thread的区别？](#42-service%E5%92%8Cthread%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [43. 介绍Http和Https的区别](#43-%E4%BB%8B%E7%BB%8Dhttp%E5%92%8Chttps%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [44. HttpClient与HttpUrlConnection的区别](#44-httpclient%E4%B8%8Ehttpurlconnection%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [45.String,StringBuffer,StringBuilder的区别](#45stringstringbufferstringbuilder%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [46. 为什么要用ContentProvider？它和sql的实现上有什么差别？](#46-%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E7%94%A8contentprovider%E5%AE%83%E5%92%8Csql%E7%9A%84%E5%AE%9E%E7%8E%B0%E4%B8%8A%E6%9C%89%E4%BB%80%E4%B9%88%E5%B7%AE%E5%88%AB)
  - [47. 描述一下View的绘制原理？](#47-%E6%8F%8F%E8%BF%B0%E4%B8%80%E4%B8%8Bview%E7%9A%84%E7%BB%98%E5%88%B6%E5%8E%9F%E7%90%86)
  - [48+ .View的,Activity绘制，原理2](#48-view%E7%9A%84activity%E7%BB%98%E5%88%B6%E5%8E%9F%E7%90%862)
  - [49. Android UI中的View如何刷新？](#49-android-ui%E4%B8%AD%E7%9A%84view%E5%A6%82%E4%BD%95%E5%88%B7%E6%96%B0)
  - [50. `requestLayout()`、`invalidate()`与`postInvalidate()`有什么区别？](#50-requestlayoutinvalidate%E4%B8%8Epostinvalidate%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB)
  - [51. 了解APK的打包流程吗，描述一下？](#51-%E4%BA%86%E8%A7%A3apk%E7%9A%84%E6%89%93%E5%8C%85%E6%B5%81%E7%A8%8B%E5%90%97%E6%8F%8F%E8%BF%B0%E4%B8%80%E4%B8%8B)
- [三：android进阶（源码分析）](#%E4%B8%89android%E8%BF%9B%E9%98%B6%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90)
  - [1.Android Handler机制是做什么的，原理了解吗？](#1android-handler%E6%9C%BA%E5%88%B6%E6%98%AF%E5%81%9A%E4%BB%80%E4%B9%88%E7%9A%84%E5%8E%9F%E7%90%86%E4%BA%86%E8%A7%A3%E5%90%97)
    - [Handler机制讲解](#handler%E6%9C%BA%E5%88%B6%E8%AE%B2%E8%A7%A3)
    - [消息机制的源码解析](#%E6%B6%88%E6%81%AF%E6%9C%BA%E5%88%B6%E7%9A%84%E6%BA%90%E7%A0%81%E8%A7%A3%E6%9E%90)
      - [1.Handler发送消息](#1handler%E5%8F%91%E9%80%81%E6%B6%88%E6%81%AF)
      - [2.Looper获取消息](#2looper%E8%8E%B7%E5%8F%96%E6%B6%88%E6%81%AF)
    - [Handler补充(注意事项)](#handler%E8%A1%A5%E5%85%85%E6%B3%A8%E6%84%8F%E4%BA%8B%E9%A1%B9)
      - [1. 使用静态内部类+弱引用的方式:](#1-%E4%BD%BF%E7%94%A8%E9%9D%99%E6%80%81%E5%86%85%E9%83%A8%E7%B1%BB%E5%BC%B1%E5%BC%95%E7%94%A8%E7%9A%84%E6%96%B9%E5%BC%8F)
      - [2. 在Activity的onDestroy方法中将MessageQueue中的消息清空](#2-%E5%9C%A8activity%E7%9A%84ondestroy%E6%96%B9%E6%B3%95%E4%B8%AD%E5%B0%86messagequeue%E4%B8%AD%E7%9A%84%E6%B6%88%E6%81%AF%E6%B8%85%E7%A9%BA)
  - [2.android如何做性能优化？](#2android%E5%A6%82%E4%BD%95%E5%81%9A%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96)
  - [3. 线程sleep和wait有什么区别](#3-%E7%BA%BF%E7%A8%8Bsleep%E5%92%8Cwait%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB)
  - [4.volatile作用，可见性原理，与synchronized区别](#4volatile%E4%BD%9C%E7%94%A8%E5%8F%AF%E8%A7%81%E6%80%A7%E5%8E%9F%E7%90%86%E4%B8%8Esynchronized%E5%8C%BA%E5%88%AB)
  - [5. Java注解反射原理是什么，和如何实现的](#5-java%E6%B3%A8%E8%A7%A3%E5%8F%8D%E5%B0%84%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%E5%92%8C%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E7%9A%84)
  - [6. 介绍一下java虚拟机，以及它和Dalvik虚拟机的区别？](#6-%E4%BB%8B%E7%BB%8D%E4%B8%80%E4%B8%8Bjava%E8%99%9A%E6%8B%9F%E6%9C%BA%E4%BB%A5%E5%8F%8A%E5%AE%83%E5%92%8Cdalvik%E8%99%9A%E6%8B%9F%E6%9C%BA%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [7. Java GC原理](#7-java-gc%E5%8E%9F%E7%90%86)
  - [8. 线程池了解吗，如何使用,原理了解吗？](#8-%E7%BA%BF%E7%A8%8B%E6%B1%A0%E4%BA%86%E8%A7%A3%E5%90%97%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8%E5%8E%9F%E7%90%86%E4%BA%86%E8%A7%A3%E5%90%97)
  - [9. 如何关闭线程?](#9-%E5%A6%82%E4%BD%95%E5%85%B3%E9%97%AD%E7%BA%BF%E7%A8%8B)
  - [10. 组件化，插件化](#10-%E7%BB%84%E4%BB%B6%E5%8C%96%E6%8F%92%E4%BB%B6%E5%8C%96)
  - [11. 内存泄漏检测工具原理](#11-%E5%86%85%E5%AD%98%E6%B3%84%E6%BC%8F%E6%A3%80%E6%B5%8B%E5%B7%A5%E5%85%B7%E5%8E%9F%E7%90%86)
  - [12. Android中常见的4种线程池](#12-android%E4%B8%AD%E5%B8%B8%E8%A7%81%E7%9A%844%E7%A7%8D%E7%BA%BF%E7%A8%8B%E6%B1%A0)
    - [FixThreadPool](#fixthreadpool)
    - [SingleThreadPool](#singlethreadpool)
    - [CachedThreadPool](#cachedthreadpool)
    - [ScheduledThreadPool](#scheduledthreadpool)
  - [13. 谈谈Java锁](#13-%E8%B0%88%E8%B0%88java%E9%94%81)
- [四：手写代码（如算法类）](#%E5%9B%9B%E6%89%8B%E5%86%99%E4%BB%A3%E7%A0%81%E5%A6%82%E7%AE%97%E6%B3%95%E7%B1%BB)
  - [1. 手写一个简单的观察者模式](#1-%E6%89%8B%E5%86%99%E4%B8%80%E4%B8%AA%E7%AE%80%E5%8D%95%E7%9A%84%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F)
  - [2. 手写一个常见的单利模式](#2-%E6%89%8B%E5%86%99%E4%B8%80%E4%B8%AA%E5%B8%B8%E8%A7%81%E7%9A%84%E5%8D%95%E5%88%A9%E6%A8%A1%E5%BC%8F)
  - [3. 手写算法（选择冒泡必须要会）](#3-%E6%89%8B%E5%86%99%E7%AE%97%E6%B3%95%E9%80%89%E6%8B%A9%E5%86%92%E6%B3%A1%E5%BF%85%E9%A1%BB%E8%A6%81%E4%BC%9A)
  - [4. 统计一段字符串中每个字符出现的次数](#4-%E7%BB%9F%E8%AE%A1%E4%B8%80%E6%AE%B5%E5%AD%97%E7%AC%A6%E4%B8%B2%E4%B8%AD%E6%AF%8F%E4%B8%AA%E5%AD%97%E7%AC%A6%E5%87%BA%E7%8E%B0%E7%9A%84%E6%AC%A1%E6%95%B0)
  - [5. 实现字符串倒叙输出（任意一种方法）](#5-%E5%AE%9E%E7%8E%B0%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%80%92%E5%8F%99%E8%BE%93%E5%87%BA%E4%BB%BB%E6%84%8F%E4%B8%80%E7%A7%8D%E6%96%B9%E6%B3%95)
- [五：项目经验（项目介绍，技术点rxJava，retrofit，rxbinding，databinding，性能优化，加载大图，以及一些最新的技术）](#%E4%BA%94%E9%A1%B9%E7%9B%AE%E7%BB%8F%E9%AA%8C%E9%A1%B9%E7%9B%AE%E4%BB%8B%E7%BB%8D%E6%8A%80%E6%9C%AF%E7%82%B9rxjavaretrofitrxbindingdatabinding%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96%E5%8A%A0%E8%BD%BD%E5%A4%A7%E5%9B%BE%E4%BB%A5%E5%8F%8A%E4%B8%80%E4%BA%9B%E6%9C%80%E6%96%B0%E7%9A%84%E6%8A%80%E6%9C%AF)
  - [1. Android蓝牙技术](#1-android%E8%93%9D%E7%89%99%E6%8A%80%E6%9C%AF)
  - [2. WebView与js交互（调用哪些API）](#2-webview%E4%B8%8Ejs%E4%BA%A4%E4%BA%92%E8%B0%83%E7%94%A8%E5%93%AA%E4%BA%9Bapi)
  - [3. RxJava](#3-rxjava)
  - [4. 开源框架，为什么使用，与别的有什么区别？](#4-%E5%BC%80%E6%BA%90%E6%A1%86%E6%9E%B6%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E4%B8%8E%E5%88%AB%E7%9A%84%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB)
    - [网络请求](#%E7%BD%91%E7%BB%9C%E8%AF%B7%E6%B1%82)
    - [异步](#%E5%BC%82%E6%AD%A5)
    - [图片处理](#%E5%9B%BE%E7%89%87%E5%A4%84%E7%90%86)
    - [消息传递：](#%E6%B6%88%E6%81%AF%E4%BC%A0%E9%80%92)
    - [混合开发](#%E6%B7%B7%E5%90%88%E5%BC%80%E5%8F%91)
  - [5. 如何做性能优化？](#5-%E5%A6%82%E4%BD%95%E5%81%9A%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96)
  - [6. 如果防止过度绘制，如何做布局优化?](#6-%E5%A6%82%E6%9E%9C%E9%98%B2%E6%AD%A2%E8%BF%87%E5%BA%A6%E7%BB%98%E5%88%B6%E5%A6%82%E4%BD%95%E5%81%9A%E5%B8%83%E5%B1%80%E4%BC%98%E5%8C%96)
  - [7. 如何提高代码质量？](#7-%E5%A6%82%E4%BD%95%E6%8F%90%E9%AB%98%E4%BB%A3%E7%A0%81%E8%B4%A8%E9%87%8F)
  - [8. 有没有遇到64k问题，为什么，如何解决?](#8-%E6%9C%89%E6%B2%A1%E6%9C%89%E9%81%87%E5%88%B064k%E9%97%AE%E9%A2%98%E4%B8%BA%E4%BB%80%E4%B9%88%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3)
  - [9. 加载大图](#9-%E5%8A%A0%E8%BD%BD%E5%A4%A7%E5%9B%BE)
    - [写入缓存](#%E5%86%99%E5%85%A5%E7%BC%93%E5%AD%98)
    - [读取缓存](#%E8%AF%BB%E5%8F%96%E7%BC%93%E5%AD%98)
    - [移除缓存](#%E7%A7%BB%E9%99%A4%E7%BC%93%E5%AD%98)
  - [10. 三级缓存（各大图片框架都可以扯到这上面来）](#10-%E4%B8%89%E7%BA%A7%E7%BC%93%E5%AD%98%E5%90%84%E5%A4%A7%E5%9B%BE%E7%89%87%E6%A1%86%E6%9E%B6%E9%83%BD%E5%8F%AF%E4%BB%A5%E6%89%AF%E5%88%B0%E8%BF%99%E4%B8%8A%E9%9D%A2%E6%9D%A5)
  - [11.谈谈扫码支付的流程](#11%E8%B0%88%E8%B0%88%E6%89%AB%E7%A0%81%E6%94%AF%E4%BB%98%E7%9A%84%E6%B5%81%E7%A8%8B)
  - [12.Android中如何实现网络安全的](#12android%E4%B8%AD%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E7%BD%91%E7%BB%9C%E5%AE%89%E5%85%A8%E7%9A%84)
  - [13. NFC简单总结](#13-nfc%E7%AE%80%E5%8D%95%E6%80%BB%E7%BB%93)
    - [NFC的工作模式](#nfc%E7%9A%84%E5%B7%A5%E4%BD%9C%E6%A8%A1%E5%BC%8F)
    - [NFC标签让Android自动打开网页](#nfc%E6%A0%87%E7%AD%BE%E8%AE%A9android%E8%87%AA%E5%8A%A8%E6%89%93%E5%BC%80%E7%BD%91%E9%A1%B5)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

[Toc]
# 让人眼前一亮的Android面试题集锦（持续更新） !   

Hi! I'm yours，本内容整理于2019-03-23，持续更新    
    
在开始整理时，网上搜罗一大圈，发现很多内容都时间比较久远，内容不更新，而且有的错误，比如一篇文章介绍Android动画两种，但其实Android中有3中动画的;
    
于带着前人的智慧和自己开发中的经验来整理一篇关于Android的面试题，题目就叫**让人眼前一亮的Android面试题集锦**    ，本内容为《android面试宝典》的第一篇文章，主要是技术；然后还有一篇通用人事面试2的内容，[@欢迎关注](https://www.zhihu.com/people/qydq).
    
<font color=#ff0000 size=5 face="微软雅黑"><b>©️版权声明CopyRight：</b></font>  
  
>**本内容作者：sunst，转载或引用请标明[出处](https://www.zhihu.com/people/qydq)，违者追究法律责任。**  

[@我的知乎主页](https://www.zhihu.com/people/qydq) ：https://www.zhihu.com/people/qydq
@Email： qyddai@gmail.com
@Author ： sunst / sunst0069 

> * @开始整理日期：2019-03-23   
> * @最后更新日期：2020-04-18
   
 <font color=#0099ff size=4 face="黑体">失败是什么？没有什么，只是更走近成功一步；成功是什么？就是走过了所有通向失败的路，只剩下一条路，那就是成功的路。</font>  


 当然不仅仅是为了面试而面试，通过整理这些能够总结之前的经验，提升自己的能力，同时也能分享一些好的idea给大家，我觉得非常有意义；以下为```sunst0069```总结的面试宝典技术篇内容.

---
# android面试宝典1：技术篇↘

分为五个部份，这些有可能会在面试中问到，大家去面试的时候准备好复习

## * 一：大厂经典问题（必须掌握）
## * 二：基础专业技能（java，android基础知识）
## * 三：android进阶（含源码分析）
## * 四：手写代码（如算法类）
## * 五：项目经验（项目介绍，技术点rxJava，retrofit，rxbinding，databinding，性能优化，加载大图，以及一些最新的技术）

推荐看这篇文章：  
https://blog.csdn.net/huangqili1314/article/details/72792682

---
# 一：大厂经典问题（必须掌握）
该内容为知名互联网公司的面试内容，有的是从网上搜罗下来的，有的则是个人总结
## 必须掌握的经典问题

- **1.android的启动过程**

- **2.View的绘制原理**

- **3.View的绘制流程**

- **4.Activity绘制原理和流程**

- **5.android binder机制及其原理**

- **6.android进程间通信的方式**

## 对比联系知识点
- 1.stringbuilder和stringbuffer的区别，以及它的实现原理

1.StringBuffer和StringBuilder都集成了AbstractStringBuilder，而StringBuffer大部分方法都是synchronized，也就是线程安全的，而StringBuilder就没有，所以，我们查看API可以知道，StringBuilder可以操作StringBuffer，但是StringBuffer不可以操作StringBuilder。

2.StringBuffer、StringBuilder和String一样，用来代表字符串。String类是不可变类，任何对String的改变都 会引发新的String对象的生成；StringBuffer则是可变类，任何对它所指代的字符串的改变都不会产生新的对象。既然可变和不可变都有了，为何还有一个StringBuilder呢？相信初期的你，在进行append时，一般都会选择StringBuffer吧！


- 2.针对集合Map，HashMap，CollectllectHashMap的区别，以及实现原理。

HashTable是线程安全的，很多方法都是synchronized方法，而HashMap不是线程安全的，但其在单线程程序中的性能比HashTable要高
## 腾讯SNG（一二面）
- **1.Android Handler机制是做什么的，原理了解吗？**  
[# native click](#)

- **2.  Android的事件分发机制？**  
[本人知乎 -Android事件分发机制完全解析，带你从源码的角度彻底理解](https://zhuanlan.zhihu.com/p/32686674)  
  
- **3. Java有哪几种创建新线程的方法及区别**  
[参考-Java中创建线程主要有三种方式及其对比](https://zhuanlan.zhihu.com/p/32686674)  

- **4.static修饰的方法可以被子类重写吗？为什么？**  
[参考-Java关键字static、final使用小结](https://blog.51cto.com/android/384614)

- **5.如何优化一个ListView**  
>listview的优化其实就是去找getView中的耗时操作，然后提取出来，要么使用异步的方式为item的布局加载数据，若需要同步，就只能在Adapter初始化时将数据准备好，然后再getView中只需绑定一下就行  
  
**更多：**  
  
>具体参考ListView优化[# native click](#27-listview%E7%9A%84%E4%BC%98%E5%8C%96%E6%96%B9%E6%A1%88) 

- **6.那些情况会导致OOM?  如何解决**
导致内存泄露主要的原因是，先前申请了内存空间而忘记了释放。如果程序中存在无用对象的引用，那么这些对象就会驻留内存，消耗内存，因为无法让垃圾回收器GC验证这些对象是否不再需要。如果存在对象的引用，这个对象就被定义为“有效的活动”，同时不会被释放。要确定对象所占内存将被回收，我们就要确认该对象不会再被使用。典型的做法是把对象数据成员设为null或者从集合中移除该对象。当出现以下情况时，会造成内存泄露:（当然不止这些，面试嘛，随便说一两个即可）  
  
> 1、 数据库的cursor没有关闭  
> 2、 构造adapter时，没有使用缓存contentview  
> 3、 Bitmap对象不使用时，采用recycle()释放内存  
> 4、 Activity中的对象的生命周期大于activity    

[本人知乎- Android内存泄漏分析与解决办法](https://zhuanlan.zhihu.com/p/32025826)  
- **7.如何检测内存泄漏？有哪些工具？**  
  
查找内存泄漏可以使用Android Profiler工具或者LeakCanary工具
  
[参考-Android中的内存泄露检测方案LeakCanary远离OOM](  
https://www.tuicool.com/articles/RvURJv)  
  
**此处延伸：**  
  
>参考如何做性能优化?[# native click](#51-%E5%A6%82%E4%BD%95%E5%81%9A%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96) 

- **8.用leak工具检测内存泄漏的原理是什么？**  
[参考 LeakCanary 内存泄露监测原理研究](https://www.jianshu.com/p/5ee6b471970e)  
  
## 今日头条(一面)  
- [1. Activity正常和异常情况下的生命周期](https://link.zhihu.com/?target=http%3A//blog.csdn.net/geekerhw/article/details/48749935)  
- [2. Activity的四种启动模式](https://link.zhihu.com/?target=http%3A//blog.csdn.net/zhangjg_blog/article/details/10923643)  
- [3. app如何保证后台服务不被杀死](https://link.zhihu.com/?target=https%3A//segmentfault.com/a/1190000006251859%23articleHeader1)  
- [4. IntentService比Service好在哪](https://link.zhihu.com/?target=http%3A//blog.qiji.tech/archives/2693)  
- [5. 如何优雅的展示Bitmap大图](https://link.zhihu.com/?target=http%3A//blog.csdn.net/guolin_blog/article/details/9316683)  
- [6. Retrofit使用的注解是哪种注解？以及，注解的底层实现是怎样的](https://link.zhihu.com/?target=http%3A//wiki.jikexueyuan.com/project/java-reflection/java-at.html)  
- [7. Thread和HandlerThread区别](https://link.zhihu.com/?target=http%3A//www.jianshu.com/p/5b6c71a7e8d7)  
  
HandlerThread是Thread的一个子类，HandlerThread自带Looper使他可以通过消息队列来重复使用当前线程，节省系统资源开销。这是它的优点也是缺点，每一个任务都将以队列的方式逐个被执行到，一旦队列中有某个任务执行时间过长，那么就会导致后续的任务都会被延迟处理。  
  
```  
HandlerThread thread = new HandlerThread("MyHandlerThread");  
thread.start();  
mHandler = new Handler(thread.getLooper());  
mHandler.post(new Runnable(){...});  
```  
- [8. 关于< include >< merge >< stub >三者的使用场景](https://link.zhihu.com/?target=http%3A//www.trinea.cn/android/layout-performance/)  
- [9. Java是值传递还是引用传递](https://www.zhihu.com/question/31203609)  
  
（1）@@# 对于基本类型 num ，赋值运算符会直接改变变量的值，原来的值被覆盖掉。  
（2）对于引用类型 str，赋值运算符会改变引用中所保存的地址，原来的地址被覆盖掉。但是原来的对象不会被改变（重要）。  
（3）原来的对象没有被改变。（没有被任何引用所指向的对象是垃圾，会被垃圾回收器回收）  
  
java中方法参数传递方式是按值传递。  
如果参数是基本类型，传递的是基本类型的字面量值的拷贝。  
如果参数是引用类型，传递的是该参量所引用的对象在堆中地址值的拷贝  
  
一切传引用其实本质上是传值  
  
- [10. final和static关键字的区别](https://link.zhihu.com/?target=http%3A//android.blog.51cto.com/268543/384614/)  
- [11. HashSet和HashMap的区别](https://link.zhihu.com/?target=http%3A//www.importnew.com/6931.html)  
- [12. 深拷贝和浅拷贝的区别](https://link.zhihu.com/?target=http%3A//www.cnblogs.com/chenssy/p/3308489.html)  
- [13. clone()的默认实现是深拷贝还是浅拷贝?如何让clone()实现深拷贝？](https://link.zhihu.com/?target=http%3A//blog.csdn.net/zhangjg_blog/article/details/18369201)  
- [14. 动态代理和静态代理](http://a.codekk.com/detail/Android/Caij/公共技术点之%20Java%20动态代理)  
- [15. 算法题：求二叉树第n层节点数](https://link.zhihu.com/?target=http%3A//blog.csdn.net/beitiandijun/article/details/41941211)  
- [16. JVM的内存分布及垃圾回收机制](https://zhuanlan.zhihu.com/p/24191775)  

[Java虚拟机（JVM）你只要看这一篇就够了！](https://blog.csdn.net/qq_41701956/article/details/81664921)

## 小米（一二面）
一面问的很详细，二面也很深入，面试官态度也超好～  
  
- [1. ThreadLocal的理解](https://www.iteye.com/blog/zhangbo-peipei-163-com-2029216)  
  
很多时候我们还是会认为ThreadLocal是为了解决线程安全的问题而设计的,线程安全问题产生的两个前提条件：  
>1. 数据共享。多个线程访问同样的数据。     
>2. 共享数据是可变的。多个线程对访问的共享数据作出了修改。     
  
一般的我们要解决线程安全，利用synchronized关键字将修改对象值的地方和输出的地方上锁。让这段代码在某一个时间段内始终只有一个线程在执行。  
  
>以上结果肯定是线程安全  
  
如果ThreadLocal是为了解决线程安全设计的，那么使用ThreadLocal同样会是上面的效果，但是结果却不是。  
  
总结：  
  
ThreadLocal里面保存一个线程共享的变量，对于该变量来讲是线程不安全的。  
如果ThreadLocal保存的本身就是一个私有的，不共享的变量的话，当然是线程安全的  
  
- 2. HashMap HashSet HashTable的区别？

		[本人知乎- # Java基础知识-集合与Map总结1](https://zhuanlan.zhihu.com/p/93054721)

- [3. 如何让HashMap可以线程安全？](http://www.importnew.com/21396.html)  
- [4. Android对HashMap做了优化后推出的新的容器类是什么？](https://blog.csdn.net/u010687392/article/details/47809295)  
- [5. Java多线程之间如何通信](https://blog.csdn.net/yulei_qq/article/details/8978456)  
- [6. 线程池的实现机制](https://www.cnblogs.com/dolphin0520/p/3932921.html)  
- [7. RxJava中map和flatmap操作符的区别及底层实现](https://link.zhihu.com/?target=http%3A//gank.io/post/560e15be2dca930e00da1083)  
- [8. 对消息机制中Looper的理解](https://zhuanlan.zhihu.com/p/25222485)  
-  [9. Integer类对int的优化](https://link.zhihu.com/?target=http%3A//denverj.iteye.com/blog/745422)  
-  [10. 单例模式有哪些实现方式](https://link.zhihu.com/?target=http%3A//www.blogjava.net/kenzhh/archive/2013/03/15/357824.html)  
-  [11. synchronized volatile关键字有什么区别？以及还有哪些同样功能的关键字](https://link.zhihu.com/?target=https%3A//segmentfault.com/a/1190000004487149)  
-  [12. 界面卡顿的原因有哪些？](https://link.zhihu.com/?target=http%3A//www.jianshu.com/p/1fb065c806e6)  
-  13. 造成OOM/ANR 的原因？（同腾讯面试）  
-  [14. Activity与Fragment生命周期有何联系](https://www.cnblogs.com/purediy/p/3276545.html)  
-  [15. Activity与Fragment之间如何进行通信？](https://blog.csdn.net/u012702547/article/details/49786417)  
-  [16. RecyclerView与ListView缓存机制的不同](https://link.zhihu.com/?target=https%3A//segmentfault.com/a/1190000007331249)  
## 阿里​  
-   操作系统进程间通信有哪些方法-（已有）  
-   [谈谈对Socket的理解-本人知乎](https://zhuanlan.zhihu.com/p/62522151)  
  
一般来说客户端与服务器的通信方式主要有两种，一是Http通信，一是Socket通信。两者的最大  
  
Socket是网络编程的一个抽象概念。通常我们用一个Socket表示“打开了一个网络链接”，而打开一个Socket需要知道目标计算机的IP地址和端口号，再指定协议类型即可  
  
-   [不同架构的机器有何不同（如x86等）](https://blog.csdn.net/kester_/article/details/71055901)  
-   TCP/UDP比较  
-   什么时候会发生死锁  
-   操作系统层面上，线程可以加哪些锁  
-   算法题：求无序数组中的中位数  
-   二叉树深度算法  
-   android什么情况下会发生内存泄露（已有）  
-   栈在系统中的方向是怎样的？为什么？  

# 二：基础专业技能（java，android基础知识）
此部分包含一些android和java中的基础知识，没有绝对的顺序，遇到了就总结到这里
## 1. Android介绍    
Android是一个开源的操作系统，主要用于移动设备，比如手机，平板电脑，它是一种基于Linux的开放源代码软件栈，应用于ARM平台，但不仅限于ARM，通过编译控制，在X86等体系结构的机器上同样可以运行，并且它提供了丰富的组件，允许开发人员编写可执行基本和高级功能的应用程序。  
  
**此处延伸：**  
 * [Android不同架构的机器有何不同？](https://blog.csdn.net/kester_/article/details/71055901)  
## 2. Android系统架构    
与其他操作系统一样，Android也采用分层的架构设计，从高到低分别是系统应用层（System Apps），Java API 框架层（Java API Framework），Android系统运行层（包括Android Runtime和Native C/C++ Libraries）、硬件抽象层（Hardware Abstraction Layer）、Linux内核层（Linux Kernel）。如下图所示：    
![sunst](https://github.com/qydq/Integrate/blob/master/res/sunst_android_framework.png?raw=true)    
    
下面由上至下分别介绍各层    
    
### (1). 系统应用层    
所有安装在手机上的系统应用都属于这一层，用户自己开发的应用也属于这一层    
    
### (2). Java API 框架层    
Android OS的整个功能集可以通过用Java语言编写的API来获得，如：    
>* 一个丰富且可扩展的View System： 可以使用它来构建应用程序的UI，包括列表，网格，文本框，按钮，甚至可嵌入的Web浏览器；    
>* Content Providers： 可让应用访问其他应用的数据，例如通讯录应用，或共享自己的数据；    
>* Activity Manager： 负责管理应用程序的生命周期并提供一个通用的导航返回栈；    
>* Resource Manager： 提供对非编码资源，如本地字符串，图形，和布局文件；    
>* Notification Manager： 为应用程序提供在状态栏中显示自定义的消息提醒；    
    
### (3). Android系统运行层    
这一层包括Android Runtime和原生态的C/C++库。    
 * 原生态的C/C++库    
    
许多核心的Android系统组件和服务（如ART和HAL）都是使用本地代码构建的，需要使用C和C ++编写的本机库。    
Android平台提供的`Java框架API`将这些本地库中的一些功能展示给应用程序。 例如，您可以通过Android框架的Java OpenGL API访问OpenGL ES，以添加对在应用程序中绘制和操作2D和3D图形的支持。WebKit提供了浏览器支持等    
 * Android运行时    
    
包括了ART虚拟机（Android 5.0之前是Dalvik虚拟机，ART模式与Dalvik模式最大的不同在于，在启用ART模式后，系统在安装应用的时候会进行一次预编译AOT，先将代码转换为机器语言存储在本地，这样在运行程序时就不会每次都进行一次编译了，执行效率也大大提升。如果您的应用在 ART 上运行效果很好，那么它应该也可在 Dalvik 上运行，但反过来不一定。），每个Java程序都运行在ART虚拟机上，该虚拟机专门针对移动设备进行了定制，每个应用都有其自己的 Android Runtime (ART) 实例    
    
### (4). 硬件抽象层（Hardware Abstraction Layer）    
 硬件抽象层 （HAL）提供了将设备硬件功能展示给更高级`Java框架API`的标准接口。 HAL由多个库模块组成，其中每个模块都为特定类型的硬件组件（如相机或蓝牙模块）实现接口。 当框架API调用访问设备硬件时，Android系统会自动为该硬件组件加载库模块    
    
### (5). Linux内核层    
Android是基于Linux内核的（Linux内核提供了安全性、内存管理、进程管理、网络协议和驱动模型等核心系统服务），Linux内核层为各种硬件提供了驱动程序，如显示驱动、相机驱动、蓝牙驱动、电池管理等等   
  
## 3. Android的Context    
[http://blog.csdn.net/lmj623565791/article/details/40481055](http://blog.csdn.net/lmj623565791/article/details/40481055)   

## 4. Java基础知识面试（数据类型）

[参考-AVA面试基础篇及答案](https://blog.csdn.net/qq_22067469/article/details/85808492)

## 5. 设计模式（单例，工厂，观察者。作用，使用场景）  
一般说自己会的就ok，不要只记得名字就一轮嘴说出来，不然有你好受。    
[http://blog.csdn.net/jason0539/article/details/23297037/](http://blog.csdn.net/jason0539/article/details/23297037/)  
  
http://gold.xitu.io/entry/56ebb4ad5bbb50004c440972  

## 6. 常用的Java设计模式，（手写单列设计模式，饿汉式，懒汉式区别，）线程安全，validate关键字的作用

## 7. java中的左移，右移位运算

## 8.面试题——常见5种运行时异常  
  
[参考-# 常见5种运行时异常](https://blog.csdn.net/iblade/article/details/50523263)
## 9. Android的四大组件是哪些，它们的作用    
    
Activity：Activity是Android程序与用户交互的窗口，是Android构造块中最基本的一种，它需要为保持各界面的状态，做很多持久化的事情，妥善管理生命周期以及一些跳转逻辑    
    
Service：后台服务于Activity，封装有一个完整的功能逻辑实现，接受上层指令，完成相关的事物，定义好需要接受的Intent提供同步和异步的接口    
    
Content Provider：是Android提供的第三方应用数据的访问方案，可以派生Content Provider类，对外提供数据，可以像数据库一样进行选择排序，屏蔽内部数据的存储细节，向外提供统一的接口模型，大大简化上层应用，对数据的整合提供了更方便的途径    
    
BroadCast Receiver：接受一种或者多种Intent作触发事件，接受相关消息，做一些简单处理，转换成一条Notification，统一了Android的事件广播模型    
    
## 10. Activity的生命周期    
    
Activity的生命周期方法有：onCreate()、onStart()、onReStart()、onResume()、onPause()、onStop()、onDestory()；    
    
1、完整生命周期: 即从一个Activity从出现到消失，对应的周期方法是从onCreate()到onDestroy()    
    
2、前景生命周期: 当Activity处于Activity栈最顶端，能够与其他用户进行交互时，将多次执行从onResume()到onPause()    
  
3、可见生命周期: 当Activity处于可以用户看见的状态，但不一定能与用户交互时，将多次执行从onStart()到onStop()    
  
**如下例子**  
  
 * A页面跳B页面，然后finish B  A生命周期：onPaused，onStop；onRestart，onResume  
  
 - A页面按Home键  A生命周期：onPaused，onStop  
  
## 11. 如果后台的Activity由于某原因被系统回收了，如何在被系统回收之前保存当前状态？  
  
重写`onSaveInstanceState()`方法，在此方法中保存需要保存的数据，该方法将会在Activity被回收之前调用。     
  
通过重写`onRestoreInstanceState()`方法可以从中获取保存好的数据  
    
## 12. Activity的启动模式有哪些？是什么含义？    
    
在Android里，有4种Activity启动模式，分别是 standard、singleTop、singleTask、singleInstance    
    
  - standard：标准启动模式，也是Android默认的启动模式    
  - singleTop：如果设置了该模式，当前的Acitivity如果存在任务栈顶，则不需要创建新的activity    
   - singleTask：如果设置了该模式，当前的Acitivity如果存在任务栈中，则不需要创建新的activity实例，并把这个activity之上的实例，通通出栈    
   - singleInstance：如果设置了该模式，当前的Acitivity如果存在该应用中的任何一个任务栈中，则不需要创建新的activity；    
## 13. 如何退出Activity？如何安全退出已调用多个Activity的Application？  
  
对于单一Activity的应用来说，退出很简单，直接finish()即可。当然，也可以用killProcess()和System.exit()这样的方法。  
  
对于多个Activity  
  
> 1、**记录打开的Activity**：每打开一个Activity，就记录下来。在需要退出时，关闭每一个Activity即可    
> 2、**发送特定广播**：在需要结束应用时，发送一个特定的广播，每个Activity收到广播后，关闭即可    
> 3、**递归退出**：在打开新的Activity时使用startActivityForResult，然后自己加标志，在onActivityResult中处理，递归关闭    
  
<font color=#0099ff size=4 face="黑体"><b>Tips：</b></font>  
  
>为了编程方便，最好定义一个Activity基类，处理这些共通问题。  
    
## 14. 请介绍下Android中常用的五种布局    
    
常用五种布局方式，分别是：FrameLayout（框架布局），LinearLayout （线性布局），AbsoluteLayout（绝对布局），RelativeLayout（相对布局），TableLayout（表格布局）。    
    
一、**FrameLayout**：所有东西依次都放在左上角，会重叠，这个布局比较简单，也只能放一点比较简单的东西。    
二、**LinearLayout**：线性布局，每一个LinearLayout里面又可分为垂直布局（android:orientation="vertical"）和水平布局（android:orientation="horizontal" ）。当垂直布局时，每一行就只有一个元素，多个元素依次垂直往下；水平布局时，只有一行，每一个元素依次向右排列。    
三、**AbsoluteLayout**：绝对布局用X,Y坐标来指定元素的位置，这种布局方式也比较简单，但是在屏幕旋转时，往往会出问题，而且多个元素的时候，计算比较麻烦。    
四、**RelativeLayout**：相对布局可以理解为某一个元素为参照物，来定位的布局方式  
> 主要属性：   
> * 相对于某元素-> android:layout_below、 android:layout_toLeftOf  
> * 相对于父元素-> android:layout_alignParentLeft、android:layout_alignParentRigh  
  
五、**TableLayout**：表格布局，每一个TableLayout里面有表格行TableRow，TableRow里面可以具体定义每一个元素。每一个布局都有自己适合的方式，这五个布局元素可以相互嵌套应用，做出美观的界面    
    
## 15. Android中的动画有哪几类，它们的特点和区别是什么    
Android中动画有三类，分别是FrameAnimation，TweenAnimation，PropertyAnimation    
    
>* FrameAnimation（逐帧动画）：将多张图片组合起来进行播放，类似于早期电影的工作原理，很多App的loading是采用这种方式。    
>* TweenAnimation（补间动画）：是对某个View进行一系列的动画的操作，包括淡入淡出（Alpha），缩放（Scale），平移（Translate），旋转（Rotate）四种模式。    
>* PropertyAnimation（属性动画android3.0+）：属性动画不再仅仅是一种视觉效果了，而是一种不断地对值进行操作的机制，并将值赋到指定对象的指定属性上，可以是任意对象的任意属性。    
  
  <font color=#0099ff size=4 face="黑体"><b>Tips：</b></font>  
  >属性动画实现原理就是修改控件的属性值实现的动画    
  
  **此处延伸：**  
  * [Android动画使用详解](https://blog.csdn.net/yanbober/article/details/46481171)    
## 16. 什么情况会导致Force Close ？如何避免？能否捕获导致其的异常？  
程序出现异常，比如nullpointer，在logcat中能看到异常信息，找出异常信息并修改程序。  
  
## 17. 什么是ANR 如何避免它？  
  
ANR：Application Not Responsable。在Android中，Java API框架层的ActivityManager和WindowManager负责监视应用程序的响应，当用户操作的在5s内应用程序没能做出反应，BroadcastReceiver在10秒内没有执行完毕，就会出现应用程序无响应对话框，既ANR。  
  
<font color=#0099ff size=4 face="黑体">避免方法：</font>Activity的关键生命周期方法（如onCreate()和onResume()）里尽可能少的去做创建操作，潜在的耗时操作。例如网络或数据库操作，或者高耗时的计算如改变位图尺寸，这些操作都应该在子线程里（或者异步方式）来完成。主线程应该为子线程提供一个Handler，以便完成时能够将任务提交给主线程。  
  
  <font color=#0099ff size=4 face="黑体"><b>Tips：</b></font>  
>腾讯微信发送消息19+15个句号发生ANR了  
  
  **此处延伸：**  
  
 - [Android内存泄漏分析与解决办法](我的知乎)  
  
## 18. 运行时权限与文件系统权限的区别  
运行时权限Android(`Dalvik`或`ART`)授权  
  
文件系统权限`Linux`内核授权  
  
## 19. Android dvm的进程和Linux的进程, 应用程序的进程是否为同一个概念  
  
DVM指dalivk虚拟机。每一个Android应用程序都在它自己的进程中运行，都拥有一个独立的`Dalvik`或`ART`虚拟机实例。而每一个`DVM`或`ART`都是在Linux 中的一个进程，所以说可以认为是同一个概念。  
  
## 20. Java虚拟机和Dalvik虚拟机的区别  
[http://www.jianshu.com/p/923aebd31b65](http://www.jianshu.com/p/923aebd31b65)  
  
## 21. 什么是嵌入式实时操作系统, Android 操作系统属于实时操作系统吗?  
  
嵌入式实时操作系统是指当外界事件或数据产生时，能够接受并以足够快的速度予以处理，其处理的结果又能在规定的时间之内来控制**生产过程**或对系统作出快速响应，并控制所有**实时任务**协调一致运行的嵌入式操作系统。主要用于工业控制、 军事设备、 航空航天等领域对系统的响应时间有苛刻的要求，这就需要使用实时系统。又可分为软实时和硬实时两种，Android是基于Linux内核的，因此属于软实时。  
  
## 22. 一条最长的短信息约占多少byte?  
  
中文70(包括标点)，英文160，160个字节。  
  
## 23. 如何将SQLite数据库(dictionary.db文件)与apk文件一起发布**  
  
可以将dictionary.db文件复制到Android工程中的res aw目录中。所有在res aw目录中的文件不会被压缩，这样可以直接提取该目录中的文件。  
  
## 24. 如何打开res aw目录中的数据库文件?  
  
在Android中不能直接打开`res aw`目录中的数据库文件，而需要在程序第一次启动时将该文件复制到手机内存或SD卡的某个目录中，然后再打开该数据库文件。  
  
复制的基本方法是使用`getResources().openRawResource`方法获得res aw目录中资源的 InputStream对象，然后将该InputStream对象中的数据写入其他的目录中相应文件中。在Android SDK中可以使用`SQLiteDatabase.openOrCreateDatabase`方法来打开任意目录中的SQLite数据库文件。  
  
##  25. DDMS和TraceView的区别?  
  
DDMS是一个程序执行查看器，在里面可以看见线程和堆栈等信息，TraceView是程序性能分析器 。  
  
## 26. Java中如何引用本地语言  
  
可以用JNI（java native interface java 本地接口）接口   
  
## 27. JNI编程  
[http://www.jianshu.com/p/aba734d5b5cd](http://www.jianshu.com/p/aba734d5b5cd)    
  
### 什么是NDK  
  
NDK 其中NDK的全拼是：Native Develop Kit。  
  
那我们先来看下Android NDK官网是对NDK怎么解释的  
  
>Android NDK 是一套允许您使用原生代码语言(例如C和C++) 实现部分应用的工具集。在开发某些类型应用时，这有助于您重复使用以这些语言编写的代码库。  
  
Android 开发语言是Java，不过我们也知道，Android是基于Linux的，其核心库很多都是C/C++的，比如Webkit等。那么NDK的作用，就是Google为了提供给开发者一个在Java中调用C/C++代码的一个开发kit。NDK本身其实就是一个交叉工作链，包含了Android上的一些库文件，然后，NDK为了方便使用，提供了一些脚本，使得更容易的编译C/C++代码。总之，在Android的SDK之外，有一个工具就是NDK，用于进行C/C++的开发。一般情况，是用NDK工具把C/C++编译为.so文件，然后在Java中调用。  
  
  
### 什么是JNI  
  
JNI是Java平台的一个特性(并不是Android系统特有的)，它是一个协议，全称：Java Native Interface。  
主要是定义了一些JNI函数，让开发者可以通过调用这些函数，实现Java代码调用C/C++的代码，C/C++的代码也可以调用Java的代码，  
这样就可以发挥各个语言的特点了  
  
使用JNI优点：  
  
* java反编译比C语言容易，一般加密算法都是用C语言编写，不容易被反编译  
* 效率上 C/C++是本地语言，比java更高效  
* 代码移植，如果之前用C语言开发过模块，可以复用已经存在的c代码  
  
  
### JNI使用  
  
* step 1：在Java中先声明一个native方法  
* step 2：编译Java源文件得到.class文件  
* step 3：通过javah -jni命令导出JNI的.h头文件  
* step 4：使用Java需要交互的本地代码，实现在Java中声明的Native方法（如果Java需要与C++交互，那么就用C++实现Java的Native方法。）  
* step 5：将本地代码编译成动态库(Windows系统下是.dll文件，如果是Linux系统下是.so文件，如果是Mac系统下是.jnilib)  
* step 6：在Activity里面直接调用本地.so库文件的方法  
  
  
1、新建一个类，声明native方法。这个类是java与C/C++交互的媒介，方法由java声明，由C/C++实现。  
  
Tips:不在Activity类里面写是为了避免编译时报错：找不到android.support.v7.app.AppCompatActivity  
  
    public class myJNI {  
    　　//加载so库  
        static {  
            System.loadLibrary("JniTest");  
        }  
    　　//native方法  
        public static native String sayHello();  
    }  
  
2、打开android studio终端Terminals，用javac编译上述文件，生成class文件  
      
    javac myJNI.java  
      
  
  
3、确认自己类的包名，在上一级的位置使用javah -jni命令生成.h头文件  
  
特别注意：一定要在上一级哦，不然会报错：找不到xxx类  
  
  
比如我的myJNI.class在  
  
>D:\public\android\open\ref_jni\app\src\main\java\com\example\bin\testjni    
  
我的包名是：  
  
    package com.example.binbin.testjni;  
所以我的javah命令应该这么写:  
  
>D:\public\android\ref_jni\app\src\main\java>javah -jni com.example.bin.testjni.myJNI  
  
  
然后就能看到生成了一个h文件。  
  
   
  
4、新建一个jni文件夹，新建main.c，把.h里面的内容复制进去，并实现里面的函数。  
  
生成的h文件  
  
    /* DO NOT EDIT THIS FILE - it is machine generated */  
    #include <jni.h>  
    /* Header for class com_example_bin_testjni_myJNI */  
      
    #ifndef _Included_com_example_bin_testjni_myJNI  
    #define _Included_com_example_bin_testjni_myJNI  
    #ifdef __cplusplus  
    extern "C" {  
    #endif  
    /*  
     * Class:     com_example_bin_testjni_myJNI  
     * Method:    sayHello  
     * Signature: ()Ljava/lang/String;  
     */  
    JNIEXPORT jstring JNICALL Java_com_example_bin_testjni_myJNI_sayHello  
            (JNIEnv *, jclass);  
      
    #ifdef __cplusplus  
    }  
    #endif  
    #endif  
      
拷贝修改后的main.c  
  
    /* DO NOT EDIT THIS FILE - it is machine generated */  
    #include <jni.h>  
    /* Header for class com_example_bin_testjni_myJNI */  
      
    #ifndef _Included_com_example_bin_testjni_myJNI  
    #define _Included_com_example_bin_testjni_myJNI  
    #ifdef __cplusplus  
    extern "C" {  
    #endif  
    /*  
     * Class:     com_example_bin_testjni_myJNI  
     * Method:    sayHello  
     * Signature: ()Ljava/lang/String;  
     */  
      
    //就实现了个函数 JNIEnv的用法可以自行百度，这里就不展开了  
    JNIEXPORT jstring JNICALL Java_com_example_bin_testjni_myJNI_sayHello  
            (JNIEnv *env, jclass jobj){  
      
    　　//返回一句话  
        return (*env)->NewStringUTF(env,"jni xiaotuanzi_lifangfang_i_love u");  
      
    }  
      
    #ifdef __cplusplus  
    }  
    #endif  
    #endif  
      
还要在jni文件夹下添加一个空白的util.c文件，防止会报错  
  
5、生成SO库  
  
首先要配置ndk，  
  
gradle.properties  
  
>android.useDeprecatedNdk=true  
  
然后app Module的build.gradle文件，在defaultConfig节点里添加以下代码  
  
Tips：注意这里的moduleName，是我们在之前自己编写的类里面加载的so库名  
  
        ndk {  
                   moduleName "JniTest"  
                   ldLibs "log", "z", "m"  
                   abiFilters "armeabi", "armeabi-v7a", "x86"  
               }  
    
完成以上步骤之后，我们rebuild一下就可以生成so库了，这个库在项目的  
>app\build\intermediates\ndk\debug\lib  
  
路径下  
  
6、使用JNI  
  
在src\main下新建文件夹jniLIB，并将生成的SO文件拷贝到该文件夹下  
  
因为native方法声明成了静态的方法，在Activity里面直接调用myJNI类就行  
  
    protected void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
      
            text = (TextView)findViewById(R.id.text);  
    　　　　　//调用  
            text.setText(myJNI.sayHello());  
        }  
    }  
      
ok！  
  
   
  
总结一下流程：  
  
编写静态方法（用java声明）-->编译生成class文件--->编译生成h文件---->编写C文件（用C/C++实现）  
  
---->配置NDK，rebuild生成so库---->在Activity调用（Java调用C/C++）。  
  
**此处延伸：**  
项目中使用JNI的地方，如：核心逻辑，密钥，加密逻辑  
  
**此处继续延伸：**  
  
 * [Android不同架构的机器有何不同？](https://blog.csdn.net/kester_/article/details/71055901)  
  
## 28. Android里的Intent传递的数据有大小限制吗，如何解决？  
  
Intent传递数据大小的限制大概在1M左右，超过这个限制就会静默崩溃。处理方式如下：  
  
-   进程内：EventBus，文件缓存、磁盘缓存。  
      
-   进程间：通过ContentProvider进行跨进程数据共享和传递。  
    
## 29. MVC设计模式    
    
<font color=#0099ff size=4 face="黑体">MVC模式的结构分为三部分，实体层的Model，视图层的View，以及控制层的Controller</font>    
![sunst](https://github.com/qydq/Integrate/blob/master/res/sunst_android_mvc.png?raw=true)    
-   View层其实就是程序的UI界面，用于向用户展示数据以及接收用户的输入    
-   Model层就是JavaBean实体类，用于保存实例数据    
-   Controller控制器用于更新UI界面和数据实例    
    
例如：View层接受用户的输入，然后通过Controller修改对应的Model实例；同时，当Model实例的数据发生变化的时候，需要修改UI界面，可以通过Controller更新界面；View层也可以直接更新Model实例的数据    
    
## 30. MVP设计模式    
    
### 引入的场景    
    
MVP模式是MVC模式在Android上的一种变种，在Android的架构中Activity,Fragment布局的xml相当于View。实际的开发过程中，Activity和Fragment占据了大部分的开发工作，这就导致了在实际开发中View层太过耦合，一不小心，几次代码迭代过后，一个Activity或者Fragment中的代码就有几千行，有时候修改个功能在笨重的代码中摸爬滚打半天才找到关键点，对于不熟悉代码的开发者来说（或者接手前人编写代码的质量过低）维护起来及其困难，所以将视图和业务逻辑代码分开势在必行    
    
Google在Github上开源的<font color=#0099ff size=4 face="黑体">[todo-mvp](https://github.com/googlesamples/android-architecture/tree/todo-mvp/)</font>项目就是MVP的前身。这种设计模式（或者说代码结构）专门是为优化Activity和Fragment的代码而产生的，但这个模式并不就说一定就非常好，只不过有它的好处的初衷：   
  >想让代码结构更加的清晰，逻辑耦合度降低    
    
### MVP的介绍    
MVP 全称是Model - View - Presenter ，是模型(model)－视图(view)－呈现器(presenter)的缩写    
![susnt](https://github.com/qydq/Integrate/blob/master/res/sunst_android_mvp.png?raw=true)    
>* <b>Model：</b><font color=#dd0000 size=4 face="黑体">业务逻辑和数据处理(数据库存储操作，网络数据请 求，复杂算法，耗时操作)</font>    
>* <b>View :</b> <font color=#dd0000 size=4 face="黑体">对应于Activity，负责View的绘制以及与用户交互</font>    
>* <b>Presenter：</b><font color=#dd0000 size=4 face="黑体">负责完成View于Model间的交互 (有一点还需要注意，presenter是双向绑定的关系，因此，在设计的时候就要注意接口和抽象的使用，尽可能的降低代码的耦合度，这也是mvp的宗旨)</font>    
    
按照MVC的分层，Activity和Fragment属于View层，用于展示UI界面，以及接收用户的输入，此外还要承担一些生命周期的工作。Activity是在Android开发中充当非常重要的角色，特别是TA的生命周期的功能，所以开发的时候我们经常把一些业务逻辑直接写在Activity里面，这非常直观方便，代价就是Activity会越来越臃肿，超过1000行代码是常有的事，而且如果是一些可以通用的业务逻辑（比如用户登录），写在具体的Activity里就意味着这个逻辑不能复用了。如果有进行代码重构经验的人，看到1000+行的类肯定会有所顾虑。因此，Activity不仅承担了View的角色，还承担了一部分的Controller角色，这样一来V和C就耦合在一起了，虽然这样写方便，但是如果业务调整的话，要维护起来就难了，所以有必要在Activity中，把View和Controller抽离开来，而这就是MVP模式的工作了    
    
<font color=#0099ff size=4 face="黑体">MVP模式的核心思想：</font>    
    
> MVP把Activity中的UI逻辑抽象成View接口，把业务逻辑抽象成Presenter接口，Presenter是Model和View之间的桥梁    
    
### MVP作用    
    
-   分离了视图逻辑和业务逻辑，降低了耦合    
    
-   Activity只处理生命周期的任务，代码变得更加简洁    
    
-   视图逻辑和业务逻辑分别抽象到了View和Presenter的接口中去，提高代码的可阅读性    
    
-   Presenter被抽象成接口，可以有多种具体的实现，所以方便进行单元测试    
    
-   把业务逻辑抽到Presenter中去，避免后台线程引用着Activity导致Activity的资源无法被系统回收从而引起内存泄露和OOM    
    
其中最重要的有三点：    
    
#### （1） Activity 代码变得更加简洁    
    
相信很多人阅读代码的时候，都是从Activity开始的，对着一个1000+行代码的Activity，看了都觉得难受。    
    
使用MVP之后，Activity就能瘦身许多了，基本上只有FindView、SetListener以及Init的代码。其他的就是对Presenter的调用，还有对View接口的实现。这种情形下阅读代码就容易多了，而且你只要看Presenter的接口，就能明白这个模块都有哪些业务，很快就能定位到具体代码。Activity变得容易看懂，容易维护，以后要调整业务、删减功能也就变得简单许多。    
    
#### （2）方便进行单元测试    
    
一般单元测试都是用来测试某些新加的业务逻辑有没有问题，如果采用传统的代码风格（习惯性上叫做MV模式，少了P），我们可能要先在Activity里写一段测试代码，测试完了再把测试代码删掉换成正式代码，这时如果发现业务有问题又得换回测试代码，咦，测试代码已经删掉了！好吧重新写吧……    
    
MVP中，由于业务逻辑都在Presenter里，我们完全可以写一个PresenterTest的实现类继承Presenter的接口，现在只要在Activity里把Presenter的创建换成PresenterTest，就能进行单元测试了，测试完再换回来即可。万一发现还得进行测试，那就再换成PresenterTest吧。    
    
####（3）避免 Activity 的内存泄露    
    
Android APP 发生OOM的最大原因就是出现内存泄露造成APP的内存不够用，而造成内存泄露的两大原因之一就是Activity泄露（Activity Leak）（另一个原因是Bitmap泄露（Bitmap Leak））    
    
> Java一个强大的功能就是其虚拟机的内存回收机制，这个功能使得Java用户在设计代码的时候，不用像C++用户那样考虑对象的回收问题。然而，Java用户总是喜欢随便写一大堆对象，然后幻想着虚拟机能帮他们处理好内存的回收工作。可是虚拟机在回收内存的时候，只会回收那些没有被引用的对象，被引用着的对象因为还可能会被调用，所以不能回收    
    
Activity是有生命周期的，用户随时可能切换Activity，当APP的内存不够用的时候，系统会回收处于后台的Activity的资源以避免OOM    
    
采用传统的MVC模式，一大堆异步任务和对UI的操作都放在Activity里面，比如你可能从网络下载一张图片，在下载成功的回调里把图片加载到 Activity 的 ImageView 里面，所以异步任务保留着对Activity的引用。这样一来，即使Activity已经被切换到后台（onDestroy已经执行），这些异步任务仍然保留着对Activity实例的引用，所以系统就无法回收这个Activity实例了，结果就是Activity Leak。Android的组件中，Activity对象往往是在堆（Java Heap）里占最多内存的，所以系统会优先回收Activity对象，如果有Activity Leak，APP很容易因为内存不够而OOM。    
    
采用MVP模式，只要在当前的Activity的onDestroy里，分离异步任务对Activity的引用，就能避免 Activity Leak。    
    
### MVP使用示例    
以最常用的网络数据请求为例    
    
先来明确下MVP中各个环节的责任划分，然后照此进行代码布局    
    
责任划分：    
>* Model: 定义并实现获取数据操作(如数据库读取、网络加载)的接口    
>* View: 定义并在Activity,Fragment等中实现用于界面处理(初始化，数据展示)的接口    
>* Presenter: 定义用于调用Model中的数据请求方法的接口，实现此接口，并实现Model中定义的数据请求的接口    
    
通过上面的介绍，MVP的主要特点就是把Activity里的许多逻辑都抽离到View和Presenter接口中去，并由具体的实现类来完成    
#### Step 1/编写Model逻辑    
数据请求接口(如数据库读取、网络加载)的定义：    
```    
/**    
 * Model层接口---实现该接口的类负责实际的获取数据操作，如数据库读取、网络加载    
 */    
public interface IModel  {    
   void getData(Model.LoadDataCallback callback);    
}    
```    
数据请求接口的实现：    
```    
/**    
 * 实现IModel接口，负责实际的数据获取操作（数据库读取，网络加载等），然后通过自己的接口（LoadDataCallback）反馈出去    
 */    
public class Model implements IModel {    
    
    @Override    
    public void getData(final LoadDataCallback callback) {    
        //数据获取操作，如数据库查询、网络加载等    
        new Thread() {    
            @Override    
            public void run() {    
                try {    
                    //模拟耗时操作    
                    Thread.sleep(3000);    
                    //获取到了数据    
                    String data = "我是获取到的数据";    
                    //将获取的数据通过接口反馈出去    
                    callback.success(data);    
                } catch (InterruptedException e) {    
                    e.printStackTrace();    
                    //获取数据失败的回调    
                    callback.failure();    
                }    
            }    
        }.start();    
    }    
    
    /**    
     * 用于回传请求的数据的回传    
     */    
    public interface LoadDataCallback {    
    
        void success(String taskId);    
    
        void failure();    
    }    
}    
```    
#### Step 2/编写View逻辑    
定义用于界面处理(初始化，数据展示)的接口    
```    
/**    
 * View层接口---执行各种UI操作，定义的方法主要是给Presenter中来调用的    
 */    
public interface IView {    
    
    void showLoadingProgress(String message);    
    
    void showData(String text);    
}    
```    
在Activity,Fragment等中对接口的实现    
```    
/**    
 * 实现IView接口并实现各种UI操作的方法（其他的业务逻辑在Presenter中进行操作）    
 */    
public class ViewActivity extends AppCompatActivity implements IView {    
    private Button mBtnShowToast;    
    private TextView mText;    
    private MyHandler mHandler = new MyHandler(ViewActivity.this);    
    private IPresenter mPresenter;    
    
    @Override    
    protected void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);    
        setContentView(R.layout.activity_mvp);    
    
        //实例化Presenter，并将实现了IView接口的类传入进去    
        mPresenter = new Presenter(ViewActivity.this);    
    
        mBtnShowToast = findViewById(R.id.btn_show_toast);    
        mText = findViewById(R.id.text);    
    
        mBtnShowToast.setOnClickListener(new View.OnClickListener() {    
            @Override    
            public void onClick(View v) {    
                //通过Presenter来实现业务逻辑操作，View层只负责UI相关操作    
                mPresenter.loadData();    
            }    
        });    
    }    
    
    @Override    
    public void showLoadingProgress(final String message) {    
        mHandler.post(new Runnable() {    
            @Override    
            public void run() {    
                mText.setText(message);    
            }    
        });    
    }    
    
    @Override    
    public void showData(final String text) {    
        mHandler.post(new Runnable() {    
            @Override    
            public void run() {    
                mText.setText(text);    
            }    
        });    
    }    
    
    private static class MyHandler extends Handler {    
    
        //弱引用，防止内存泄露    
        WeakReference<ViewActivity> weakReference;    
    
        public MyHandler(ViewActivity activity) {    
            this.weakReference = new WeakReference<ViewActivity>(activity);    
        }    
    
        @Override    
        public void handleMessage(Message msg) {    
            switch (msg.what) {    
                case 1:    
                    weakReference.get().mText.setText(msg.what);    
                    break;    
            }    
        }    
    }    
}    
```    
#### Step 3/编写presenter逻辑(重点关注)    
presenter层很重要，为什么这样说呢？    
因为MVP模式中，View和Model是不直接交互的，而是通过presenter这个纽带来进行交互-----------View通过presenter对象来调用Model中数据请求的接口，而Model中数据请求的结果会通过presenter中定义的接口回调给presenter，然后presenter在通知给View。    
    
定义用于调用Model中的数据请求方法的接口：    
具体实现：    
```    
/**    
 * Presenter层接口---控制Model层的数据操作及调用View层的UI操作来完成“中间人”工作    
 */    
public interface IPresenter {    
    
    void loadData();    
    
}    
```    
定义用于调用Model中的数据请求方法的接口，实现此接口，并实现M中定义的数据请求的接口    
```    
/**    
 * Presenter层接口---控制Model层的数据操作及调用View层的UI操作来完成“中间人”工作.    
 * 用于model和view的相关方法的调用    
 */    
public class Presenter implements IPresenter, Model.LoadDataCallback {    
    
    private final IView mView;    
    private final Model mModel;    
    
    public Presenter(IView view) {    
        mView = view;    
        mModel = new Model();    
    }    
    
    @Override    
    public void loadData() {    
        mView.showLoadingProgress("加载数据中");    
        mModel.getData(Presenter.this);    
    }    
    
    @Override    
    public void success(String data) {    
        mView.showData(data);    
    }    
    
    @Override    
    public void failure() {    
    
    }    
}    
```    
大家要多看，多试验，最重要的是**理解思路**，Google官方的MVP代码大家可以去研读一下，是同一个模式，只不过它把好多接口集成在一个接口文件中，防止代码碎片化，大家研读时记住这一点，就不会困惑了。    
    
## 31. ListView的优化方案    
    
1、如果自定义适配器，那么在getView方法中要考虑方法传进来的参数contentView是否为null，如果为null就创建contentView并返回，如果不为null则直接使用。在这个方法中尽可能少创建view    
    
2、给contentView设置tag（setTag（）），传入一个viewHolder对象，用于缓存要显示的数据，可以达到图像数据异步加载的效果    
    
3、如果listview需要显示的item很多，就要考虑分页加载。比如一共要显示100条或者更多的时候，我们可以考虑先加载20条，等用户拉到列表底部的时候再去加载接下来的20条    
    
  <font color=#0099ff size=4 face="黑体"><b>Tips：</b></font>  
>ListView已经过时了，现在使用RecycleView替代，RecycleView不仅能替代ListView还能替代GridView    
  
## 32. RecyclerView使用过吗？  
[http://blog.csdn.net/lmj623565791/article/details/45059587](http://blog.csdn.net/lmj623565791/article/details/45059587)  
    
  这里推荐一下我的两篇关于RecycleView的内容，你可以通过an系列框架快速集成非常绚丽的RecycleView，[可以关注我知乎](https://www.zhihu.com/people/qydq/)    
    
* [RecyclerView解析之下拉刷新与上拉加载SwipeRefreshLayout（含分割线工具类）](https://zhuanlan.zhihu.com/p/22362839)    
    
* [ViewPager,RecyclerView,SrollView嵌套事件冲突解决](https://zhuanlan.zhihu.com/p/32748913)    
  
## 33. Android的数据存储方式    
> * SharedPreferences存储；   
> * 文件存储；   
> * SQLite数据库存储；   
> * ContentProvider存储；   
> * 网络存储  
  
Preference，File， DataBase这三种方式分别对应的目录是`/data/data/Package Name/Shared_Pref`,  
`/data/data/Package Name/files`,  
`/data/data/Package Name/database`  
    
### （1）使用SharedPreferences存储数据    
    
首先说明SharedPreferences存储方式，它是 Android提供的用来存储一些简单配置信息的一种机制，例如：登录用户的用户名与密码。其采用了Map数据结构来存储数据，以键值的方式存储，可以简单的读取与写入，具体实例如下：    
#### sp写数据    
```    
SharedPreferences user = getSharedPreferences(“sun_info”,"0");    
user.edit();    
user.putString(“message”, "XiXi Love U");    
user.putString(“time” ,"forever");    
user.commit();    
```    
#### sp读数据    
```    
SharedPreferences user = getSharedPreferences("sun_info","0");`    
message = user.getString("message","陈夕");    
time = user getString(“time” ,"永远");    
```    
    
数据读取与写入的方法都非常简单，只是在写入的时候有些区别：先调用edit()使其处于编辑状态，然后才能修改数据，最后使用commit()提交修改的数据。实际上SharedPreferences是采用了XML格式将数据存储到设备中，在DDMS中的File Explorer中的/data/data/<package name>/shares_prefs下    
    
>使用SharedPreferences是有些限制的：只能在同一个包内使用，不能在不同的包之间使用。    
  
### （2）文件存储数据    
    
文件存储方式是一种较常用的方法，在Android中读取/写入文件的方法，与 Java中实现I/O的程序是完全一样的，提供了openFileInput()和openFileOutput()方法来读取设备上的文件。具体实例如下:    
    
`String fn = “moandroid.log”;`    
    
`FileInputStream fis = openFileInput(fn);`    
    
`FileOutputStream fos = openFileOutput(fn,Context.MODE_PRIVATE);`    
    
### （3）网络存储数据    
    
网络存储方式，需要与Android 网络数据包打交道，关于Android 网络数据包的详细说明，请阅读Android SDK引用了Java SDK的哪些package？。    
    
### （4）ContentProvider    
    
#### 1、ContentProvider简介    
    
当应用继承ContentProvider类，并重写该类用于提供数据和存储数据的方法，就可以向其他应用共享其数据。虽然使用其他方法也可以对外共享数据，但数据访问方式会因数据存储的方式而不同，如：采用文件方式对外共享数据，需要进行文件操作读写数据；采用sharedpreferences共享数据，需要使用sharedpreferences API读写数据。而使用ContentProvider共享数据的好处是统一了数据访问方式。    
    
#### 2、Uri类简介    
    
Uri代表了要操作的数据，Uri主要包含了两部分信息：1.需要操作的ContentProvider ，2.对ContentProvider中的什么数据进行操作，一个Uri由以下几部分组成：    
    
*  scheme：ContentProvider（内容提供者）的scheme已经由Android所规定为：content://…    
* 主机名（或Authority）：用于唯一标识这个ContentProvider，外部调用者可以根据这个标识来找到它    
    
 * 路径（path）：可以用来表示我们要操作的数据，路径的构建应根据业务而定，如下：    
    
要操作contact表中id为10的记录，可以构建这样的路径:/contact/10    
    
要操作contact表中id为10的记录的name字段， contact/10/name    
    
要操作contact表中的所有记录，可以构建这样的路径:/contact?    
    
要操作的数据不一定来自数据库，也可以是文件等他存储方式，如下:    
    
要操作xml文件中contact节点下的name节点，可以构建这样的路径：/contact/name    
    
如果要把一个字符串转换成Uri，可以使用Uri类中的parse()方法，如下：    
    
Uri uri = Uri.parse("content://com.changcheng.provider.contactprovider/contact")    
    
#### 3、UriMatcher、ContentUrist和ContentResolver简介    
    
因为Uri代表了要操作的数据，所以我们很经常需要解析Uri，并从 Uri中获取数据。Android系统提供了两个用于操作Uri的工具类，分别为UriMatcher 和ContentUris 。掌握它们的使用，会便于我们的开发工作。    
    
UriMatcher：用于匹配Uri，它的用法如下：    
    
1.首先把你需要匹配Uri路径全部给注册上，如下：    
    
`//常量UriMatcher.NO_MATCH表示不匹配任何路径的返回码(-1)。`    
    
`UriMatcher uriMatcher =` `new`  `UriMatcher(UriMatcher.NO_MATCH);`    
    
`//如果match()方法匹配content://com.changcheng.sqlite.provider.contactprovider /contact路径，返回匹配码为1`    
    
`uriMatcher.addURI(“com.changcheng.sqlite.provider.contactprovider”, “contact”, 1);``//添加需要匹配uri，如果匹配就会返回匹配码`    
    
`//如果match()方法匹配content://com.changcheng.sqlite.provider.contactprovider/contact/230路径，返回匹配码为2`    
    
`uriMatcher.addURI(“com.changcheng.sqlite.provider.contactprovider”, “contact/#”, 2);``//#号为通配符`    
    
2.注册完需要匹配的Uri后，就可以使用uriMatcher.match(uri)方法对输入的Uri进行匹配，如果匹配就返回匹配码，匹配码是调用 addURI()方法传入的第三个参数，假设匹配 content://com.changcheng.sqlite.provider.contactprovider/contact路径，返回的匹配码为1。    
    
ContentUris：用于获取Uri路径后面的ID部分，它有两个比较实用的方法：    
    
withAppendedId(uri, id)用于为路径加上ID部分    
    
parseId(uri)方法用于从路径中获取ID部分    
    
ContentResolver：当外部应用需要对ContentProvider中的数据进行添加、删除、修改和查询操作时，可以使用 ContentResolver 类来完成，要获取ContentResolver 对象，可以使用Activity提供的getContentResolver()方法。 ContentResolver使用insert、delete、update、query方法，来操作数据。    
    
## 34. Activity的启动过程（不要回答生命周期）    
    
[Android启动过程远吗分析](http://blog.csdn.net/luoshengyang/article/details/6689748)    
    
在Android系统中，Activity和Service是应用程序的核心组件，它们以松藕合的方式组合在一起构成了一个完整的应用程序，这得益于应用程序框架层框架层提供了一套完整的机制来协助应用程序启动这些Activity和Service，以及提供Binder机制帮助它们相互间进行通信    
    
有两种操作会引发Activity的启动，一种用户点击应用程序图标时，Launcher会为我们启动应用程序的主Activity；应用程序的默认Activity启动起来后，它又可以在内部通过调用startActvity接口启动新的Activity，依此类推，每一个Activity都可以在内部启动新的Activity    
     
无论是通过点击应用程序图标来启动Activity，还是通过Activity内部调用startActivity接口来启动新的Activity，都要借助于应用程序框架层的ActivityManagerService服务进程  
  <font color=#0099ff size=4 face="黑体">Tips:</font>  
  
>Service也是由ActivityManagerService进程来启动的。在Android应用程序框架层中，ActivityManagerService是一个非常重要的接口，它不但负责启动Activity和Service，还负责管理Activity和Service    
>  
![enter image description here](http://hi.csdn.net/attachment/201108/14/0_1313305334OkCc.gif)  
    
下面介绍一下启动的过程    
* Step 1. 两种方式启动Activity，都通过Binder进程间通信进入到ActivityManagerService进程中，并且调用ActivityManagerService.startActivity接口；     
    
* Step 2. ActivityManagerService调用ActivityStack.startActivityMayWait来做准备要启动的Activity的相关信息；    
    
* Step 3. ActivityStack通知ApplicationThread要进行Activity启动调度了，这里的ApplicationThread代表的是调用ActivityManagerService.startActivity接口的进程，对于通过点击应用程序图标的情景来说，这个进程就是Launcher了，而对于通过在Activity内部调用startActivity的情景来说，这个进程就是这个Activity所在的进程了；    
    
 * Step 4. ApplicationThread不执行真正的启动操作，它通过调用ActivityManagerService.activityPaused接口进入到ActivityManagerService进程中，看看是否需要创建新的进程来启动Activity；    
    
 * Step 5. 对于通过点击应用程序图标来启动Activity的情景来说，ActivityManagerService在这一步中，会调用startProcessLocked来创建一个新的进程，而对于通过在Activity内部调用startActivity来启动新的Activity来说，这一步是不需要执行的，因为新的Activity就在原来的Activity所在的进程中进行启动；    
    
 * Step 6. ActivityManagerServic调用ApplicationThread.scheduleLaunchActivity接口，通知相应的进程执行启动Activity的操作；    
    
* Step 7. ApplicationThread把这个启动Activity的操作转发给ActivityThread，ActivityThread通过ClassLoader导入相应的Activity类，然后把它启动起来。    
    
这样，Android应用程序的Activity启动过程就启动起来了    
    
## 35. Android进程间通信IPC机制Binder简单介绍    
在Android系统中，每一个应用程序都是由一些Activity和Service组成的，这些Activity和Service有可能运行在同一个进程中，也有可能运行在不同的进程中,那么，不在同一个进程的Activity或者Service是如何通信的呢？    
    
Binder是一种进程间通信机制，它是一种类似于COM和CORBA分布式组件架构，通俗一点，其实是提供远程过程调用RPC(Remote Procedure Call)功能。从英文字面上意思看，Binder具有粘结剂的意思，那么它把什么东西粘结在一起呢？    
    
在Android系统中，Binder机制是由系统组件组成的，分别是Client、Server、Service Manager和Binder驱动程序，    
    
>* Client、Server和Service Manager运行在用户空间；    
>* Binder驱动程序运行内核空间    
    
Binder就是把这四个组件粘合在一起的粘结剂了，其中，核心组件便是Binder驱动程序了，Service Manager提供了辅助管理的功能，Client和Server正是在Binder驱动和Service Manager提供的基础设施上，进行Client-Server之间的通信。Service Manager和Binder驱动已经在Android平台中实现好，开发者只要按照规范实现自己的Client和Server组件就可以了。    
    
说起来简单，做起难，对初学者来说，Android系统的Binder机制是最难理解的了，而Binder机制无论从系统开发还是应用开发的角度来看，都是Android系统中最重要的组成，因此，很有必要深入了解Binder的工作方式。要深入了解Binder的工作方式，最好的方式莫过于是阅读Binder相关的源代码了，Linux的鼻祖Linus Torvalds曾经曰过一句名言RTFSC：    
    
>Read The Fucking Source Code    
    
总结一下，Android系统Binder机制中的四个组件Client、Server、Service Manager和Binder驱动程序的关系如下图所示    
![Binder机制4组件关系图xixi](https://github.com/qydq/Integrate/blob/master/res/sunst_android_binder.jpeg?raw=true)    
    
 * 1. Client、Server和Service Manager实现在用户空间中，Binder驱动程序实现在内核空间中    
* 2. Binder驱动程序和Service Manager在Android平台中已经实现，开发者只需要在用户空间实现自己的Client和Server    
* 3. Binder驱动程序提供设备文件/dev/binder与用户空间交互，Client、Server和Service Manager通过open和ioctl文件操作函数与Binder驱动程序进行通信    
 * 4. Client和Server之间的进程间通信通过Binder驱动程序间接实现    
 *  5. Service Manager是一个守护进程，用来管理Server，并向Client提供查询Server接口的能力    
    
至此，对Binder机制总算是有了一个感性的认识，但仍然感到不能很好地从上到下贯穿整个IPC通信过程，推荐下面四个情景，分析Binder源代码的文章，以进一步理解Binder机制    
  
> * [1. Service Manager是如何成为一个守护进程的？即Service  
> Manager是如何告知Binder驱动程序它是Binder机制的上下文管理者](http://blog.csdn.net/luoshengyang/article/details/6621566)  
> * [2. Server和Client是如何获得Service  
> Manager接口的？即defaultServiceManager接口是如何实现的](http://blog.csdn.net/luoshengyang/article/details/6627260)  
> * [3. Server是如何把自己的服务启动起来的？Service  
> Manager在Server启动的过程中是如何为Server提供服务的？即IServiceManager::addService接口是如何实现的](http://blog.csdn.net/luoshengyang/article/details/6629298)  
> * [4.  ServiceManager是如何为Client提供服务的？即IServiceManager::getService接口是如何实现的](http://blog.csdn.net/luoshengyang/article/details/6633311)  
  
---  
  
## 36. Android进程保活（不死进程）  
<font color=#0099ff size=4 face="黑体">Tips可参考：</font>  
  
[http://www.jianshu.com/p/63aafe3c12af](http://www.jianshu.com/p/63aafe3c12af)    
  
**此处延伸：**  
  
进程的优先级是什么（下面这篇文章，都有说）    
[https://segmentfault.com/a/1190000006251859](https://segmentfault.com/a/1190000006251859)  
  
  
## 37. Android进程间通信的几种实现方式    
<font color=#0099ff size=4 face="黑体">Tips可参考：</font>  
  
> [Android进程间通信 -几种方式的对比总结](https://blog.csdn.net/hzw2017/article/details/81275438)    
> [Android面试收集录14-Android进程间通信方式](https://www.cnblogs.com/Jason-Jan/p/8459687.html)  
  
### 什么是RPC    
RPC（Remote Procedure Call）即远程过程调用，它是一种通过网络，从远程计算机程序上请求服务，在不需要了解底层网络技术的协议下，即可获取计算机进程中的数据    
    
RPC使得开发包括网络分布式多程序在内的应用程序更加容易；RPC在OSI网络通信7层模型中，位于传输层与表示层之间，即位于会话层    
![RPC位于OSI网络模型中的位置xixi](https://github.com/qydq/Integrate/blob/master/res/sunst_android_rpc.jpeg?raw=true)    
### 什么是IPC    
    
IPC 即 Inter-Process Communication (进程间通信)，是指进程间数据交互的过程    
### Android进程间通信  
Android底层是基于Linux，而Linux基于安全考虑，是不允许两个进程间直接操作对方的数据，这就是进程隔离。    
    
但Android没有继承Linux中的进程通信的方式，Android有着自己进程间通信方式。常用有如下几种：    
    
#### （1）Bundle （对应于四大组件）    
[详解Android 进程间通信-4种应用程序组件](https://blog.csdn.net/baidu_29094221/article/details/78852998)    
    
总结：    
    
>1. Activity，Service，Receiver 都支持在 Intent 中传递 Bundle 数据，而 Bundle 实现了 Parcelable 接口，可以在不同的进程间进行传输    
>2. 在一个进程中启动了另一个进程的 Activity，Service 和 Receiver ，可以在 Bundle 中附加要传递的数据，通过 Intent 发送出去。    
    
Example ：跨进程访问的Activity，例如，直接调用拨打电话的Activity    
    
    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:13570**4685");  
    startActivity(callIntent);    
#### （2）文件共享    
[参考Android进程通信 - 序列化Serialzable与Parcelable中的示例](https://blog.csdn.net/hzw2017/article/details/80978663)    
    
原理：    
>* 序列化是将对象转换成字节流，持久化保存在内存、文件、数据库中。也可以通过网络传输到其他客户端     
>    
>* 反序列化是将字节流转化成对象。 这样就可以通过文件共享实现进程通信    
    
总结：    
    
Serializable和Parcelable都可以实现序列化进行数据传递。Serializable只需实现接口（保险点设置serialVersionUID值）即可，而Parcelable实现序列化使用则相对复杂些，当效率比Serializable高，Android底层做了相应的优化    
    
<font color=#0099ff size=4 face="黑体">Tips：保存到SD卡、数据库或网络传输一般使用Serializable序列化，虽然效率低些，但使用很方便。     
Intent、Bundle、Binder间的数据传递建议使用Parcelable，Android在这块做了内存序列化优化，效率高。</font>    
    
#### （3）ContentProvider（基于Binder）     
[Android进程间通信 - ContentProvider内容提供者](https://blog.csdn.net/hzw2017/article/details/81123791)    
    
ContentProvider可以跨进程访问其他应用程序中的数据（以Cursor对象形式返回），当然，也可以对其他应用程序的数据进行增、删、改操作，或共享自己的数据    
    
    
#### （4）AIDL Service（基于Binder）     
[Android进程通信 - AIDL的使用方法](https://blog.csdn.net/hzw2017/article/details/81048650)    
    
AIDL Service和Content Provider类似，也可以访问其他应用程序中的数据，     
但不同的是，ContentProvider返回的是Cursor对象，     
而Service返回的是Java对象，这种可以跨进程通讯的服务叫AIDL服务    
    
* 能自动生成Binder文件的工具，相当于工具    
#### （5）Messenger（基于Binder）     
* 类似于Hnadler发消息用法    
* [Android进程间通信 - Messenger的使用和理解](https://blog.csdn.net/hzw2017/article/details/81090319)    
    
[AIDL合Messenger对比使用](https://www.cnblogs.com/e007/p/6106482.html)    
#### （6）Socket（网络）     
[Android进程间通信 - Socket使用（TCP、UDP）](https://blog.csdn.net/hzw2017/article/details/81210979)    
  
## 38. 理解序列化吗，Android为什么引入Parcelable？  
  
所谓序列化就是将对象变成二进制流，便于存储和传输。    
-   Serializable是java实现的一套序列化方式，可能会触发频繁的IO操作，效率比较低，适合将对象存储到磁盘上的情况。  
      
-   Parcelable是Android提供一套序列化机制，它将序列化后的字节流写入到一个共性内存中，其他对象可以从这块共享内存中读出字节流，并反序列化成对象。因此效率比较高，适合在对象间或者进程间传递信息。  
## 39. 什么是Service以及描述下它的生命周期。Service有哪些启动方法，有什么区别，怎样停用Service？    
  
Android Service是运行在后台的代码，不能与用户交互，可以运行在自己的进程，也可以运行在其他应用程序进程的上下文里。需要通过某一个Activity或者Context对象来调用  
  
### 启动方法  
[http://www.jianshu.com/p/2fb6eb14fdec](http://www.jianshu.com/p/2fb6eb14fdec)    
  
Service有两个启动方法，分别是  
  
 1. Context.startService()   
 2. Context.bindService()  
  
<font color=#0099ff size=4 face="黑体">Tips：</font>  
>如果在Service执行耗时的操作需要启动一个新线程来执行。   
### 区别  
  
* startService(): 调用者与服务之间没有关连，调用者退出后Service仍然存在。  
* bindService(): 调用者与服务绑定在了一起，调用者一旦退出，Service也随即终止。  
### 生命周期  
Context.startService()方法启动服务，在服务未被创建时，系统会先调用服务的onCreate()方法，接着调用onStart()方法。如果调用startService()方法前服务已经被创建，多次调用startService()方法并不会导致多次创建服务，<b>但会导致多次调用onStart()方法</b>。采用startService()方法启动的服务，<b>只能调用Context.stopService()方法结束服务</b>，服务结束时会调用onDestroy()方法。  
  
Context.bindService()方法启动服务，在服务未被创建时，系统会先调用服务的`onCreate()`方法，接着调用onBind()方法。这个时候调用者和服务绑定在一起，调用者退出了，系统就会先调用服务的onUnbind()方法，接着调用onDestroy()方法。<b>如果调用bindService()方法前服务已经被绑定，多次调用bindService()方法并不会导致多次创建服务及绑定</b>(也就是说onCreate()和onBind()方法并不会被多次调用)。<b>停用服务可以调用unbindService()方法</b>，服务结束时会调用服务的onUnbind()-->onDestroy()方法。  
  
<font color=#0099ff size=5 face="黑体"><b>总结生命周期</b></font>  
* onCreate() 在服务被创建时调用，无论调用多少次startService()或bindService()方法，该方法只会被调用一次。  
* onDestroy()该方法在服务被终止时调用。  
<b>1. 采用Context.startService()方法启动服务的生命周期</b>  
onStart() 只有采用Context.startService()方法启动服务时才会回调该方法。该方法在服务开始运行时被调用。多次调用startService()方法尽管不会多次创建服务，但onStart() 方法会被多次调用。  
<b>2. 采用Context.bindService()方法启动服务的生命周期</b>  
onBind()只有采用Context.bindService()方法启动服务时才会回调该方法。该方法在调用者与服务绑定时被调用，当调用者与服务已经绑定，多次调用Context.bindService()方法并不会导致该方法被多次调用。onUnbind()只有调用Context.unbindService()方法启动服务时才会回调该方法。该方法在调用者与服务解除绑定时被调用  
  
## 40. 注册广播有几种方式，这些方式有何优缺点？请谈谈Android引入广播机制的用意  
  
>`BroadcastReceiver`广播接收者用于接收系统或其他程序（包括自己程序）发送的广播。  
  
### 注册广播  
在android中，我们如果想接收到广播信息，必须自定义我们的广播接收者。要写一个类来继承`BroadcastReceiver`，并且重写其`onReceive()`方法，定义好了一个广播接收者后，想使用它接受到广播，就要注册这个广播接收者。  
#### 注册广播方式  
第一种：静态注册minifest  
```  
<receiver    
  android:name=".take.ApkInstallReceiver"    
  android:exported="false">    
    <intent-filter android:priority="1000">    
        <action android:name="sunst.installapk.APKINSTALLRECV" />    
    </intent-filter>    
</receiver>  
```  
第二种：动态注册activity  
```  
IntentFilter filter =  new IntentFilter("sunst.installapk.APKINSTALLRECV");    
ApkInstallReceiver receiver = new ApkInstallReceiver();    
registerReceiver(receiver.filter);  
```  
#### 注册广播区别  
|                |        静态注册               |动态注册                        |    
|----------------|-------------------------------|-----------------------------|    
|<b>静态注册</b> |`常驻型广播，不受组件生命周期影响，即便应用退出，广播还是可以被接收`            |非常驻型广播，跟随组件的生命变化，组件结束，广播结束。在组件结束前，需要先移除广播，否则容易造成内存泄漏            |    
|Quotes          |`"Isn't this fun?"`            |"Isn't this fun?"            |  
### 发送广播  
需要发送一个自定义的广播来通知程序中其他组件一些状态  
  
#### 广播发送方式  
 - 无序广播：通过`Context.sendBroadcast(Intent)`或`Context.sendBroadcast(Intent,String)`方法发送。  
 - 有序广播：通过`Context.sendOrderedBroadcast(Intent,String, BroadCastReceiver,Handler,int,String,Bundle)`方法发送。  
#### 发送广播区别  
 - 无序广播：所有的接收者都会接收事件，不可以被拦截，不可以被修改。  
 - 有序广播：按照优先级，一级一级的向下传递，接收者可以修改广播数据，也可以终止广播事件。  
  
###  广播发送和接收的原理  
 -  继承BroadcastReceiver，重写onReceive()方法。  
 -  通过Binder机制向ActivityManagerService注册广播。  
 -  通过Binder机制向ActivityMangerService发送广播。  
 -  ActivityManagerService查找符合相应条件的广播(IntentFilter/Permission)，将广播发送到BroadcastReceiver所在的消息队列中。  
 -  BroadcastReceiver所在消息队列拿到此广播后，回调它的onReceive()方法。  
  
**此处延伸：**  
  
什么情况下用动态注册  
## 41. BroadcastReceiver与LocalBroadcastReceiver有什么区别？  
  
-   BroadcastReceiver 是跨应用广播，利用Binder机制实现。  
      
-   LocalBroadcastReceiver 是应用内广播，利用Handler实现，利用了IntentFilter的match功能，提供消息的发布与接收功能，实现应用内通信，效率比较高。  
## ***42. Service和Thread的区别？  
  
Servie是系统的组件，它由系统进程托管（servicemanager）；它们之间的通信类似于client和server，是一种轻量级的ipc通信，这种通信的载体是binder，它是在linux层交换信息的一种ipc。而thread是由本应用程序托管。  
1). Thread：Thread 是程序执行的最小单元，它是分配CPU的基本单位。可以用 Thread 来执行一些异步的操作。  
  
2). Service：Service 是android的一种机制，当它运行的时候如果是Local Service，那么对应的 Service 是运行在主进程的 main 线程上的。如：onCreate，onStart 这些函数在被系统调用的时候都是在主进程的 main 线程上运行的。如果是Remote Service，那么对应的 Service 则是运行在独立进程的 main 线程上。  
  
既然这样，那么我们为什么要用 Service 呢？其实这跟 android 的系统机制有关，我们先拿 Thread 来说。Thread 的运行是独立于 Activity 的，也就是说当一个 Activity 被 finish 之后，如果你没有主动停止 Thread 或者 Thread 里的 run 方法没有执行完毕的话，Thread 也会一直执行。因此这里会出现一个问题：当 Activity 被 finish 之后，你不再持有该 Thread 的引用。另一方面，你没有办法在不同的 Activity 中对同一 Thread 进行控制。  
  
举个例子：如果你的 Thread 需要不停地隔一段时间就要连接服务器做某种同步的话，该 Thread 需要在 Activity 没有start的时候也在运行。这个时候当你 start 一个 Activity 就没有办法在该 Activity 里面控制之前创建的 Thread。因此你便需要创建并启动一个 Service ，在 Service 里面创建、运行并控制该 Thread，这样便解决了该问题（因为任何 Activity 都可以控制同一 Service，而系统也只会创建一个对应 Service 的实例）。  
  
因此你可以把 Service 想象成一种消息服务，而你可以在任何有 Context 的地方调用 Context.startService、Context.stopService、Context.bindService，Context.unbindService，来控制它，你也可以在 Service 里注册 BroadcastReceiver，在其他地方通过发送 broadcast 来控制它，当然这些都是 Thread 做不到的。
  
## 43. 介绍Http和Https的区别  
  
参考：http://www.jianshu.com/p/93fdebe5fef1  
  
HTTPS（全称：Hyper Text Transfer Protocol over Secure Socket Layer），是以安全为目标的HTTP通道，简单讲是HTTP的安全版。即HTTP下加入SSL层，HTTPS的安全基础是SSL，因此加密的详细内容就需要SSL。  
  
HTTPS 和 HTTP 的区别  
超文本传输协议HTTP协议被用于在Web浏览器和服务器之间传递信息。  
  
HTTP协议以明文方式发送内容，不提供任何方式的数据加密，如果攻击者截取了Web浏览器和网站服务器之间的传输报文，就可以直接读懂其中的信息，因此HTTP协议不适合传输一些敏感信息，比如信用卡号、密码等。  
为了解决HTTP协议的这一缺陷，需要使用另一种协议：安全套接字层超文本传输协议HTTPS。为了数据传输的安全，HTTPS在HTTP的基础上加入了SSL协议，SSL依靠证书来验证服务器的身份，并为浏览器和服务器之间的通信加密。  
  
HTTPS和HTTP的区别主要为以下五点：  
  
* https 用的 443 端口， http 用的 80 端口  
* https协议需要到ca申请证书，一般免费证书很少，需要交费。  
* http是超文本传输协议，信息是明文传输，https 则是具有安全性的ssl加密传输协议。  
* http和https使用的是完全不同的连接方式，用的端口也不一样，前者是80，后者是443。  
* http的连接很简单，是无状态的；HTTPS协议是由SSL+HTTP协议构建的可进行加密传输、身份认证的网络协议，比http协议安全。  
  
  
## 44. HttpClient与HttpUrlConnection的区别  
  
[http://blog.csdn.net/guolin_blog/article/details/12452307](http://blog.csdn.net/guolin_blog/article/details/12452307)  
## 45.String,StringBuffer,StringBuilder的区别  
本人知乎  
  
[浅论String,StringBuffer,StringBuilder的区别](https://zhuanlan.zhihu.com/p/27323462)  
  
## 46. 为什么要用ContentProvider？它和sql的实现上有什么差别？  
ContentProvider可以像数据库一样进行选择排序，屏蔽内部数据的存储细节，向外提供统一的接口模型，用户只需要关心操作数据的uri就可以了，大大简化上层应用，对数据的整合提供了更方便的途径。  
  
---  
## 47. 描述一下View的绘制原理？  
View的绘制流程主要分为三步：  
  
1.  onMeasure：测量视图的大小，从顶层父View到子View递归调用measure()方法，measure()调用onMeasure()方法，onMeasure()方法完成绘制工作。  
      
2.  onLayout：确定视图的位置，从顶层父View到子View递归调用layout()方法，父View将上一步measure()方法得到的子View的布局大小和布局参数，将子View放在合适的位置上。  
      
3.  onDraw：绘制最终的视图，首先ViewRoot创建一个Canvas对象，然后调用onDraw()方法进行绘制。onDraw()方法的绘制流程为：① 绘制视图背景。② 绘制画布的图层。 ③ 绘制View内容。    
    ④ 绘制子视图，如果有的话。⑤ 还原图层。⑥ 绘制滚动条。  
  
以下两个讲解都讲得很透彻，这部分面试官多数不会问很深，要么就给你一个效果让你讲原理。   
（1）http://www.gcssloop.com/customview/CustomViewIndex   
（2）http://blog.csdn.net/yanbober/article/details/50577855  
  
## 48+ .View的,Activity绘制，原理2  
  
[view](https://blog.csdn.net/Rayht/article/details/80782697)  
[activity](https://blog.csdn.net/qq_23547831/article/details/51285804)  
  
这是我在面试中被问到的，同以上有所区别，问法不一样的，下面描述一下：我们的Activity是如何绘制的  
  
![sunst](https://github.com/qydq/Integrate/blob/master/res/sunst_android_activity_inflate.png?raw=true)   
   
![sunst](https://github.com/qydq/Integrate/blob/master/res/sunst_android_view_inflate.png?raw=true)    
  
  
  
先总结一下View的绘制流程：  
  
1. 在onCreate方法中通过setContentView将View及ViewGroup初始化，即将我们自己的XML文件转换了Java对象，并添加到系统根布局DecorView中。  
  
2. 在onResume方法中先将我们的DecorView添加到WindowManager然后通过ViewRootImpl来进行View的具体绘制流程。  
  
3. 在ViewRootImpl的performTraversals()中调用performMeasure然后分别调用View的onMeasure方法对View自己进行测量，测量即计算自己的weight和height。这个过程完成后，我们就可以通过getMeasuredWeight和getMeasuredHeght方法来获取View测量的宽高。  
  
4. 然后通过performLayout最终通过View自己的onLayout方法来摆放自己，即把自己放到合适的位置，在这个过程中我们应该注意View的边距问题。  
  
5. 最后通过performDraw进行具体的绘制，这个方法最张也是调用View自己的onDraw方法进行绘制的，一般在ViewGroup中会调用DrawChild方法进行子View的绘制。  
  
然后总结一下：Activity绘制流程：  
  
Activity执行onResume之后再ActivityThread中执行Activity的makeVisible方法。  
  
View的绘制流程包含了测量大小，测量位置，绘制三个流程；  
  
Activty的界面绘制是从mDector即根View开始的，也就是从mDector的测量大小，测量位置，绘制三个流程；  
  
View体系的绘制流程是从ViewRootImpl的performTraversals方法开始的；  
  
View的测量大小流程:performMeasure –> measure –> onMeasure等方法;  
  
View的测量位置流程：performLayout –> layout –> onLayout等方法；  
  
View的绘制流程：onDraw等方法；  
  
View组件的绘制流程会在onMeasure,onLayout以及onDraw方法中执行分发逻辑，也就是在onMeasure同时执行子View的测量大小逻辑，在onLayout中同时执行子View的测量位置逻辑，在onDraw中同时执行子View的绘制逻辑；  
  
Activity中都对应这个一个Window对象，而每一个Window对象都对应着一个新的WindowManager对象（WindowManagerImpl实例）.  
  
## 49. Android UI中的View如何刷新？  
  
Android中对View的更新方式有很多种，使用时要区分不同的应用场合。要分清的是：多线程和双缓冲。  
  
 - 1、不使用多线程和双缓冲  
  
这种情况最简单，一般只希望View在发生改变时对UI进行重绘。你只需要Activity中显式调用View对象中的invalidate()方法即可。系统会自动调用View的onDraw()方法。  
  
 - 2、使用多线程和不使用双缓冲  
  
这种情况下需要开启新的线程，新开的线程就不好访问View对象了。强行访问的话会报错：  
  
    android.view.ViewRoot$ CalledFromWrongThreadException: only theoriginal thread that created a view hierarchy can touch its views  
  
这时候你需要创建一个继承了android.os.handler的子类，并重写handleMessage方法。在Activity中发出更新UI的消息，然后再在你的Handler(可以使用匿名内部类)中处理消息(因为匿名内部类可以访问父类变量，你可以直接调用View对象中的invalidate()方法。  
  
也就是说：  
>在新线程中创建并发送一个Message，然后在主线程中捕获、处理该消息  
  
 - 3、使用多线程和双缓冲  
  
Android的SurfaceView是View的子类，实现了双缓冲。你可以定义一个它的子类并实现SurfaceHolder.Callback接口，新线程就不要android.os.Handler帮忙了。SurfaceHolder中lockCanvas()方法可以锁定画布，绘制完新的图像后调用unlockCanvasand Post解锁。  
## 50. `requestLayout()`、`invalidate()`与`postInvalidate()`有什么区别？  
  
-   requestLayout()：该方法会递归调用父窗口的requestLayout()方法，直到触发ViewRootImpl的performTraversals()方法，此时mLayoutRequestede为true，会触发onMesaure()与onLayout()方法，不一定    
    会触发onDraw()方法。  
      
-   invalidate()：该方法递归调用父View的invalidateChildInParent()方法，直到调用ViewRootImpl的invalidateChildInParent()方法，最终触发ViewRootImpl的performTraversals()方法，此时mLayoutRequestede为false，不会    
    触发onMesaure()与onLayout()方法，当时会触发onDraw()方法。  
      
-   postInvalidate()：该方法功能和invalidate()一样，只是**它可以在非UI线程中调用**。  
  
一般说来需要重新布局就调用requestLayout()方法，需要重新绘制就调用invalidate()方法。  
  
## 51. 了解APK的打包流程吗，描述一下？  
  
Android的包文件APK分为两个部分：代码和资源，所以打包方面也分为资源打包和代码打包两个方面  
具体说来：  
  
1.  通过AAPT工具进行资源文件（包括AndroidManifest.xml、布局文件、各种xml资源等）的打包，生成R.java文件。  
      
2.  通过AIDL工具处理AIDL文件，生成相应的Java文件。  
      
3.  通过Javac工具编译项目源码，生成Class文件。  
      
4.  通过DX工具将所有的Class文件转换成DEX文件，该过程主要完成Java字节码转换成Dalvik字节码，压缩常量池以及清除冗余信息等工作。  
      
5.  通过ApkBuilder工具将资源文件、DEX文件打包生成APK文件。  
      
6.  利用KeyStore对生成的APK文件进行签名。  
      
7.  如果是正式版的APK，还会利用ZipAlign工具进行对齐处理，对齐过程就是将APK文件中所有的资源文件起始距离都偏移4字节的整数倍，这样通过内存映射访问APK文件的速度会更快。  


 <font color=#0099ff size=4 face="黑体">一生温暖纯良，不舍爱与自由   -- 小团子李芳芳同学</font>

# 三：android进阶（源码分析）

## 1.Android Handler机制是做什么的，原理了解吗？  
### Handler机制讲解
谷歌官方规定，与UI控件的操作都应放在主线程即UI线程，而一些耗时操作应当放在子线程中。当在子线程中完成耗时操作并要对UI控件进行操作时，就要用Handler来分发消息

Android的Handler机制，其实就是Android的消息机制，下面我将详细介绍，并从源码角度进行分析
  
在单线程模型下，为了线程通信问题，Android设计了一个Message Queue(消息队列)， 线程间可以通过Message Queue结合Handler和Looper组件进行信息交换，主要是UI线程和子线程之间交互  
  
主要涉及的角色如下所示：  
  
-   Message：消息，分为硬件产生的消息（例如：按钮、触摸）和软件产生的消息。  
-   MessageQueue：消息队列，主要用来向**消息池**添加消息和取走消息。  
-   Handler：消息处理器，主要向消息队列发送各种消息以及处理各种消息。  
-   Looper：消息循环器，是Handler和消息队列之间的通讯桥梁，主要用来把消息分发给相应的处理者，Looper中维护一个消息队列。   
  
**Tips：**  
>MessageQueue存放Handler发布的消息，通常附属于某一个创建它的线程，可以通过Looper.myQueue()得到当前线程的消息队列，但该消息队列可能为NULL；Android会自动替UI线程建立Message Queue，所以调用Looper.getMainLooper()得到的主线程的Looper不为NULL  
  
具体说来：  
  
1.  Handler通过`sendMessage()`或`post()`发送消息Message到消息队列MessageQueue。  
2.  Looper通过`loop()`不断提取触发条件的Message，并将Message交给对应的target handler来处理。  
3.  target handler调用自身的`handleMessage()`方法来处理Message。  
  
![enter image description here](https://upload-images.jianshu.io/upload_images/3985563-d7da4f5ba49f6887.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/600)  
  
下面我们先看一下使用消息机制的一个简单实例  
```  
public class Activity extends Activity {    
    private Handler mHandler = new Handler(){    
        @Override    
        public void handleMessage(Message msg) {    
            super.handleMessage(msg);    
            System.out.println(msg.what);    
        }    
    };    
    @Override    
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {    
        super.onCreate(savedInstanceState, persistentState);    
        setContentView(R.layout.activity_main);    
        new Thread(new Runnable() {    
            @Override    
            public void run() {    
                ...............耗时操作    
                Message message = Message.obtain();    
                message.what = 1;    
                mHandler.sendMessage(message);    
            }    
        }).start();    
    }    
}  
```  
在子线程中，进行耗时操作，执行完操作后，发送消息，通知主线程更新UI  
  
###  消息机制的源码解析  
#### 1.Handler发送消息  
Handler可以通过sendXXX()或post()发送消息Message到MessageQueue，下面来跟踪一下源码  
**post方法**  
```  
    
public final boolean post(Runnable r) {    
    return sendMessageDelayed(getPostMessage(r), 0);    
}    
public final boolean postAtTime(Runnable r, long uptimeMillis) {    
    return sendMessageAtTime(getPostMessage(r), uptimeMillis);    
}    
public final boolean postAtTime(Runnable r, Object token, long uptimeMillis) {    
    return sendMessageAtTime(getPostMessage(r, token), uptimeMillis);    
}    
public final boolean postDelayed(Runnable r, long delayMillis) {    
    return sendMessageDelayed(getPostMessage(r), delayMillis);    
}  
```  
**send方法**  
```  
public final boolean sendMessage(Message msg) {    
    return sendMessageDelayed(msg, 0);    
}    
public final boolean sendEmptyMessage(int what) {    
    return sendEmptyMessageDelayed(what, 0);    
}    
    
public final boolean sendEmptyMessageDelayed(int what, long delayMillis) {    
    Message msg = Message.obtain();    
    msg.what = what;    
    return sendMessageDelayed(msg, delayMillis);    
}    
public final boolean sendEmptyMessageAtTime(int what, long uptimeMillis) {    
    Message msg = Message.obtain();    
    msg.what = what;    
    return sendMessageAtTime(msg, uptimeMillis);    
}    
public final boolean sendMessageDelayed(Message msg, long delayMillis) {    
    if (delayMillis < 0) {    
        delayMillis = 0;    
    }    
    return sendMessageAtTime(msg, SystemClock.uptimeMillis() + delayMillis);    
}  
```  
通过源码分析，子线程中通过Handler的post()方式或send()方式发送Message消息，归根结底都是调用了`sendMessageAtTime()`方法  
  
而且就连子线程中调用Activity中的runOnUiThread()更新UI，其实最终也会调用`sendMessageAtTime()`方法  
```  
public final void runOnUiThread(Runnable action) {    
    if (Thread.currentThread() != mUiThread) {    
        mHandler.post(action);    
    } else {    
        action.run();    
    }    
}  
```  
如果当前的线程不等于UI线程(主线程)，就去调用Handler的`post()`方法，最终会调用`sendMessageAtTime()`方法。否则就直接调用Runnable对象的`run()`方法。  
  
**Tips：**  
>网上有人说最终调用`sendMessageDelayed`这是错误的说法  
  
下面我们来一探到底`sendMessageAtTime()`方法有什么作用  
```  
public boolean sendMessageAtTime(Message msg, long uptimeMillis) {    
    MessageQueue queue = mQueue;    
    if (queue == null) {    
        RuntimeException e = new RuntimeException(    
                this + " sendMessageAtTime() called with no mQueue");    
        Log.w("Looper", e.getMessage(), e);    
        return false;    
    }    
    return enqueueMessage(queue, msg, uptimeMillis);    
}  
```  
首先获取了Handler中的MessageQueue对象，若不为空，则调用`enqueueMessage()`方法，将Message插入到MessageQueue中  
```  
private boolean enqueueMessage(MessageQueue queue, Message msg, long uptimeMillis) {    
    msg.target = this;    
    if (mAsynchronous) {    
        msg.setAsynchronous(true);    
    }    
    //调用MessageQueue的enqueueMessage方法    
  return queue.enqueueMessage(msg, uptimeMillis);    
}  
```  
这里将message的目标(target)指向了该handler自己(this)，然后调用MessageQueue的enqueueMessage()方法，往消息队列中添加一个消息  
```  
boolean enqueueMessage(Message msg, long when) {    
    if (msg.target == null) {    
        throw new IllegalArgumentException("Message must have a target.");    
    }  
    if (msg.isInUse()) {    
        throw new IllegalStateException(msg + " This message is already in use.");    
    }  
    synchronized (this) {    
        if (mQuitting) {    
            IllegalStateException e = new IllegalStateException(    
                    msg.target + " sending message to a Handler on a dead thread");    
            Log.w(TAG, e.getMessage(), e);    
            msg.recycle();    
            return false;    
        }  
        msg.markInUse();    
        msg.when = when;    
        Message p = mMessages;    
        boolean needWake;    
        if (p == null || when == 0 || when < p.when) {    
            msg.next = p;    
            mMessages = msg;    
            needWake = mBlocked;    
        } else {    
            needWake = mBlocked && p.target == null && msg.isAsynchronous();    
            Message prev;    
            for (;;) {    
                prev = p;    
                p = p.next;    
                if (p == null || when < p.when) {    
                    break;    
                }    
                if (needWake && p.isAsynchronous()) {    
                    needWake = false;    
                }    
            }    
            msg.next = p;    
            prev.next = msg;    
        }    
    
        if (needWake) {    
            nativeWake(mPtr);    
        }    
    }    
    return true;    
}  
```  
MessageQueue是按照Message触发时间的先后顺序排列的，当有消息需要加入消息队列时，会从队列头开始遍历，直到找到消息应该插入的合适位置，以保证所有消息的时间顺序。  
  
**Tips：**  
>MessageQueue实际结构是一个Message类自身持有一个next形成的单向链表，他只是负责分发消息  
  
#### 2.Looper获取消息  
要想使用消息机制，首先要创建一个Looper。创建Looper需要初始化Looper，  无参情况下，默认调用`prepare(true)`表示的是这个Looper可以退出，而对于false的情况则表示当前Looper不可以退出。  
```  
public static void prepare() {    
    prepare(true);    
}  
private static void prepare(boolean quitAllowed) {    
    if (sThreadLocal.get() != null) {    
        throw new RuntimeException("Only one Looper may be created per thread");    
    }    
    sThreadLocal.set(new Looper(quitAllowed));    
}  
```  
调用prepare()方法，会new 一个Looper对象把他传给sThreadLocal.set()方法，ThreadLocal是线程本地存储区（Thread Local Storage，简称为TLS），每个线程都有自己的私有的本地存储区域，不同线程之间彼此不能访问对方的TLS区域  
  
而且代码里面可以看到只能创建一个Looper，再来看看set()方法是何用：  
```  
public void set(T value) {    
    Thread t = Thread.currentThread();    
    ThreadLocalMap map = getMap(t);    
    if (map != null)    
        map.set(this, value);    
    else    
  createMap(t, value);    
}  
```  
将一个数据用map保存在了当前线程中。再来看看Looper的构造方法  
```  
private Looper(boolean quitAllowed) {    
    mQueue = new MessageQueue(quitAllowed);    
    mThread = Thread.currentThread();    
}  
```  
前面我们给Looper默认传了一个true，在这个构造方法中，先创建了一个消息队列，然后又获取了当前线程，并把消息队列和该Looper对象关联起来，也就是前面提到的Looper是Handler和消息队列之间通讯桥梁  
Looper创建好以后，接下来就是开启了。开启方法是loop()  
```  
public static void loop() {    
    final Looper me = myLooper();  //获取TLS存储的Looper对象     
   if (me == null) {    
        throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");    
    }    
    final MessageQueue queue = me.mQueue;  //获取Looper对象中的消息队列  
  Binder.clearCallingIdentity();    
    final long ident = Binder.clearCallingIdentity();    
    for (; ; ) { //进入loop的主循环方法    
  Message msg = queue.next(); //可能会阻塞,因为next()方法可能会无限循环    
    if (msg == null) { //消息为空，则退出循环    
  return;  }    
        Printer logging = me.mLogging;  //默认为null，可通过setMessageLogging()方法来指定输出，用于debug功能    
   if (logging != null) {    
            logging.println(">>>>> Dispatching to " + msg.target + " " +    
                    msg.callback + ": " + msg.what);  }    
        msg.target.dispatchMessage(msg); //获取msg的目标Handler，然后用于分发Message     
    if (logging != null) {    
            logging.println("<<<<< Finished to " + msg.target + " " + msg.callback);    
        }    
    
        final long newIdent = Binder.clearCallingIdentity();    
        if (ident != newIdent) {    
        }    
        msg.recycleUnchecked();    
    }    
}  
```  
代码太长，本神注释掉一些日志，通过myLooer()从当前线程中获取保存的Looper对象，loop()进入循环模式，不断的从queue中获取msg，然后调用msg的target的dispatchMessage()方法，target就是一个前面指向this的Handler对象，然后Handler就调用自身dispatchMessage()方法分发消息（我想到Android的事件分发机制dispatchtouchevent方法)。最后直到消息为空时退出循环  
```  
public void dispatchMessage(Message msg) {    
    if (msg.callback != null) {    
        handleCallback(msg);    
    } else {    
        if (mCallback != null) {    
            if (mCallback.handleMessage(msg)) {    
                return;    
            }    
        }    
        handleMessage(msg);    
    }    
}  
```  
可以看到这里是通过callback回调处理的，在Handler中通过handleMessage我们就能传递Message了  
  
**Tips：**  
>主线程在一开始创建时就已经创建并开启了Looper，所以我们在主线程中使用Handler时就已经和主线程、消息队列有了联系，就不用再手动调用loop()了,所以调用Looper.getMainLooper()得到的主线程的Looper不为NULL  
  
### Handler补充(注意事项)
Handler在使用过程中，需要注意内存泄漏问题。  

Handler是用来进行线程间通信的，新开启的线程是会持有Handler引用的，如果在Activity等中创建Handler，并且是非静态内部类的形式，就有可能造成内存泄漏。  
  
非静态内部类是会隐式持有外部类的引用，当其他线程持有了该Handler，线程没有被销毁，则意味着Activity会一直被Handler持有引用而无法导致回收。  
同时，MessageQueue中如果存在未处理完的Message，Message的target也是对Activity等的持有引用，也会造成内存泄漏。  
  
#### 1. 使用静态内部类+弱引用的方式:  
  
静态内部类不会持有外部类的的引用，当需要引用外部类相关操作时，可以通过弱引用获取到外部类相关操作，弱引用是不会造成对象回收不掉的问题  
```  
private Handler sHandler = new TestHandler(this);  
static class TestHandler extends Handler {  
    private WeakReference<Activity> mActivity;  
    TestHandler(Activity activity) {  
        mActivity = new WeakReference<>(activity);  
    }  
    @Override  
    public void handleMessage(Message msg) {  
        super.handleMessage(msg);  
        Activity activity = mActivity.get();  
        if (activity != null) {  
            //TODO:  
  }  
    }  
}  
```  
#### 2. 在Activity的onDestroy方法中将MessageQueue中的消息清空  
```  
@Override   
protected void onDestroy() {   
handler.removeCallbacksAndMessages(null);   
super.onDestroy();   
}  
```  
## 2.android如何做性能优化？  
  
[Android性能优化（一）之启动加速35%](https://www.jianshu.com/p/f5514b1a826c)  
  
  
[图片的三级缓存中,图片加载到内存中,如果内存快爆了,会发生什么？怎么处理？](https://blog.csdn.net/Android_SE/article/details/91445544)  
  
  
[第8章 Android异常与性能优化相关面试问题](https://www.cnblogs.com/zhaojianhua/p/8574136.html)  
  
[LeakCanary 内存泄露监测原理研究](https://www.jianshu.com/p/5ee6b471970e)  

## 3. 线程sleep和wait有什么区别  
  
都用来进行线程控制,他们最大本质的区别是:  
  
>sleep()不释放同步锁    
>wait()释放同步锁     
  
用法的上的不同是:  
  
>sleep(milliseconds)可以用时间指定来使他自动醒过来,如果时间不到你只能调用interreput()来强行打断    
>wait()可以用notify()直接唤起    
  
1.这两个方法来自不同的类分别是Thread和Object  
2.最主要是sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法  
3.wait，notify和notifyAll只能在同步控制方法或者同步控制块里面使用，而sleep可以在任何地方使用  
```  
synchronized(x){  
  x.notify()  
 //或者wait()  
}  
```  
4.sleep必须捕获异常，而wait，notify和notifyAll不需要捕获异常
  
## 4.volatile作用，可见性原理，与synchronized区别  
  
[volatile作用，可见性原理，与synchronized区别](https://blog.csdn.net/Dennis_Wu_/article/details/82049875)  
  
## 5. Java注解反射原理是什么，和如何实现的
可以看我知乎  

## 6. 介绍一下java虚拟机，以及它和Dalvik虚拟机的区别？

java虚拟机：
https://blog.csdn.net/liyang_nash/article/details/78742623

https://blog.csdn.net/qq_41701956/article/details/81664921


和Dalvik的区别？
https://www.cnblogs.com/cmusketeer/p/8016489.html

## 7. Java GC原理  
  
http://www.jianshu.com/p/d75a32ac5bed?  

## 8. 线程池了解吗，如何使用,原理了解吗？  
[Android中常见的4种线程池（保证你能看懂并理解）](https://blog.csdn.net/seu_calvin/article/details/52415337)  
  
[Android 线程池原理及使用](https://www.jianshu.com/p/7b2da1d94b42)  
  
## 9. 如何关闭线程?  
  
在程序中，我们是不能随便中断一个线程的，因为这是及其不安全的操作，我们无法知道这个线程正运行在什么状态，他可能持有某把锁，强行中断可能导致锁不能  
释放的问题，或者线程在操作数据库，强行中断会导致数据不一致混乱的问题，正因为如此，Java里将Thread的stop方法设置为过时。  
  
一个线程什么时候可以退出，我们可以调用Thread.interrupt将线程设置为一个中断状态，它有两个作用：  
  
(1).如果线程处于阻塞状态（如调用wait，释放同步锁，使得其他线程可以使用同步控制块或者方法),则会立马退出阻塞，抛出一个我们可以捕获的InterruptedExecption，然后关闭  
  
(2).如果是运行状态，线程不受影响，但是线程中断标记状态设置为True，然后在适当的位置，通过Thread.isInterrupt（）来做处理。  
  
还可以通过：  
  
>shutdownNow(),不再接受新提交的任务，立马关闭线程池，线程池里的任务不再执行。    
>shutdown()不再接受新提交的任务，等待线程池里面的任务执行完毕以后关闭线程池，它会释放同步锁。    
  
## 10. 组件化，插件化  
https://blog.csdn.net/cmyperson/article/details/81199444  
![](https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=927498126,1209797804&fm=15&gp=0.jpg)  
  
组件化开发就是将一个app分成多个模块，每个模块都是一个组件（Module），开发的过程中我们可以让这些组件相互依赖或者单独调试部分组件等，但是最终发布的时候是将这些组件合并统一成一个apk，这就是组件化开发。  
  
插件化开发和组件化开发略有不用，插件化开发时将整个app拆分成很多模块，这些模块包括一个宿主和多个插件，每个模块都是一个apk（组件化的每个模块是个lib），最终打包的时候将宿主apk和插件apk分开或者联合打包。  
  
  
## 11. 内存泄漏检测工具原理  
  
本人知乎有完整答案参考  
  
leakcanary是一个在debug build中用于检测内容泄漏的开源Java库，创建一个RefWatcher实例，用来监控对象的引用情况  
  
    refWatcher.watch(object)  
  
每个都这样写太繁琐了，通过下面一行代码，leakcannary就会自动侦测Activity的内存泄漏  
  
    public class SunstApplication extends Applictation{  
         @Override public void onCreate(){  
            LeakCannary.install(this);  
        }  
    }  
这样以后就能在通知里面看到一个显示得整齐漂亮的信息。  
  
## 12. Android中常见的4种线程池  
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
  
### FixThreadPool  
FixThreadPool只有核心线程，并且数量固定，也不会被回收，所有线程都活动时，因为队列没有大小限制，新任务会等待执行。由于线程不会被回收，FixThreadPool会很快响应外界请求  
具体使用：  
```  
public static ExecutorService newFixThreadPool(int nThreads){  
   return new ThreadPoolExecutor(nThreads,nThreads,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());  
}  
Executor.newFixThreadPool(5).execute(r);  
```  
### SingleThreadPool  
SingleThreadPool只有一个核心线程，确保所任务都在同一线程按顺序完成，因此不需要处理线程同步的问题  
具体使用：  
```  
public static ExecutorService newSingleThreadPool (int nThreads){  
   return new FinalizableDelegatedExecutorService ( new ThreadPoolExecutor (1, 1, 0, TimeUnit. MILLISECONDS, new LinkedBlockingQueue<Runnable>()) );  
}  
Executors.newSingleThreadPool().execute(r);  
```  
### CachedThreadPool  
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
  
### ScheduledThreadPool  
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
  
## 13. 谈谈Java锁  
  
在介绍java锁之前，先说下什么是markword，markword是java对象数据结构中的一部分，要详细了解java对象的结构可以点击这里(http://blog.csdn.net/zqz_zqz/article/details/70246212),这里只做markword的详细介绍，因为对象的markword和java各种类型的锁密切相关  
  
###一：Java自旋和对象头的概念。  
  
1.自旋  
  
现在假设有这么一个场景：有两个线程A,B在竞争一个锁，假设A拿到了，这个时候B被挂起阻塞，一直等待A释放了锁B才得到使用权。在操作系统中阻塞和唤醒是一个耗时操作，如果A在很短的时间内就释放了锁，当这个时间与阻塞唤醒比较起来更短的时候，我们将B挂起，其实不是一个最优的选择。  
  
自旋是指某线程需要获取锁，但该锁已经被其他线程占用时，该线程不会被挂起，而是在不断的消耗CPU的时间，不停的试图获取锁。虽然CPU的时间被消耗了，但是比线程下文切换时间要少。这个时候使用自旋是划算的。  
  
如果是单核处理器，一般建议不要使用自旋锁。因为只有单个处理器，自旋占用的时间片使得代价很高。而偏向锁、轻量锁、重量锁也是一个锁围绕着如何使得程序运行的更加“划算”而进行改变的。  
  
2.对象头  
  
HotSpot虚拟机中，对象在内存中存储的布局可以分为三块区域：对象头、实例数据和对齐填充。  
  
锁的实现机制与java对象头息息相关，锁的所有信息，都记录在java的对象头中。用2字（32位JVM中1字=32bit=4baye）存储对象头，如果是数组类型使用3字存储（还需存储数组长度）。对象头中记录了hash值、GC年龄、锁的状态、线程拥有者、类元数据的指针  
  
![](https://img-blog.csdnimg.cn/20181107002452745.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4MDA2NTIw,size_16,color_FFFFFF,t_70)  
  
###二：Java锁的种类以及辨析。  
  
锁作为并发共享数据，保证一致性的工具，在JAVA平台有多种实现(如 synchronized 和 ReentrantLock等等 ) 。这些已经写好提供的锁为我们开发提供了便利，但是锁的具体性质以及类型却很少被提及。下面介绍分析JAVA中常见的锁以及其特性。  
  
1. 宏观上分为：悲观锁、乐观锁  
  
悲观锁：认为写多读少，遇到并发写的可能性高，每次去拿数据的时候都认为别人会修改，所以每次在读写数据的时候都会上锁。  
  
乐观锁：读多写少，遇到并发写的可能性低，每次去拿数据的时候都认为别人不会修改，所以不会上锁，但是在更新的时候会判断一下在此期间别人有没有去更新这个数据。  
  
2.锁原理：偏向锁、轻量锁、重量锁  
  
java中每个对象都可作为锁，锁有四种级别，按照量级从轻到重分为：无锁、偏向锁、轻量级锁、重量级锁。每个对象一开始都是无锁的，随着线程间争夺锁，越激烈，锁的级别越高，并且锁只能升级不能降级。  
  
JDK 1.6中默认是开启偏向锁和轻量级锁的，我们也可以通过-XX:-UseBiasedLocking来禁用偏向锁。锁的状态保存在对象的头文件中  
  
3.其它：  
悲观锁  不相信，这里会是安全的，必须全部上锁  
乐观锁  相信，这里是安全的。  
可重入锁 多次进入改锁的域  
读写锁 对锁进行读写修改操作  
互斥锁 锁本身就是互斥的  
公平锁 有优先级的锁  
非公平锁 无优先级的锁  
对象锁 锁住对象  
线程锁 线程里面的锁对象  
偏向锁 无竞争不锁，有竞争挂起，转为轻量锁  
自旋锁：如果持有锁的线程能在很短的时间内释放资源，那么那些等待竞争锁的线程就不需要做内核态与用户态之间的切换进入阻塞状态，只需要等一等（自旋），等待有锁的线程释放锁后即可立即获取锁，避免用户线程与内核的切换消耗。自旋的过程是需要消耗CPU的，就是让CPU做无用功  
  
###三：Java Synchronized 锁的实现原理与应用 (偏向锁,轻量锁,重量锁)  
  
重量锁：Synchronized保证同步。  
  
在Java SE 1.6之前,Synchronized被称为重量级锁.在SE 1.6之后进行了各种优化,就出现了偏向锁,轻量锁,目的是为了减少获得锁和释放锁带来的性能消耗.  
  
1.Synchroized的使用  
  
(1) 对于普通同步方法,锁是当前实例对象.如下代码示例:  
解释:对于set和get方法来说,都是在方法上使用了同步关键字,所以他们是同步方法,锁的就是当前的实例对象,怎么理解了,看下面的main方法,就是这个new的实例对象.所以他们的锁对象都是synchronizedMethod   
```  
public class SynchronizedMethod{  
private int i = 0;  
public synchronized void setNum (int number) {  
    this.i = number;  
}  
  
public synchronized int getNum () {  
    return i;  
}  
  
public static void main (String[] args) {  
    // 启动两个线程调用get和set方法  
    SynchronizedMethod synchronizedMethod = new SynchronizedMethod();  
    new Thread(() -> {  
        synchronizedMethod.setNum(5);  
    },"set").start();  
    new Thread(() -> {  
        int num = synchronizedMethod.getNum();  
        System.out.println(num);  
    },"get").start();  
}  
}  
```  
(2) 对于静态同步方法,锁是当前类的Class对象.看代码示例:  
解释:如下两个方法都是静态同步方法.所以锁是当前类的class对象,这么理解吧,静态方法是类调用的,所以锁就是这个类对象.如下代码运行结果,只有当类的第一个静态同步方法执行完毕,第二个才能执行.  
```  
/**  
* synchronized 静态方法  
*/  
public class SynchroizedStaticMethod {  
  
private static int i = 0;  
  
public static synchronized void addNum () {  
    for (;;) {  
        i++;  
        System.out.println(Thread.currentThread().getName()+"----"+i);  
        if(i >= 100){  
            break;  
        }  
    }  
}  
  
public static synchronized void getNum () {  
    System.out.println(Thread.currentThread().getName()+"----"+i);  
}  
  
public static void main (String[] args) {  
    new Thread(() -> {  
        SynchroizedStaticMethod.addNum();  
    },"addNum").start();  
    new Thread(() -> {  
        SynchroizedStaticMethod.getNum();  
    },"getNum").start();  
  
}  
}  
```  
一部分执行结果  
```  
addNum----92  
addNum----93  
addNum----94  
addNum----95  
addNum----96  
addNum----97  
addNum----98  
addNum----99  
addNum----100  
getNum----100  
```  
3) 对于同步代码块,锁就是Synchronized括号里面配置的对象.如下代码实例:  
  
解释:通过如下代码可以证明锁就是括号里面的对象,当两个方法是一个对象时,只能是获取到对象锁的方法 执行,但是是两个锁对象时,那么两个方法获取的就是不同的锁对象,所以结果不一样了.  
```  
/**  
 * 代码块  
 */  
public class SynchroizedCodeBlock {  
  
    private Object object = new Object();  
  
    public void printOne () {  
        synchronized (object) {  
            for (int i = 0; i < 10; i++) {  
                System.out.println(Thread.currentThread().getName() + "---" + 1);  
            }  
        }  
    }  
  
    public void printTwo () {  
        synchronized (object) {  
            System.out.println(Thread.currentThread().getName()+"---"+2);  
        }  
    }  
  
    public static void main (String[] args) {  
        SynchroizedCodeBlock codeBlock = new SynchroizedCodeBlock();  
        new Thread(() -> {  
            codeBlock.printOne();  
        },"printOne").start();  
        new Thread(() -> {  
            codeBlock.printTwo();  
        },"printTwo").start();  
    }  
}  
```  
执行结果  
```  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printTwo---2  
Process finished with exit code 0  
```  
改变下括号里面的对象  
```  
public void printTwo () {  
        synchronized (this) {  
            System.out.println(Thread.currentThread().getName()+"---"+2);  
        }  
    }  
```  
执行结果(与第一次不一样了)  
```  
printTwo---2  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
printOne---1  
  
Process finished with exit code 0  
```  

# 四：手写代码（如算法类）
## 1. 手写一个简单的观察者模式


## 2. 手写一个常见的单利模式

## 3. 手写算法（选择冒泡必须要会）  
[http://www.jianshu.com/p/ae97c3ceea8d](http://www.jianshu.com/p/ae97c3ceea8d)  
一个简单的：冒泡排序
```java
public static void main(int[] args) {  
    int temp;  
    boolean flag;  
    for (int i = 0; i < args.length; i++) {  
        flag = false;  
        for (int j = args.length - 1; j > i; j--) {  
            if (args[j] < args[j - 1]) {  
                temp = args[j];  
                args[j] = args[j - 1];  
                args[j - 1] = temp;  
                flag = true;  
            }  
        }  
        if (!flag) break;  
    }  
}
```
**此处延伸：**  
python里面各种简单的算法题  

## 4. 统计一段字符串中每个字符出现的次数
```java
public static void main(int[] args){
	String aimstring = "adjfklasdhfidhsdgjds2342klhf78326s";
	int[] args = new int[256]
	for(int i = 0 ;i < args.length;i++){
		args[i] = 0;
	}
	char[] charArray = aimString.toCharArray();
	for(int i = 0 ;i< charArray.length;i++){
		int temp = (int)charArray[i];
		args[temp] += 1;
	}
	for(int i = 0 ;i<256;i++){
		if(args[i]!=0){
			System.out.println((char)i +"字符出现的次数为："+args[i]);
		}
	}
}

```

## 5. 实现字符串倒叙输出（任意一种方法）
```java
/*
 * string倒序输出 
 * 利用String类的toCharArray()，再倒序输出数组的方法
 * 2018-5-18 13:05:00
 */
private static void reverseString1(String str) {
	char[] chr = str.toCharArray();
	for (int i = chr.length-1 ; i >= 0; i--) {
		System.out.print(chr[i]);
	}
	System.out.println("\t");
}
/*
 * string倒序输出 
 * 利用String类提供的subString()方法，利用递归的办法输出倒序字符串。
 * 2018-5-18 13:16:00
 */
private static void reverseString2(String str) {
	if (str.length() == 1)
		System.out.println(str);
	else {
		String subString1 = str.substring(0, str.length() - 1);
		String subString2 = str.substring(str.length() - 1);
		System.out.print(subString2);
		reverseString2(subString1);
	}
}

/*
 * string倒序输出 
 * 定义成一个StringBuffer类，用StringBuffer类中的reverse()方法直接倒序字符串。
 * 2018-5-18 13:22:10
 */
private static void reverseString3(String str) {
	StringBuffer buffer = new StringBuffer(str);
	System.out.println(buffer.reverse());
}

/*
 *  自己瞎写
 *  还是利用subString()方法，只不过循环输出
 *  2018-5-18 13:18:30
 */
private static void reverseStringMy(String str) {

	StringBuffer a = new StringBuffer();
	String subString2 = "";
	for (int i = str.length(); i > 0; i--) {
		subString2 = str.substring(i - 1, i);
		a.append(subString2);
	}
	System.out.print("My:" + a);
	System.out.println("\t");
}
```

调用
```java
public static void main(String[] args) {
    String str1 = "abc";
	System.out.println(str1.substring(2));
	String str = "holle world";
	//倒序输出的4种方式
	reverseString1(str);
	reverseString2(str);
	reverseString3(str);
	reverseStringMy(str);
}
```
结果：
```
1.  c
2.  dlrow elloh
3.  dlrow elloh
4.  dlrow elloh
5.  My:dlrow elloh
```


# 五：项目经验（项目介绍，技术点rxJava，retrofit，rxbinding，databinding，性能优化，加载大图，以及一些最新的技术）
## 1. Android蓝牙技术  
  
本人知乎  
  
[android5.0 BLE 蓝牙4.0+浅析demo搜索（一）](https://zhuanlan.zhihu.com/p/23341414)  
  
android BLE 蓝牙4.0（api level>18）  
Tips：一下操作默认支持蓝牙  
  
Step 1: 操作蓝牙，我们需要在AndroidMainfest.xml中配置，如下权限，  
  
<!--蓝牙权限-->  
<uses-permission android:name="android.permission.BLUETOOTH" />  
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />  
  
<uses-feature  
    android:name="android.hardware.bluetooth_le"  
    android:required="true"></uses-feature>  
  
Step 2:打开蓝牙，蓝牙状态等操作，以及是否支持蓝牙BLE  
```  
if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {  
    Toast.makeText(this, R.string.ble_not_supported, Toast.LENGTH_SHORT).show();  
mText.setText(R.string.ble_not_supported);  
return;  
}  
final BluetoothManager bluetoothManager = (BluetoothManager)getSystemService(Context.BLUETOOTH_SERVICE);  
mBluetoothAdapter = bluetoothManager.getAdapter();  
//打开蓝牙,  
mBluetoothAdapter.enable();  
//另一种跳转到设置里面打开安全  
startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),REQUEST_CODE)  
```  
Step 3:搜索蓝牙操作。  
```  
//蓝牙4.2以前  
mBluetoothAdapter.startLeScan(mLeScanCallBack)  
//蓝牙4.2以后  
BluetoothLeScanner mBluetoothLeScanner = mBluetoothAdapter.getBluetoothLeScanner();  
mBluetoothLeScanner.startScan(mScanCallback);  
```  
Step 4:搜索蓝牙监听回调mScanCallback  
  
要监听里面的三个方法，onScanResult，onBatchScanResults，onScanFailed  
  
Step 5:其它读写数据需要GATT 这个具体分析  
  
Step6:关闭蓝牙搜索   
```  
mBluetoothLeScanner.stopScan(mBleScanCallback);  
```  

## 2. WebView与js交互（调用哪些API）  
本人知乎：  
  
WebView的三个方法，LoadUrl ;LoadData , LoadDataWithBase  
  
>LoadUrl有点浪费流量，而且加载起来有点慢    
>LoadData ：data:是要加载的数据类型，但在数据里面不能出现英文特殊字符    
>loadDataWithBaseURL：会把baseUrl和historyUrl传到List列表中    

## 3. RxJava  
  
http://gank.io/post/560e15be2dca930e00da1083?from=timeline&isappinstalled=0#toc_1  


## 4. 开源框架，为什么使用，与别的有什么区别？  
这个问题基本必问。在自己简历上写什么框架，他就会问什么。  
android快速集成框架：livery
网络请求：[xUtils3](https://www.cnblogs.com/wangying222/p/5590437.html)，okhttp，[retrofit](https://blog.csdn.net/carson_ho/article/details/73732076)    
异步：[RxJava](https://blog.csdn.net/xx326664162/article/details/52068014)，AsyncTask    
图片处理：Picasso，Glide    
消息传递：EventBus (注：3。0)  
混合开发:weex,rn    
热修复：AndFix/HotFix/Spophix（阿里巴巴）、Tinker（腾讯）、Robust(美团)    
插件化：360drodplugin,small    
### 网络请求  
  
1.xutils3  4个模块  
  
* (1).DbUtils、用来操作数据库    
```  
DbUtils dUtils = DbUtils.create(MainActivity.this, "Student");  
try {  
    //创建表，表名为包名_StudentInfo  
    dUtils.createTableIfNotExist(StudentInfo.class);  
} catch (DbException e) {  
    e.printStackTrace();  
}  
```            
* (2).HttpUtils、  
```    
// 请求参数  
RequestParams params = new RequestParams("http://www.baidu.com");  
x.http().get(params, new CommonCallback<String>() {  
    @Override  
    public void onCancelled(CancelledException arg0) {  
    }  
    @Override  
    public void onError(Throwable arg0, boolean arg1) {  
    }  
    @Override  
    public void onFinished() {  
    }  
    @Override  
    public void onSuccess(String arg0) {  
        // 成功下载，显示到txtv上面  
        txtv.setText(arg0);  
    }  
});  
```    
* (3).ViewUtils、 可以用来代替findViewbyId，也可以用来给控件添加点击事件(注解形式)  
* (4).BitmapUtils 用来加载ImageView的图片资源，可以加载本地、网络  
```  
BitmapUtils bUtils = new BitmapUtils(this); 2 bUtils.display(imgv,"http://xiaotuanzi.jpg");   
```  
2.retrofit  
  
>准确来说，Retrofit是一个RESTful的HTTP网络请求框架的封装。原因：网络请求的工作本质上是OkHttp完成，而Retrofit仅负责网络请求接口的封装  
  
使用 Retrofit 的步骤共有7个：  
  
步骤1：添加Retrofit库的依赖  
```  
dependencies {  
    compile 'com.squareup.retrofit2:retrofit:2.0.2'  
    // Retrofit库  
    compile 'com.squareup.okhttp3:okhttp:3.1.2'  
    // Okhttp库  
  }  
```  
步骤2：创建 接收服务器返回数据 的类  
  
步骤3：创建 用于描述网络请求 的接口  
Retrofit将 Http请求 抽象成 Java接口：采用 注解 描述网络请求参数 和配置网络请求参数  
```  
public interface GetRequest_Interface {  
  
    @GET("openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=car")  
    Call<Translation>  getCall();  
    // @GET注解的作用:采用Get方法发送网络请求  
   
    // getCall() = 接收网络请求数据的方法  
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）  
    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>  
}  
```  
网络请求方法注解：  
>1.@GET、@POST、@PUT、@DELETE、@HEAD、@PATH、@OPTIONS    
>2.@HTTP 用于替换以上7个注解的作用及更多扩展功能。  
  
网络请求参数注解：  
>@Header、@headers、@URL、@Body、@Path、@Field、@FieldMap、@Part、@PartMap、@Query、@QueryMap  
  
步骤4：创建 Retrofit 实例  
```  
Retrofit retrofit = new Retrofit.Builder()  
            .baseUrl("http://sunst.lifangfang.com/") // 设置网络请求的Url地址  
            .addConverterFactory(GsonConverterFactory.create()) // 设置数据解析器  
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 支持RxJava平台  
            .build();  
```  
步骤5：创建 网络请求接口实例 并 配置网络请求参数  
```  
// 创建 网络请求接口 的实例  
GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);  
  
//对 发送请求 进行封装  
Call<Reception> call = request.getCall();  
```  
步骤6：发送网络请求（异步 / 同步）  
```  
/发送网络请求(异步)  
call.enqueue(new Callback<Translation>() {  
    //请求成功时回调  
    @Override  
    public void onResponse(Call<Translation> call, Response<Translation> response) {  
        //请求处理,输出结果  
        response.body().show();  
    }  
  
    //请求失败时候的回调  
    @Override  
    public void onFailure(Call<Translation> call, Throwable throwable) {  
        System.out.println("连接失败");  
    }  
});  
  
// 发送网络请求（同步）  
Response<Reception> response = call.execute();  
```  
### 异步  
  
http://gank.io/post/560e15be2dca930e00da1083  
非常非常经典的一篇文章，失效了。  
  
重新找了一篇：下次自己记录  
  
https://blog.csdn.net/xx326664162/article/details/52068014  
  
### 图片处理  
  
使用参考连接：  
  
https://www.cnblogs.com/simadi/p/6707409.html  
https://www.jb51.net/article/108596.htm  
  
1.Picasso  
  
>Square公司开源的一个Android图形缓存库  
>一个Android下强大的图片下载缓存库  
  
Step1:  
  
compile 'com.squareup.picasso:picasso:2.5.2'  
  
Step2:  
```  
ImageView targetImageView = (ImageView) findViewById(R.id.imageView);  
//网络加载一张图片  
String internetUrl = "http://b.hiphotos.baidu.com/image/pic/item/32fa828ba61ea8d3fcd2e9ce9e0a304e241f5803.jpg";  
Picasso  
    .with(context)  
    .load(internetUrl)  
    .into(targetImageView);  
//Resources 中加载  
int resourceId = R.mipmap.ic_launcher;  
Picasso  
    .with(context)  
    .load(resourceId)  
    .into(targetImageView);  
//本地File文件中加载  
File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Running.jpg");  
Picasso  
    .with(context)  
    .load(file)  
    .into(targetImageView);   
```  
2.Glide：是Google员工的开源项目，基于Picasso的一个框架，代码风格与Picasso非常相似，增加了更多的功能，  
非常重要的就是支持gif，当然它的包会大一些。如果你的项目对图片的使用场景非常多，并且需要支持gif，则推荐使用。  
目前在Github上的Star已经达到13636个。  
  
https://www.cnblogs.com/guilin-hu/p/5706916.html  
  
### 消息传递：  
使用EventBus了，在看代码之前要记得三个问题。  
  
* 1、事件发布者如何发布事件  
* 2、事件订阅者如何订阅事件  
* 3、订阅者如何准确接收发布者发布的多个事件中的一个(假设发布者发布多个事件，订阅者只是订阅其中的一个事件)  
  
(1)首先在gradle文件中添加EventBus的依赖  
  
       compile 'org.greenrobot:eventbus:3.0.0'  
(2)在相关Activity中的onCreat()、onDestory()注册和解注EventBus  
  
```  
@Override  
protected void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    setContentView(R.layout.activity_main);  
    EventBus.getDefault().register(this);  
}  
  
@Override  
protected void onDestroy() {  
    super.onDestroy();  
    EventBus.getDefault().unregister(this);  
}  
```  
(3)事件发布者如何发布事件  
```  
EventBus.getDefault().post(实参);  
```  
(4)事件订阅者订阅事件  
```  
@Subscribe  
public void onEventMainThread(实参){  
    //接收到发布者发布的事件后，进行相应的处理操作  
}  
```  
这里要注意的是：EventBus在 3.0 版本后，事件订阅监听的方法名可以随意起，不同于旧版本，名字是特定的。  
  
```  
public void onEventMainThread(param)    
{    
　　  //如果使用onEventMainThread作为订阅函数，那么不论事件是在哪个线程中发布出来的，onEventMainThread都会在UI线程中执行，接收事件就会在UI线程中运行，  
　　　//这个在Android中是非常有用的，因为在Android中只能在UI线程中跟新UI，所以在onEvnetMainThread方法中是不能执行耗时操作的。  
}    
    
public void onEventPostThread(param)    
{    
 //如果使用onEvent作为订阅函数，那么该事件在哪个线程发布出来的，onEvent就会在这个线程中运行，也就是说发布事件和接收事件线程在同一个线程。  
　　  //使用这个方法时，在onEvent方法中不能执行耗时操作，如果执行耗时操作容易导致事件分发延迟。       
}    
    
public void onEventBackgroundThread(param)    
{    
 //如果使用onEventBackgrond作为订阅函数，那么如果事件是在UI线程中发布出来的，那么onEventBackground就会在子线程中运行，如果事件本来就是子线程中发布出来的，那么onEventBackground函数直接在该子线程中执行。       
}    
    
public void onEventAsync(param)    
{    
　　//使用这个函数作为订阅函数，那么无论事件在哪个线程发布，都会创建新的子线程在执行onEventAsync.           
}   
```  
但是新版本需要手动的添加注解@Subscribe(这是必不可少的)。既然名字可以随意起，那么又怎么控制在什么线程内进行处理呢？  
```  
@Subscribe(threadMode = ThreadMode.MAIN)  
```  
给注解设置ThreadMode就可以了。  
  
(5)事件发布者和订阅者如何对应上  
  
可以看到发布事件和订阅事件，都需要传入一个实参，而且在post方法中我们也看到了，这个实参是对象类型的，大家猜想的话也可以知道，发布和订阅事件是通过一个对象实参来进行关联的。  
  
```  
public class TestEvent {  
    private int mMsg;  
    public TestEvent(int msg) {  
        mMsg = msg;  
    }  
    public int getMsg(){  
        return mMsg;  
    }  
}  
```  
这个类很简单，只有一个变量和一个构造方法、get方法。具体内容根据项目需求来定。  
  
基本上了解这些就可以搞明白EventBus的使用了  
  
下面上一下我写的Demo，功能很简单，就是模仿下载的进度条，因为现在用的最多的是通过handler来进行处理的，而EventBus的出现，可以完美的代替handler，  
  
而且实现了解耦。  
  
具体看这里：https://www.cnblogs.com/upwgh/p/6394901.html  
  
  
### 混合开发  
  
[weex,rn比较](https://blog.csdn.net/sun_hongtao/article/details/75451653)  

## 5. 如何做性能优化？  
  
1.  **节制的使用Service**，当启动一个Service时，系统总是倾向于保留这个Service依赖的进程，这样会造成系统资源的浪费，可以使用IntentService，执行完成任务后会自动停止。  
      
2.  **当界面不可见时释放内存**，可以重写Activity的onTrimMemory()方法，然后监听TRIM_MEMORY_UI_HIDDEN这个级别，这个级别说明用户离开了页面，可以考虑释放内存和资源。  
      
3.  **避免在Bitmap浪费过多的内存**，使用压缩过的图片，也可以使用Fresco等库来优化对Bitmap显示的管理。  
      
4.  **使用优化过的数据集合**，SparseArray代替HashMap，HashMap为每个键值都提供一个对象入口，使用SparseArray可以免去基本对象类型转换为引用数据类想的时间。  
      
5. **避免使用依赖注入框架**，比如说像Guice或者RoboGuice等，可以简化一些复杂的编码操作，甚至可以将`findViewById()`都省去，看上去确实十分诱人，但是这些框架为了要搜寻代码中的注解，通常都需要经历较长的初始化过程，并且还可能将一些你用不到的对象也一并加载到内存当中。这些用不到的对象会一直占用着内存空间，可能要过很久之后才会得到释放，相较之下，也许多敲几行看似繁琐的代码才是更好的选择。  
  
6. **使用ProGuard简化代码**，这个工具除了混淆代码外，它还具有压缩和优化代码的功能。ProGuard会对我们的代码进行检索，删除一些无用的代码，并且会对类、字段、方法等进行重命名，重命名之后的类、字段和方法名都会比原来简短很多，这样的话也就对内存的占用变得更少了。  
## 6. 如果防止过度绘制，如何做布局优化?  
  
1.  使用include复用布局文件。  
      
2.  使用merge标签避免嵌套布局。  
      
3.  使用stub标签仅在需要的时候在展示出来。  
  
## 7. 如何提高代码质量？  
  
1.  避免创建不必要的对象，尽可能避免频繁的创建临时对象，例如在for循环内，减少GC的次数。  
      
2.  尽量使用基本数据类型代替引用数据类型。  
      
3.  静态方法调用效率高于动态方法，也可以避免创建额外对象。  
      
4.  对于基本数据类型和String类型的常量要使用static final修饰，这样常量会在dex文件的初始化器中进行初始化，使用的时候可以直接使用。  
      
5.  多使用系统API，例如数组拷贝System.arrayCopy()方法，要比我们用for循环效率快9倍以上，因为系统API很多都是通过底层的汇编模式执行的，效率比较高。  
## 8. 有没有遇到64k问题，为什么，如何解决?  
  
-   在DEX文件中，method、field、class等的个数使用short类型来做索引，即两个字节（65535），method、field、class等均有此限制。  
      
-   APK在安装过程中会调用dexopt将DEX文件优化成ODEX文件，dexopt使用LinearAlloc来存储应用信息。  
  
<font color=#0099ff size=4 face="微软雅黑"><b>Tips：</b></font>  
  
> 关于LinearAlloc缓冲区大小，不同的版本经历了4M/8M/16M的限制，超出缓冲区时就会抛出INSTALL_FAILED_DEXOPT错误。  
      
这个我没遇见过：回答解决方案就行了  
  
解决方案是Google的MultiDex方案，具体参见：配置方法数超过64K的应用。  
  
## 9. 加载大图   
Tips：有家小公司（规模写假的，给骗过去了），直接把项目给我看，让我说实现原理。   
最让我无语的一次面试，就一个点问的我底裤都快穿了，就差帮他们写代码了。。   
http://blog.csdn.net/lmj623565791/article/details/49300989  
  
>DiskLruCache：硬盘缓存的解决方案(非Google官方编写，但获得官方认证)    
>LruCache ：只是管理了内存中图片的存储与释放，如果图片从内存中被移除的话，那么又需要从网络上重新加载一次图片，这显然非常耗时  
  
在我所接触的应用范围里，Dropbox、Twitter、网易新闻，华为智能家居酷玩页面等都是使用DiskLruCache来进行硬盘缓存的  
  
这些内容和图片在从网络上获取到之后都会存入到本地缓存中，因此即使手机在没有网络的情况下依然能够加载出以前浏览过的新闻。而使用的缓存技术不用多说，自然是DiskLruCache  
  
那么首先第一个问题，这些数据都被缓存在了手机的什么位置呢？  
  
  
  
其实DiskLruCache并没有限制数据的缓存位置，可以自由地进行设定，但是通常情况下多数应用程序都会将缓存的位置选择为   
/sdcard/Android/data/<application package>/cache  
  
选择在这个位置有两点好处：  
  
第一，这是存储在SD卡上的，因此即使缓存再多的数据也不会对手机的内置存储空间有任何影响，只要SD卡空间足够就行。  
  
第二，这个路径被Android系统认定为应用程序的缓存路径，当程序被卸载的时候，这里的数据也会一起被清除掉，这样就不会出现删除程序之后手机上还有很多残留数据的问题。  
  
journal这个文件就标志着该程序使用DiskLruCache技术了。  
  
### 写入缓存  
  
    public static DiskLruCache open(File directory, int appVersion, int valueCount, long maxSize)  
  
open()方法接收四个参数，第一个参数指定的是数据的缓存地址，第二个参数指定当前应用程序的版本号，第三个参数指定同一个key可以对应多少个缓存文件，基本都是传1，第四个参数指定最多可以缓存多少字节的数据。  
  
需要注意的是，每当版本号改变，缓存路径下存储的所有数据都会被清除掉，因为DiskLruCache认为当应用程序有版本更新的时候，所有的数据都应该从网上重新获取。  
  
  
    DiskLruCache.Editor editor = mDiskLruCache.edit(key);  
    OutputStream outputStream = editor.newOutputStream(0);  
    mDiskLruCache.flush();  
  
### 读取缓存  
    public synchronized Snapshot get(String key) throws IOException  
  
    DiskLruCache.Snapshot snapShot = mDiskLruCache.get(key);  
    InputStream is = snapShot.getInputStream(0);  
这是我们从本地缓存中加载的，而不是从网络上加载的，因此即使在你手机没有联网的情况下，这张图片仍然可以显示出来。  
  
### 移除缓存  
    public synchronized boolean remove(String key) throws IOException  
    mDiskLruCache.remove(key);  
  
总结：  
  
每次加载图片的时候都优先去内存缓存当中读取，当读取不到的时候则回去硬盘缓存中读取，而如果硬盘缓存仍然读取不到的话，就从网络上请求原始数据。  
不管是从硬盘缓存还是从网络获取，读取到了数据之后都应该添加到内存缓存当中，这样的话我们下次再去读取图片的时候就能迅速从内存当中读取到，  
而如果该图片从内存中被移除了的话，那就重复再执行一遍上述流程就可以了。  
  
## 10. 三级缓存（各大图片框架都可以扯到这上面来）   
  
 - 内存缓存    
 - 本地缓存    
 - 网络  
  
内存：http://blog.csdn.net/guolin_blog/article/details/9526203   
本地：http://blog.csdn.net/guolin_blog/article/details/28863651  


## 11.谈谈扫码支付的流程  
  
[参考-# 谈谈扫码支付的实现流程](https://www.jianshu.com/p/f1a088dc7a66)  

## 12.Android中如何实现网络安全的
[参考-# Android网络请求加密机制详解](https://blog.csdn.net/fengyeNom1/article/details/80880808)
## 13. NFC简单总结  
NFC（Near Field Communication，近场通信）是一种数据传输技术。与Wi-Fi、蓝牙、红外线等数据传输技术的一个主要差异就是有效距离一般不能超过4厘米。但是NFC传输速度要比红外快。  
  
华为钱包NFC是内置于芯片里面的，可以通过NFC刷手机、完成坐公交，地铁，结账等点对点付款的场景。其它比如身份识别、门钥匙==，这里面就涉及到NFC通信技术##  
### NFC的工作模式  
  
NFC支持如下3种工作模式：  
  
* 1.读卡器模式（Reader/writer mode）  
* 2.仿真卡模式(Card Emulation Mode)  
* 3.点对点模式（P2P mode）  
  
（1）读卡器模式  
  
数据在NFC芯片中，可以简单理解成“刷标签”。本质上就是通过支持NFC的手机或其它电子设备从带有NFC芯片的标签、贴纸、名片等媒介中读写信息。通常NFC标签是不需要外部供电的。当支持NFC的外设向NFC读写数据时，它会发送某种磁场，而这个磁场会自动的向NFC标签供电。  
  
（2）仿真卡模式  
  
数据在支持NFC的手机或其它电子设备中，可以简单理解成“刷手机”。本质上就是将支持NFC的手机或其它电子设备当成借记卡、公交卡、门禁卡等IC卡使用。基本原理是将相应IC卡中的信息凭证封装成数据包存储在支持NFC的外设中 。  
在使用时还需要一个NFC射频器（相当于刷卡器）。将手机靠近NFC射频器，手机就会接收到NFC射频器发过来的信号，在通过一系列复杂的验证后，将IC卡的相应信息传入NFC射频器，最后这些IC卡数据会传入NFC射频器连接的电脑，并进行相应的处理（如电子转帐、开门等操作）。  
  
（3）点对点模式  
  
该模式与蓝牙、红外差不多，用于不同NFC设备之间进行数据交换，不过这个模式已经没有有“刷”的感觉了。其有效距离一般不能超过4厘米，但传输建立速度要比红外和蓝牙技术快很多，传输速度比红外块得多，如过双方都使用Android4.2，NFC会直接利用蓝牙传输。这种技术被称为Android Beam。所以使用Android Beam传输数据的两部设备不再限于4厘米之内。  
点对点模式的典型应用是两部支持NFC的手机或平板电脑实现数据的点对点传输，例如，交换图片或同步设备联系人。因此，通过NFC，多个设备如数字相机，计算机，手机之间，都可以快速连接，并交换资料或者服务。  
  
  
差异性对比图：  
  
| 对比项      | NFC                  | 蓝牙                            | 红外                |  
|-----------|-----------------------|--------------------------------|----------------------------|   
|网络类型  |点对点                   |单点对多点                      |点对点                |  
|有效距离  |<=0.1m                    |<=10m，最新蓝牙4.0有效距离可达100m |一般在1m以内，热技术连接，不稳定|  
|传输速度  |最大424kbps 最大24Mbps   |慢速115.2kbp                     |快速4Mbps|                     
|建立时间  |<0.1s                 |6s                                 |0.5s                       |  
|安全性       |安全，硬件实现           |安全，软件实现                       |不安全，使用IRFM时除外|  
|通信模式  |主动-主动/被动          |主动-主动                         |主动-主动                  |  
|成本        |低                     |   中                              |低                         |  
  
Android对NFC的支持  
不同的NFC标签之间差异很大，有的只支持简单的读写操作，有时还会采用支持一次性写入的芯片，将NFC标签设计成只读的。当然，也存在一些复杂的NFC标签，例如，有一些NFC标签可以通过硬件加密的方式限制对某一区域的访问。还有一些标签自带操作环境，允许NFC设备与这些标签进行更复杂的交互。这些标签中的数据也会采用不同的格式。但Android SDK API主要支持NFC论坛标准（Forum Standard），这种标准被称为NDEF（NFC Data Exchange Format，NFC数据交换格式）。  
  
（1）NDEF数据的操作  
  
Android SDK API支持如下3种NDEF数据的操作：  
  
* 1）从NFC标签读取NDEF格式的数据。    
* 2）向NFC标签写入NDEF格式的数据。    
* 3）通过Android Beam技术将NDEF数据发送到另一部NFC设备。    
  
用于描述NDEF格式数据的两个类：  
  
* 1）NdefMessage：描述NDEF格式的信息，实际上我们写入NFC标签的就是NdefMessage对象。  
* 2）NdefRecord：描述NDEF信息的一个信息段，一个NdefMessage可能包含一个或者多个NdefRecord。  
  
NdefMessage和NdefRecord是Android NFC技术的核心类，无论读写NDEF格式的NFC标签，还是通过Android Beam技术传递Ndef格式的数据，都需要这两个类。  
  
（2）非NDEF数据的操作  
  
对于某些特殊需求，可能要存任意的数据，对于这些数据，我们就需要自定义格式。这些数据格式实际上就是普通的字节流，至于字节流中的数据代表什么，就由开发人员自己定义了。  
  
（3）编写NFC程序的基本步骤  
  
Step 1: 设置权限，限制Android版本、安装的设备  
```  
<uses-sdk android:minSdkVersion="14"/>  
<user-permission android:name="android.permission.NFC"/>  
<uses-feature android:name="android.hardware.nfc" android:required="true"/>  
```  
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
  
  
Step 3:向NFC标签写入数据  
  
一般分为三步：  
  
1）获取Tag对象  
```  
Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);  
```  
2）判断NFC标签的数据类型（通过Ndef.get方法）  
```  
Ndef ndef = Ndef.get(tag);  
```  
3）写入数据  
```  
ndef.writeNdefMessage(ndefMessage);  
```  
完整代码参考  
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
  
  
### NFC标签让Android自动打开网页  
  
首先我们创建一个NdefRecord，Android已经为我们提供好了这样的方法：  
```  
//直接接受一个Uri  
public NdefRecord createUri(String uriString);  
//接受一个Uri的对象  
public NdefRecord createUri(Uri uri);  
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