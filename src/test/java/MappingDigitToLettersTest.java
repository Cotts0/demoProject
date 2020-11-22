import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Mapping Digit To Letters
 */
public class MappingDigitToLettersTest {

    @Test
    public void initTest() {
        MappingDigitToLetters.getDigitsMap();
    }

    @Test
    public void inputCheckTest() {
        System.out.println("-- inputCheckTest begin --");
        String input1 = "-1";
        System.out.println("");
        MappingDigitToLetters.inputCheck(input1);

        String input4 = "100";
        System.out.println("");
        MappingDigitToLetters.inputCheck(input4);
        System.out.println("\n-- inputCheckTest end --");
    }

    @Test
    public void printListTest() {
        System.out.println("-- printListTest begin --");
        List<String[]> resultList = new ArrayList<>();
        String[] strings = {"SS", "AA", "BB", "CC", "DD"};
        resultList.add(strings);
        MappingDigitToLetters.printList(resultList);
        System.out.println("\n-- printListTest end --");

    }

    @Test
    public void digitsToLettersTest() {
        System.out.println("-- digitsToLettersTest begin --");

        String input1 = "0";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input1);

        String input2 = "5";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input2);


        String input3 = "15";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input3);

        String input4 = "99";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input4);

        String input5 = "1";
        System.out.println("");
        MappingDigitToLetters.digitsToLetters(input5);
        System.out.println("\n-- digitsToLettersTest begin --");


    }


}
