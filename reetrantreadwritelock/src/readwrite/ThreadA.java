package readwrite;

import readread.Service;

public class ThreadA extends Thread {

    private readwrite.Service service;
    public ThreadA(readwrite.Service service) {
        super();
        this.service = service;
    }


    public void run() {
        service.read();
    }
}
