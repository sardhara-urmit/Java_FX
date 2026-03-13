import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test_stackPen extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        
        Button B1 =new Button("click me");
       

        

        StackPane root=new StackPane();
        root.getChildren().add(B1);
        Scene scene= new Scene(root,200,200);
         arg0.setScene(scene);


        arg0.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
