import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    even(Number());
    }
    public static void even(int Number){
        if (Number % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static int Number(){
        System.out.println("Введите целое число: ");
        return new Scanner(System.in).nextInt();
    }
}
