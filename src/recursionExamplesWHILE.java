public class recursionExamplesWHILE {
    public static void main(String[] args) {
        int n = 100; // calculate sum of even and odd numbers between 1 and n

        int sumEven = sumEvenWithWhile(n, 0, 1);
        int sumOdd = sumOddWithWhile(n, 0, 1);
        int sumDivisibleBySeven = sumDivisibleBySevenWithWhile(n, 0, 1);

        System.out.println("Sum of even numbers between 1 and " + n + ": " + sumEven);
        System.out.println("Sum of odd numbers between 1 and " + n + ": " + sumOdd);
        System.out.println("Sum of numbers divisible by 7 between 1 and " + n + ": " + sumDivisibleBySeven);

    }

    public static int sumEvenWithWhile(int n, int sum, int i) {
        if (i > n) {
            return sum;
        }

        if (i % 2 == 0) {
            sum += i;
        }

        return sumEvenWithWhile(n, sum, i + 1);
    }

    public static int sumOddWithWhile(int n, int sum, int i) {
        if (i > n) {
            return sum;
        }

        if (i % 2 != 0) {
            sum += i;
        }

        return sumOddWithWhile(n, sum, i + 1);
    }

    public static int sumDivisibleBySevenWithWhile(int n, int sum, int i) {
        if (i > n) {
            return sum;
        }

        if (i % 7 == 0) {
            sum += i;
        }

        return sumDivisibleBySevenWithWhile(n, sum, i + 1);
    }

}
