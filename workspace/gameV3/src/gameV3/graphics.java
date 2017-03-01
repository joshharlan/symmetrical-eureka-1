package gameV3;

import java.awt.Component;

/**
 * Created by 226784 on 1/27/2017.
 */

import java.awt.FlowLayout;
import javax.swing.*;


public class graphics extends JFrame {


	private JLabel label;
    private JLabel item1;
    private JLabel imageJLabel;
    private JLabel icon;
    private JLabel imageLabel1;
    public graphics() {
        /*super("KEEEP THE BALLOON UUPPPPP");
        setLayout(new FlowLayout());

        item1 = new JLabel("TESTTTTTTT");
        item1.setToolTipText("this is a major teest");
        add(item1);
        
        ImageIcon winIcon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        this.setIconImage(winIcon.getImage());
		add(icon); 

		ImageIcon balloon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        JLabel imageLabel1 = new JLabel(balloon);
        imageLabel1.setBounds(100,100,32,32);
        imageLabel1.setVisible(true);
 
      
            add(imageLabel1);*/


        super("Keep the Balloon Up! :D");
        setLayout(new FlowLayout());
        label = new JLabel("DONT LET THE BALLOON FALL!");
        label.setToolTipText("this is a major teest");
        ImageIcon winIcon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        this.setIconImage(winIcon.getImage());
        add(label); 
       





    }
}