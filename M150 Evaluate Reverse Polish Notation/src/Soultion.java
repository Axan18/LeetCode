import java.util.Stack;

class Solution {
    private Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(String token: tokens)
        {
            try{
                stack.push(Integer.parseInt(token));
            }catch (NumberFormatException e )
            {
                switch (token)
                {
                    case "+": {
                        stack.push(stack.pop() + stack.pop());
                        break;
                    }
                    case "-": {
                        int temp = stack.pop();
                        stack.push(stack.pop() - temp);
                        break;
                    }
                    case "*": {
                        stack.push(stack.pop() * stack.pop());
                        break;
                    }
                    case "/": {
                        int temp = stack.pop();
                        stack.push(stack.pop() / temp);
                        break;
                    }
                }
            }
        }
        return stack.pop();
    }
}