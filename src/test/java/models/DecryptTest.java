package models;

import static org.junit.Assert.*;
import org.junit.*;

public class DecryptTest {
    private Decrypt decrypt = new Decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 2);

    @Test
    public void shouldDecipher() {
        String s = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";

        String encrypted = decrypt.decipher(s, 2);

        assertEquals(s, decrypt.decipher(encrypted, -2));
    }
}