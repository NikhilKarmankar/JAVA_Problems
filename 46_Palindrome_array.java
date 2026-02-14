import java.util.concurrent.ThreadPoolExecutor;

class Palindrome_array {
     public static void main(String[] args) {
         System.out.println("Welcome to palindrome Checker\n");
         int[] numArr = Array_utility.inputArray();
         boolean  isPalin = isPalindrome(numArr);
         if(isPalin) {
             System.out.println("Your array is palindrome");

         }else{
             System.out.println("your Array is not palindrome");
         }
     }

     public static boolean isPalindrome(int[] numArr){
         int i = 0 ;
         while(i < numArr.length/2){
             if(numArr[i]!= numArr[numArr.length-1 -i]){
                 return false ;
             }
             i++;
         }

             return true ;

     }
}
