package Behavioral.Strategy;

public class CombineContext {
    private CombineStrategy combineStrategy;

    public CombineContext(CombineStrategy combineStrategy) {
        this.combineStrategy = combineStrategy;
    }

    public void setCombineStrategy(CombineStrategy combineStrategy) {
        this.combineStrategy = combineStrategy;
    }

    public int performCombine(int[] array) {
        return combineStrategy.combine(array);
    }
}