import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class B_flow extends Application {
    @Override
    public void start(Stage arg0) throws Exception {
        
        Button b1=new Button("click");

        FlowPane f1= new FlowPane();
         
        f1.getChildren().add(b1);
        Scene scene =new Scene(f1);

        // arg0.setTitle("hello sir ");
        arg0.setScene(scene);
        arg0.show();

        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
