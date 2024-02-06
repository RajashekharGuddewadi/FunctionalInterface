//class Myrunnable implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("child Thread");
//        }
//    }
//}

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread with Lambda");
            }
        };

        Thread t =new Thread(r1);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
