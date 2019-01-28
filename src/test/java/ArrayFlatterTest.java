import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayFlatterTest {

    @Test
    public void flattenWhen() {
        ArrayFlatter arrayFlatter = new ArrayFlatter();
        arrayFlatter.test();

        Map uniqueCharactersByChar = new HashMap<Character, Integer>();
    }

    @Test
    public void name() {
        String s = "abcaddceabd";

        int[] counter = new int[26];

        for (char c : s.toCharArray()) {
            counter[c-1]++;
            System.out.println(counter[c-97]);
        }
    }



    @Test
    public void name1() {
        int year = 2005;
        String str = "asdf";
        if (1000000000 != 1000000000) {
            System.out.println(" not equal");
        }

        int x = 23;

        int century = year / 100 + 1;

        System.out.println(century);

    }
}