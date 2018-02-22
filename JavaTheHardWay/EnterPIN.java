import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA");

    System.out.println("PLEASE ENTER YOUR PASSWORD: ");
    pass = keyboard.nextLine();

    while (! pass.equals("password")){
      System.out.println("INCORRECT PASSWORD");
      System.out.println("ENTER YOUR PASSWORD: ");
      pass = keyboard.nextLine();
    }
    System.out.println("PASSWORD ACCEPTED.\nENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.println("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
