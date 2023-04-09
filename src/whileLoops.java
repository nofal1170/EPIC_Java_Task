public class whileLoops {
    public static void main(String[] args) {
        int i = 1, sumEven = 0 ,sumOdd = 0 ,sum7 = 0;

        while (i <= 100) {
            if (i % 2 == 0) { // even
                sumEven += i;
            } else { // odd
                sumOdd += i;
            }

            if (i % 7 == 0) { // divisible by 7
                sum7 += i;
            }

            i++;
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sumEven);
        System.out.println("Sum of odd numbers between 1 and 100: " + sumOdd);
        System.out.println("Sum of numbers divisible by 7 between 1 and 100: " + sum7);
    }
}
