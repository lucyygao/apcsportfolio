
/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class rectangle
{
    /**
     * Constructor for objects of class rectangle
     */
    
    private double myX; // the x coordinate of the rectangle 
    private double myY; // the y coordinate of the rectangle 
    private double myWidth; // the width of the rectangle 
    private double myHeight; // the height of the rectangle
      
    // Creates a 500 x 500 SketchPad with a DrawingTool, pen, that is used
    // to display Rectangle objects. The Drawingtool is declared static
    // so that multiple Rectangle objects can be drawn on the Sketchpad
    // at the same time.
    private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        // put your code here
    }
    
    // calculates and returns the perimeter of the rectangle 
    public double getPerimeter()
    {
        double perimeter = 0;
        return perimeter;
    }
    // Calculates and returns the are of the rectangle. 
    public double getArea()
    {
        double area = 0;
        return area;
    }
    // Draws a new instance of a Rectangle object with the left and right 
    // edges of the rectangle at x and x + width. The top and bottom edges
    // are at y and y + height.
    public void draw()
    {
    }
}
