package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        Subject remote = new Remote();
        remote.addObserver(new Speaker());
        remote.addObserver(new Television());
        remote.pressButton(Button.POWER_ON);
        remote.pressButton(Button.VOLUME_UP);
        remote.pressButton(Button.VOLUME_DOWN);
        remote.pressButton(Button.POWER_OFF);
    }
}
