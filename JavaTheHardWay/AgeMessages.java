import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? ");
    age = keyboard.nextInt();
    if (age < 13 ){
      System.out.println( "\ttoo young to create a Facebook account");
    }
    if (age >= 13) {
      System.out.println( "\told enough to create a Facebook account");
    }
    if (age < 16) {
      System.out.println( "\ttoo young to get a driver's license.");
    }
    if (age >=16) {
      System.out.println( "\told enough to get a drier's license.");
    }
    if (age < 18) {
      System.out.println( "\ttoo young to get a tattoo");
    }
    if (age >=18) {
      System.out.println( "\told enough to get a tatto");
    }
    if (age < 21 ){
      System.out.println( "\ttoo young to drink alcohol");
    }
    if (age >=21) {
      System.out.println ("\told enough to drink alcohol");
    }
    if (age < 35) {
      System.out.println( "\ttoo young to run for President of the U.S.");
      System.out.println( "\t\t(How sad!)");
    }
    if (age >= 35) {
      System.out.println( "\told enough to run for President of the U.S.");
    }
    if (age > 65) {
      System.out.println( "\tyou are old enough to retire!");
    }
    if (age <= 65) {
      System.out.println( "\ttoo young to retire!");
    }
  }
}
//Typing in an age greater than 55 (before code changes) will end the program with no output, because all the output code is false and therefore skipped.
