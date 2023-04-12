public class RecursionTask {
    public static void main(String[] args) {
        /* from 0 to 100 sum odd numbers */
        System.out.println("Sum of odd numbers: " + sumNumber(0, 100, 1));

        /* from 0 to 100 sum even numbers */
        System.out.println("Sum of even numbers: " + sumNumber(0, 100, 2));

        /* from 0 to 100 sum multiples of seven */
        System.out.println("Sum of multiples of 7: " + sumNumber(0, 100, 7));
    }
    public static int sumNumber(int n, int e, int t) {
        if (t == 1) {                 // for odd
            int sum = 0;
            if (n % 2 != 0) {
                sum = n;
            }
            return n >= e ? sum : sum + sumNumber(n + 1, e, 1);
        } else if (t == 2) {          // for even
            int sum = 0;
            if (n % 2 == 0) {
                sum = n;
            }
            return n >= e ? sum : sum + sumNumber(n + 1, e, 2);
        } else if (t == 7) {          // for multiples of seven
            int sum = 0;
            if (n % 7 == 0) {
                sum = n;
            }
            return n >= e ? sum : sum + sumNumber(n + 1, e, 7);
        } else {                      // for invalid input
            return 0;
        }
    }


}

