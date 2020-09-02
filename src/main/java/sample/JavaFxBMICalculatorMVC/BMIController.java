package sample.JavaFxBMICalculatorMVC;

//Controllern
public class BMIController {
    
    //räknar ut BMI för en Person
    public double getBMI(Person p){
        double length = p.getLength();
        double weight = p.getWeight();
        double lengthInMeter = length/100;
        return weight/(lengthInMeter*lengthInMeter);
    }
    
    //skriver ut BMI-info för en Person
    public String getBMIInfo(Person p){
        return String.format("Hej %s. "+ "Ditt BMI är %.2f.", 
                p.getName(),getBMI(p));
    }

}
