package Figures;

public class Circle extends Ellipse {
    public Circle (int x, int y, int r1) {
        super(x, y, r1, r1);
        if(r1 <= 0)
            throw new RuntimeException("Radius is negative or zero.");
    }
}
