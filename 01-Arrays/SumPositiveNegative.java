public class SumPositiveNegative {
    public static void main(String[] args) {
        // Problem: Find the sum of all positive numbers and the sum of all negative numbers in an array
        // Logic: Iterate through the array. If the number is > 0, add it to the positive sum, else add it to the negative sum.

        int[] arr = {3, -2, 1, -1, 8};
        
        int positiveSum = 0;
        int negativeSum = 0;

        // Traverse the array to calculate sums
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveSum = arr[i] + positiveSum;
            } else {
                negativeSum = arr[i] + negativeSum;
            }
        }
        
        System.out.println("Total sum of positives: " + positiveSum + ", Total sum of negatives: " + negativeSum);
    }
}
