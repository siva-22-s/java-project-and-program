package inter;

class Triangle {
    protected int side1;
    protected int side2;
    protected int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isTriangle() {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }
}

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(int side) {
        super(side, side, side);
    }

    @Override
    public boolean isTriangle() {
        return true; 
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(1, 1, 3);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);

        System.out.println("Triangle 1 is valid: " + triangle1.isTriangle());
        System.out.println("Triangle 2 is valid: " + triangle2.isTriangle());
        System.out.println("Equilateral triangle is valid: " + equilateralTriangle.isTriangle());
    }
}
