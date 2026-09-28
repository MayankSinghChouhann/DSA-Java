// Question: Multiply each element of the array by 10 and print the new array.
// Logic: Create a new array of the same length as the original array. Iterate through the original array, multiply each element by 10, store it in the new array, and print the updated value.

public class MultiplyByTen {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6};
        double[] newarr = new double[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i] * 10;
            System.out.print(newarr[i] + " ");
        }
    }
}
