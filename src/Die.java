//
//public class Die {
//
//	private final int MAX = 6; //max face value
//	private int faceValue; //current value
//	
//	public int roll(){
//		
//		faceValue = (int)(Math.random() * MAX) + 1;
//		
//		return faceValue;
//	}
//}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class Die extends JComponent
{
private static final long serialVersionUID = 1L;

//Variable for creating the die background
private Rectangle dieBorder;
private int number = Roll.die();
//Variable for creating the number of circles on die
private Ellipse2D numCircle;
private Ellipse2D numCircle2;
private Ellipse2D numCircle3;
private Ellipse2D numCircle4;
private Ellipse2D numCircle5;
private Ellipse2D numCircle6;
private Ellipse2D numCircle7;

      private int width = 50;
      private int height = 50;

/*
 * This constructs the DieComponent
 * with @param number. 
 */
public Die(int xPos, int yPos, int number1)
{
    number = number1;
    dieBorder = new Rectangle(xPos, yPos, width, height);

    numCircle = new Ellipse2D.Double(locationX(xPos, 2, 0), locationY(yPos, 2, 0), 8, 8);
    numCircle2 = new Ellipse2D.Double(locationX(xPos, 1, -7), locationY(yPos, 1, -7), 8, 8);
    numCircle3 = new Ellipse2D.Double(locationX(xPos, 1, -43), locationY(yPos, 1, -43), 8, 8);
    numCircle4 = new Ellipse2D.Double(locationX(xPos, 1, -7), locationY(yPos, 1, -43), 8, 8);
    numCircle5 = new Ellipse2D.Double(locationX(xPos, 1, -43), locationY(yPos, 1, -7), 8, 8);
    numCircle7 = new Ellipse2D.Double(locationX(xPos, 2, -18), locationY(yPos, 2, 0), 8, 8);
    numCircle6 = new Ellipse2D.Double(locationX(xPos, 2, 18), locationY(yPos, 2, 0), 8, 8);
}

/*
 * This will create the die graphics for 
 * the game. With @param g.
 */
public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;
    super.paintComponent(g2);

    //Sets color of field
    g2.setColor(Color.RED);
    //Draws the die background
    g2.draw(dieBorder);
    //Fills in the background
    g2.fill(dieBorder);

    if(number == 1)
    {
    //Sets color to draw the circle with
    g2.setColor(Color.WHITE);
    //Draws the circle
    g2.draw(numCircle);
    //Fills in the circle
    g2.fill(numCircle);
    }

    if(number == 2)
    {
        g2.setColor(Color.WHITE);
        g2.draw(numCircle2);
        g2.draw(numCircle3);
        g2.fill(numCircle3);
        g2.fill(numCircle2);
    }

    if(number == 3)
    {
        g2.setColor(Color.WHITE);
        g2.draw(numCircle2);
        g2.draw(numCircle3);
        g2.draw(numCircle);
        g2.fill(numCircle3);
        g2.fill(numCircle2);
        g2.fill(numCircle);
    }

    if(number == 4)
    {
        g2.setColor(Color.WHITE);
        g2.draw(numCircle2);
        g2.draw(numCircle3);
        g2.draw(numCircle4);
        g2.draw(numCircle5);
        g2.fill(numCircle3);
        g2.fill(numCircle2);
        g2.fill(numCircle4);
        g2.fill(numCircle5);

    }

    if(number == 5)
    {
        g2.setColor(Color.WHITE);
        g2.draw(numCircle);
        g2.draw(numCircle2);
        g2.draw(numCircle3);
        g2.draw(numCircle4);
        g2.draw(numCircle5);
        g2.fill(numCircle3);
        g2.fill(numCircle2);
        g2.fill(numCircle4);
        g2.fill(numCircle);
        g2.fill(numCircle5);
    }

    if(number == 6)
    {
        g2.setColor(Color.WHITE);
        g2.draw(numCircle2);
        g2.draw(numCircle3);
        g2.draw(numCircle4);
        g2.draw(numCircle5);
        g2.draw(numCircle6);
        g2.draw(numCircle7);
        g2.fill(numCircle3);
        g2.fill(numCircle2);
        g2.fill(numCircle4);
        g2.fill(numCircle5);
        g2.fill(numCircle6);
        g2.fill(numCircle7);
    }
}

public static int locationX(int xPos, int spot, int move)
{
    int xPosition = (xPos + 50 / spot) - 4 + move;

    //Returns the x position of where the circle should be
    return xPosition;
}

/*
 * This method will get the height of 
 * the border of the die and formulate where
 * to place the y position of the numCircle based
 * on value of die and uses spot to determine where
 * to draw circle.
 */
public static int locationY(int yPos, int spot, int move)
{
    //Formula to calculate position of circle
    int yPosition = (yPos + 50 / spot) - 4 + move;

    //Returns the y position of where circle should be
    return yPosition;
}


      public void roll()
      {
         number = Roll.die();
         repaint();
      }
      //This is where i think im messing up cuz it just replaces the first die
      public int getDie(){
    	  return number;
      }
}