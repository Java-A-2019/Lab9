package layoutDemos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class StackPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final int WIDTH = 1200;
        final int HEIGHT = 600;
        // 新建三个不同大小的Label
        Label greenLabel = new Label("Green Label");
        setWidthHeight(greenLabel, WIDTH/2, HEIGHT/2);
        greenLabel.setStyle("-fx-background-color: green");

        Label yellowLabel = new Label("Yellow Label");
        setWidthHeight(yellowLabel, WIDTH/4, HEIGHT/4);
        yellowLabel.setStyle("-fx-background-color: yellow");

        Label redLabel = new Label("Red Label");
        setWidthHeight(redLabel, WIDTH/8, HEIGHT/8);
        redLabel.setStyle("-fx-background-color: red");

        // 布局
        StackPane pane = new StackPane();
        pane.getChildren().add(greenLabel);
        pane.getChildren().add(yellowLabel);
        pane.getChildren().add(redLabel);
        pane.setStyle("-fx-background-color:#aaa;"); // 设置成灰色

        // 主界面显示
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    private void setWidthHeight(Region region, int width, int height) {
        region.setMaxHeight(height);
        region.setMinHeight(height);
        region.setMaxWidth(width);
        region.setMinWidth(width);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
