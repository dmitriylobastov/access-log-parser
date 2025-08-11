public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Dot... dots) {
        super(dots);
    }

    public int getLength() {
        if (dots.length < 2) {
            return 0;
        }
        int sumLengthPolyLine = super.getLength();

        int legStart = dots[dots.length - 1].getX() - dots[0].getX();
        int legEnd = dots[dots.length - 1].getY() - dots[0].getY();
        sumLengthPolyLine += Math.sqrt(legStart * legStart + legEnd * legEnd);
        return sumLengthPolyLine;
    }

}
