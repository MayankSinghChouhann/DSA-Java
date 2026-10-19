import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
    static int firstUnique(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for (char c : s.toCharArray()) m.merge(c, 1, Integer::sum);
        for (int i = 0; i < s.length(); i++)
            if (m.get(s.charAt(i)) == 1) return i;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUnique("leetcode"));
    }
}
// Returns -1 when every character repeats.