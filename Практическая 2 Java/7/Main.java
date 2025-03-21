import java.util.Scanner;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        String[] words = s.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String word : words) {
            set.add(word);
        }
        for (String word : set) {
            System.out.print(word + " ");
        }
        System.out.println(); // Перенос строки для чистоты вывода
        in.close();
    }
}

