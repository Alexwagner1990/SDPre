public class ArrayIntro{
  public static void main(String[] args){
    String[] planets = {"Mercury", "Venus", "Earth", "Mars",
                        "Jupiter", "Saturn", "Uranus", "Neptune"};
    String[] icecream = {"CHOCOLATE", "VANILLA", "STRAWBERRY"};

    for (String p : planets){
      System.out.println( p + "\t" + p.toUpperCase());
    }
    for (String i : icecream){
      System.out.println( i + "\t" + i.toLowerCase());
    }
  }
}
