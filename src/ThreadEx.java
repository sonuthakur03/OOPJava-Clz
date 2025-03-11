class ThreadA extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++ ){
            System.out.println("Running " + i +" From Class A");
        }
        System.out.println("Exit from Class A");
    }
}
class ThreadB extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++ ){
            System.out.println("Running " + i +" From Class B");
        }
        System.out.println("Exit from Class B");
    }
}
class ThreadC extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++ ){
            System.out.println("Running " + i +" From Class C");
        }
        System.out.println("Exit from Class C");
    }
}


public class ThreadEx {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadC threadC = new ThreadC();

        threadA.start();
        threadB.start();
        threadC.start();
    }
}