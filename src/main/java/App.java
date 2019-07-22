import models.Caesar;
import java.util.Scanner;
import models.Decrypt;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String userInput = myScanner.next();


        System.out.println("Enter Shift Key");
        String userKey = myScanner.next();
        int intKey = Integer.parseInt(userKey);


        Caesar newCaesar = new Caesar(userInput,intKey);
        System.out.println("Encrypted word is: " + newCaesar.cipher(userInput,intKey));

    }
}
