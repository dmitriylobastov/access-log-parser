package ru.сourses.tasks;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Integer> grades;

    public Student(String name, int... InitGrades) {
        this.name = name;
        this.grades = new ArrayList<>();
        if (InitGrades != null && InitGrades.length > 0) {
            addGrades(InitGrades);
        }
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void addGrade(int newGrade) {
        checkGrades(newGrade);
        grades.add(newGrade);
    }

    public void addGrades(int[] newGrades) {
        if (newGrades == null) return;
        for (int grade : newGrades) {
            checkGrades(grade);
        }
        for (int grade : newGrades) {
            grades.add(grade);
        }
    }

    private void checkGrades(int grade) {
        if (grade < 2 || grade > 5) {
            throw new
                    IllegalArgumentException(
                    String.format(
                            "Все оценки должны быть в диапазоне от 2 до 5! Вы ввели оценку: %d", grade));
        }
    }

    @Override
    public String toString() {
        return name + ":" + grades;
    }
}
