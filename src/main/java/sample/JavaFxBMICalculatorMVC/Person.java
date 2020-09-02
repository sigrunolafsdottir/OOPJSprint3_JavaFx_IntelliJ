package sample.JavaFxBMICalculatorMVC;

//Modellen
public class Person {
    
    private double weight;
    private double length;
    private String name;
    
    public Person(String name, double length, double weight){
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
