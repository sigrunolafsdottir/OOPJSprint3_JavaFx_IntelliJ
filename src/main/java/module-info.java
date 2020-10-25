module sample {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires kotlin.stdlib;

    opens sample.Demos;
    opens sample.Övn9_BMICalculator;
    opens sample.Övn11_Formulär;
    opens sample.Övn12_BMISceneBuilder;
    opens sample.JavaFxListDemo;
    opens sample.JavaFxBMICalculatorMVC;
}
