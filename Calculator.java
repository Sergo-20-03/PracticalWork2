package PracticalWork2;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        System.out.println("Як вас звати?");
        name = scanner.next();
        System.out.println("Привіт," + name + ")");
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операції: "+result);
    }

    public static int getInt(){
        System.out.println("Введіть число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ви допустили помилку при вводі числа. Спробуйте ще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введіть операцію яку ви хочете провести з цими числами:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ви допустили помилку при вводі операції. Спробуйте ще раз");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Операція не розпізнна. Спробуйтеще раз.");
                result = calc(num1, num2, getOperation());//рекурсия
            }
        }
        return result;
    }
}
