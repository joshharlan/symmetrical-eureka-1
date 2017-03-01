package gameV2;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JLabel;


public class graphics extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel item1;
    public graphics() {
        super("KEEEP THE BALLOON UUPPPPP");
        setLayout(new FlowLayout());

        item1 = new JLabel("TESTTTTTTT");
        item1.setToolTipText("this is a major teest");
        add(item1);


            ImageIcon image = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\head.png");
            JLabel imageLabel = new JLabel(image);
            imageLabel.setBounds(10, 10, 400, 400);
            imageLabel.setVisible(true);

            add(imageLabel);








    }
}
