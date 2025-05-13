public class Logics {
    public static boolean is2Digits(int x){
        boolean notPosX = Integer.toString(x).startsWith("-");
        if (!notPosX) {
            int lengthX = Integer.toString(x).length();
            return lengthX == 2;
        }
        else return false;
    }

    public static double fraction(double x){
        return x-(int)x;
    }

    public static int sumLastNums(int x){
        return Math.abs(x%100/10+x%10);
    }

    public static int charToNum(char x){
        return x-48;
    }

    public static boolean isPositive(int x){
        return x >0;
    }

    public static boolean isUpperCase(char x){
        return x >64 && x <91;
    }
}
