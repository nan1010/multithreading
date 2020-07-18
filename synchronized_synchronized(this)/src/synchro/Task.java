package synchro;

public class Task {
    private String getData1;
    private String getData2;
    synchronized public void doLongTimeTask(){
        try {
            System.out.println("begin task!");
            Thread.sleep(3000);
            getData1 = "ThreadName" + Thread.currentThread().getName();
            getData2 = "ThreadName" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
