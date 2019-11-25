package launchDemos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // 控件Label
        Label label = new Label("Welcome to JavaFX");
        label.setMaxHeight(100);
        label.setMinHeight(100);
        label.setMaxWidth(200);
        label.setMinWidth(200);
        label.setStyle("-fx-background-color: #fff;"); // 设置成白色
        label.setAlignment(Pos.CENTER); // 设置字体居中对齐

        // 布局
        StackPane pane = new StackPane();
        pane.getChildren().add(label);
        pane.setStyle("-fx-background-color:#aaa;"); // 设置成灰色

        // 主界面显示
        Scene scene = new Scene(pane, 200, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
