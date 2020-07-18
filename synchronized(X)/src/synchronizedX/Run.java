package synchronizedX;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread1 = new MyThread(service);
        MyThread myThread2 = new MyThread(service);
        myThread1.start();
        myThread2.start();
    }
}
