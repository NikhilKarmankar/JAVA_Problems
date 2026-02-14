package Stacks;

import java.util.Scanner;
import java.util.Stack;

class UserInputInStacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer>St = new Stack<>();

        int n;
        System.out.println("Enter the number of elements you want to put:");
        n= input.nextInt();

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            int x = input.nextInt();
            St.push(x);
        }
        System.out.println(St);

        System.out.println("Enter the number of elements you want to pop:");
        int y = input.nextInt();
        if(y > St.size()){
            System.out.println("Number is greater than size of stack:");
        }else{
            for(int i=0;i<y;i++){
                St.pop();
            }
            System.out.println("Stack after poping " + y + " Elements");
        }
        System.out.println(St);
    }

}
