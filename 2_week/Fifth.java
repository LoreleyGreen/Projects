import java.util.Scanner;
import java.util.Random;

public class Fifth {
    /**
     * Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры)
     * заполнените элементы произвольными числами. Выведите этот массив на экран.
     */

    public static Random random = new Random();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = 0;
        try{
            System.out.println("Введіть розмір масиву: ");
            x = s.nextInt();
        } catch (java.util.InputMismatchException ime) {
            System.out.println("Невалідний символ");
            return;
        }

        int [] arr = new int [x];
        for (int i =0; i < arr.length; i++) {
//            arr[i] = random.nextInt(1000); Можна виставити обмеження від 0 до мах інта
            arr[i] = random.nextInt();

            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
