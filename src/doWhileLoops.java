public class doWhileLoops {
    public static void main(String[] args) {
        int i = 1;
        int sumEven = 0;
        int sumOdd = 0;
        int sum7 = 0;

        do {
            if (i % 2 == 0) { // even
                sumEven += i;
            } else { // odd
                sumOdd += i;
            }

            if (i % 7 == 0) { // divisible by 7
                sum7 += i;
            }

            i++;
        } while (i <= 100);

        System.out.println("Sum of even numbers between 1 and 100: " + sumEven);
        System.out.println("Sum of odd numbers between 1 and 100: " + sumOdd);
        System.out.println("Sum of numbers divisible by 7 between 1 and 100: " + sum7);
    }
}
