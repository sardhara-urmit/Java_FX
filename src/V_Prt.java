import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class V_Prt extends Application{
     
    @Override
    public void start(Stage arg0) throws Exception {
        
        Button btn11=new Button("Exit");
        btn11.setOnAction(e->{
            
            System.exit(0);
        });
        VBox root =new VBox();
        root.getChildren().add(btn11);
        Scene scene =new Scene(root,300,200);
        arg0.setTitle("king of cursice");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
