import java.util.Scanner;

public class BMICategories{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, weight, meters, kg;
    int feet, inches;

    System.out.print( "Enter your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.print( "Enter your height (inches only): ");
    inches = keyboard.nextInt();
    System.out.print("Enter your weight in pounds: ");
    weight = keyboard.nextDouble();

    meters = ((feet*12) + inches) / 39.3701;
    kg = (weight)/2.2046;
    bmi = kg / (meters*meters);

    System.out.println( "Your BMI is: " + bmi);

    System.out.print("BMI category: ");
    if (bmi <= 15.0) {
      System.out.println( "very severely underweight");
    }
    else if (bmi <=16.0) {
      System.out.println( "severely underweight");
    }
    else if (bmi <18.5) {
      System.out.println( "underweight");
    }
    else if (bmi < 25.0) { //if you remove an else statement here then "normal weight" will output in addition to other messages.
      System.out.println("normal weight");
    }
    else if (bmi <30.0) {
      System.out.println( "overweight");
    }
    else if (bmi < 35.0) {
      System.out.println( "moderately obese");
    }
    else if (bmi < 40.0) {
      System.out.println( "severely obese");
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese");
    }
  }
}
