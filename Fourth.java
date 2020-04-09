
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fSide = 0;
        double sSide = 0;
        double angle = 0;

        try {
            while (true) {
                System.out.println("Введіть значення першої сторони fSide");
                fSide = s.nextDouble();
                System.out.println("Введіть значення другої сторони sSide");
                sSide = s.nextDouble();
                System.out.println("Введіть значення кута між сторонами в градусах");
                angle = s.nextDouble();

                if (fSide <= 0 || sSide <= 0 || angle <= 0) {
                    System.out.println("Введене значення не валідне");
                } else {
                    break;
                }
            }
            System.out.println("Площа паралелограма: " + area(fSide, sSide, angle));
        } catch(java.util.InputMismatchException imx){
            System.out.println("Invalid argument");
        }

    }
    public static double area(double a, double b, double c) {
        double rad = Math.toRadians(c);

        return Math.round(a*b*Math.sin(rad));
    }

}
