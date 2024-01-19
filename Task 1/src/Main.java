import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static double input = 0;
    static double c = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор!
        System.out.println("Что вы хотите сделать? \n1-разделить\n2-отнять\n3-умножить\n4-сложить");

    }

    private static void divide() {
        c = a / b;
        //todo дописать логику и печать результата
    }

    private static void diff() {
        c = a - b;
        //todo дописать логику и печать результата
    }

    private static void multiply() {
        c = a * b;
        //todo дописать логику и печать результата
    }

    private static void sum() {
        c = a + b;
        //todo дописать логику и печать результата
    }

    private static double inputDouble() {
        System.out.println("Введите ваш ответ: ");
        input = new Scanner(System.in).nextInt();
        System.out.println("Введите первое число: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        b = new Scanner(System.in).nextInt();
        //todo дописать логику
        return 0;
    }
}
