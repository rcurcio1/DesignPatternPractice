package Structural.Adapter;

public class CinemaAdapter implements Cinema {
    private OldCinema oldCinema;

    public CinemaAdapter() {
        this.oldCinema = new OldCinema("Wayne Theatre");
    }

    @Override
    public void buyTicket() {
        this.oldCinema.oldBuyTicket();
    }
}
