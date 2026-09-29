public class CountOnesAndZeros {
    public static void main(String[] args) {
        // Problem: Count the number of 1s (positives) and 0s (negatives/zeros) in an array
        // Logic: Iterate through the array. If the number is > 0, increment positive count, else increment negative/zero count.

        int[] arr = {0, 1, 0, 0, 1, 0, 1};

        int countpos = 0;
        int countneg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countpos = countpos + 1;
            } else {
                countneg++;
            }
        }
        
        System.out.println("Total positive (1s): " + countpos + ", Total negative/zero (0s): " + countneg);
    }
}
