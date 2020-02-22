package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your weight in kg");
        double weight = input.nextDouble();
        System.out.println("What is your height in m");
        double height = input.nextDouble();
        double bmi = bmi(weight, height);
        System.out.println("Your BMI is: " + bmi + " that quallifies as: " + bmiDescriptive(bmi));

    }

    private static String bmiDescriptive(double bmi) {
        if (bmi<18.5) return "Niedowaga";
        else if (bmi<25) return "Normalna (zdrowa) waga";
        else return "Nadwaga";

    }

    private static double bmi(double weight, double height) {
        return weight/(height * height);
    }
}
