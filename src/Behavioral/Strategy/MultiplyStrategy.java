package Behavioral.Strategy;

public class MultiplyStrategy implements CombineStrategy {
    @Override
    public int combine(int[] array) {
        int total = 1;
        for (int i: array) {
            total *= i;
        }
        return total;
    }
}
