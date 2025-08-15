import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                int minLengthLine = Integer.MAX_VALUE;
                int maxLengthLine = 0;
                int countLine = 0;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();

                    if (length > 1024) {
                        throw new LineLong1024Exception((countLine + 1) + "я строка в файле длиннее 1024 символов");
                    }
                    minLengthLine = Math.min(minLengthLine, length);
                    maxLengthLine = Math.max(maxLengthLine, length);
                    countLine++;
                }
                System.out.println("Общее количество строк в файле: " + countLine);
                System.out.println("Длина самой длинной строки в файле: " + maxLengthLine);
                System.out.println("Длина самой короткой строки в файле: " + minLengthLine);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
// C:\Users\Dmitriy\Documents\GitHub\AccessLogParser\out\artifacts\AccessLogParser_jar\AccessLogParser.jar
// C:\Users\Dmitriy\Documents\GitHub\AccessLogParser\src\main\resources\access.log


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