package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length*breadth; // write code to calculate area here
    }

       public int getperimeter(){
        return (length+breadth)*2 ; } // write code to calculate perimeter here
                                     // getPerimeter()

}