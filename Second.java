public class Second {
    public static void main(String[] args) {
        String first = "5";
        String second = "а";
       try {
           System.out.println(sum(first, second));
       } catch (NumberFormatException nfe) {
           System.out.println("Invalid argument");
       }

    }
   public static String sum(String x, String z) {
        int i = Integer.parseInt(x);
        int v = Integer.parseInt(z);
        return Integer.toString(i + v) ;
    }


}
