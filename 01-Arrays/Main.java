public class Main {
    public static void main(String[] args) {

        int [] arr = {2,7,4,3};
                // now we have set our logic in that , we have to calulate avg of array
        double sum = 0;

        // mow loop
        for(int i=0; i< arr.length; i++) {
            sum = sum + arr[i];
        }
        double size =arr.length;
        double avg = sum/size;

        System.out.print(avg);
    }

}