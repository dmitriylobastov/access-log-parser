public final class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Отрицательное значение знаменателя недопустимо");
        }
        this.numerator = numerator;
        this.denominator = denominator;
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
