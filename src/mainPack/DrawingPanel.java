/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mainPack;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Dastyruck
 */
public class DrawingPanel extends JPanel
{

    public boolean drawing;
    public int range;
    public int angle;
    public double dUp;
    public int time;
    double vr;
    public int xPos;
    public int yPos;
    public double currTime;
    public boolean first;

    Graphics g = this.getGraphics();
    public DrawingPanel()
    {
        setBackground(Color.BLACK);
        this.setVisible(true);
        first = true;
    }

    public void draww(int armL, int mass, int angle, int r)
    {
        
        range = r;
        this.angle = angle;
        vr = (0.85*Math.sqrt((2*armL/mass)*((-8/9)*angle+285)));
        double vy = vr*Math.sin(angle * Math.PI / 180);
        dUp = Math.pow(vy, 2) / (2 * 9.8);
        time = (int) (2 * (vr * Math.sin(angle * Math.PI / 180)) / (9.8));
        first=true;
        drawing = true;
        repaint();
        
    }

    public void paint(Graphics window)
    {
        window.setColor(Color.black);
        window.fillRect(0, 0, 407, 317);
        window.setColor(Color.green);

        if(drawing)
        {
            for(double x = 0;x<time;x+=.1)
            {
                xPos = (int) (vr * Math.cos(angle * Math.PI / 180) * x);
                yPos = (int) ((vr * Math.sin(angle * Math.PI / 180) * x) - (.5 * 9.8 * Math.pow(x, 2)));
                window.drawOval(xPos-3, 317-yPos-3, 6, 6);
            }
        }

    }


}
