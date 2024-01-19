import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static int input = 0;
    static double c = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор!
        while (true) {
            System.out.println("Что вы хотите сделать? \n1-разделить\n2-отнять\n3-умножить\n4-сложить\n5-закрыть калькулятор");
            inputText();
            if (input == 1) {
                divide();
            }
            if (input == 2) {
                diff();
            }
            if (input == 3) {
                multiply();
            }
            if (input == 4) {
                sum();
            }
            if (input == 5) {
                System.exit(0);
            }
        }
        }

        private static void divide () {
            inputDouble();
            c = a / b;
            System.out.println("При делении " + a + " на " + b + " получается число: " + c);
            //todo дописать логику и печать результата
        }

        private static void diff () {
            inputDouble();
            c = a - b;
            System.out.println("При вычитании " + a + " от " + b + " получается число: " + c);
            //todo дописать логику и печать результата
        }

        private static void multiply () {
            inputDouble();
            c = a * b;
            System.out.println("При умножении " + a + " на " + b + " получается число: " + c);
            //todo дописать логику и печать результата
        }

        private static void sum () {
            inputDouble();
            c = a + b;
            System.out.println("При сложении " + a + " на " + b + " получается число: " + c);
            //todo дописать логику и печать результата
        }

        private static void inputDouble () {
            System.out.println("Введите первое число: ");
            a = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.println("Введите второе число: ");
            b = Double.parseDouble(new Scanner(System.in).nextLine());
            //todo дописать логику

        }

        private static void inputText () {
            System.out.println("Введите ваш ответ: ");
            try {
                input = Integer.parseInt(new Scanner(System.in).nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: введено не число. Пожалуйста, введите число.");
            }
            }

}
