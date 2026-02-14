import java.util.Scanner;
class Month_of_year {
    public static void main(String[] args) {
        System.out.println("Welcome to find  month of the Year");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number you want to find:");
        int num = input.nextInt();
        newSwitch(num);

    }

    public static void newSwitch(int Month) {
        String monthStr = switch(Month) {
            case 1 -> "January" ;
            case 2 -> "Febuary" ;
            case 3 -> "March" ;
            case 4  -> "April" ;
            case 5 -> "May" ;
            case 6 -> "June" ;
            case 7 -> "July" ;
            case 8 -> "August" ;
            case 9 -> "September" ;
            case 10 -> "October" ;
            case 11 -> "November" ;
            case 12 -> "December" ;
            default -> "invalid";

        };
        System.out.println(monthStr);
    }
}
