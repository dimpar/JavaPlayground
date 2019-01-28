import java.util.*;

public class ArrayFlatter {
    public void test() {
        System.out.println("Yay!!!");
    }


    char firstNotRepeatingCharacter(String s) {
        Map uniqueCharactersByChar = new LinkedHashMap<Character, Boolean>();
        char uniqueChar = '_';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!uniqueCharactersByChar.containsKey(c)) {
                uniqueCharactersByChar.put(c, true);
            } else {
                uniqueCharactersByChar.put(c, false);
            }
        }

        for(Object entryObj : uniqueCharactersByChar.entrySet()){
            Map.Entry entry = (Map.Entry) entryObj;
            Object key = entry.getKey();
            Object value = entry.getValue();

            if (Boolean.TRUE.equals(value)) {
                uniqueChar = key.toString().charAt(0);
            }

            break;
        }

        return uniqueChar;
    }
}

