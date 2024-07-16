package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        CombineContext combineContext = new CombineContext(new AddStrategy());
        int[] array1 = {1,2,3,4,5};
        System.out.println(combineContext.performCombine(array1));

        combineContext.setCombineStrategy(new MultiplyStrategy());
        int[] array2 = {3,4,5};
        System.out.println(combineContext.performCombine(array2));
    }
}
