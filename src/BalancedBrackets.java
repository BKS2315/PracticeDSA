import java.util.Stack;

public class BalancedBrackets {

}
class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.


     */

    public static Character invC(Character c){
        if(c==')'){
            return '(';
        }else if(c=='}'){
            return '{';
        }else{
            return '[';
        }
    }

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> stk = new Stack<Character>();

        for(int i=0 ; i<s.length(); i++){
            Character c = s.charAt(i);

            if(c=='('||c=='{'||c=='['){
                stk.push(c);
            }else{
                if(stk.size()==0){
                    return "NO";
                }else{
                    Character ch=invC(c);
                    if(stk.peek()==ch){
                        stk.pop();
                    }else{
                        return "NO";
                    }

                }

            }

        }
        if(stk.empty()){
            return "YES";
        }else{
            return "NO";
        }

    }

}