import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    static int longest(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int start = 0, best = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c) && last.get(c) >= start) start = last.get(c) + 1;
            last.put(c, i);
            best = Math.max(best, i - start + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest("abcabcbb"));
    }
}