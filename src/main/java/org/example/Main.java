package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        calc.sum(3, 9);
        System.out.println(" 3 + 9 = " + calc.sum(3, 9));
        calc.sum(3, 9);
        System.out.println(" 3 * 9 = " + calc.mult(3, 9));
        calc.sum(3, 3);
        System.out.println(" 5 ^ 3 = " + calc.pow(5, 3));

    }
}