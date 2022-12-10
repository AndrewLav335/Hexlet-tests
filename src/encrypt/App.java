package encrypt;

public class App {
    public static void main(String[] args) {
        App.encrypt("move");
    }

    public static String encrypt(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
    }
}

