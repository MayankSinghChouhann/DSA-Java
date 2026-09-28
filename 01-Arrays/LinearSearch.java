// Question: Search for a specific element in an array (Linear Search). Return true if found, false otherwise.
// Logic: Iterate through the array and compare each element with the target value 'n'. If a match is found, set a boolean flag 'found' to true and break out of the loop. Finally, print the boolean flag.

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}