import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Master_form extends Application{
    @Override
    public void start(Stage arg0) throws Exception {

        Label lb1=new Label("Username");
        TextField userField=new TextField();
        Label lb2= new Label("Password");
        PasswordField pass=new PasswordField();
        Button submit=new Button();
        Button reset=new Button();

        GridPane root=new GridPane();
        

        Scene scene=new Scene(root,500,500);
        arg0.setScene(scene);
        arg0.setTitle("form");
        arg0.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
