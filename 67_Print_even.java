class Print_even {
    public static void main(String[] args) {
        System.out.println("welcome to print the even number:");
        for(int i = 1 ; i <= 100; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
