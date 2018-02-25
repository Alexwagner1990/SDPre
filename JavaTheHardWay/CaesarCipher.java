import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class CaesarCipher {
  /**
   * Returns the character shifted by the given number of letters.
   */
   public static char shiftLetter( char c, int n){
     int u = c;

     if (!Character.isLetter(c))
      return c;

      u = u + n;
      if (Character.isUpperCase(c) && u > 'Z'
      || Character.isLowerCase(c) && u > 'z'){
        u -= 26;
      }
      if (Character.isUpperCase(c) && u < 'A'
      || Character.isLowerCase(c) && u < 'a' ){
        u +=26;
      }

      return (char)u;
   }

   public static void main( String[] args) throws Exception {
     Scanner keyboard = new Scanner(System.in);
     String plaintext, cipher = "", letter = "", cipherout;
     Scanner file = new Scanner(new File("CaesarLetter.txt"));
     int shift;
/* printout code
     System.out.print("Message: ");
     plaintext = keyboard.nextLine(); */
     while (file.hasNext()){
       letter += file.next();
     }

     System.out.print("Shift (0-26): ");
     shift = keyboard.nextInt();

     for (int i=0; i<letter.length(); i++){
       cipher += shiftLetter( letter.charAt(i), shift);
     }
    // System.out.println(cipher); //printout Cipher
    System.out.println("Choose a file to write the cipher to: ");
    cipherout = keyboard.next();

    PrintWriter out = new PrintWriter(cipherout + ".txt");
      out.println(cipher);
     out.close();
   }
}
