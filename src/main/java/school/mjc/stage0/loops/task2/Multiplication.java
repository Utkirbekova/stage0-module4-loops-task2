package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int n = 0;
        while (n <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
            System.out.println(n);
            n += 5;
        }
    }
}
