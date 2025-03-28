public class AbstractionEx {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone();
        samsung.update();
        samsung.call();
        samsung.shutdown();
    }
}

abstract class Phone{
    Phone(){
        System.out.println("Phone created");
    }
    void update(){
        System.out.println("Updating phone");
    }
    abstract void call();
    void shutdown(){
        System.out.println("Shutting down phone");
    }
}

class SamsungPhone extends Phone{
    void call(){
        System.out.println("Calling from samsung phone");
    }
}