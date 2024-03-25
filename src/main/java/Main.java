import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int maxPath(String s) {
        int maxPath = 0;
        int currentPath = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c)) {
                currentPath = Math.max(currentPath, i - charIndexMap.get(c));
            }
            charIndexMap.put(c, i);
            maxPath = Math.max(maxPath, currentPath);
        }
        return maxPath == 0 ? -1 : maxPath;
    }

    public static void main(String[] args) {
        String s = "abcadeaj";
        int maxPath = maxPath(s);
        System.out.println(maxPath);
    }
}
