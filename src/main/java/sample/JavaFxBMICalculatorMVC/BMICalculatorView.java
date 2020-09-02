package sample.JavaFxBMICalculatorMVC;

//Vyn
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class BMICalculatorView extends Application {
    
    BMIController controller = new BMIController();
    
    @Override
    public void start(Stage primaryStage) {
        Label name = new Label("Namn");
        Label weight = new Label("Vikt i kg");
        Label length = new Label("Längd i cm");
        
        TextField nameTxt = new TextField();
        TextField lengthTxt = new TextField();
        TextField weightTxt = new TextField();
        TextField result = new TextField();
        
        Button btn = new Button();
        btn.setText("Calculate");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Scanner scLength = new Scanner(lengthTxt.getText().trim());
                Scanner scWeight = new Scanner(weightTxt.getText().trim());
                if (scLength.hasNextDouble() 
                        && scWeight.hasNextDouble()){
                    Person p = new Person(nameTxt.getText(), 
                            scLength.nextDouble(), 
                            scWeight.nextDouble());
                    String res = controller.getBMIInfo(p);
                    System.out.println(res);
                    result.setText(res);
                }
            }
        });
        
        GridPane grid = new GridPane();
        grid.add(name, 0, 0);
        grid.add(nameTxt, 1, 0);
        grid.add(length, 0, 1);
        grid.add(lengthTxt, 1, 1);
        grid.add(weight, 0, 2);
        grid.add(weightTxt, 1, 2);
        grid.add(btn, 0, 3);
        grid.add(result, 1, 3);
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
