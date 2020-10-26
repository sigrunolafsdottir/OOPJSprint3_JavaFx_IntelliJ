package sample.BMI_MVC_LiveKodning;

import javafx.event.ActionEvent;

import java.util.Scanner;

public class Controller {

    public double calculateBMI(Person p){
        return p.weight / (p.getLength() * p.getLength());

    }

    public String printOut(Person p){
        double bmi = calculateBMI(p);
        return "Hej "+p.getName()+" , ditt BMI är " + bmi;

    }

    public String handleUserInput(String name, String weight, String length) {
        int weightInt = Integer.parseInt(weight);
        Scanner lengthScanner = new Scanner(length);
        double lengthdouble = lengthScanner.nextDouble();
        Person p = new Person(name, weightInt, lengthdouble);
        return printOut(p);
    }




}
