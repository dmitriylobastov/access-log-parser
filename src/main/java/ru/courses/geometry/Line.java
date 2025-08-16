package ru.courses.geometry;

import java.util.Objects;

public class Line implements Measurable, Cloneable {
    private Dot start;
    private Dot end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() {
        try {
            Line cloneLine = (Line) super.clone();
            cloneLine.start = this.start.clone();
            cloneLine.end = this.end.clone();
            return cloneLine;
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("Неуспешное клонирование объекта", ex);
        }
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
