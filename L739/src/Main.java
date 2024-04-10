import java.util.Stack;

public class Main {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stos = new Stack<>();
        stos.push(0);
        for(int i=1;i<temperatures.length;i++)
        {
            int currentElement = temperatures[i];
            while (!stos.empty() && currentElement > temperatures[stos.peek()])
            {
                int index = stos.pop();
                temperatures[index] = i - index;
            }
            stos.push(i);
        }
        while(!stos.empty())
        {
            temperatures[stos.pop()]=0;
        }
        return temperatures;
    }
}
