import java.util.Scanner;

public class Second {
    /**
     * С помощью циклов нарисовать «обои».
     * Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
     * ***+++***+++***+++***
     * ***+++***+++***+++***
     * ***+++***+++***+++***
     * ***+++***+++***+++***
     * ***+++***+++***+++***
     **/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vert = 0;
        int horis = 5; // я вирішила додати можливість користувачу вибрати к-ть горизонтальних рядочків, так цікавіше )
        String result = "";
        String asterisk = "***";
        String plus = "+++";

        try {
            System.out.println("Введіть кількість вертикальних смуг");
            vert = s.nextInt();

            System.out.println("Введіть кількість горизонтальних смуг");
            horis = s.nextInt();
        } catch (java.util.InputMismatchException ime) {
            System.out.println("Невалідний символ");
            return;
        }

        for(int i = 1; i <= vert; i++){
            if (i % 2 == 1){
              result += asterisk;
            } else {
                result += plus;
            }
        }

        for (int j = 1; j <= horis; j++){
            System.out.println(result);
        }
        s.close();
    }
}
