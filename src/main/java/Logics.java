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
        int intX = (int)x;
        double x3F = Double.parseDouble(String.format("%.3f", x).replace(',', '.'));
        return x3F - intX;
    }
}
