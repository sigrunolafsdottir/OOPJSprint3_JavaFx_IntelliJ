package sample.JavaFxListDemo;

import java.util.ArrayList;
import java.util.List;
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.geometry.*; 
import javafx.beans.value.*; 
import javafx.collections.*; 
 
public class ListViewDemo extends Application { 
 
  Label response; 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("ListView Demo"); 
 
    // Use a FlowPane for the root node. In this case, 
    // vertical and horizontal gaps of 10. 
    FlowPane rootNode = new FlowPane(10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 200, 120); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Create a label. 
    response = new Label("Select Computer Type"); 
 
    // Create an ObservableList of entries for the list view. 
    //Detta är namnen som står i listan
   ObservableList<String> computerTypes = 
      FXCollections.observableArrayList("Smartphone", "Tablet", 
              "Notebook", "Desktop" );  
 
// Create the list view. 
//Detta är den grafiska komponenten som visar upp listan
    ListView<String> lvComputers = new ListView<String>(computerTypes); 
      
 
    //Alternativ om man vill slippa ObservableList:an:
 //   ListView<String> lvComputers = new ListView<String>(); 
 //   lvComputers.getItems().addAll("Smartphone", "Tablet", "Notebook", "Desktop");
 
    // Set the preferred height and width. 
    lvComputers.setPrefSize(100, 70); 
 
    // Get the list view selection model. 
    //Vi får information om vilka rader som valts via listViewns selectionModel
    MultipleSelectionModel<String> lvSelModel = 
                      lvComputers.getSelectionModel(); 
    
 
    // Use a change listener to respond to a change of selection within 
    // a list view. 
    //Vi måste gå genom selektions-modellen när vi lägger till lyssnare
    lvSelModel.selectedItemProperty().addListener( 
                                      new ChangeListener<String>() { 
      public void changed(ObservableValue<? extends String> changed, 
                          String oldVal, String newVal) { 
 
        // Display the selection. 
        response.setText("Computer selected is " + newVal); 
      } 
    }); 
 
    // Add the label and list view to the scene graph. 
    rootNode.getChildren().addAll(lvComputers, response); 
 
    // Show the stage and its scene. 
    myStage.show(); 

  } 
}