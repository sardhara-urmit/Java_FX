import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
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
        fname.setPromptText("Enter first name ");
        Label Mname =new Label("Enter middel name :");
        TextField mname =new TextField();
        mname.setPromptText("Enter mniddal name");
        Label Lname=new Label("Enter Last name :");
        TextField lname =new TextField();
        lname.setPromptText("Enter last name ");
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
        sem.getItems().addAll("sem-1","sem-2","sem-3","sem-4");

        // sub using live select sem 
        Label lbsub =new Label("select sub");
         ListView<String> sub =new ListView<>();
         // hight 
         sub.setMaxHeight(80);
         sub.setMaxWidth(200);


         // this is combobox obj sem 
        sem.setOnAction(e->{
            sub.getItems().clear();
            if (sem.getValue().equals("sem-1")) {
                sub.getItems().addAll("c","html","com");
                
            }
           else if (sem.getValue().equals("sem-2")) {
            sub.getItems().addAll("grupe-study","dsa in c","php");
            
           }
          else if (sem.getValue().equals("sem-3")) {
            sub.getItems().addAll("oracle ","c++ ","soft-skill");
            
           }
           else{
            sub.getItems().addAll("java","c#","seo");
           }
        });

       
        // ardes using text arriya 

        Label lbarr =new Label("add addres");
        TextArea addrs=new TextArea();
        addrs.setMaxHeight(80);
        addrs.setMaxWidth(200);



        //add slider 
        Label lbSld =new Label("set age ");
        Slider sdr = new Slider(0,50,18);
        
        // sdr.setShowTickMarks(true);
        // sdr.setShowTickLabels(true);
         Label sldVal =new Label();
         
sldVal.textProperty().bind(sdr.valueProperty().asString("%.0f"));
  
        Button submit =new Button("Submit");
           

        // condison for validason 
        Label note=new Label();
       submit.setOnAction(e->{

        if (fname.getText().equals("")|| mname.getText().equals("")|| 
         lname.getText().equals("")||
         group.getSelectedToggle()==null) {

            note.setText("note valid ");
            
        }
        else if (!Music.isSelected()&& !playGame.isSelected()&&!Singing.isSelected()) {
            
             note.setText("note valid ");
        }
        else if (sem.getValue()=="") {
            note.setText("note valid ");

            
        }
        else if (addrs.getText().equals("")) {
              note.setText("note valid ");


        }
        else{
            // print all dtl..
            note.setText(



                "First Name - "+fname.getText()+
                "\nMidal name - "+mname.getText()+
                "\nLast name - "+lname.getText()+
                "\nGender - " +(rd1.isSelected() ? "Male" : "Female")+
                "\nHobby - "+(playGame.isSelected() ? "playgame" : "")+(Music.isSelected() ? "Music" :"")+(Singing.isSelected() ? "Singing" : "")+
                "\nSem - "+sem.getValue()+
                "\nage - "+sdr.getValue()+
                "\nAdres - "+addrs.getText()

                


            );
        }
       });



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
        root.add(lbsub, 0, 6);
        root.add(sub, 1, 6);
        root.add(lbarr, 0, 7);
        root.add(addrs, 1, 7);
        root.add(lbSld, 0, 8);
        root.add(sdr, 1, 8);
        root.add(sldVal, 1, 9);
        root.add(submit, 1, 10);
        root.add(note, 1, 11);

 
        // style ----
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setStyle("-fx-background-color:linear-gradient(to right ,blue , white);-fx-font-size:15");
        

        // add scroll bar  
       ScrollPane scrollPane =new ScrollPane();
       scrollPane.setContent(root);
       scrollPane.setFitToWidth(true);
        Scene scene =new Scene(scrollPane,1000,780);


        arg0.setScene(scene);
       arg0.setTitle("Register");
        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}

// all done 