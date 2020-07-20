package callback;

import java.util.concurrent.TimeUnit;

public class RoomMate {
    public void getAnswer(String homework, Dohomework someone){
        if("1 + 1 = ?".equals(homework)){
            someone.doHomework(homework, "2");
        }else if ("当x趋向于0，sin(x)/x =?".equals(homework)){
            System.out.println("思考：");
            for (int i = 1; i < 4; i++) {
                System.out.print(i + "秒");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            someone.doHomework(homework, "1");
        }else {
            someone.doHomework(homework,null);
        }
    }
}
