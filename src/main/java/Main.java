import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
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
    }
}