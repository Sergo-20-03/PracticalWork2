package PracticalWork2;

public class Literally {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("Зараз будуть виведені логічні літерали: ");
        System.out.println(a);
        System.out.println(b);
        String c = "Hello";
        System.out.print("Рядковий літерал: ");
        System.out.println(c);
        char d = 'A';
        System.out.print("Символьний літерал: ");
        System.out.println(d);
        int e = 6;
        System.out.println("Десятичне число " + e + " дорівнює двоїчному числу " + Integer.toBinaryString(e));
        int decimalNumber = 25;
        System.out.println("Десятичне число " + decimalNumber + " дорівнює восьмичному числу " + toOctal(decimalNumber));
        int f = 7;
        System.out.println("Цілісний десятичний літерал: " + f);
        int g = 35;
        System.out.println("Десятичне число " + g + " дорівнює шістнацятичному числу " + Integer.toHexString(g));
        float fl = 3.45F;
        System.out.print("Літерал типу float: ");
        System.out.println(fl);
        double db = 5.965;
        System.out.print("Літерал типу double: ");
        System.out.println(db);




    }
    public static int toOctal(int decimalNumber) {
        int i = 0;
        int x = (int)Math.ceil(Math.log10(decimalNumber));
        int octal = 0;
        if (decimalNumber>0) {

            while (i < x) {
                octal = (int) (octal + ((decimalNumber % 8) * Math.pow(10, i)));
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octal;
        } else return 0;
    }
}
