import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomNumberList {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = generateRandomList(20);
        System.out.println("List of 20 random numbers:");
        System.out.println("numberList = " + numberList);
        int maxNumber = findMax(numberList);
        int minNumber = findMin(numberList);
        System.out.println("Max number in the list: " + maxNumber);
        System.out.println("Min number in the list: " + minNumber);

        int[] intArray = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            intArray[i] = numberList.get(i);
        }

        int[] sortedArray = sortArray(intArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        double average = calculateAverage(intArray);
        System.out.println("Average of array values: " + average);
    }

    public static ArrayList<Integer> generateRandomList(int size) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = rand.nextInt(100);
            numberList.add(randomNumber);
        }

        return numberList;
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
