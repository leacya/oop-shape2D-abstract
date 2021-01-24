package dkit.sd2;
/**
 * Represents a rectangle and extends Shape.
 * Note that the getArea() method inherited from Shape
 MUST be implemented, because it was declared as abstract in
 Shape (the superclass).
 *
 *
 */
public class Rectangle extends Shape
{

    private int width, height;

    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);	//calls the superclass constructor
        this.width = width;
        this.height = height;
    }

    /**
     * Implement the inherited abstract getArea() method.
     * (This method must be implemented or compiler error is
     * generated)
     */
    @Override
    public double getArea()
    {
        return this.width * this.height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        //calls superclass toString method first
        return super.toString()
                + "[width=" + this.width
                + ",height=" + this.height + "]";
    }
}

