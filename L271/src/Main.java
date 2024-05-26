import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list.add("dupa");
        list.add("sraka");
        list.add("ppp");
        String s = solution.encode(list);
        System.out.println(solution.decode(s));
    }
}
