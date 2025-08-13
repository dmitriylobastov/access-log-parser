package ru.сourses.tasks;
import java.util.Arrays;

public class Logics {
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];
        int count = 0;
        for (; count < pos; ) {
            newArr[count] = arr[count++];
        }
        for (int i = 0; i < ins.length; ) {
            newArr[count++] = ins[i++];
        }
        for (int j = pos; count < newArr.length; ) {
            newArr[count++] = arr[j++];
        }
        return newArr;
    }

    public static int[] add2(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos + 1, j = pos; i < newArr.length; i++, j++) {
            newArr[i] = arr[j];
        }
        return newArr;
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] newArr = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static int[] findAll(int[] arr, int x) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                newArr[count++] = i;
            }
        }
        int[] finalArr = new int[count];
        for (int j = 0; j < finalArr.length; j++) {
            finalArr[j] = newArr[j];
        }
        return finalArr;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < newArr.length; i++, j++) {
            newArr[i] = arr2[j];
        }
        return newArr;
    }

    public static int[] reverseBack(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[i] = arr[j];
        }
        return newArr;
    }

    public static void reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArr[i] = arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

    public static boolean palindrom(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }

    public static int countPositive(int[] arr) {
        int countPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) countPos++;
        }
        return countPos;
    }

    public static int maxAbs(int[] arr) {
        int maxArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(maxArr)) maxArr = arr[i];
        }
        return maxArr;
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static boolean is2Digits(int x) {
        boolean notPosX = Integer.toString(x).startsWith("-");
        if (!notPosX) {
            int lengthX = Integer.toString(x).length();
            return lengthX == 2;
        } else return false;
    }

    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        return Math.abs(x % 100 / 10 + x % 10);
    }

    public static int charToNum(char x) {
        return x - 48;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean isUpperCase(char x) {
        return x > 64 && x < 91;
    }

    public static boolean isInRange(int a, int b, int num) {
        if (a <= b) {
            return num >= a && num <= b;
        } else return num >= b && num <= a;
    }

    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static boolean isEqual(int a, int b, int c) {
        return a == b && a == c;
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // Условия
    public static int abs(int x) {
        if (x > 0) return x;
        return -x;
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }

    public static String makeDecision(int x, int y) {
        if (x > y) return x + ">" + y;
        if (x < y) return x + "<" + y;
        return x + "==" + y;
    }

    public static int max3(int x, int y, int z) {
        if (x > y && x > z) return x;
        if (y > z) return y;
        return z;
    }

    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) return true;
        if (x + z == y) return true;
        return y + z == x;
    }

    public static int sum2(int x, int y) {
        if (x + y > 9 && x + y < 20) return 20;
        return x + y;
    }

    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        return x % 3 == 0 || x % 5 == 0;
    }

    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6) return true;
        if (x + y == 6) return true;
        return x - y == 6 || y - x == 6;
    }

    public static String age(int x) {
        if (x % 100 != 11 && x % 10 == 1) return x + " год";
        if (x % 100 != 12 && x % 10 == 2) return x + " года";
        if (x % 100 != 13 && x % 10 == 3) return x + " года";
        if (x % 100 != 14 && x % 10 == 4) return x + " года";
        return x + " лет";
    }

    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public static String listNums(int x) {
        String num = "";
        for (int i = 0; i <= x; i++) {
            num += i + " ";
        }
        return num;
    }

    public static String reverseListNums(int x) {
        String num = "";
        for (int i = x; i >= 0; i--) {
            num += i + " ";
        }
        return num;
    }

    public static String chet(int x) {
        String num = "";
        for (int i = 0; i <= x; i += 2) {
            num += i + " ";
        }
        return num;
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    public static int numLen(long x) {
        int count = 0;
        do {
            x /= 10;
            count++;
        } while (x > 0);
        return count;
    }

    public static boolean equalNum(int x) {
        int firstNum = x % 10;
        do {
            if (x % 10 != firstNum) return false;
            x /= 10;
        } while (x > 0);
        return true;
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > 0; j--) {
                if (j > i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int randomNum = 3, x, count = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        do {
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
            count++;
        } while (x != randomNum);
        System.out.println("Количество попыток: " + count);
    }

}