public class rsnp {
    public static void main(String[] args) {
        int[] arr = {3,-2, 1,-1,8};
                int postive = 0;
        int negtive = 0;


                // now we have to run
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > 0) {
                postive = arr[i] + postive;
            } else {
                negtive = arr[i] + negtive;

            }
        } System.out.println(" total numbers is " + postive + negtive);
    }
}