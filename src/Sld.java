import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sld extends Application{
 
    @Override
    public void start(Stage arg0) throws Exception {
        Label lb1 =new Label();
        Slider sld=new Slider(0,50,18);
        lb1.textProperty().bind(sld.valueProperty().asString("%.0f"));
         
        GridPane root =new GridPane();
        root.add(sld, 0, 1);
        root.add(lb1, 0, 0);
        root.setAlignment(Pos.CENTER);
        
        Scene scene  =new Scene(root,1000,800);
        arg0.setScene(scene);
        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}