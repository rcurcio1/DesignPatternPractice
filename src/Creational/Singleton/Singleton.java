package Creational.Singleton;

public class Singleton {
    public  String s;

    private static Singleton singleton_instance = null;

    private Singleton() {
        s = "Singleton initialized";
    }

    public static Singleton getInstance() {
        if (singleton_instance == null) {
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }
}
