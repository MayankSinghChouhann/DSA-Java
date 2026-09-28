public class sea {
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