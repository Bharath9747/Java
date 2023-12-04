package Shape;

import Shape.Shapes;

public class Circle implements Shapes {
    private int r;
    Circle(int r){
        this.r=r;
    }
    @Override
    public double area() {
        return 3.14f*this.r*this.r;
    }
}