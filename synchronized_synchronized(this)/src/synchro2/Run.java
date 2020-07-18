package synchro2;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread thread1 = new MyThread(task);
        MyThread thread2 = new MyThread(task);
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long beginTime;
        long endTime;
        if(thread1.beginTime < thread2.beginTime){
            beginTime = thread1.beginTime;
        }else {
            beginTime = thread2.beginTime;
        }

        if(thread1.endTime < thread2.endTime){
            endTime = thread2.endTime;
        }else{
            endTime = thread1.endTime;
        }

        System.out.println("耗时：" + (endTime - beginTime)/1000 + "s");
    }
}
