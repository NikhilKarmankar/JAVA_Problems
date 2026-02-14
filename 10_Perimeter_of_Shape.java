import java.util.Scanner;
class Perimeter_of_Shape {
    static void main(String[] args) {
        System.out.println("We are finding perimeter of rectangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sides of a shape in cms:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println("the Perimeter of Shape " + ( a+b+c+d )+ "cms");
    }
}
