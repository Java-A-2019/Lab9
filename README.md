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
可以进行大小的设置，更加方便。大家自行探究！效果如下图：
<br/>

![effect2](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/effect2.jpg)

## 熟悉JavaFx的布局元素
### StackPane
它会将放入的控件，一个个重叠起来。相当于你往桌面上面放卡片，它们会堆起来。我们看一下
代码：
```java
@Override
    public void start(Stage stage) throws Exception {
        final int WIDTH = 1200;
        final int HEIGHT = 600;
        // 新建三个不同大小的Label
        // code ...

        // 连续放入三个Label
        StackPane pane = new StackPane();
        pane.getChildren().add(greenLabel);
        pane.getChildren().add(yellowLabel);
        pane.getChildren().add(redLabel);
        pane.setStyle("-fx-background-color:#aaa;"); // 设置成灰色

        // 主界面显示
        // code ...
    }
```

具体代码在LayoutDemos的StackPaneDemo.java下面。
首先创建三个不同颜色的Label，然后依次将他们放入StackPane中。看下效果：
<br/>
![stackpane](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/stackpane.jpg)

这个界面虽然看起来很难看，但是稍微修改一下就能达到不同的效果，比方说，最底下可以放置
一个背景图片，中间的一层可以放置高斯模糊。这些需要大家自己尝试了。

### GridPane, HBox & VBox
有了重叠布局，之后是网格布局。比方说，上面的日历中，显示数字就用到了表格。
* GridPane
<br/>
含有多行多列的表格。用法如下：

```java
@Override
    public void start(Stage stage) throws Exception {
        final int WIDTH = 500;
        final int HEIGHT = 240;
        // 创建网格布局
        GridPane pane = new GridPane();
        pane.setStyle("-fx-background-color:#fff;"); // 设置成灰色
        setWidthHeight(pane, WIDTH, HEIGHT);
        pane.setAlignment(Pos.CENTER); // 设置GridPane在父元素（这里是Scene）中居中对齐
        pane.setHgap(10); // 设置格子元素的水平距离
        pane.setVgap(10); // 设置格子元素的竖直距离

        // 创建一系列Label
        for (int row = 0 ; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                Label label = new Label("" + (row * 7 + col + 1));
                setWidthHeight(label, 60, 40);
                label.setStyle("-fx-background-color: lightgreen;" + // 设置背景色
                        "-fx-alignment: center; " + // 设置文字居中
                        "-fx-background-radius: 5;"); // 设置背景的圆角化
                pane.add(label, col, row);
            }
        }

        // 主界面显示
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        stage.setTitle("Demo2");
        stage.setScene(scene);
        stage.show();
    }
```

注意，GridPane添加子元素的时候，需要加上row和column参数。另外，它的对齐方式，有
多种，这里用了setAlignment，和setHAlignment。另外，通过设置style的方式进行格式的
配置是一种很好的方式（这是以前我室友教我的）。效果如下：
<br />

![gridpane](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/gridpane.jpg)

Tip: 多使用idea自动弹出的提示，利用上下键进行查找，这会大大提高你的效率。
<br />

![tip](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/tip.jpg)

* HBox & VBox

相信你不久之后，就会发现GridPane要实现对齐是如此困难。这个时候，你可以参考一下
书上HBox和VBox的使用。

### BorderPane
实话说，我感觉这个Pane不是特别有用，基本可以用其他的Panel代替，这也交给大家自学了。

### GridPane 和 StackPane 结合使用
将GridPane和StackPane结合起来，基本可以完成很多布局了。下面展示一下一个简单的：
<br/>

```java
    @Override
    public void start(Stage stage) throws Exception {
        final int WIDTH = 600;
        final int HEIGHT = 400;
        // 布局
        StackPane pane = new StackPane();
        // 载入图片
        Image image = new Image("file:img/autumn.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(HEIGHT);
        imageView.setFitWidth(WIDTH);
        
        pane.getChildren().add(imageView);
        GridPane grid = getGrid();
        pane.getChildren().add(grid);
        // !!! 设置平移，在原来居中的基础上，进行平移。
        grid.setTranslateX(20);
        grid.setTranslateY(20);


        // 主界面显示
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.show();
    }
    
    private GridPane getGrid() {
            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setHgap(10);
            pane.setVgap(10);
    
            // 创建一系列Label
            for (int row = 0 ; row < 4; row++) {
                for (int col = 0; col < 7; col++) {
                    Label label = new Label("" + (row * 7 + col + 1));
                    setWidthHeight(label, 60, 40);
                    label.setStyle("-fx-background-color: rgba(102,255,153, 0.5);" + // 自行搜索rgba的用法
                            "-fx-alignment: center; " +
                            "-fx-background-radius: 5;");
                    pane.add(label, col, row);
                }
            }
            return pane;
        }
```
首先，这些代码想做到的是在StackPane里面加上一个GridPane。我们看到，getGrid方法
会返回一个定制化的GridPane。之后，StackPane里面先放置了一张图片，然后放置了GridPane。
在这里，可以通过setTranslateX和setTranslateY的方式将子元素从原有的位置上平移到其他地方。

代码的效果如下：
<br />

![combination](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/combination.jpg)


## 任务

阅读并运行task package下面的ShowGridPane.java，参考它的实现，完成下面红框内的内容。
<br />
![task](https://raw.githubusercontent.com/Java-A-2019/Lab9/master/img/task.jpg)

###要求
* 内容必须一致，配色可以不同。
* 将整个项目打包上传到ftp WORK_UPLOAD的lab9目录下，命名为学号+姓名。
* 截止时间为2019年12月1日23点59分59秒。

## 其他资源
大家如果有看到什么比较好的资源可以共享一下，我搜了一下，感觉没什么好推荐的。
大家可以先看书，或者用搜索引擎一点点学，这基本上就是我们以前采用的方式了。