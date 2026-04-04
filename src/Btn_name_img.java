import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Btn_name_img extends Application{
    @Override
     public void start(Stage arg0) throws Exception {
        
        Image img =new Image("file:src/Mda/img.jpg");
        ImageView imageView =new ImageView(img);
        Button btn =new Button("me with tommy");

        // secong img 
        Image img2 =new Image("file:src/Mda/black.jpg");
        ImageView imageView2 =new ImageView(img2);
         Button btn2 =new Button("balck");




        // layout
        GridPane root =new GridPane();
        root.add(btn, 0, 0);
        root.add(btn2, 0, 1);



        // style 
        imageView.setFitHeight(300);
        imageView.setFitWidth(250);
        imageView2.setFitHeight(300);
        imageView2.setFitWidth(250);


        // action 

        btn.setOnAction(e->{
            root.add(imageView, 1, 1);

        });


        btn2.setOnAction(e->{
            root.add(imageView2, 2, 1);
        });



        Scene scene =new Scene(root,500,500);

        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
