public class cnoze {
    public static void main(String[] args) {

        int[] arr = {0,1,0,0,1,0,1};

        int countpos = 0;
        int countneg = 0;

        for(int i=0; i< arr.length; i++ ) {
            if ( arr[i] > 0) {
                countpos = countpos + 1;
            } else {
                countneg++;

            }
        } System.out.print("Total number is postive and negative : " + countpos  + " " + countneg );


    }
}