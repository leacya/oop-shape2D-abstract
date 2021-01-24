package dkit.sd2;
/**
 * Demonstrates Abstract class
 * Contains an abstract method that MUST be implemented by subclasses
 * (Ref. p434 Big Java)
 */


import java.util.ArrayList;

public class App
{

    public static void main(String[] args)
    {
        App theApp = new App();
        theApp.start();
    }

    private void start()
    {
        System.out.println("\ndemoInheritanceAndPolymorphism - notice that the correct overridden version of toString is called...");
        demoInheritanceAndPolymorphism();

        System.out.println("\ndemoPolymorphismAndStorage - notice that a storage structure like an ArrayList can store multiple types as long as a common parent (superclass) exists...");
        demoPolymorphismAndStorage();
    }

    private void demoInheritanceAndPolymorphism()
    {
        Circle c1 = new Circle(10, 10, 1);
        System.out.println(c1);
        System.out.println("area:" + c1.getArea() + "\n");

//   A supertype reference can be used to store a reference to a subtype object.
//
//   Here, shape1 is a supertype (type Shape) and it is assigned
//   a reference to a Circle subtype, and a Recatangle subtype

        Shape shape1;

// ERROR: An abstract class can NOT be instantiated (try it!)
//        shape1 = new Shape(5, 5);

        shape1 = new Circle(20, 20, 5);
        System.out.println(shape1);

// the call below to shape1.getArea() demonstrates polymorphism, as
// even though the reference type is Shape, the getArea() method
// for a Cirle is called (because the object is a Circle)

        System.out.println("area:" + shape1.getArea() + "\n");

        shape1 = new Rectangle(10, 10, 20, 30);
        System.out.print(shape1 + "  ");
        System.out.println("area:" + shape1.getArea());
    }

    /**
     * This method uses an ArrayList of Shape type objects
     * (actually, an ArrayList of references to objects of type Shape).
     * Notice that the ArrayList can store objects that are subtypes
     * of Shape.
     */
    private void demoPolymorphismAndStorage()
    {
        ArrayList<Shape> list = new ArrayList<>();

        //add some object references
        list.add(new Circle(10, 10, 1));
        list.add(new Rectangle(20, 20, 5, 20));
        list.add(new Circle(15, 60, 1));

        //print and see that the correct toString is called
        print(list);

        //get the total area and see that the correct getArea method is called for each shape in the list
        double sumArea = getSumArea(list);
        System.out.println("\nTotal area:" + sumArea);

    }

    public void print(ArrayList<Shape> list)
    {
        for (Shape shape : list)
        {
            System.out.println(shape);  // relying on toString() of each class
        }
    }

    public double getSumArea(ArrayList<Shape> list)
    {
        double sum = 0;

        for (Shape shape : list)
        {
            sum += shape.getArea();     // polymorphism in action - see below ***
        }

        return sum;
    }

    // *** polymorphism ***
    // the correct getArea() method for the object type is called each time
    // (declared type Vs dynamic type of a variable)

}
