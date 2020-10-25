package sample.Demos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        btn.setText("say Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World!)");
            }
        });

        Button btn2 = new Button();
        btn2.setText("another button");

        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(8);

        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
