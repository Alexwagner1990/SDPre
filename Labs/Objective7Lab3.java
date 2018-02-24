import java.util.Scanner;

public class Objective7Lab3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;

    printMenu();
    selection = scanner.nextInt();

    while(!(selection == 3)){
      if (selection == 1){
        System.out.println("Hello Human");
        printMenu();
        selection = scanner.nextInt();
      }
      if (selection == 2){
        System.out.println("Apples, Bananas, Coconuts");
        printMenu();
        selection = scanner.nextInt();
      }
      if (selection == 3){
        System.out.println("Goodbye");
      }

    }
    scanner.close();
  }

    public static void printMenu(){
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();
    }
}
