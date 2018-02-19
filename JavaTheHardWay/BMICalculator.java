import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, feet, inches, pounds;

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches only): ");
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    m = ((feet*12) + inches) / 39.3701;
    kg = (pounds)/2.2046;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
