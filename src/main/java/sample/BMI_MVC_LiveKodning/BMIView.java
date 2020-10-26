package sample.BMI_MVC_LiveKodning;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class BMIView extends Application {

    Controller c = new Controller();


    @Override
    public void start(Stage stage) throws Exception {

        Label name = new Label("Namn:");
        Label weight = new Label("Vikt:");
        Label length = new Label("Längd:");

        TextField nameText = new TextField();
        TextField weightText = new TextField();
        TextField lengthText = new TextField();
        TextField bmiText = new TextField();

        Button b = new Button("Calculate");

        b.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent actionEvent) {
                bmiText.setText(c.handleUserInput(nameText.getText().trim(),
                       weightText.getText().trim(), lengthText.getText().trim()));
            }
        });

        GridPane gp = new GridPane();
        gp.add(name, 0,0);
        gp.add(weight, 0,1);
        gp.add(length, 0,2);
        gp.add(b, 0,3);
        gp.add(nameText, 1,0);
        gp.add(weightText, 1,1);
        gp.add(lengthText, 1,2);
        gp.add(bmiText, 1,3);

        Scene scene = new Scene(gp);
        stage.setTitle("BMI räknare");
        stage.setScene(scene);
        stage.show();
    }
}
