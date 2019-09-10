
/**
 * Write a description of class benzene here.
 *
 * @author (Lucy Gao)
 * @version (1.0)
 */
import apcslib.*;
public class benzene
{    
    public static void main()
    {
        // declare and initialize
        DrawingTool pen = new DrawingTool();
        SketchPad paper = new SketchPad(300,300);
        int x;
        
        //positioning
        pen.up();
        pen.forward(100);
        pen.turnLeft(90);
        pen.forward(100);
        pen.turnRight(180);
        pen.down();
        
        // draw outer hexagon
        for (x = 0; x <= 5; x++)
        {
        pen.forward(100);
        pen.turnRight(60);
        }
        
        // draw inner circle
        pen.up();
        pen.move(-50,15);
        pen.down();
        pen.drawCircle(60);
    }
}
