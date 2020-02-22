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
        System.out.println("Your BMI is: " + bmi);

    }

    private static double bmi(double weight, double height) {
        return weight/(height * height);
    }
}
