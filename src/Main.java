import java.awt.*;

public class Main {
    public static void main(String []args){
        Circle c1 = new Circle();
        c1.setRadius(3);
        c1.setCenter(new Point(1,2));
        
        System.out.println("Area = " + c1.getArea());
        System.out.println("Area = " + c1.getPerimeter());
    }
}
