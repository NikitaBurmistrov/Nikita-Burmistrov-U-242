import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        int[] cell = {-2147483648, -2147483648, -2147483648};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число (или 'q' для выхода): ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                boolean foundEmpty = false;
                for (int i = 0; i < 3; i++) {
                    if (cell[i] == -2147483648) {
                        cell[i] = input;
                        foundEmpty = true;
                        break;
                    }
                }
                if (!foundEmpty) {
                    int minIndex = 0;
                    for (int i = 1; i < 3; i++) {
                        if (cell[i] < cell[minIndex]) {
                            minIndex = i;
                        }
                    }
                    cell[minIndex] = input;
                }
                System.out.print("Ячейка: ");
                for (int value : cell) {
                    if (value == -2147483648) {
                        System.out.print("_ ");
                    } else {
                        System.out.print(value + " ");
                    }
                }
                System.out.println();
            } else if (scanner.next().equals("q")) {
                break;
            } else {
                System.out.println("Некорректный ввод. Введите число или 'q'.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
