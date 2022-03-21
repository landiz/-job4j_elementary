package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double differenceX = diffPow(x1, x2);
        double differenceY = diffPow(y1, y2);
        return Math.sqrt(differenceX + differenceY);
    }

    public static double diffPow(int a, int b) {
        return Math.pow((a - b), 2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(10, 20, 30, 30);
        System.out.println("result (10, 20) to (30, 30) " + result);
    }
}