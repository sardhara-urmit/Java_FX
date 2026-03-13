import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Btn extends Application {

    @Override
    public void start(Stage stage) {

        Button b1 = new Button("Click me");

        FlowPane f1 = new FlowPane();
        f1.getChildren().add(b1);

        Scene scene = new Scene(f1, 300, 300);

        stage.setTitle("Hello Button");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}