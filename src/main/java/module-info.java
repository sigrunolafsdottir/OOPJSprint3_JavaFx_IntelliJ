module sample {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires kotlin.stdlib;

    opens sample.Demos;
    opens sample.Ovn9_BMICalculator;
    opens sample.Ovn11_Formular;
    opens sample.Ovn12_BMISceneBuilder;
    opens sample.JavaFxListDemo;
    opens sample.JavaFxBMICalculatorMVC;
    opens sample.BMI_MVC_LiveKodning;
}
