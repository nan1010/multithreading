package synchronizedX;
//尝试将任意对象作为对象监视器
public class Service {
    private String usernameParam;
    private String passwordParam;
    //private String anything = new String();

    public void setUsernamePassword(String username,String password) {
        try {
            String anything = new String();
            synchronized (anything) {
                System.out.println(Thread.currentThread().getName()+
                        "在"+System.currentTimeMillis()+"进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println(Thread.currentThread().getName()+
                        "在"+System.currentTimeMillis()+"离开同步块");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
