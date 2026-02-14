package Stacks;

import java.util.Scanner;
import java.util.Stack;

class Min_Bracket_balance {
    public static int count(String Str){
        Stack<Character>st = new Stack<>();
        int n = Str.length();

        for(int i =0;i<n;i++){
            char ch = Str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch ==')'){
                if(!st.isEmpty() && st.peek() =='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }

            return st.size();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine()
                ;
        int result = count(Str);
        System.out.println("Minimum number of brackets to balanced:" + result);

    }
}
