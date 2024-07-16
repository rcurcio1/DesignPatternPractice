package Behavioral.Strategy;

public class AddStrategy implements CombineStrategy {

    @Override
    public int combine(int[] array) {
        int total = 0;
        for (int i: array) {
            total += i;
        }
        return total;
    }
}
