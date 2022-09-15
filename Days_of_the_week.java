package PracticalWork2;

import java.util.Scanner;

public class Days_of_the_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть день тижня числом (1-7): ");
        int d = sc.nextInt();
        if (d == 1){
            System.out.println("Понеділок");
        } else if (d == 2) {
            System.out.println("Вівторок");
        } else if (d == 3) {
            System.out.println("Середа");
        } else if (d == 4) {
            System.out.println("Четвер");
        } else if (d == 5) {
            System.out.println("Пятниця");
        } else if (d == 6 || d == 7) {
            System.out.println("Вихідний");
        } else {
            System.out.println("Такого дня тижня не існує!)");
        }

    }
}
