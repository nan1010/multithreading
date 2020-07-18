package ticket;

public class Run {
    public static void main(String[] args) {

        Service service = new Service();
        service.setTicketA();
        Station station1 = new Station("窗口1");
        Station station2 = new Station("窗口2");
        Station station3 = new Station("窗口3");

        station1.start();
        station2.start();
        station3.start();
    }
}
