package Behavioral.Observer;

public class Television implements Observer {
    @Override
    public void update(Button state) {
        switch(state) {
            case POWER_ON:
                System.out.println("TV power on");
                break;
            case POWER_OFF:
                System.out.println("TV power off");
                break;
            default:
                break;
        }
    }
}
