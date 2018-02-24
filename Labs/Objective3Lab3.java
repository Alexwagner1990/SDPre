import java.util.Scanner;

public class Objective3Lab3{
  public static void main(String[] args){
    int birthYear, age, currentYear;
    String bd;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    currentYear = 2017; //without knowing whether or not the user has had a birthday, setting currentYear to 2017 instead of 2018 is more likely to give an accurate result.


    /*The code in the comments accounts for whether or not the user has had a birthday
    this year - it doesn't match the expected input, but there's no way to know this
    information without asking for it or fetching it from somewhere.
    System.out.println("Have you had a birthday this year (y/n)?");
    bd = input.next();
    if (bd.equals("y")){
      age--;
    } */
    birthYear = currentYear - age;
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
