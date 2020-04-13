import java.util.Random;

public class Sixth {
    /**
     * Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза больше,
     * первые 15 элементов должны быть равны элементам первого массива, а остальные элементы заполнить
     * удвоенных значением начальных.
     * Например Было → {1,4,7,2}
     * Стало → {1,4,7,2,2,8,14,4}
     */
    public static Random random = new Random();

    public static void main(String[] args) {

        int [] arr = new int [15];
        int [] arr2 = new int [30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            for (int j = 0; j < arr2.length; j++){
                if (j < 15) {
                    arr2[j] = arr[j];
                } else {
                    arr2[j] = arr[j - 15] * 2;
                }
                System.out.print(arr2[j] + " ");
            }
        }
    }
