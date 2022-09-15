package PracticalWork2;

import java.lang.Math;

public class Factorial {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 6);
        int r = 1;
        for (int i = n; i > 0; i--) {
            r *= i;
        }
        System.out.println("Факторіал числа " + n + " дорівнює: " + r);
    }
}
