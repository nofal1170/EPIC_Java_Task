public class recursionExampleFOR {

    public static void main(String[] args) {
        int n = 100;

        int sumEven = sumEvenWithFor(n, 0);
        int sumOdd = sumOddWithFor(n, 0);
        int sumDivisibleBySeven = sumDivisibleBySevenWithFor(n, 0);

        System.out.println("Sum of even numbers between 1 and " + n + ": " + sumEven);
        System.out.println("Sum of odd numbers between 1 and " + n + ": " + sumOdd);
        System.out.println("Sum of numbers divisible by 7 between 1 and " + n + ": " + sumDivisibleBySeven);

    }

    public static int sumEvenWithFor(int n, int sum) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sumOddWithFor(int n, int sum) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sumDivisibleBySevenWithFor(int n, int sum) {
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
