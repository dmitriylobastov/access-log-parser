import java.util.Arrays;

public class PolyLine {
    //    массив Точек, через которые линия проходит
    protected Dot[] dots;

    //    При создании объекта можно ничего не указывать, или указать начальный набор Точек
    public PolyLine(Dot... dots) {
        this.dots = dots;
    }

    //    Может вернуть массив Линий (getLines)
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

    //    Может вернуть свою длину (getLength)
    public int getLength() {
        if (dots.length < 2) {
            return 0;
        }

        int sumLengthPolyLine = 0;
        Line[] lines = getLines();
        for (Line line : lines) {
            sumLengthPolyLine += line.getLength();
        }
        return sumLengthPolyLine;
    }

    //    Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”,
    //    где TN – это результат приведения к строке Точки с номером N
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(dots);
    }
}
