package gameV3;

/**
 * Created by 226784 on 1/31/2017.
 */


//import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.geom.*;
import java.security.Key;


//http://valk.id.au/blog/awesome/how-to-run-java-applets-in-intellij-idea/

/**
 * Created by 226784 on 1/27/2017.
 */

// ADD jpanels to jframe

public class Move extends JPanel implements ActionListener, KeyListener {

        private Image hand;
        private Image background;



            Timer t = new Timer(5,this);
            int x=0,y=0, velx=0, vely=0;

            public Move(){
              
            	
            	background = new ImageIcon("C:\\Users\\227385\\Pictures\\charcoal.fw.png").getImage();
         
                hand = new ImageIcon("C:\\Users\\227385\\Pictures\\kkonA.fw.png").getImage();
                
                t.start();
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
            }

            public void paintComponent(Graphics g){

                    super.paintComponent(g);
                    g.drawImage(background,100,100,this);
                    g.drawImage(hand, x, y, this);
                 


            }


            public void actionPerformed(ActionEvent e){
                if (x < 0 || x > 1720){
                    velx = -velx;
                }
                if (y < 0 || y > 780){
                    vely = -vely;
                }
                repaint();
                x += velx;
                y += vely;
            }
            public void up(){
                vely = -2;
                velx = 0;
            }
            public void down(){
                vely = 2;
                velx = 0;
            }
            public void left(){
                velx = -2;
                vely = 0;
            }
            public void right(){
                velx = 2;
                vely = 0;
            }

            public void keyPressed(KeyEvent e){
                int code = e.getKeyCode();

                if(code == KeyEvent.VK_UP){
                    up();
                }
                if(code == KeyEvent.VK_DOWN){
                    down();
                }
                if(code == KeyEvent.VK_RIGHT){
                    right();
                }
                if(code == KeyEvent.VK_LEFT){
                    left();


                }
            }
            public void keyTyped(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}

        }