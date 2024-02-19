import java.awt.*;

// define the class
class Circle {
    // attributes or instance variables, default values of 0, and 0.0
    private Point center;
    private double radius;
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    double getArea (){
        return Math.PI * radius * radius;
    }
    void setRadius (double newRadius){
        radius = newRadius;
    }
    void setCenter(Point newCenter){
        center = newCenter;
    }
}