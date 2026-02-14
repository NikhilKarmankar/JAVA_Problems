import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle( double radiusInMm){
        this.radiusInMm = radiusInMm;
    }
    double getCircumference(){
        return  2 * radiusInMm * Math.PI;

    }

    double getArea(){
        return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radiusInMm=").append(radiusInMm);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Circle ");
        double radius =  input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);


    }
}
