import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Form extends Application {
    @Override
    public void start(Stage stage) {
        // 1. Controls (Form ke items) banana
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();

        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();

        Button loginBtn = new Button("Login");
        Label messageLbl = new Label();

        // 2. Layout (GridPane) setup karna
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // Beech mein laane ke liye
        grid.setHgap(10); // Horizontal gap
        grid.setVgap(10); // Vertical gap
        grid.setPadding(new Insets(25)); // Charon taraf se jagah

        // Items ko Grid mein add karna (Column, Row)
        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);
        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);
        grid.add(loginBtn, 1, 2);
        grid.add(messageLbl, 1, 3);

        // 3. Button Click Event
        loginBtn.setOnAction(e -> {
            if(userField.getText().equals("admin") && passField.getText().equals("123")) {
                messageLbl.setText("Login Successful!");
                messageLbl.setStyle("-fx-text-fill: green;");
            } else {
                messageLbl.setText("Invalid User!");
                messageLbl.setStyle("-fx-text-fill: red;");
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Practical Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}