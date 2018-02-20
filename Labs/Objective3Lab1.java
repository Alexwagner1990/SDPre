import java.util.Scanner; /*Not sure if this line was intended to be added, as
it's not contained in the designated area to add code, but the code fails on
line 4 without it, which from what I understand indicates that the Scanner class
needs to be imported.*/

public class Objective3Lab1 {
  public static void main(String[] args) {
    String userInput = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Please Type a word: ");
    userInput = input.next();
    System.out.println(userInput);
    input.close();

  }
}
