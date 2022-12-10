package TwoClasses;

import java.io.File;

public class TwoClasses {
    public static int bigLettersCount(String str) {

        var count = 0;
        var result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                count++;
                result = count;
            }

        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        TwoClasses.bigLettersCount("asdJkl");

    }
}