package synchro;

public class MyThread extends Thread{
    private Task task;
    long beginTime;
    long endTime;

    public MyThread(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        beginTime = System.currentTimeMillis();
        task.doLongTimeTask();
        endTime = System.currentTimeMillis();
    }
}
