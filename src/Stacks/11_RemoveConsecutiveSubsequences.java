package Stacks;

import java.util.Stack;

class RemoveConsecutiveSubsequences {
    public static int[] remove (int[] arr){
        int n = arr.length;
        Stack<Integer>St = new Stack<>();
        for(int i=0;i<n;i++){
            if(St.size()==0|| St.peek()!=arr[i]){
                St.push(arr[i]);
            }else if(arr[i]==St.peek()){
                if(i==n-1||arr[i]!=arr[i+1]){
                    St.pop();
                }
            }

        }
        int []res = new int[St.size()];
        int m = res.length;
        for(int i = m-1;i>=0;i--){
            res[i]= St.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,4,6,8,2,4,8,8};
        int[] res = remove(arr);
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }


    }
}
