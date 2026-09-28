public class findmax {
    public static void main(String[] args) {
        int[] arr = {7,2,3,4};
                double max = arr[0];

        for (int i =0; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.print(" Max value is : " + max );
    }
}