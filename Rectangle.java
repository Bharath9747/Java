package Shape;

import Shape.Shapes;

public class Rectangle implements Shapes
{
    private int l;
    private int h;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return this.l*this.h;
    }
}