package game;

import java.awt.FlowLayout;
import javax.swing.*;

public class graphics extends JFrame {

	private JLabel label;
    public graphics(){
        super("Keep the Balloon Up! :D");
        setLayout(new FlowLayout());
        label = new JLabel("DONT LET THE BALLOON FALL!");
        label.setToolTipText("this is a major teest");
        ImageIcon winIcon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        this.setIconImage(winIcon.getImage());
        add(label); 
       
        //label.setText("Keep the Balloon Up!");
        	
        ImageIcon wallpaper = new ImageIcon("C:\\Users\\227385\\Pictures\\charcoal.png");
        JLabel imageLabel = new JLabel(wallpaper);
        imageLabel.setBounds(100,100,32,32);
        imageLabel.setVisible(true);
        
    
        //trying to put the hand in the picture
        ImageIcon hand = new ImageIcon("C:\\Users\\227385\\Pictures\\kkonA.png");
        JLabel imageLabel2 = new JLabel(hand);
        imageLabel2.setBounds(955,540,225,225);
        imageLabel2.setVisible(true);
        
        ImageIcon balloon = new ImageIcon("C:\\Users\\227385\\Pictures\\whyzay\\dogekappa10.png");
        JLabel imageLabel1 = new JLabel(balloon);
        imageLabel1.setBounds(100,100,32,32);
        imageLabel1.setVisible(true);
        

        add(imageLabel);
        add(imageLabel2);
        add(imageLabel1);


    }


}