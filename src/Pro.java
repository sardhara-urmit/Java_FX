import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pro extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Button btn1=new Button("click me ");
        Label lb1=new Label();
        Button btn2=new Button("click 2");
        TextArea txt=new TextArea("search");


        VBox root =new VBox(20);
        root.getChildren().addAll(btn1,lb1,btn2,txt);
        Scene scene =new Scene(root);
        arg0.setTitle("final test");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
