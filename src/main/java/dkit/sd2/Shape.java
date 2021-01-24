package dkit.sd2;

// Abstract class
// - if a class defines one or more abstract methods then
//   the class must be declared as abstract (as in this example)
// - an abstract class can NOT be instantiated (i.e. it is not
//   possible to create an object of the class using 'new ClassName()'
// - subclasses MUST implement all abstract methods e.g. getArea()
//   (the compiler will indicate an error if a subclass does not
//   implement a method that has beeen declared as 'abstract'
//   (So,writers of subclasses are forced to implement all
//
// - the reason for including an abstract method is to force programmers
//   writing subclasses to implement the functionality of the abstract method.
//   It is something that the designer of the superclass thinks that all
//   subclasses should implement.

public abstract class Shape
{

    private int x, y; //centre

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Abstract method that must be implemented by all
     * subclasses that extend this class.
     * Declaring the method as 'abstract' will force classes that inherit
     * from this class to implement the method.
     *
     * @return area of the shape
     * (see Rectangle::getArea() and Circle::getArea() for implementations)
     */
    public abstract double getArea();   // no body allowed

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public String toString()
    {
        return this.getClass().getSimpleName() +
                "[x=" + this.x + ",y=" + this.y + "]";
    }
}

