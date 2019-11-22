# Lab9

> 世界上并没有完美的程序，但是我们并不因此而沮丧，因为写程序本来就是
一个不断追求完美的过程。  -- 《深入理解Java虚拟机》

这次Lab主要让大家熟悉一些JavaFX的基础知识。JavaFX是用于构建用户图形化界面
的工具库，可以类比Junit4工具库。另外，Swing和AWT也是构建用户图形化界面的工具库
，只不过比较推荐使用JavaFx。通过使用JavaFx,我们可以实现这个效果：<br/><br/>
![calendar1](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/calendar1.jpg)

甚至这个效果：<br/>

![calendar2](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/calendar2.jpg)

## JavaFX知识脉络
* 简单JavaFX程序的启动
   <br/>
   学东西，从最简单的东西开始，稍微了解一下一个基本的JavaFX程序，然后在
   这个程序的基础上扩展你的程序就好了。
* 熟悉JavaFx的布局方式
   <br/>
   JavaFx主要通过各种Panel进行布局，比方说BorderPane, StackPane。在Web编程中，
   有div, span等元素进行布局；在android中，有LinearLayout, FrameLayout和RelativeLayout
   ；在C#中，当让也有...总之，GUI的变化，万变不离其宗，“其宗”指的是，布局，控件，事件绑定。
   有了这三项，你就可以搭建出一个基本能用的程序。如果需要好看，之后有时间再说。
 
 * 熟悉JavaFx的控件
   <br />
   各种GUI的控件基本上都是相同的，当你们大一下或者之后学了就知道。学来学去都是
   Button，Label，输入框，图片等等。在这里，我会介绍几个，实际上控件真的灰常简单，
   大家书上翻一翻基本就可以弄懂了。
   
* 熟悉JavaFx的事件绑定
  <br />
  这个内容留到下次Lab课再讲了，不然这次内容太多，消化不了。感兴趣的同学，可以提前
  学习一下第十五章的内容。课本上的东西很多，但是实用的东西并不多，要学会取舍哦！
  
* 熟悉JavaFx的界面美化
  <br />
  这个内容，可能毛助教来讲比较合适。嗯，大家多去“骚扰”他。

## 启动JavaFx程序
首先，第一个示例是launchDemos目录下Demo1。大致结构如下:
```java
public class Demo1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // 初始化工作
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
```
Demo1必须是Application的子类，并且重写start方法，最后通过main方法启动。
之所以要这么做，是因为JavaFx内部使用了多线程机制，需要通过这种方式进行启动。
接下来写入初始化代码：
```java
// 控件Label
@Override
public void start(Stage stage) throws Exception {

    // 控件Label
    Label label = new Label("Welcome to JavaFX");
    label.setMaxHeight(100);
    label.setMinHeight(100);
    label.setMaxWidth(200);
    label.setMinWidth(200);
    label.setStyle("-fx-background-color: #fff;"); // 设置背景色为白色
    label.setAlignment(Pos.CENTER); // 设置字体居中对齐

    // 布局元素
    StackPane pane = new StackPane();
    pane.getChildren().add(label);
    pane.setStyle("-fx-background-color:#aaa;"); // 设置成灰色

    // 主界面显示
    Scene scene = new Scene(pane, 200, 250);
    stage.setTitle("Demo1");
    stage.setScene(scene);
    stage.show();
}
```
启动之后的效果如下：<br />
![effect1](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/effect1.jpg)

我们可以看到Scene和Application基本上没有什么卵用。主要是Label和StackPane起了作用。
但是Scene和Application还是要写的。Label是标签，主要用于显示文字。StackPane是一种布局方式，
接下来会详细讲。

<br/>
Demo2则展示了一个Button，由于Button是Region的子类，通过setWidthHeight方法，
可以进行大小的设置，更加方便。大家自行探究！

## 熟悉JavaFx的布局元素


## 熟悉JavaFx的控件


## 任务