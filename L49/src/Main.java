import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"stop","pots","reed","","tops","deer","opts",""}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());

    }
    private static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int x : count) {
            if (x != 0) return false;
        }
        return true;
    }
}
