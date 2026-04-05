import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prec_From extends Application{
  @Override
  public void start(Stage arg0) throws Exception {
     TextField user =new TextField();
      user.setPromptText("enter user ");

      TextField Pass =new TextField();
      Pass.setPromptText("enter pass ");

      Button submit =new Button("submit");


      GridPane root =new GridPane();
      root.add(user, 0, 0);
      root.add(Pass, 0, 1);
      root.add(submit, 0, 2);

      Scene scene =new Scene(root,500,500);
      arg0.setScene(scene);
 
    // show 
    



    arg0.show();
  }   
  
  public static void main(String[] args) {
    launch(args);
  }
}
