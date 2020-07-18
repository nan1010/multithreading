package fairandunfair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private Lock lock;

    public Service(boolean isfair){
        super();
        lock = new ReentrantLock(isfair);
    }

    public void serviceMethod(){
        lock.lock();
        System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
        lock.unlock();
    }
}
