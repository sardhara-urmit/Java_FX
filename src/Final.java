import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Final extends Application{
    @Override
    public void start(Stage arg0) throws Exception {

        Button btn1= new Button("click");
        Button btn2 =new Button("exit");
        Label lb1= new Label();
        
        btn1.setOnAction(e->{
            lb1.setText("hello king ");
        });
        btn2.setOnAction(e->{
            System.exit(0);
        });

        VBox root =new VBox(20);
        root.getChildren().addAll(btn1,lb1,btn2);
        Scene scene =new Scene(root,500,500);

        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color:red");
        btn1.setStyle("-fx-background-color:yellow; -fx-tex-fill:red;-fx-font-size:20px");
        lb1.setStyle("-fx-text-fill:white; -fx-font-size:20px");
        btn2.setStyle("-fx-background-color:powderblue;-fx-font-size:20px;-fx-text-fill:green");

        arg0.setTitle("final short");
        arg0.setScene(scene);
        arg0.show();

        
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
