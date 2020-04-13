import java.util.Scanner;

public class Seventh {
    /**
     *7.Введите строку текста с клавиатуры — реализуйте программу для
     * возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";

        System.out.println("Введіть стрічку тексту:");

        str = s.nextLine();
        int nums = 0;
        char b = 'b';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b'){
                nums++;
            }
        }
        System.out.println("Кількість символів у стрічці: " + nums);
        s.close();
    }
}
