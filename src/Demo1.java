import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // 控件
        Button btOK = new Button("OK");
        setWidthHeigh(btOK, 100 , 100);

        // 布局
        StackPane pane = new StackPane();
        pane.getChildren().add(btOK);
        pane.setStyle("-fx-background-color:#aaa;"); // 设置成灰色

        // 主界面显示
        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("Demo1");
        stage.setScene(scene);
        stage.show();
    }

    private void setWidthHeigh(Button bt, int width, int height) {
        bt.setMaxHeight(height);
        bt.setMinHeight(height);
        bt.setMaxWidth(width);
        bt.setMinWidth(width);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
