package readwrite;

public class ThreadB extends Thread {

    private readwrite.Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    public void run() {
        service.write();
    }
}
