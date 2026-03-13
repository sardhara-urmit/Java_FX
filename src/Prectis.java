import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Prectis extends Application{
 @Override
 public void start(Stage arg0) throws Exception {
    
    Button b1= new Button("click");
    StackPane root = new StackPane();
    root.getChildren().add(b1);
   Scene scene =new Scene(root,300,400);

    arg0.setTitle("king is win");
    arg0.setScene(scene);
    arg0.show();
 }
 public static void main(String[] args) {
    launch(args);
 }
    
}