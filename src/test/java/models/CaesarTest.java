package models;

import static org.junit.Assert.*;
import org.junit.*;

public class CaesarTest {
    private  Caesar caesar = new Caesar("HE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",-3);

        @Test
        public void shouldCipherWholeAlphabet() {
            String allChars = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
            assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",
                    caesar.cipher(allChars, -3));
        }

    }
