import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
// import javafx.scene.media.VideoTrack;
import javafx.stage.Stage;

public class Vdo extends Application{
    @Override
    public void start(Stage arg0) throws Exception {

        // 1. Video file ka path set
        String path= new String("src/Mda/video.mp4");
        File file =new File(path);
         
        // 2. Media obj
        Media media =new Media(file.toURI().toString());

        //3 media player engine 
        MediaPlayer mediaPlayer =new MediaPlayer(media);
        mediaPlayer.play();

        //4 vdo view

        MediaView mediaView =new MediaView(mediaPlayer);

        //style
        mediaView.setFitHeight(200);
        mediaView.setFitWidth(300);

        GridPane root =new GridPane();
        root.add(mediaView, 0, 0);

        Scene scene=new Scene(root,500,500);

        arg0.setScene(scene);
        arg0.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
    
}
