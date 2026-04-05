

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prec_From extends Application{
  @Override
  public void start(Stage arg0) throws Exception {
     TextField user =new TextField();
      user.setPromptText("enter user ");

      TextField Pass =new TextField();
      Pass.setPromptText("enter pass ");




      /// gender 
      RadioButton Male=new RadioButton("Male");
      RadioButton Female =new RadioButton("Female");
      ToggleGroup group =new ToggleGroup();
      Male.setToggleGroup(group);
      Female.setToggleGroup(group);

    // combo box
    ComboBox<String> comboBox =new ComboBox<>();
    comboBox.getItems().addAll("sem-1","sem-2","sem-3");

    // list view
    ListView<String> listView =new ListView<>();
    listView.setMaxHeight(80);
    
    //sub vali
   comboBox.setOnAction(e->{
    listView.getItems().clear();
    if (comboBox.getValue().equals("sem-1")) {

        listView.getItems().addAll("hrmlt","css","js");
    }
    
    else if (comboBox.getValue().equals("sem-2")) {
        listView.getItems().addAll("sem2 ","sem2 ","sem2");

        
    }
    else if (comboBox.getValue().equals("sem-3")) {
        listView.getItems().addAll("sme 3 ","sem3","sem 3");
        
    }

   });

    Button submit =new Button("submit");
      Label note =new Label();


      GridPane root =new GridPane();
      root.add(user, 0, 0);
      root.add(Pass, 0, 1);
      root.add(note, 0, 10);
      root.add(Male, 0, 4);
      root.add(Female, 1, 4);
      root.add(comboBox, 0, 5);
      root.add(listView, 0, 6);
      root.add(submit, 0, 9);


      //add style
      root.setAlignment(Pos.CENTER);
      root.setStyle("-fx-background-color:powderblue");

      Scene scene =new Scene(root,500,500);
      arg0.setScene(scene);
 
    // show 
    submit.setOnAction(e->{
        note.setText(user.getText()+"\n"+Pass.getText()+"\n"+(Male.isSelected()?"Male":"Female"));


    });


    arg0.show();
  }   
  
  public static void main(String[] args) {
    launch(args);
  }
}
