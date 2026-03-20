import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Te_form extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Label lb1=new Label("User Name ");
        TextField userField=new TextField();
        Label lb2=new Label("Password");
        PasswordField PasswordField=new PasswordField();
        Button btn1=new Button("Login");
       Button btn2=new Button("Reset");
       Label lb3=new Label();

        btn1.setOnAction(e->{
            if (userField.getText().equals("") || PasswordField.getText().equals("")) {
                lb3.setStyle("-fx-font-size:20px;-fx-text-fill:red");
                lb3.setText("enter user and pass ");
                
            }
            else{
                  lb3.setStyle("-fx-font-size:20px;-fx-text-fill:green");
            lb3.setText("Login Succesfull");
            }
        });

        btn2.setOnAction(e->{
            userField.setText("");
            PasswordField.setText("");
            lb3.setText("");
        });

       GridPane root=new GridPane();
    //    root.getChildren().addAll(lb1,userField,lb2,PasswordField,btn1,btn2); 

    root.setHgap(20);
    root.setVgap(20);
    root.add(lb1, 0, 0);
    root.add(userField, 1, 0);
    root.add(lb2, 0, 1);
    root.add(PasswordField, 1, 1);
    root.add(btn1, 0, 2);
    root.add(btn2, 1, 2);
    root.add(lb3, 0, 3);

    // add style
    root.setStyle("-fx-background-color:linear-gradient(to right,red,blue)");
    lb1.setStyle("-fx-text-fill:yellow; -fx-font-size:20px");
    lb2.setStyle("-fx-text-fill:yellow;-fx-font-size:20px");
    btn1.setStyle("-fx-background-color:yellow");
    btn2.setStyle("-fx-background-color:yellow");
    

        root.setAlignment(Pos.CENTER);
        Scene scene=new Scene(root,500,500);
        arg0.setTitle("login form");
        arg0.setScene(scene);
        
        arg0.show();
    }
    



    public static void main(String[] args) {
        launch(args);
    }
}
