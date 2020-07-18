package condition;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadB.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signalAll_A();
        myService.signalAll_B();
    }
}
