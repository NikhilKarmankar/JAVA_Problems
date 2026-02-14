import java.util.Scanner;
class guessing_Game {
    int random;
    guessing_Game(){
        random = (int) Math.ceil(Math.random()*100);
    }
    int guess(int guessNumber){
        return guessNumber-random;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessing_Game game = new guessing_Game();
        System.out.println("Welcome  to the guessing game .Guess the number ");
        int guess;
        int result;
        do{
            System.out.println("Guess the number");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("congrats ");
            }else if (result < 0){
                System.out.println("please guess higher ");

            }else{
                System.out.println("please guess lower");
            }
        }while(result!= 0);
    }


}
