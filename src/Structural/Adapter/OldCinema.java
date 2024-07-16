package Structural.Adapter;

public class OldCinema {

    private String name;

    public OldCinema(String name) {
        this.name = name;
    }

    public void oldBuyTicket() {
        System.out.println("Ticket bought from " + this.name + "!");
    }
}