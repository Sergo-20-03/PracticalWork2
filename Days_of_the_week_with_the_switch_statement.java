package PracticalWork2;

import java.util.Scanner;

public class Days_of_the_week_with_the_switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть день тижня числом (1-7): ");
        int d = sc.nextInt();
        switch (d) {
            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 -> System.out.println("Середа");
            case 4 -> System.out.println("Четвер");
            case 5 -> System.out.println("Пятниця");
            case 6, 7 -> System.out.println("Вихідний");
            default -> System.out.println("Такого дня тижня не існує!");
        }

    }
}
