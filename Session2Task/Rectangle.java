package Session2Task;

/*
Assignment of StaticChallenge.java ---------->

Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
public class Rectangle {
    double width;
    double height;
    static int numOfRectangles=0;
    public Rectangle(double width, double height){
        this.width = width;
        this.height= height;
        numOfRectangles++;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return 2*(this.width + this.height);
    }
    public static int getNumOfRectangles(){
        return numOfRectangles;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,5);
        Rectangle rect2 = new Rectangle(12,6);
        Rectangle rect3 = new Rectangle(8,5);
        Rectangle rect4 = new Rectangle(15,9);

        System.out.println("Area of Rectangle1 : "+rect1.getArea()+" and Perimeter : "+rect1.getPerimeter());
        System.out.println("Area of Rectangle2 : "+rect2.getArea()+" and Perimeter : "+rect2.getPerimeter());
        System.out.println("Area of Rectangle3 : "+rect3.getArea()+" and Perimeter : "+rect3.getPerimeter());
        System.out.println("Area of Rectangle4 : "+rect4.getArea()+" and Perimeter : "+rect4.getPerimeter());

        System.out.println("Number of Rectangles created : "+getNumOfRectangles());

    }

}
