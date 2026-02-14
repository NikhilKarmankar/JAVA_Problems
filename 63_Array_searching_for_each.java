
class Array_searching_for_each {
    public static void main(String[] args) {
        System.out.println("Welcome to find maximum number in array:");
        int[] arr = Array_utility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num){
                max = num;
            }
        }
        System.out.println("maximum number is " + max);
    }
}
