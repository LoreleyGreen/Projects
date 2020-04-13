import java.util.Scanner;

public class Third {
    /**
     * Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
     * Факториал числа это произведение всех чисел от этого числа до 1.
     * Например 5!=5*4*3*2*1=120
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long num = 0;

        try {
            System.out.println("Введіть число в межах від 5 до 15");
            num = s.nextLong();
        } catch (java.util.InputMismatchException ime) {
            System.out.println("Невалідний символ");
            return;
        }


        if (num < 5 || num > 15) {
            System.out.println("Введене число знаходиться за рамками вводу");
            return;
        }
        for (long i = num - 1; i > 0; i--) {
            num *= i;
        }
        System.out.println("Факторіал введеного числа: " + num);
        s.close();
    }
}
