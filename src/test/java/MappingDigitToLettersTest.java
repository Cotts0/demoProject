import org.junit.Test;

/**
 * Mapping Digit To Letters
 */
public class MappingDigitToLettersTest {

    @Test
    public void digitsToLettersTest() {
        MappingDigitToLetters.getDigitsMap();

        String input1 = "-1";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input1);

        String input4 = "101";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input4);

        String input2 = "5";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input2);

        String input3 = "99";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input3);


    }
}
