package PracticalWork2;

import java.util.Scanner;

public class A_number_from_0_to_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число для перевірки: ");
        int x = in.nextInt();
        if (x >= 0 && x < 10) {
            System.out.println("Позитивне число менше 10 або нуль");
        } else if (x == 10) {
            System.out.println("Число дорівнює: 10");
        } else {
            System.out.println("Позитивне число більше 10 або негативне");
        }
    }
}
