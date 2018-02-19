public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;
    int z;
    double months;
    String born, raised;

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    z = 645;
    months = 3.5;
    born = "Tallahassee";
    raised = "Tampa";
    //Seeing for myself if types of variables need to all be grouped together in order to compile

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y.");
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A favorite irrational # is Euler's number: " + e);
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName + lastName);
    System.out.println( "An x variable and a y variable need a z variable too. The z variable is " + z );
    System.out.println( "My apartment lease is up in " + months + " months.");
    System.out.println( "I was born in " + born + " and raised in " + raised + ".");
  }
}
