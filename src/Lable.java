import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Lable extends Application {
    @Override
    public void start(Stage stage) {
        // Label create karein
        Label lbl = new Label("Hello JavaFX!");
        
        FlowPane root = new FlowPane();
        root.getChildren().add(lbl);

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("JavaFX Label Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}