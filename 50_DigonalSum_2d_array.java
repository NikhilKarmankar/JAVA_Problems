class DigonalSum_2d_array {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal sum");
        int [][] numArr = Array_utility.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("sum of diagonals is : " + sum);

    }
    public static long sumOfDiagonals(int[][] numArr){
        long leftSum = sumOfLeftDiagonals(numArr);
        long rightsum = sumOfRightDiagonals(numArr);
        long sum = leftSum + rightsum;
        if (numArr.length % 2 != 0){
            int ind = numArr.length/2;
            sum -= numArr[ind][ind];

        }
        return sum;
    }

    public static long sumOfLeftDiagonals(int[][] numArr){
        long sum =0;
        int i = 0;
        while (i < numArr.length){
            int col = numArr.length -1-i;
            i++;
        }


        return sum;
    }
    public static long sumOfRightDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
        }
        return sum;
    }
}
