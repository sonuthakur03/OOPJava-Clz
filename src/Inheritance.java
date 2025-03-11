class AnimalIn {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends AnimalIn{
    void sound(){
        super.sound();
        System.out.println("Dog Barks");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog2 myDog = new Dog2();
        myDog.sound();
    }
}