public class Person {
    final String name;
    final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Alice", 25);
        person1.displayInfo();
        person2.displayInfo();
    }
}
