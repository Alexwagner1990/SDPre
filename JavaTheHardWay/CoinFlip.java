import java.util.Scanner;

public class CoinFlip{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String coin, again, ready;
    int streak = 0;
    boolean gotHeads;
    double flip;

/* In this comment block is my code to convert the "do while" loop into a "while" loop. I also added an
"Are you ready?" while loop before the actual coin game starts for extra practice. 

again = "y";
    System.out.println("Are you ready to play the flip game? (y/n)");
    ready = keyboard.next();
    while (!ready.equals("y")){
      System.out.println("Well then get ready, scrub! Are you ready now?");
      ready = keyboard.next();
    }
    while (again.equals("y")){
    flip = Math.random();

      if (flip < 0.5){
      System.out.println("You flip a coin and it is...Heads");
      streak++;
      System.out.println("\tThat's " + streak + " in a row. . . .");
      System.out.println("\tWould you like to flip again? (y/n)? ");
      again = keyboard.next();
      }
      else{
        System.out.println("\tYou flip a coin and it is...Tails");
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD. . . .");
        streak = 0;
        again = "n";
      }
    }
    System.out.println("Final Score: "+streak);
  }
}
*/



    do {
      gotHeads = Math.random() < 0.5;

      if ( gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println( "You flip a coin and it is... " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " in a row. . . .");
        System.out.print("\tWould you like to flip again (y/n)? ");
        again = keyboard.next();
      }
      else{
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD. . . .");
        streak = 0;
        again = "n";
      }
    } while (again.equals("y"));

    System.out.println( "Final score: " + streak);
  }
}
