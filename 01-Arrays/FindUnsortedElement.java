public class FindUnsortedElement {
    public static void main(String[] args) {
        // Problem: Find the first element in a descending array that breaks the sorted order (first ascending step).
        // Logic: Iterate through the array and compare adjacent elements. Print the next element if it is greater than the current one.

        int[] arr = {10, 9, 8, 6, 1, 12};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("The first element breaking descending order is: " + arr[i + 1]);
                break;
            }
        }
    }
}
