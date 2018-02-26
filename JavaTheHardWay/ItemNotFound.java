import java.util.Scanner;

public class ItemNotFound {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
      "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon",
      "Castor", "Chrysippus", "Daedalus", "Diomedes",
      "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
      "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
    };
    int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int guessnumber;
    String guess;
    boolean found;

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();

    found = false;
    for (String hero : heroes) {
      if (guess.equals(hero)){
        System.out.println( "That's one of them!");
        found = true;
      }
    }

    if (found == false){
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }
    System.out.println("Name a number between one and ten: ");
    guessnumber = keyboard.nextInt();

    int count = 0;
    for (int n : number){
      if (guessnumber == n){
      System.out.println( "That is a number between one and ten");
      count++;
      }
    }
    if (count == 0){
      System.out.println( "That is not a number between one and ten");
    }
 }
}
