import models.Caesar;
import java.util.Scanner;
import models.Decrypt;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a word/ sentence: ");
        String userInput = myScanner.next();


        System.out.println("Enter Shift Key");
        String userKey = myScanner.next();
        int intKey = Integer.parseInt(userKey);


        Caesar newCaesar = new Caesar(userInput, intKey);
        System.out.println("Encrypted word is: " + newCaesar.cipher(userInput, intKey));



        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Would you like to decipher? (1/0)");
        Integer choice = Integer.parseInt(myScanner2.nextLine());

        if(choice.equals(1)) {

            System.out.println("Enter a word/ sentence: ");
            String input = myScanner.next();

            System.out.println("Enter Shift Key");
            String inputKey = myScanner.next();
            int key = Integer.parseInt(inputKey);

           Decrypt newDecrypt = new Decrypt(input, key);
            System.out.println("Encrypted word is: " + newDecrypt.decipher(input, key));
        }






    }

}
