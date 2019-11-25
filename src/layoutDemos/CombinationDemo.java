package layoutDemos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CombinationDemo extends Application {
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
