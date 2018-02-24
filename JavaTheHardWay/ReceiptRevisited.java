import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited{
  public static void main(String[] args) throws Exception{
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner gal = new Scanner(System.in);
    double gallons, total;

    System.out.println("How much gas ya want, bub? :");
    gallons = gal.nextDouble();
    total = gallons*2.436;

    System.out.println("That'll be $" + total + ". Here's your receipt.");
    fileout.println( "+------------------------+" );
    fileout.println( "|                        |" );
    fileout.println( "|      CORNER STORE      |" );
    fileout.println( "|                        |" );
    fileout.println( "| 2018-02-18  04:38PM    |" );
    fileout.println( "| Price/gallon: $ 2.436  |" );
    fileout.println( "+------------------------+")
    fileout.println( "Gasonline gallons ordered: " + gallons)
    fileout.println( "Fuel total: $ " + total );
    fileout.println( "+------------------------+" );
    fileout.close();
  }
}
