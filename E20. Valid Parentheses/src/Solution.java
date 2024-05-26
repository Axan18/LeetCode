import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("){"));
    }

    public boolean isValid(String s)
    {
        if(s.length()%2==1) return false;
        char[] parentheses = s.toCharArray();
        Set<Character> openers = new HashSet<>();
        Set<Character> closers = new HashSet<>();
        openers.add('(');
        openers.add('{');
        openers.add('[');
        closers.add(')');
        closers.add('}');
        closers.add(']');
        Stack<Character> openings = new Stack<>();
        HashMap<Character,Character> pairs = new HashMap<>();
        pairs.put('{','}');
        pairs.put('(',')');
        pairs.put('[',']');
        for(char bracket: parentheses)
        {
            if(openers.contains(bracket))
            {
                openings.add(bracket);
            } else if (closers.contains(bracket)) {
                if(!openings.isEmpty()) {
                    if (!pairs.get(openings.peek()).equals(bracket)) return false;
                    openings.pop();
                }
                else return false;
            }
        }
        return openings.isEmpty();
    }
}
