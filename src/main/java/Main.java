import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTruePath = 0;
        while (true) {
            System.out.println("Введите путь к файлу: ");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Ошибка. Введен путь к папке, а не файлу");
                continue;
            }
            if (!fileExists) {
                System.out.println("Ошибка. Введен путь к несуществующему файлу");
                continue;
            }
            System.out.println("Путь указан верно");
            countTruePath++;
            System.out.println("Это файл номер " + countTruePath);
        }
    }
        /*
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber+secondNumber;
        int diff = firstNumber-secondNumber;
        int  prod = firstNumber*secondNumber;
        double  priv = (double) firstNumber/secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + prod);
        System.out.println("Частное: " + priv);
         */
}