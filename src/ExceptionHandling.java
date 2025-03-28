public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int dividend = 10;
            int divisor = 0;
            int quotient = dividend / divisor;
        }catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
    }
}
