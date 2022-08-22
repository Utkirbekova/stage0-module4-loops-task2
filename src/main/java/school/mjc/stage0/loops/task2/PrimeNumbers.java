package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public  void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0 ) return;
        int n = 2;

        while (n <= printToInclusive) {
            int i = 2, count = 0;
            while (i <= n / 2) {
                if (n % i == 0) {
                    count++;
                    break;
                }
                i++;

            }
            if (count == 0) {
                System.out.println(n);            }
            n++;
        }
    }
}
