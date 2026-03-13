import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vbox extends Application{
     @Override
     public void start(Stage arg0) throws Exception {
          
        Button b1= new Button("click me");
        Button exit =new Button("exit");

        b1.setOnAction(e->{
            System.out.println("the king never died");
        });

        exit.setOnAction(e->{
            System.exit(0);
        });
        VBox root = new VBox();

        root.getChildren().addAll(b1,exit);
        Scene scene =new Scene(root,400,500);
        arg0.setTitle("im winer");
        arg0.setScene(scene);

        arg0.show();
     }

    public static void main(String[] args) {
        launch(args);

    }
}
