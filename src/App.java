
public class App {
    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;
        String str1 = str.toLowerCase();
        System.out.println(str1);
        while (i < str.length()) {
        Character.toLowerCase(ch);

            if (str1.charAt(i) == Character.toLowerCase(ch)) {


                // Считаем только подходящие символы
                count = count + 1;

            }

            i = i + 1;

            // END
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {
        App.countChars("hexLet", 'E');
    }
}

