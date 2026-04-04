import javafx.application.Application;
// import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class T_img extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        Image img =new Image("file:src\\Mda\\img.jpg");
        ImageView imageView =new ImageView(img);
        imageView.setFitHeight(250);
        imageView.setFitWidth(200);

        

       
        GridPane root =new GridPane();
      
         // add btn
        Button btn =new Button("click");
 root.add(btn, 1, 0);
        btn.setOnAction(e->{
              root.add(imageView, 1, 1);
        });
         
        //styele 
        // root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color:powderblue");
        
        Scene scene=new Scene(root,500,500);
        arg0.setScene(scene);

        arg0.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
