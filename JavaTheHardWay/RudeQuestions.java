import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args){
    String name, live;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? ");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + " eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print(" Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println ( name + ".");

    System.out.print( "Oh, I almost forgot! " + name + ", where do you live? ");
    live = keyboard.next();
    System.out.println( live + "! That's pretty close to me! I'll come by and visit some time!");
  }
}
/*The program continues to function if the user enters an int value where a double value is expected. This is
likely because every int can be stored or converted to a double, but not every double can be stored as an int.
The program converts a double value entered as an int value (e.g. entering "9" when the program expects a double
outputs a "9.0" when the program encounters a System.out.print(double) string.*/
/*The program functions as expected when entering numeric numbers when the program is expecting a String. This is
because a String can store any character, including numbers, and stores the characters literally as entered.*/
/*On the first question, entering "Alex Wagner" terminates the program. The program outputs, "Hi, Alex! How old are
you?" before it reaches the error. This likely happens because the program doesn't account for spaces unless told to -
typing in a space for any answer and hitting Enter does not advance the program. I think the program first reads a valid
String value ("Alex") and then doesn't know how to handle the space between "Alex" and "Wagner".

On the second question, entering "20.5" terminates the program. This is because the age variable is designated as an
integer and "20.5" cannot be stored as an integer.

On the third question, entering "200 pounds" terminates the program. This is because the "pounds" string cannot be stored
as a double, even though the "200" value can be. The program actually outputs "200.0! Better keep that quiet!! Finally, what's
your income, [name]?" before terminating. Entering "200pounds" with no space terminates the program immediately, contributing to
my theory for why question 1 cannot handle a space input.*/
