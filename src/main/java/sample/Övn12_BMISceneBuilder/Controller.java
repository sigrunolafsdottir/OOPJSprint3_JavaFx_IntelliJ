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

    @FXML
    private ImageView myImage;
    private static int counter = 0;

    @FXML
    public void mc(MouseEvent event){
        System.out.println("in mouseclicked");
        if (counter %2 == 0){
                myImage.setImage(new Image("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/kitten-playing-with-toy-mouse-royalty-free-image-590055188-1542816918.jpg?crop=1.00xw:0.758xh;0,0.132xh&resize=980:*"));
          }else{
            myImage.setImage(new Image("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/kitten-with-his-paw-up-royalty-free-image-149052633-1542816516.jpg?crop=1xw:1xh;center,top&resize=980:*"));
        }
        counter++;
    }





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
