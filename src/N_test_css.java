import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class N_test_css extends Application {
    @Override
    public void start(Stage arg0) throws Exception {
        Button btn1=new Button("click");
        Button exit =new Button("exit");
        Label lb1=new Label();
        btn1.setOnAction(e->{
            lb1.setText("king");
        });

        exit.setOnAction(e->{
            System.exit(0);
        });

        VBox root=new VBox(50);
        root.getChildren().addAll(btn1,exit,lb1);
        Scene scene =new Scene(root,500,500);
        root.setAlignment(Pos.CENTER);
        scene.getStylesheets().add(getClass().getResource("N_style.css").toExternalForm());

        arg0.setScene(scene);
        arg0.setTitle("all time win");
        arg0.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
