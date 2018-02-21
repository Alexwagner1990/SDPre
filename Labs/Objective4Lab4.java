import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int num;

    System.out.println("Please enter a number:");
    num = input.nextInt();
    if( num % 2 == 0){
      System.out.println(num + " is an even number.");
    }
    else{
      System.out.println(num + " is an odd number.");
    }
  }
}
