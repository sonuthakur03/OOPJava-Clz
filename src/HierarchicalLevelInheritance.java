class AnimalHIn{
    void sound(){
        System.out.println("Animal makes a sound.");
    }
}

class DogHIn extends AnimalHIn{
    void sound(){
        System.out.println("Dog barks.");
    }
}

class CatHIn extends AnimalHIn{
    void sound(){
        System.out.println("Cat meows.");
    }
}

public class HierarchicalLevelInheritance {
    public static void main(String[] args) {
        DogHIn dog = new DogHIn();
        CatHIn cat = new CatHIn();
        dog.sound(); // Outputs: Dog barks.
        cat.sound(); // Outputs: Cat meows.
    }
}
