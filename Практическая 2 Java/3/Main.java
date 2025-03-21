import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        String result = removeVowels(inputString);
        System.out.println("Строка без гласных: " + result);
        scanner.close();
    }

    private static String removeVowels(String str) {
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}