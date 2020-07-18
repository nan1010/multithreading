package ticket;

public class Station extends Thread{
    String name;
    Service service = new Service();

    public Station(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        service.buyA(name);
    }


}
