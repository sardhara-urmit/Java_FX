import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestF extends Application{
    @Override
     public void start(Stage arg0) throws Exception {
     Button btn1 =new Button("Show");
     Button exit =new Button("exit");
     Label lbl1=new Label();

       exit.setOnAction(e->{
        System.exit(0);
       });

        btn1.setOnAction(e->{
            lbl1.setText("hello");
            
        });

     VBox root =new VBox();
    
     root.getChildren().addAll(btn1,lbl1,exit);
     
    
     Scene scene =new Scene(root,500,500);
     arg0.setTitle("test lable");
     arg0.setScene(scene);
        arg0.show();
    }
    

    public static void main(String[] args) {
        
        launch(args);
    }
}
