package ru.courses.tasks;

public class SumAll {
    public static double sumAll(Number... numbers) {
        double sumAll = 0.0;
        for (Number number : numbers) {
            sumAll += number.doubleValue();
        }
        return sumAll;
    }
}