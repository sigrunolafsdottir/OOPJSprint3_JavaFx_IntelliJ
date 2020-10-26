package sample.Demos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        btn.setText("say Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World!");
            }
        });

        Button btn2 = new Button();
        btn2.setText("another button");
        Button btn3 = new Button();
        btn3.setText("button 3");
        Button btn4 = new Button();
        btn4.setText("button 4");

        GridPane root = new GridPane();

        root.add(btn, 0, 0);
        root.add(btn2, 0,1);
        root.add(btn3, 1, 0);
        root.add(btn4, 3, 3);
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
