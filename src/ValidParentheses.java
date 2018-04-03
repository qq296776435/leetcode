import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> parentheses = Arrays.asList('{','}','[',']','(',')');
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if (parentheses.indexOf(s.charAt(i))!=-1) {
                if (stack.isEmpty()|| s.charAt(i)==stack.peek()||parentheses.indexOf(s.charAt(i))/2!=parentheses.indexOf(stack.peek())/2) {
                    stack.push(s.charAt(i));
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
