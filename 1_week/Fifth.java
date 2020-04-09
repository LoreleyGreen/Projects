import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Fifth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double aSide = 0;
        double bSide = 0;
        double cSide = 0;

        while (true){
            System.out.println("Введіть значення строни а");
            aSide = s.nextDouble();
            System.out.println("Введіть значення строни b");
            bSide = s.nextDouble();
            System.out.println("Введіть значення строни с");
            cSide = s.nextDouble();
            if (aSide <= 0 || bSide <= 0 || cSide <= 0) {
                System.out.println("Введене значення не валідне");
            } else {
                break;
            }
        }
        System.out.println("Площа трикутника: " + area(aSide, bSide, cSide));
    }
    public static double hPer(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public static double area(double a, double b, double c) {
        double hPer = hPer(a, b, c);
        return Math.round(sqrt(hPer*(hPer -a)*(hPer - b)*(hPer - c)));
    }
}
