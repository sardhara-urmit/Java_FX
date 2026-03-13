import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color; 
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Txt  extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
    
        Text text =new Text();
        text.setText("hello");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font(60));
        text.setFill(Color.BLUE);

        Group root=new Group();
        root.getChildren().add(text);
        Scene scene =new Scene(root,500,500);
        arg0.setTitle("all time win");
        arg0.setScene(scene);
    
        arg0.show();
        
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
