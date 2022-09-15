package PracticalWork2;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть число, яке ви хочете перевірити: ");
        n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Введене число парне.");
        } else {
            System.out.println("Введене число не парне.");
        }
    }
}
