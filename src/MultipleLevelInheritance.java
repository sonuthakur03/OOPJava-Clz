class AnimalMIn{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class DogMIn extends AnimalMIn{
    void sound(){
        System.out.println("Dog barks");
    }
}

class BabyDogMIn extends DogMIn{
    void sound(){
        System.out.println("Baby dog weeps");
    }
}

public class MultipleLevelInheritance {
    public static void main(String[] args) {
        DogMIn dog = new DogMIn();
        BabyDogMIn babydog = new BabyDogMIn();
        dog.sound(); // Output: Dog barks
        babydog.sound(); // Output: Baby dog weeps
    }
}
