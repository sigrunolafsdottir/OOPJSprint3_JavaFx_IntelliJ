package sample.Övn12_BMISceneBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    public TextField name;
    public TextField length;
    public TextField weight;
    public TextField bmi;




    public static double getBMI(double weight, double length){
        double lengthInMeter = length/100;
        return weight/(lengthInMeter*lengthInMeter);
    }

    public void click(ActionEvent actionEvent) {
        System.out.println("in actionevent");
        Scanner scLength = new Scanner(length
                .getText().trim());
        Scanner scWeight = new Scanner(weight
                .getText().trim());
        if (scLength.hasNextDouble()
                && scWeight.hasNextDouble()) {
            String res = String.format("Hej %s. "
                            + "Ditt BMI är %.2f.", name.getText(),
                    getBMI(scWeight.nextDouble(),
                            scLength.nextDouble()));
            System.out.println(res);
            bmi.setText(res);
        }
    }


}
