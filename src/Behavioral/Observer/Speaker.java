package Behavioral.Observer;

public class Speaker implements Observer {
    @Override
    public void update(Button state) {
        switch(state) {
            case POWER_ON:
                System.out.println("Speaker turns on");
                break;
            case POWER_OFF:
                System.out.println("Speaker turns off");
                break;
            case VOLUME_DOWN:
                System.out.println("Speaker volume down");
                break;
            case VOLUME_UP:
                System.out.println("Speaker volume up");
                break;
            default:
                break;
        }
    }
}
