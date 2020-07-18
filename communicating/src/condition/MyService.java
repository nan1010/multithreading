package condition;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();

    public void awaitA(){
        lock.lock();
        System.out.println("begin awaitA 的时间为：" + System.currentTimeMillis() + "ThreadName:" + Thread.currentThread().getName());
        try {
            conditionA.await();
            System.out.println("end awaitA时间为："+System.currentTimeMillis()
                    +"ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        lock.lock();
        System.out.println("begin awatB 的时间为：" + System.currentTimeMillis() + "ThreadName:" + Thread.currentThread().getName());
        try {
            conditionB.await();
            System.out.println("end awaitB时间为："+System.currentTimeMillis()
                    +"ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        lock.lock();
        System.out.println("signalAll_A的时间为：" + System.currentTimeMillis() + "ThreadName:" + Thread.currentThread().getName());
        conditionA.signalAll();
        lock.unlock();
    }

    public void signalAll_B(){
        lock.lock();
        System.out.println("signalAll_B的时间为：" + System.currentTimeMillis() + "ThreadName:" + Thread.currentThread().getName());
        conditionB.signalAll();
        lock.unlock();
    }
}
