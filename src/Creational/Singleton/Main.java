package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s1.hashCode() == s2.hashCode() && s2.hashCode() == s3.hashCode()) {
            System.out.println("S1, S2, and S3 all have the same hashcode and therefore point to the same object.");
        }
    }
}
