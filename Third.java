import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = s.nextInt();
        System.out.println(checkNum(a));

    }
    public static boolean checkNum (int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}
