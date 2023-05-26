package assignment1_2;

public class ForLoops {
    public static void main(String[] args) {

        int sum7 = 0,sumEven = 0,sumOdd =0;

        for (int i = 0; i <= 100; i++) {
            /* to check for the sum of numbers divided by 7 without interfering in the if clause
            you can just add another if on stand alone */
            if (i%7==0) {
                sum7 +=i;
            }
            if (i%2==0) {
                sumEven +=i;
            } else {
                sumOdd +=i;
               }
            }
        System.out.println("Sum of numbers divisible by 7 from 0 to 100 = " + sum7);
        System.out.println("Sum of even numbers from 0 to 100 = " + sumEven);
        System.out.println("Sum of odd numbers from 0 to 100 = " + sumOdd);


    }
}
