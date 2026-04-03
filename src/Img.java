import java.io.FileInputStream;

import javax.imageio.stream.ImageInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Img extends Application{
    @Override
    public void start(Stage arg0) throws Exception {


        Image img =new Image(new FileInputStream("src\\imgs/img.jpg"));
        ImageView imageView =new ImageView(img);


        
        GridPane root =new GridPane();
        root.add(imageView, 0, 0);

        //styele
        imageView.setFitWidth(200);
        imageView.setFitHeight(250);
        root.setAlignment(Pos.CENTER);


        Scene scene=new Scene(root,500,500);

        arg0.setScene(scene);

        arg0.show();

    }

    

    public static void main(String[] args) {
        launch(args);
    }
}