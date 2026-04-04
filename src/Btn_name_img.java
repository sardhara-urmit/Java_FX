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
        Button btn =new Button("me with tommy");


        // secong img 
        Image img2 =new Image("file:src/Mda/black.jpg");
         Button btn2 =new Button("balck");

        // img frame
           ImageView imageView =new ImageView();
             imageView.setFitHeight(300);
             imageView.setFitWidth(250);


        // layout
        GridPane root =new GridPane();
       root.add(btn, 0, 0);
    root.add(btn2, 0, 1);
    root.add(imageView, 1, 1);

        // action 

        btn.setOnAction(e->{
          imageView.setImage(img);

        });


        btn2.setOnAction(e->{
            
            imageView.setImage(img2);
        });



        Scene scene =new Scene(root,500,500);

        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
