// Question: Calculate the average of all elements in an array.
// Logic: Initialize a sum variable to 0. Iterate through the array and add each element to the sum. Finally, divide the sum by the length of the array to get the average.

public class CalculateAverage {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 3};
        
        // now we have set our logic in that, we have to calculate avg of array
        double sum = 0;

        // now loop
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        double size = arr.length;
        double avg = sum / size;

        System.out.print(avg);
    }
}