package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new CinemaAdapter();
        cinema.buyTicket();
    }
}
