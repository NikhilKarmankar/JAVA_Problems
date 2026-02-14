package Stacks;

import java.util.Scanner;

class NextGreaterElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = {1,3,5,6,2,8,5,9,3};
        int []res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }

            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
