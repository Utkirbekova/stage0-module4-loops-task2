package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        printFactorialRow(7);
    }
    public static void printFactorialRow(int printToInclusive) {
        int n = 1;
        int c = 0;
        while (true) {
            System.out.println(n);
            c++;
            n *= c;
            if (c == printToInclusive+1 ) return;
        }
    }
}
