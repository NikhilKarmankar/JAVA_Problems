import java.util.Scanner;
class Exit_on_exit {
    public static void main(String[] args) {
        System.out.println("Welcome to exit to exit");
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your command:");
            String  command = input.next();
            if(command.equals("exit")){
                break;
            }

        }
        System.out.println("you have successfully exited. ");
    }
}
