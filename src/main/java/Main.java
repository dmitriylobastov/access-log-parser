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
                int countLine = 0;
                int countYandexBot = 0;
                int countGooglebot = 0;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();

                    if (length > 1024) {
                        throw new LineLong1024Exception((countLine + 1) + "я строка в файле длиннее 1024 символов");
                    }
                    String firstBrackets = firstBrackets(line);
                    String fragment = fragment(firstBrackets);
                    String notWhitewash = remoteSlash(fragment);

                    if (notWhitewash.equals("YandexBot")) {
                        countYandexBot++;
                    } else if (notWhitewash.equals("Googlebot")) {
                        countGooglebot++;
                    }
                    countLine++;
                }
                System.out.println("Общее количество строк в файле: " + countLine);
                System.out.println("Доля запросов от YandexBot относительно общего числа сделанных запросов: "
                        + countYandexBot + "/" + countLine);
                System.out.println("Доля запросов от Googlebot относительно общего числа сделанных запросов: "
                        + countGooglebot + "/" + countLine);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    static String fragment(String line) {
        String fragment = "";
        String[] parts = line.split(";");

        if (parts.length >= 2) {
            fragment = parts[1].replace(" ", "");
        }
        return fragment;
    }

    static String firstBrackets(String line) {
        String firstBrackets = "";

        int start = line.indexOf('(');
        int end = line.indexOf(')', start + 1);

        if (start != -1 && end != -1) {
            firstBrackets = line.substring(start + 1, end);
        }
        return firstBrackets;
    }

    static String remoteSlash(String line) {
        String remoteWhitewash = "";
        int slashIndex = line.indexOf('/');

        if (slashIndex != -1) {
            remoteWhitewash = line.substring(0, slashIndex);
        } else {
            remoteWhitewash = line;
        }
        return remoteWhitewash;
    }
}
// C:\Users\Dmitriy\Documents\GitHub\AccessLogParser\out\artifacts\AccessLogParser_jar\AccessLogParser.jar
// C:\Users\Dmitriy\Documents\GitHub\AccessLogParser\src\main\resources\access.log