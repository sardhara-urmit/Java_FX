import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Clg_form extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        // name fild 
        Label Fname= new Label("Enter name : ");
        TextField fname =new TextField();
        Label Mname =new Label("Enter middel name :");
        TextField mname =new TextField();
        Label Lname=new Label("Enter Last name :");
        TextField lname =new TextField();
        //Gender 
        Label Gender =new Label("Gender");
        RadioButton rd1=new RadioButton("Male");
        RadioButton rd2 =new RadioButton("Female");
           // Gender (RadioButton)
        ToggleGroup group =new ToggleGroup();
        rd1.setToggleGroup(group);
        rd2.setToggleGroup(group);

          // Hobby (CheckBox)

        Label Hobby =new Label("Hobby");
        CheckBox playGame = new CheckBox("play game");
        CheckBox Music =new CheckBox("MUsic");
        CheckBox  Singing =new CheckBox("Singing "); 

        // Semester combo box 

        Label semStr=new Label("Semester");
        ComboBox<String> sem=new ComboBox<>();
        sem.getItems().addAll("sem-1","sem-2","sem-3","sem-5","sem-6");




        GridPane root =new GridPane();
        root.add(Fname, 0, 0);
        root.add(fname,1,0);
        root.add(Mname, 0, 1);
        root.add(mname,1,1);
        root.add(Lname, 0, 2);
        root.add(lname,1,2);
        root.add(Gender, 0, 3);
        root.add(rd1, 1, 3);
        root.add(rd2, 2, 3);
        root.add(Hobby, 0, 4);
        root.add(playGame, 1, 4);
        root.add(Music, 2, 4);
        root.add(Singing, 3, 4);
        root.add(semStr, 0,5);
        root.add(sem, 1, 5);     


        // style ----
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setStyle("-fx-background-color:linear-gradient(to right ,red , blue)");



        Scene scene =new Scene(root,1000,780);
        arg0.setScene(scene);
       arg0.setTitle("Register");
        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
