public class Objective6Lab3{
  public static void main(String[] args){
    int counter = 1, oe;

    while(counter < 21){
      oe = counter%2;
      if(oe == 0){
        System.out.println(counter + " is even");
      }
      else{
        System.out.println(counter + " is odd");
      }
      counter++;
    }
  }
}
