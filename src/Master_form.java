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
        Button submit=new Button("Subimit");
        Button reset=new Button("reset");
        Label lb3=new Label();


        submit.setOnAction(e->{
            if (userField.getText().equals("") || pass.getText().equals("")) {
                
            
            lb3.setText("Fail");
            }
            else{
                lb3.setText("succses full");
            }
        });
        reset.setOnAction(e->{
            userField.setText("");
            pass.setText("");
            lb3.setText("");
        });

        GridPane root=new GridPane();
        root.add(lb1, 0, 0);
        root.add(userField, 1, 0);
        root.add(lb2,0 , 1);
        root.add(pass, 1, 1);
        root.add(submit, 0, 2);
        root.add(reset, 1, 2);
        root.add(lb3, 0, 3,2,1);

        Scene scene=new Scene(root,500,500);
        arg0.setScene(scene);
        arg0.setTitle("form");
        arg0.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
