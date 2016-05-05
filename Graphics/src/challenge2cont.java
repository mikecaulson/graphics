import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class challenge2cont extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    		challenge2cont canvas = new challenge2cont();
	        JFrame frame = new JFrame();
	        frame.setSize(800, 800);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics)
    	{
    		int one = 0;
    		int two = -100;
    		
    		for (int i = 0;i<9;i++)
    			{
    				
    				for (int j=0;j<8;j++)
    					{
    						if (i%2==0)
    								{
    									if (j%2==0)
    										{
    								graphics.setColor(Color.gray);
    										}
    									else if (j%2==1)
    										{
    								graphics.setColor(Color.black);
    										}
    									two = two +100;
    									graphics.fillRect(two, one, 100, 100);
    							}
    						else if (i%2==1)
								{
									if (j%2==0)
										{
								graphics.setColor(Color.gray);
										}
									else if (j%2==1)
										{
								graphics.setColor(Color.black);
										}
									two = two +100;
									graphics.fillRect(two, one, 100, 100);
							}
    					}
    				one = one +100;
    			}
    	}
	}