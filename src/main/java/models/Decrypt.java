package models;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Decrypt {
    private String message;
    private int shiftKey;
    private static final int Letter = 26;
    //constructor
    public Decrypt(String message, int shiftKey) {
        this.message=message;
        this.shiftKey=shiftKey;
    }

    public String decipher(){
        shiftKey %= Letter;
        char[] chars = message.toCharArray();
        shift(chars,shiftKey);
        return new String(chars);

    }
    private void shift(char[] chars, int shiftKey) {
        for (int i = 0; i < chars.length; ++i) {
            if (isLowerCase(chars[i])) {
                chars[i] = shiftChar(chars[i], shiftKey, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] =  shiftChar(chars[i], shiftKey, 'A', 'Z');
            }
        }
    }
    private char shiftChar(char ch, int shiftBy, char firstChar, char lastChar) {
        ch += shiftBy;
        if (ch < firstChar) {
            return (char) (ch + Letter);
        }
        if (ch > lastChar) {
            return (char) (ch - Letter);
        }
        return ch;
    }

}
