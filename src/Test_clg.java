import javafx.application.Application;
import javafx.geometry.Pos;
// import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test_clg extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Label lbName= new Label("enter name ");
        TextField  name =new TextField();
        name.setPromptText("enter the name ");
        RadioButton rd1 =new RadioButton("Male");
        RadioButton rd2 =new RadioButton("Female");
        ToggleGroup group =new ToggleGroup();
        rd1.setToggleGroup(group);
        rd2.setToggleGroup(group);
  

        // hobby

        CheckBox music =new CheckBox("music");
        CheckBox dance =new CheckBox("dance");
        

        //sem combo box 

        ComboBox<String> sem =new ComboBox<>();
        
        sem.getItems().addAll("sem-1","sem-2","sem-3");

        // list view

        ListView<String> lsw =new ListView<>();
 

        sem.setOnAction(e->{
            lsw.getItems().clear();

            if (sem.getValue().equals("sem-1")) {
                lsw.getItems().addAll("this is ","jasjflkaj");
                
            }
            else if (sem.getValue().equals("sem-2")) {
                lsw.getItems().addAll("sem 2 ","syb","exy z ");
                
            }
            else if (sem.getValue().equals("sem-3")) {
                lsw.getItems().addAll("sem-3","this is ","king");
                
            }
            
        });

    
    // slider for age  
    Label sld= new Label();
    Slider age =new Slider(0,50,18);
  
    sld.textProperty().bind(age.valueProperty().asString("%.0f"));


 // text area 
   TextArea info =new TextArea();
   info.setMaxHeight(80);
   info.setMaxWidth(300);



        Button submit =new Button("Submit");

        Label NOte =new Label();


       

        // if  
        submit.setOnAction(e->{
           NOte.setText("");

            if (name.getText().equals("")) {
                
                NOte.setText("envilad");
           
            }
             else if (group.getSelectedToggle()==null) {
                 NOte.setText("envilad");
                
            }
            else if (!music.isSelected() && !dance.isSelected()) {
                
                 NOte.setText("envilad");
            }
        });

        GridPane root =new GridPane();
        root.add(lbName, 0, 0);
        root.add(name, 1, 0);
        root.add(rd1, 0, 1);
        root.add(rd2, 1, 1);
        root.add(music, 0, 2);
        root.add(dance, 1, 2);
        root.add(sem, 0, 3);
        root.add(lsw, 0, 4);
        root.add(sld, 0, 5);
        root.add(age, 0, 6);
        root.add(info, 0, 7);
        root.add(submit, 0, 10);
        root.add(NOte, 1, 11);



        // style 
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);


        
        lsw.setMaxHeight(80);
        root.setStyle("-fx-background-color:linear-gradient(to right ,red,blue);-fx-font-size:20px;");
        sld.setStyle("-fx-text-fill:white");




        Scene scene =new Scene(root,700,700);
        arg0.setScene(scene);
        arg0.setTitle("login ");

        arg0.show();
    } 
    

    public static void main(String[] args) {
        launch(args);
    }
}