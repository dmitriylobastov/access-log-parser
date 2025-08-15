package ru.courses.geometry;
public class Line implements Measurable{
    private Dot start;
    private Dot end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    public Line(int statX, int startY, int endX, int endY) {
        this(new Dot(statX, startY), new Dot(endX, endY));
    }

    public Dot getStart() {
        return start;
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public Dot getEnd() {
        return end;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    @Override
    public Double getLength() {
        int leg1 = end.getX() - start.getX();
        int leg2 = end.getY() - start.getY();
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }
}
