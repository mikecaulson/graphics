import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class challenge2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        challenge2 canvas = new challenge2();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics)
    	{
    		Scanner userInput = new Scanner(System.in);
    		System.out.println("How large would you like the square to be, within a 500 by 500 frame?");
    		System.out.println("Enter width now:");
    		int width = userInput.nextInt();
    		System.out.println("Enter heigth now:");
    		int heigth = userInput.nextInt();
    		int R=250;
    		int G =0;
    		int B= 0;
    		Color randomcolor = new Color(R,G,B);
    		graphics.setColor(randomcolor);
    		System.out.println("Would you like it to be Red or Blue?");
    		System.out.println("(1) red");
    		System.out.println("(2) blue");
    		int color = userInput.nextInt();
    		if (color==1)
    			{
    				graphics.setColor(randomcolor);
    			}
    		else if (color==2)
    			{
    				graphics.setColor(Color.blue);
    			}
    		
    		graphics.fillRect(0, 0, width, heigth);
    	}
	}
