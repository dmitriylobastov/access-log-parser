package ru.courses.tasks;
public final class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Отрицательное значение знаменателя недопустимо");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Числитель/знаменатель: "
                + numerator
                + "/"
                + denominator;
    }

    public Fraction sum(Fraction otherFraction) {
        return new Fraction(
                this.numerator * otherFraction.getDenominator()
                        + otherFraction.getNumerator() * this.denominator,
                this.denominator * otherFraction.denominator
        );
    }

    public Fraction sum(int otherFraction) {
        return sum(new Fraction(otherFraction, 1));
    }

    public Fraction minus(Fraction otherFraction) {
        return new Fraction(
                this.numerator * otherFraction.getDenominator()
                        - otherFraction.getNumerator() * this.denominator,
                this.denominator * otherFraction.denominator
        );
    }

    public Fraction minus(int otherFraction) {
        return minus(new Fraction(otherFraction, 1));
    }
}
