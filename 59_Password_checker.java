import java.util.Scanner;
class Password_checker {
    public static void main(String[] args) {
        System.out.println("Welcome to find password checker");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("Please enter your password:");
            password = input.next();

        } while(!isValidPassword(password));
        System.out.println("Thanks for entering password");

    }

    public static boolean isValidPassword(String password){
        return password.length() > 6 ;
    }

}
