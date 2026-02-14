class Dice_roll {

    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        Dice_roll dice = new Dice_roll();
        for(int i =0; i<10;i++){
            System.out.println(dice.roll());
        }


    }
}
