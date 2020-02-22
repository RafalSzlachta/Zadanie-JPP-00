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
        System.out.println("Your BMI is: " + bmi + " that quallifies as: " + bmiDescriptive(bmi));

    }

    private static String bmiDescriptive(float bmi) {
        if (bmi<18.5) return "Niedowaga";
        else if (bmi<25) return "Normalna (zdrowa) waga";
        else return "Nadwaga";

    }

    private static float bmi(float weight, float height) {
        return weight/(height * height);
    }
}
