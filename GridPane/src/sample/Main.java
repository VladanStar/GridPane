package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javax.xml.soap.Text;

public class Main extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFX Vladan Cupric");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        // Name label
        Label nameLabel = new Label("UserName: ");
       GridPane.setConstraints(nameLabel,0,0);
       // Text field
        TextField nameInput = new TextField("JavaFX");
        GridPane.setConstraints(nameInput,1,0);
        // pasword label
        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel,0,1);

        // pasword input
        TextField passwordInput = new TextField();
        passwordInput.setPromptText("password");
        GridPane.setConstraints(passwordInput,1,1);

        Button loginButton = new Button("LogIn");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameInput,nameInput,passwordInput,passwordLabel, loginButton);

        Scene scene = new Scene(grid, 300, 300);
        window.setScene(scene);


        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
