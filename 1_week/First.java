
public class First {
   public static void main(String[] args) {
     int a = -32;
     int b = 0;
     int c = -62;

       if ((a > b) && (a > c)) {
           System.out.println("Max value: " + a);
       }
       else if ((b > a) && (b > c))  {
           System.out.println("Max value: " + b);
       } else {
           System.out.println("Max value:" + c);
       }
   }
}


