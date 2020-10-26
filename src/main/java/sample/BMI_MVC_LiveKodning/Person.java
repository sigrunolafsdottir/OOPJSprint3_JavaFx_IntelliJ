package sample.BMI_MVC_LiveKodning;

public class Person {

    protected String name;
    protected int weight;
    protected double length;

    public Person(String name, int weight, double length){
        this.name = name;
        this.weight = weight;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public double getLength(){
        return length;
    }
}
