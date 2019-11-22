# Lab9

> 世界上并没有完美的程序，但是我们并不因此而沮丧，因为写程序本来就是
一个不断追求完美的过程。  -- 《深入理解Java虚拟机》

这次Lab主要让大家熟悉一些JavaFX的基础知识。JavaFX是用于构建用户图形化界面
的工具库，可以类比Junit4工具库。另外，Swing和AWT也是构建用户图形化界面的工具库
，只不过比较推荐使用JavaFx。通过使用JavaFx,我们可是实现这个效果：<br/>
![calendar1]()



# Lab0
大神A忠告: 不要抄lab, 好好用、多多用搜索引擎！

~~大神B忠告： 好好学高数，不要抄作业！~~ （跑题了）

大神C忠告： 不要觉得自己很菜，好好学，你们中的一些人以后都会变成大神的！

大神D忠告： 拒绝粗糙，追求细节！

嗷，恭喜大家开启编程生涯！这是Programming A课程的第一次上机实验，本次Lab将会帮助大家配置好相应的环境，为日后的编程做准备。

## 目录
- [教学团队](#教学团队)  
- [Lab课堂要求与建议](#lab课堂要求与建议)
- [使用学院的ftp](#使用学院的ftp)
- [使用elearning](#使用elearning)
- [安装Java JDK](#安装java-jdk)
- [账号注册与IDEA](#账号注册与IDEA)
- [思考题](#思考题)
- [其他](#其他)



## 教学团队
### 教师：陈荣华
联系方式：[chenrh@fudan.edu.cn](http://chenrh@fudan.edu.cn)
### 助教：
- 谢东方 [16302010029@fudan.edu.cn](http://16302010029@fudan.edu.cn) 18702169661
- 毛浩楠 [16302010027@fudan.edu.cn](http://16302010027@fudan.edu.cn) 17621194869
- 陈雷远 [16302010001@fudan.edu.cn](http://16302010001@fudan.edu.cn) 17317124396

## 任务

- 熟悉计算机操作及命令

- 使用ftp上传下载作业

- 配置环境（含java）

- 运行第一个程序

## Lab课堂要求与建议  
1. 遇到问题请先自我思考。其次，考虑使用Google/Baidu，使用搜索引擎是大家必须养成的习惯，它会极大地加速各位的成长！最后，再询问周围的同学和助教。  
2. 在完成Lab后，和周围的同学进行语言上的交流和代码上的交流(Code Review)，积极地参与讨论。  
3. 按时、按说明递交作业，如有情况请及时向TA通过邮件说明。  
4. 如果你不是大牛，请亲自来Lab课并当堂完成。当你抄了一个lab，会根本停不下来，起码学长学姐的历史上经常是这样的。程序设计有五学分，而且是编程生涯的启蒙课程，请大家务必认真对待！


## 使用学院的ftp


FTP 站点类似于云盘，在FTP上可以下载软件学院的的课程资料，我们主要使用 FTP 提交每次 lab 作业 和期中期末两次 Project

进入FTP之前**必须连上学校内网**

源地址：```ftp://10.132.141.33```

![figure](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/ftp_line.jpg)

1. 使用ftp客户端或者Windows资源管理器，在学校内网下访问，用户名与密码都是学号，登入之后请改密码。

2. 还有一个无门槛的账户（用户名 ```ss``` 密码 ```ss```），提供紧急使用。

3. Mac端推荐使用fileZilla作为客户端，地址在学院文件夹里。

4. 然后进入 ```/classes/19/191 程序设计A（陈荣华）```

![child](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/ftp.jpg)


>注意，你只对 WORK_UPLOAD文件夹有上传的权限，没有下载、删除、重命名的权限。  
请重命名文件后再上传，ftp服务器上错误的文件名是无法修改的，但是可以 覆盖重名的文件。另外，上传文件是有时间戳的，不要认为助教不知道你们的上传时间哦！

### [Easy Connect](http://www.ecampus.fudan.edu.cn/sxfsyzn/list.htm)  

想在寝室或者家里连接校园网，也是有办法滴！（PS：但是lab课还是要来的）下载Easy Connect软件，输入URP信息，连接后，相当于你处于校园网环境中，这样就可以访问ftp了。

## 使用elearning

浏览器打开  
http://elearning.fudan.edu.cn/portal  
右上角使用 URP 账号登陆。

## 安装java JDK 8

请在 FTP 的 ```/classes/19/191 程序设计A（陈荣华）/LAB/lab0/jdk```文件夹下载 	jdk-8u181-windows-x64.exe（用于64位windows系统）或者jdk-8u181-windows-i586.exe （用于32位windows系统），jdk-8u221-macosx-x64 （用于Mac系统）。
或者可以直接去官网下载，但是要先进行注册： https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

### 配置环境变量（Windows）

1. 在桌面上右键`计算机`(或者`此电脑`，`我的电脑`，不同系统显示名称可能不同)，点击`属性`:
2. 点击`高级系统设置`
3. 点击`环境变量`
4. 在`系统变量`中，选中名为`Path`的条目，点击编辑。

   ![](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/path.jpg)

   如果使用的是Windows 10，点击新建，输入`C:\Program Files\Java\jdk1.8.0_101\bin`，确定。

   ![](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/path_edit.jpg)

   命令行会从上图中所有的路径中搜索你输入的命令。在我们把目录添加进去后，不管在哪个文件夹下，命令行都能找到`java`和`javac`。

5. 接下去我们配置`CLASSPATH`。

   在`系统变量`中，点击`添加`，`变量名`填`CLASSPATH`，`变量值`填`.`，确定。

   ![](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/classpath.jpg)

Windows 7 和 Windows 8 的配置在界面上有一些小区别，可以参考
[http://jingyan.baidu.com/article/925f8cb836b26ac0dde0569e.html](http://jingyan.baidu.com/article/925f8cb836b26ac0dde0569e.html)

在这个链接中，还添加了一些其他的路径到Path和CLASSPATH，这个是过时的做法，高版本的Java不需要这样设置。



### 配置环境变量（macOS）

打开终端，输入以下命令：

```
echo -e 'export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home\nexport CLASSPATH=.\n
export PATH=${PATH}:${JAVA_HOME}\n' >> ~/.bash_profile
```


### 第一个Java程序： Hello world！
**对于检查环境配置，能打印出这一句话一句话说明路径、环境配置基本成功。Hello World是著名的贝尔实验室提出的范式了，学任意编程语言，Hello World都是起始代码。想要了解贝尔实验室的童鞋，可以参见吴军的《浪潮之巅》 I 百年帝国。**

用记事本或文本编辑器在电脑上新建文件 ```Main.java``` ，输入  
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

+ 在当前目录打开powershell命令行
![powershell](https://raw.githubusercontent.com/Java-B-2018/lab0/master/images/powershell.png)

+ 输入编译指令并运行程序

![HelloWorld](https://raw.githubusercontent.com/Java-B-2018/lab0/master/images/HelloWorld.png)

### 第二个Java程序： 五子棋
经过努力，助教大大终于给各位拿到了大神A的五子棋授权。这是大神A大一上程序设计A的project，相信大家只要好好努力，，，也不一定能超过大一的他，不要灰心，努力三年还是有点可能的。下载`/classes/19/181 程序设计A（陈荣华）/LAB/lab0/game`目录下的iGoBangBySongshu.jar。

![igobang path](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/igobang.jpg)

在包含iGoBangBySongshu.jar的目录下，打开命令行，并输入命令： java -jar .\iGoBangBySongshu.jar。效果如下：

![effect](https://raw.githubusercontent.com/Java-B-2019/lab0/master/images/effect.jpg)

> Java是跨平台的，不管是Linux, Windows 还是 Mac系统都可以装Java。对Linux感兴趣，并且有时间的同学，可以选毛迪林老师的Linux操作系统。

## 账号注册与IDEA
1. 请登陆网站：https://github.com/ 。github是程序员必须知道了解的重要合作平台，我们会慢慢熟悉它。现在大家要做的事情是进入该网站并完成账号的注册。
2. IDEA的下载： 使用记事本直接编辑java文件的做法是非常naive的，现在，编写java一般用~~宇宙最强的~~无比强大的Intellij IDEA来编写。同学们可以进入下面的链接进行下载（学生账户可以免费用ultimate版本）： http://www.jetbrains.com/idea/

## 思考题
- 什么是JDK?
- Java 一共有12个版本，它们之间有什么不同？
- 选择Java 8有什么好处？
- JAVA 的跨平台特性是怎么实现的？
   “Write once, run everywhere” - Sun Microsystem. 


## 其他
轻量级文本编辑器：
+ [Visual Studio Code](https://code.visualstudio.com/) (**极力推荐**)
+ [NotePad++](https://notepad-plus-plus.org/) (**推荐**)
+ [Atom](https://atom.io/) 
+ [Sublime Text](https://www.sublimetext.com/)

浏览器：
 + [Google Chrome](https://www.google.cn/chrome/)
 + [Mozilla FireFox](http://www.firefox.com.cn/)

搜索引擎：

+ [Google](https://www.google.com.hk/)

搜集材料（当然只是借鉴）：
 + [CSDN](https://blog.csdn.net/)
 + [Github](https://github.com/)
 + [PUDN](http://www.pudn.com/)