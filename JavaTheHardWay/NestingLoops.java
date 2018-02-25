public class NestingLoops {
  public static void main(String[] args){
    //this is #1 - I'll call it "CN"
    for (char c='A'; c <= 'E'; c++) {
      for (int n=1; n <=3; n++){ //This inner variable changes faster than the outter variable
        System.out.println(c + " " + n);
      }
    }

    System.out.println("\n");

    //this is #2 - I'll call it "AB"
    for (int a=1; a <=3; a++){
      for (int b=1; b<=3; b++){
        System.out.print( "(" + a + "," + b + ") ");
      }
      System.out.println(); //this prints a new line every time the "b" loop is escaped
    }

    System.out.println("\n");
  }
}
