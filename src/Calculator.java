import java.util.Scanner;

public class Calculator {
    public Calculator(){
        System.out.println("Calculator Object Creator");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) {
        if(num2 == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double)num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation: \n1.Add \n2.Sub \n3.Mul \n4.Div \n");
        int choice = sc.nextInt();
        System.out.println("enter number1");
        int num1 = sc.nextInt();
        System.out.println("enter number2");
        int num2 = sc.nextInt();
        int result = 0;

        switch (choice){
            case 1:
                result = calc.add(num1, num2);
                break;

            case 2:
                result = calc.subtract(num1, num2);
                break;

            case 3:
                result = calc.multiply(num1, num2);
                break;

            case 4:
                result = (int)calc.divide(num1, num2);
                break;

            default:
                System.out.println("Error!");
        }

        System.out.println("Result of operation: "+ result);
    }
}
