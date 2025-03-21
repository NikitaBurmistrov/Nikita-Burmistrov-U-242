public class Main {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bc";

        boolean result = isEnding(str1, str2);
        System.out.println(result);
    }

    public static boolean isEnding(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        return str1.endsWith(str2);
    }
}
