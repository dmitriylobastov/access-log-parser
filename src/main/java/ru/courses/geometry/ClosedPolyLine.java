package ru.courses.geometry;
public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Dot... dots) {
        super(dots);
    }

    @Override
    public Double getLength() {
        if (dots.length < 2) {
            return (double) 0;
        }
        Double sumLengthPolyLine = super.getLength();

        int legStart = dots[dots.length - 1].getX() - dots[0].getX();
        int legEnd = dots[dots.length - 1].getY() - dots[0].getY();
        sumLengthPolyLine += Math.sqrt(legStart * legStart + legEnd * legEnd);
        return sumLengthPolyLine;
    }

}
