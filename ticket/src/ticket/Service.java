package ticket;

import static java.lang.Thread.sleep;

public class Service {

    Ticket ticketA = new Ticket();
    static Object ob = "aa";//值是任意的
    public void setTicketA(){
        ticketA.setNumber(20);
    }

    static int ticketID = 0;
    //问题：三个线程读到同一个值，其中一个线程对此值进行改变但是其他两个线程已经读了不会改变怎么办？
    public void buyA(String name){
        while(ticketID < 20){
            synchronized (this){
                if(ticketID < 20){
                    System.out.println(name + "购买一张A电影票，序号为：" + ticketID++);
                }

            }

            /*try {
                sleep(1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        if(ticketID >= 20){
            System.out.println(name + "A电影票已经卖完");
        }
    }

}

