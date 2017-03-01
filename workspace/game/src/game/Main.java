package game;


	import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
	import java.awt.*;
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.RenderingHints;
	import java.awt.geom.Ellipse2D;
import java.io.IOException;

import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class Main {
	    public static void main(String [] args){

	         /*class screen extends JFrame{
	            private JLabel item1;
	            public screen(){
	                super("KEEEP THE BALLOON UUPPPPP");
	                setLayout(new FlowLayout());
	                item1 = new JLabel("TESTTTTTTT");
	                item1.setToolTipText("this is a major teest");
	                add(item1);
	            }
	        }*/
	        Main n = new Main();
	        try {
				new audioInputStream();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        graphics lol = new graphics();
	        lol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        lol.setSize(1920,1080);
	        lol.setLocationRelativeTo(null);
	        lol.setVisible(true);



	        //Main.screen lol = new Main.screen();
	       // lol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	    }
	}
