import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num;

        System.out.println("Проверка, двузначное ли число.");
        System.out.println("Введите положительное число:");
        num = number.nextInt();

        if (Logics.is2Digits(num)) {
            System.out.println("Число двузначное");
        }
        else {
            System.out.println("Число не является положительным и двузначным");
        }


        /*
        int firstNumber;
        int secondNumber;
        int sum;
        int diff;
        int prod;
        double priv;

        System.out.println("Введите первое число:");
        firstNumber = number.nextInt();
        System.out.println("Введите второе число:");
        secondNumber = number.nextInt();

        sum = firstNumber+secondNumber;
        diff = firstNumber-secondNumber;
        prod = firstNumber*secondNumber;
        priv = (double)firstNumber/secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + prod);
        System.out.println("Частное: " + priv);
         */
    }
}