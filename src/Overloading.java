public class Overloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static String add(String a, String b) {
        return a + " " + b;
    }
    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 3.2));
        System.out.println(add("Hello", "World"));
    }
}
