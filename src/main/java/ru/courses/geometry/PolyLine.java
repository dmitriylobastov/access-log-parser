package ru.courses.geometry;
import java.util.Arrays;

public class PolyLine implements Measurable {
    protected Dot[] dots;

    public PolyLine(Dot... dots) {
        this.dots = dots;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLine polyLine = (PolyLine) obj;
        return Arrays.equals(dots, polyLine.dots);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dots);
    }

    public Line[] getLines() {
        if (dots.length < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[dots.length - 1];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(dots[i], dots[i + 1]);
        }
        return lines;
    }

    @Override
    public Double getLength() {
        if (dots.length < 2) {
            return (double) 0;
        }

        Double sumLengthPolyLine = 0.00;
        Line[] lines = getLines();
        for (Line line : lines) {
            sumLengthPolyLine += line.getLength();
        }
        return sumLengthPolyLine;
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(dots);
    }
}
