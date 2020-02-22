package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your weight in kg");
        float weight = input.nextFloat();
        System.out.println("What is your height in m");
        float height = input.nextFloat();
        float bmi = bmi(weight, height);
        System.out.println("Your BMI is: " + bmi);

    }

    private static float bmi(float weight, float height) {
        return weight/(height * height);
    }
}
