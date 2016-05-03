import java.awt.*;

import javax.swing.*;
 
public class challenge1 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        challenge1 canvas = new challenge1();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics)
    	{
    		graphics.setColor(Color.black);
    		graphics.drawLine(0, 0, 900, 900);
    		graphics.drawLine(0, 900, 900, 0);
    		
    		graphics.setColor(Color.red);
    		graphics.drawRect(0, 0, 800, 100);
    		graphics.fillRect(0, 0, 800, 100);
    		
    		graphics.setColor(Color.blue);
    		graphics.drawRect(5, 5, 230, 210);
    		
    		graphics.setColor(Color.blue);
    		graphics.drawRect(800, 800, 200, 200);
    		graphics.setColor(Color.yellow);
    		graphics.fillRect(801, 801, 198, 198);
    		
    		graphics.setColor(Color.green);
    		graphics.fillOval(200, 200, 600, 600);
    		graphics.setColor(Color.orange);
    		graphics.fillRect(350, 350, 100, 100);
    		graphics.fillRect(550, 350, 100, 100);
    		graphics.setColor(Color.pink);
    		graphics.fillOval(350, 500, 300, 150);
    	}
    	
	}

