import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Практика Java. Классы и методы. #1
        System.out.println("Получение дробной части числа.");
        System.out.println("Введите вещественное число:");
        double scannerDouble = scanner.nextDouble();

        System.out.print("Дробная часть числа, 3 знака после запятой: ");
        System.out.printf("%.3f%n%n", Logics.fraction(scannerDouble));

        // Практика Java. Классы и методы. #2
        System.out.println("Сложение двух последних знаков.");
        System.out.println("Введите целое число не менее 2х знаков:");
        int scannerInt = scanner.nextInt();

        if (scannerInt/10 !=0) {
            System.out.println("Сумма двух последних чисел: " + Logics.sumLastNums(scannerInt));
        }
        else System.out.println("Вы ввели число менее 2х знаков!");
        System.out.println();

        // Практика Java. Классы и методы. #3
        System.out.println("Вывод чисел от 0 до 9.");
        System.out.println("Введите число от 0 до 9:");
        String scannerString = scanner.next();
        int resultCharToNum = Logics.charToNum(scannerString.charAt(0));
        if (scannerString.length() == 1 && (resultCharToNum >=0 && resultCharToNum <=9)) {
            System.out.println("Вы ввели число: " + resultCharToNum);
        }
        else {
            System.out.println("Вы ввели не число от 0 до 9.");
        }
        System.out.println();

        // Практика Java. Классы и методы. #4
        System.out.println("Проверка, пложительное ли число.");
        System.out.println("Введите целое число:");
        scannerInt = scanner.nextInt();
        if (Logics.isPositive(scannerInt)) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное или 0");
        }
        System.out.println();

        // Практика Java. Классы и методы. #5
        System.out.println("Проверка, двузначное ли число.");
        System.out.println("Введите положительное число:");
        scannerInt = scanner.nextInt();

        if (Logics.is2Digits(scannerInt)) {
            System.out.println("Число двузначное");
        }
        else {
            System.out.println("Число не является положительным и двузначным");
        }


        /*
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber+secondNumber;
        int diff = firstNumber-secondNumber;
        int prod = firstNumber*secondNumber;
        double priv = (double)firstNumber/secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + prod);
        System.out.println("Частное: " + priv);
         */
    }
}