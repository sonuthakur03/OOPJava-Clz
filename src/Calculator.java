public class Calculator {
    public Calculator(){
        System.out.println("Calculator Object Creator");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(5,7);

        System.out.println("Result of addition: "+ result);
    }
}
