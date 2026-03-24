import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Clg_form extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Label Fname= new Label("Enter name : ");
        TextField fname =new TextField();
        Label Mname =new Label("Enter middel name :");
        TextField mname =new TextField();
        Label Lname=new Label("Enter Last name :");
        TextField lname =new TextField();
        RadioButton rd1=new RadioButton("Male");
        RadioButton rd2 =new RadioButton("Female");
        ToggleGroup group =new ToggleGroup();
        rd1.setToggleGroup(group);
        rd2.setToggleGroup(group);


        GridPane root =new GridPane();
        root.add(Fname, 0, 0);
        root.add(fname,1,0);
        root.add(Mname, 0, 1);
        root.add(mname,1,1);
        root.add(Lname, 0, 2);
        root.add(lname,1,2);
        root.add(rd1, 0, 3);
        root.add(rd2, 1, 3);

        


        // style ----
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setStyle("-fx-background-color:linear-gradient(to right ,red , blue)");



        Scene scene =new Scene(root,500,500);
        arg0.setScene(scene);
       arg0.setTitle("Register");
        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
