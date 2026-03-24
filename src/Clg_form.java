import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Clg_form extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Label Fname= new Label("Enter name : ");
        TextField fname =new TextField();
        Label Mname =new Label("Enter middel name :");
        TextField mname =new TextField();
        Label Lname=new Label("Enter Last name : ");
        TextField lname =new TextField();

        GridPane root =new GridPane();
        root.add(Fname, 0, 0);
        

        Scene scene =new Scene(root,500,500);
        arg0.setScene(scene);
       arg0.setTitle("Register");
        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
