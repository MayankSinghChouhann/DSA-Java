// Question: Find the maximum element in an array.
// Logic: Initialize a variable 'max' with the first element of the array. Iterate through the array starting from the first element. If any element is greater than 'max', update 'max' with that element.

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4};
        double max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(" Max value is : " + max );
    }
}