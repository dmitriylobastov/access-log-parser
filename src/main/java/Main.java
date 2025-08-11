import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Dot dot1 = new Dot(1, 5);
        Dot dot2 = new Dot(2, 8);
        Dot dot3 = new Dot(5, 3);
        Dot dot4 = new Dot(8, 9);

        //        1. Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}

        ClosedPolyLine poliLine1 = new ClosedPolyLine(dot1, dot2, dot3, dot4);
        System.out.println("Создана Ломаная " + poliLine1);

//        2. Рассчитать длину Ломаной
        System.out.println("Длина Ломаной: " + poliLine1.getLength());

//        3. Получить у Ломаной массив Линий
        System.out.println("Массив Ломаной: " + Arrays.toString(poliLine1.getLines()));

//        4. Рассчитать длину массива Линий
        System.out.println("Длина массива Линий Ломаной: " + poliLine1.getLines().length);

//        5. Сравнить длину Ломаной и массива Линий: они должны совпасть
        if (poliLine1.getLength() == poliLine1.getLines().length) {
            System.out.println("Длина Ломаной совпадает с длиной массива Линий");
        } else {
            System.out.println("Длина Ломаной с длиной массива Линий не совпадает");
        }

//        6. Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
//        Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3),
//        то задача решена верно
        System.out.println("Изначальное значение точки: " + dot2);
        dot2.setX(12);
        System.out.println("Новое значение точки: " + dot2);
        System.out.println("Измененная Ломаная " + poliLine1);
        System.out.println("Измененный массив Ломаной: " + Arrays.toString(poliLine1.getLines()));





    }
}

//    Point3D dot1 = new Point3D(1, 5, 9);
//        System.out.println(dot1.getY());
//                System.out.println(dot1.getZ());
//                dot1.setX(2);
//                System.out.println(dot1);

//    Student student1 = new Student("Дмитрий Лобастов");
//    Student student2 = new Student("Дмитрий", 2, 3, 5);
//    Student student3 = new Student("Сергей", 2);
//        System.out.println(student1);
//                System.out.println(student2);
//                System.out.println(student3);
//                student2.addGrade(2);
//                System.out.println(student2);
//                student3.addGrade(2);
//                System.out.println(student2);
//                System.out.println(student1.getGrades());
//                System.out.println(student2.getGrades());
//                System.out.println(student3.getGrades());


//    Fraction f1 = new Fraction(1, 3);
//    Fraction f2 = new Fraction(2, 5);
//    Fraction f3 = new Fraction(7, 8);
//        System.out.println(f1.sum(f2).sum(f3).minus(5));




//
////        Dot dot1 = new Dot(1, 3);
//        Dot dot2 = new Dot(5, 8);
//        Dot dot3 = new Dot(10, 11);
//        Dot dot4 = new Dot(15, 19);
//
//        Line line1 = new Line(dot1, dot2);
//        Line line2 = new Line(dot3, dot4);
//        Line line3 = new Line(line1.getEnd(), line2.getStart());
//        System.out.println("Линия 3 " + line3.toString().substring(9));
//
//        line3.getStart().setX(20);
//        line3.getStart().setY(40);
//        line3.getEnd().setX(30);
//        line3.getEnd().setY(60);
//        System.out.println("Линия 3 после изменений " + line3.toString().substring(9));
//
//        double sumLengthLine = line1.getLength() + line2.getLength() + line3.getLength();
//        System.out.println("Сумма всех трех линий: " + sumLengthLine);
