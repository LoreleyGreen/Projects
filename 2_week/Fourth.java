public class Fourth {
    // Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
    public static void main(String[] args) {

        int [] arr =  {0,5,2,4,7,1,3,19};
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
            odd += 1;
            }
        }
        System.out.println("Кількість непарних чисел в масиві: " + odd);
    }
}
