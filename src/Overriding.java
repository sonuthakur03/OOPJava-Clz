class Game{
    void noOfPlayers(){
        System.out.println(15);
    }
}

class Cricket extends Game{
    void noOfPlayers(){
        System.out.println(11);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.noOfPlayers(); // Output: 11
    }
}
