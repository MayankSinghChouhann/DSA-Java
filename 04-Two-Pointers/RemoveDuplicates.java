public class RemoveDuplicates {
    static int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < a.length; i++)
            if (a[i] != a[k - 1]) a[k++] = a[i];
        return k;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(a));
    }
}