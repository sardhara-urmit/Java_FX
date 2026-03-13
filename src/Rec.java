import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle; // Sahi import
import javafx.stage.Stage;

public class Rec extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        
        // Rectangle create karein aur sahi methods use karein
        Rectangle rectangle = new Rectangle(); 
        rectangle.setX(20);
        rectangle.setY(20);
        rectangle.setWidth(200);
        rectangle.setHeight(100);

        // Rectangle ko dikhane ke liye Group aur Scene chahiye
        Group root = new Group(rectangle);
        Scene scene = new Scene(root, 400, 300);

        arg0.setTitle("Rectangle Example");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}