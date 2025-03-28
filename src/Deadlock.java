public class Deadlock {
    public static void main(String[] args) {
        MyThread obj = new MyThread();

        new Thread(){
            public void run(){
                obj.MethodA();
            }
        }.start();

        new Thread(){
            public void run(){
                obj.MethodB();
            }
        }.start();
    }
}

class MyThread{
    String resource1 = "BCA";
    String resource2 = "Third Semester";

    void MethodA(){
        synchronized (resource1){
            System.out.println("Thread 1: Locked resource 1 methodA");
        }

        try {Thread.sleep(1000);} catch (Exception e) {}

        synchronized (resource2){
            System.out.println("Thread 1: Locked resource 2 methodA");
        }
    }

    void MethodB(){
        synchronized (resource2){
            System.out.println("Thread 2: Locked resource 2 methodB");
        }

        try {Thread.sleep(1000);} catch (Exception e) {}

        synchronized (resource1){
            System.out.println("Thread 2: Locked resource 1 methodB");
        }
    }
}