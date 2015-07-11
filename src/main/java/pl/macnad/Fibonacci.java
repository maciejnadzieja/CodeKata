package pl.macnad;

public class Fibonacci {
    public static long get(int index) {
        if (index < 0) {
            throw new UnsupportedOperationException();
        }
        if (index == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i < index; i++) {
            int tmp = a;
            a = b;
            b += tmp;
        }
        return a+b;
    }

    public static final void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d => %d%n", i, Fibonacci.get(i));
        }
    }
}
