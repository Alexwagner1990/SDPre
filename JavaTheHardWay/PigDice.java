import java.util.Scanner;

public class PigDice{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, turnTotal, ctotPot = 0;
    String choice = "";

    ptot = 0;
    ctot = 0;

    do{
      turnTotal = 0;
      System.out.println( "You have " + ptot + " points.");

      do{
        roll = 1 + (int)(Math.random()*6);
        System.out.println( "\tYou rolled a " + roll + ".");
        if (roll == 1) {
          System.out.println("\tThat ends your turn.");
          turnTotal = 0;
        }
        else{
          turnTotal += roll;
          System.out.print( "\tYou have " + turnTotal + " points");
          System.out.print(" so far this round. \n");
          System.out.print("\tWould you like to \"roll\" again");
          System.out.print(" or \"hold\"?");
          choice = keyboard.next();
        }
      }while ( roll !=1 && choice.equals("roll"));

      ptot += turnTotal;
      System.out.println("\tYou end the round with " + ptot + " points.");

      if (ptot < 100) {
        turnTotal = 0;
        System.out.println("Computer has " + ctot + " points.");

        do {
          roll = 1 + (int)(Math.random()*6);
          System.out.println( "\tComputer rolled a " + roll + ".");
          if (roll == 1){
            System.out.println("\tThat ends its turn.");
            turnTotal = 0;
          }

          else {
            turnTotal += roll;
            ctotPot = ctot + turnTotal; //New variable to stop computer from rolling after 100
            System.out.print(" \tComputer has " + turnTotal );
            System.out.print(" points so far this round.\n");
            if ((100 > (ctotPot)) && (turnTotal < 20)){ //Computer won't print this if it's not rolling again
              System.out.println("\t Computer will roll again.");
            }
          }
      }while ( roll != 1 && turnTotal < 20 && 100>ctotPot);

        ctot += turnTotal;
        System.out.print("\tComputer ends the round with ");
        System.out.print(ctot + " points.\n");
      }

    }while (ptot < 100 && ctot < 100);

    if (ptot > ctot){
      System.out.println( "Humanity wins!");
    }
    else{
      System.out.println("The computer wins.");
    }
  }
}
