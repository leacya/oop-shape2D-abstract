package dkit.sd2;

/**
 * Represents a circle and extends Shape.
 * Note that the getArea() method inherited from Shape
 MUST be implemented, because it was declared as abstract in
 Shape (the superclass).
 */

public  class Circle extends Shape
{

    private int radius;

    public Circle(int x, int y, int radius)
    {
        super(x, y); //calls the superclass constructor
        this.radius = radius;
    }

    /**
     * Implement the inherited abstract getArea() method
     * (this must be implemented, otherwise an error is reported)
     * @return area of a circle
     */
    @Override
    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        //calls superclass toString method first
        return super.toString() + "[radius=" + this.radius + "]";
    }

}
