package RPS_Project;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.imageio.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;

public class image extends JPanel{
	
public static void main(String[] args) {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	BufferedImage img = null;
	try {
	    img = ImageIO.read(new File("/home/jadenwalker/Desktop/level1-module3-jadenfw-master/rock.jpg"));
	} catch (IOException e) {
	}
	  JButton button = new JButton();
	    button.setBorderPainted(false);
	    button.setFocusPainted(false);
	    button.setContentAreaFilled(false);
	    
	   // panel.add(img);
	    frame.add(panel);
	    frame.pack();
	    frame.setVisible(true);
}
	   
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	  private BufferedImage image;
//
//	    public image() {
//	       try {                
//	          image = ImageIO.read(new File("rock.jpg"));
//	       } catch (IOException ex) {
//	            // handle exception...
//	       }
//	    }
//
//	    protected void paintComponent(Graphics g) {
//	        super.paintComponent(g);
//	        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
//	    }
//  }
//
////BufferedImage bf = new BufferedImage();
////JFrame jf = new JFrame();
////JPanel jp = new JPanel();
////JLabel jl = new JLabel(bf);
////jp.add(bf);
////jp.add(jl);
////jf.add(jp);
////jf.pack();
////jf.setVisible(true);