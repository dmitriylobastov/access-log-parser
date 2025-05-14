import java.util.Scanner;

public class Tasks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void task1() {
        // Практика Java. Классы и методы. #1
        System.out.println("Получение дробной части числа.");
        System.out.println("Введите вещественное число:");
        double scannerDouble = scanner.nextDouble();
        System.out.print("Дробная часть числа, 3 знака после запятой: ");
        System.out.printf("%.3f%n%n", Logics.fraction(scannerDouble));
    }

    public static void task2() {
        // Практика Java. Классы и методы. #2
        System.out.println("Сложение двух последних знаков.");
        System.out.println("Введите целое число не менее 2х знаков:");
        int scannerInt = scanner.nextInt();

        if (scannerInt / 10 != 0) {
            System.out.println("Сумма двух последних чисел: " + Logics.sumLastNums(scannerInt));
        } else System.out.println("Вы ввели число менее 2х знаков!");
    }

    public static void task3() {
        // Практика Java. Классы и методы. #3
        System.out.println("Вывод чисел от 0 до 9.");
        System.out.println("Введите число от 0 до 9:");
        String scannerString = scanner.next();
        int resultCharToNum = Logics.charToNum(scannerString.charAt(0));

        if (scannerString.length() == 1 && (resultCharToNum >= 0 && resultCharToNum <= 9)) {
            System.out.println("Вы ввели число: " + resultCharToNum);
        } else {
            System.out.println("Вы ввели не число от 0 до 9.");
        }
    }

    public static void task4() {
        // Практика Java. Классы и методы. #4
        System.out.println("Проверка, пложительное ли число.");
        System.out.println("Введите целое число:");
        int scannerInt = scanner.nextInt();

        if (Logics.isPositive(scannerInt)) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное или 0");
        }
    }

    public static void task5() {
        // Практика Java. Классы и методы. #5
        System.out.println("Проверка, двузначное ли число.");
        System.out.println("Введите положительное число:");
        int scannerInt = scanner.nextInt();

        if (Logics.is2Digits(scannerInt)) {
            System.out.println("Число двузначное");
        } else {
            System.out.println("Число не является положительным и двузначным");
        }
    }

    public static void task6() {
        // Практика Java. Классы и методы. #6
        System.out.println("Проверка, большая ли буква в диапазоне от 'A' до 'Z'.");
        System.out.println("Введите один символ:");
        String scannerString = scanner.next();
        boolean resultIsUpperCase = Logics.isUpperCase(scannerString.charAt(0));

        if (scannerString.length() == 1 && resultIsUpperCase) {
            System.out.println("Вы ввели большую ли букву в диапазоне от 'A' до 'Z'");
        } else {
            System.out.println("Введеный текст не является большой буквой в диапазоне от 'A' до 'Z'");
        }
    }

    public static void task7() {
        // Практика Java. Классы и методы. #7
        System.out.println("Проверка, входит ли num в диапазон числового ряда [a и b] включая границы.");
        System.out.println("Введите первое целое число a:");
        int scannerIntA = scanner.nextInt();
        System.out.println("Введите второе целое число b:");
        int scannerIntB = scanner.nextInt();
        System.out.println("Введите целое число num:");
        int scannerIntNum = scanner.nextInt();

        if (Logics.isInRange(scannerIntA, scannerIntB, scannerIntNum)) {
            System.out.println("Num входит в диапазон числового ряда [a и b]");
        } else {
            System.out.println("Num в диапазон числового ряда [a и b] не входит");
        }
    }

    public static void task8() {
        // Практика Java. Классы и методы. #8
        System.out.println("Проверка, делит ли любое число на другое нацело.");
        System.out.println("Введите одно целое число a:");
        int scannerIntA = scanner.nextInt();
        System.out.println("Введите другое целое число b:");
        int scannerIntB = scanner.nextInt();

        if (Logics.isDivisor(scannerIntA, scannerIntB) && scannerIntA != 0 && scannerIntB != 0) {
            System.out.println("Одно любое число делится на другое без остатка");
        } else {
            System.out.println("Одно любое число на другое без остатка не делится, либо одно или оба числа это ноль ");
        }
    }

    public static void task9() {
        // Практика Java. Классы и методы. #9
        System.out.println("Проверка, что все три числа равны.");
        System.out.println("Введите первое целое число a:");
        int scannerIntA = scanner.nextInt();
        System.out.println("Введите второе целое число b:");
        int scannerIntB = scanner.nextInt();
        System.out.println("Введите третье целое число b:");
        int scannerIntC = scanner.nextInt();

        if (Logics.isEqual(scannerIntA, scannerIntB, scannerIntC)) {
            System.out.println("Все три числа равны");
        } else {
            System.out.println("Три числа между собой не равны");
        }
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
