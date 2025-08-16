package ru.courses.geometry;

public class Dot implements Cloneable {
    protected int x;
    protected int y;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dot dot = (Dot) obj;
        return x == dot.x && y == dot.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public Dot clone() {
        try {
            return (Dot) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("Неуспешное клонирование объекта", ex);
        }
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}