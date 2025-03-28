class AnimalSIn {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class DogSIn extends AnimalSIn{
    void sound(){
        super.sound();
        System.out.println("Dog Barks");
    }
}

public class SingleInheritance{
    public static void main(String[] args){
        DogSIn myDog = new DogSIn();
        myDog.sound();
    }
}