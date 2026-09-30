public class Reverseanarray {
    public static void main(String[] args) {

        int[] arr = {12, 3, 60, 10, 8};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i]; // 2 ko yaha bachaya
            arr[i] = arr[j];   // 8 ko left me dala
            arr[j] = temp;     // 2 ko right me dala
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}