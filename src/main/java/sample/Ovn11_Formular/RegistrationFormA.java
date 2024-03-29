package sample.Ovn11_Formular;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  

public class RegistrationFormA extends Application { 
   @Override 
   public void start(Stage stage) {      

      Text text1 = new Text("First name");       
      Text text2 = new Text("Last name"); 
      Text text3 = new Text("Email"); 
       
      TextField textField1 = new TextField();   
      TextField textField2 = new TextField();
      TextField textField3 = new TextField();
      
      Button button1 = new Button("Submit"); 
      Button button2 = new Button("Clear");  
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      gridPane.setMinSize(400, 200);
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(text3, 0, 2);       
      gridPane.add(textField3, 1, 2); 
      gridPane.add(button1, 0, 3); 
      gridPane.add(button2, 1, 3); 
       
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; "
              + "-fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; "
              + "-fx-text-fill: white;"); 
      
      Path outFilePath = Paths.get("src\\main\\java\\sample\\sample.Övn11_Formulär\\RegisteredUsers.txt");
      
      button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String firstName = textField1.getText();
                String lastName = textField2.getText();
                String email = textField3.getText();
                
                try(PrintWriter w = new PrintWriter(Files
                        .newBufferedWriter(outFilePath, 
                        StandardOpenOption.APPEND), true)){
                    w.print(firstName + "," + lastName+ "," 
                            + email+ "\n");
                        
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
      
      button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
       
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
      text3.setStyle("-fx-font: normal bold 20px 'serif' ");  
      gridPane.setStyle("-fx-background-color: PURPLE;"); 
       
      // Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      // Setting title to the Stage   
      stage.setTitle("Registrer now!"); 
         
      // Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}