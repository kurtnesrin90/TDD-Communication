package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata5Test {

    @Test
    @DisplayName("Test simple input (letter a - M returns ciphered string")
    void testAtoM() {

        // Arrange
        String input1 = "ABC";
        String input2 = "abc";
        String input3 = "A CAB a ham";

        // Act
        String result1 = Kata5.aCaesarCipher(input1);
        String result2 = Kata5.aCaesarCipher(input2);
        String result3 = Kata5.aCaesarCipher(input3);

        // Assert
        assertAll(
                () -> assertEquals("NOP", result1),
                () -> assertEquals("nop", result2),
                () -> assertEquals("N PNO n unz", result3)
        );
    }
    @Test
    @DisplayName("Test input (letter a - Z) returns correctly ciphered string")
    void testAtoZ() {

        // Arrange
        String input1 = "ABC NOP";
        String input2 = "aBc nOp";
        String input3 = "northcoders";
        String input4 = "abegupbqref";
        String input5 = "Hello World we are Nesrin and Jackson";

        // Act
        String result1 = Kata5.aCaesarCipher(input1);
        String result2 = Kata5.aCaesarCipher(input2);
        String result3 = Kata5.aCaesarCipher(input3);
        String result4 = Kata5.aCaesarCipher(input4);
        String result5 = Kata5.aCaesarCipher(input5);


        // Assert
        assertAll(
                () -> assertEquals("NOP ABC", result1),
                () -> assertEquals("nOp aBc", result2),
                () -> assertEquals("abegupbqref", result3),
                () -> assertEquals("northcoders", result4),
                () -> assertEquals("Uryyb Jbeyq jr ner Arfeva naq Wnpxfba", result5)
                );
    }

    @Test
    @DisplayName("Test complicated sentences with punctuation and numbers returns correctly ciphered string")
    void testComplexSentencesAndEdgeCases() {

        String randomStringVariable = "tEsT vAriAbLe";

        // Arrange
        String input1 = "ABC123";
        String input2 = "";
        String input3 = null;
        String input4 = "ABC !@£$% nop";
        String input5 = "I'm sure glad nobody can read my secret ROT13 code.";
        String input6 =
                "This is the MOST COMPLEX sentence!!! " +
                "its got Number's Like 12345. " +
                "Also Symbols LIKE \"!@£$%^&&\", " +
                "including quotations Marks like ' ' and \" \"" +
                "and even a variable String concatenated " +
                randomStringVariable +
                ". \nHope it all worked!";

        // Act
        String result1 = Kata5.aCaesarCipher(input1);
        String result2 = Kata5.aCaesarCipher(input2);
        String result3 = Kata5.aCaesarCipher(input3);
        String result4 = Kata5.aCaesarCipher(input4);
        String result5 = Kata5.aCaesarCipher(input5);
        String result6 = Kata5.aCaesarCipher(input6);


        // Assert
        assertAll(
                () -> assertEquals("NOP123", result1),
                () -> assertEquals("", result2),
                () -> assertEquals("", result3),
                () -> assertEquals("NOP !@£$% abc", result4),
                () -> assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", result5),
                () -> assertEquals(
                        "Guvf vf gur ZBFG PBZCYRK fragrapr!!! vgf tbg Ahzore'f Yvxr 12345. " +
                        "Nyfb Flzobyf YVXR \"!@£$%^&&\", " +
                        "vapyhqvat dhbgngvbaf Znexf yvxr ' ' naq \" \"" +
                        "naq rira n inevnoyr Fgevat pbapngrangrq gRfG iNevNoYr. \n" +
                        "Ubcr vg nyy jbexrq!"
                        , result6)

        );
    }
}
