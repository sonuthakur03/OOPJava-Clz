class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog Barks");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.sound();
    }
}