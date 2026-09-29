public class unsorted {
    public static void main (String[]args) {
        int[] arr = {10,9,8,6,1,12};

        for(int i=0; i< arr.length-1; i++){
            if (arr[i] < arr[1+i]) {
                System.out.print("The sorted number is : " + arr[i+1]);
                break;
            }
        }

    }
}