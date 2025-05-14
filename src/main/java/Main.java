import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Практика Java. Классы и методы.
        System.out.println("Практика Java. Классы и методы.");
        System.out.println("Задача 1. Получение дробной части числа.");
        System.out.println("Задача 2. Сложение двух последних знаков.");
        System.out.println("Задача 3. Вывод чисел от 0 до 9.");
        System.out.println("Задача 4. Проверка, пложительное ли число.");
        System.out.println("Задача 5. Проверка, двузначное ли число.");
        System.out.println("Задача 6. Проверка, большая ли буква в диапазоне от 'A' до 'Z'.");
        System.out.println("Задача 7. Проверка, входит ли num в диапазон числового ряда [a и b] включая границы.");
        System.out.println("Задача 8. Проверка, делит ли любое число на другое нацело.");
        System.out.println();
        System.out.println("Для запуска задачи ведите её номер: ");

        int scannerInt = scanner.nextInt();

        switch (scannerInt) {
                case 1:
                    Tasks.task1();
                    break;
                case 2:
                    Tasks.task2();
                    break;
                case 3:
                    Tasks.task3();
                    break;
                case 4:
                    Tasks.task4();
                    break;
                case 5:
                    Tasks.task5();
                    break;
                case 6:
                    Tasks.task6();
                    break;
                case 7:
                    Tasks.task7();
                    break;
                case 8:
                    Tasks.task8();
                    break;
                default:
                    System.out.println("Задача с таким номером отсутствует");
            }
    }
}