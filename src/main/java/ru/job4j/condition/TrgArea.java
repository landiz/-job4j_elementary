package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = semiPerimeter(a, b, c);
        double sp = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sp);
    }

    public static double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}