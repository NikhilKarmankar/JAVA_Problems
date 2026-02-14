import java.util.Scanner;
class Triangle_Area {
    static void main(String[] args) {
        System.out.println("Welcome to find area of triangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the side of the triangle in cms:");
        System.out.println("please enter your base in cms:");
        double base = input.nextDouble();
        System.out.println("now please enter your perpendicular height in cms: ");
        double height = input.nextDouble ();

        double area = 0.5 * base * height ;
        System.out.println("The area of triangle is "+ area + " cms");


    }
}
