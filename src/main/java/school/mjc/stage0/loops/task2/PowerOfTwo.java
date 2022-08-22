package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(16);
    }

    public static void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int n = 1;
            int c = 1;

            while (true) {
                c++;
                String s = String.valueOf(n);
                System.out.println(s);
                n = n * 2;

                if (power == c - 2) {
                    break;
                }
            }
        }
    }
}
