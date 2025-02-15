import java.util.Scanner;

class PositiveNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do{
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();
        }while(number <=0);

        System.out.println("Thank You! You have entered a positive number: " + number);
    }
}