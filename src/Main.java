import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект класса Scanner
        String input;

        System.out.print("Введите Ваше имя: ");
        input = scanner.nextLine();
        System.out.println("Ваше имя: " + input);
        System.out.print("Введите Ваш возраст: ");
        input = scanner.nextLine();
        System.out.println("Ваш возраст: " + input);
    }
}
