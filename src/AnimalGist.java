// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }


}

// Subclass: Dog
class Dog extends Animal {
    void sound() {

        System.out.println("Dog barks");
    }

    void fetchBall() { // Unique method for Dog
        System.out.println("Dog fetches the ball!");
    }

}

// Subclass: Cat
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    void scratchFurniture() { // Unique method for Cat
        System.out.println("Cat scratches the furniture!");
    }
}

// Main class to demonstrate both approaches
public class AnimalGist {
    public static void main(String[] args) {

        // ✅ Using Animal reference (POLYMORPHISM)
        Animal myAnimal1 = new Dog();  // Animal reference pointing to Dog
        Animal myAnimal2 = new Cat();  // Animal reference pointing to Cat

        myAnimal1.sound(); // Calls Dog's sound() → "Dog barks"
        myAnimal2.sound(); // Calls Cat's sound() → "Cat meows"


        // ❌ The following will NOT work because the reference type is Animal
        // myAnimal1.fetchBall();  ERROR!
        // myAnimal2.scratchFurniture();  ERROR!

        System.out.println("-----------------------------");

        // ❌ Using Specific Class Reference (NO POLYMORPHISM)
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.sound();  // Calls Dog's sound() → "Dog barks"
        myCat.sound();  // Calls Cat's sound() → "Cat meows"


        // ✅ Now we can call class-specific methods
        myDog.fetchBall();  // "Dog fetches the ball!"
        myCat.scratchFurniture();  // "Cat scratches the furniture!"

    }
}