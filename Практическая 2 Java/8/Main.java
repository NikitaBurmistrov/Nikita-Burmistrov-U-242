import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        int upperCount = 0;
        int lowerCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        if (upperCount > lowerCount) {
            System.out.println(inputString.toUpperCase());
        } else if (lowerCount > upperCount) {
            System.out.println(inputString.toLowerCase());
        } else {
            System.out.println(inputString.toLowerCase());
        }

        scanner.close();
    }
}
