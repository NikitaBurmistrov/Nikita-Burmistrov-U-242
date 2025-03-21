import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String inputName = scanner.nextLine();

        String formattedName = formatName(inputName);


        System.out.println("Привет, " + formattedName + "!");

        scanner.close();
    }

    private static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }

        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }
}
