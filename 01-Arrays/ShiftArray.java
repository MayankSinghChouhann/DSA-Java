public class ShiftArray {
    public static void main(String[] args) {

        int[] arr = {7, 8, 1, 2, 4, 10};

        //  Last value ko save ka
        int temp = arr[arr.length - 1];

        // Sabb elements ko 1 position right shift karo
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Purani last value ko starting me rakho
        arr[0] = temp;

        //  Print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}