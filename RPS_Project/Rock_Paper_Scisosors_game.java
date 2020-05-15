package RPS_Project;

import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Rock_Paper_Scisosors_game implements ActionListener {

    JFrame jf = new JFrame();

    JPanel jp = new JPanel();
    JButton jb1 = new JButton();
    JButton jb2 = new JButton();
    JButton jb3 = new JButton();
    JButton jb4 = new JButton();
    JButton jb5 = new JButton();
    JLabel jl1 = new JLabel();
    JLabel jl2 = new JLabel();

    ImageIcon rock = null;
    ImageIcon paper = null;
    ImageIcon scissors = null;
    ImageIcon rockhand = null;
    ImageIcon paperhand = null;
    ImageIcon scissorshand = null;

    int win = 0;
    int loss = 0;
    int tie = 0;

    public void run() {

        try {
            rock = new ImageIcon( ImageIO.read( getClass().getResource( "rock2.jpeg" ) ) );
            paper = new ImageIcon( ImageIO.read( getClass().getResource( "paper2.jpg" ) ) );
            scissors = new ImageIcon( ImageIO.read( getClass().getResource( "scissors2.png" ) ) );

            Image image = rock.getImage();
            Image newimg = image.getScaledInstance( 116, 100, java.awt.Image.SCALE_SMOOTH );
            rock = new ImageIcon( newimg );

            image = paper.getImage();
            newimg = image.getScaledInstance( 116, 100, java.awt.Image.SCALE_SMOOTH );
            paper = new ImageIcon( newimg );

            image = scissors.getImage();
            newimg = image.getScaledInstance( 116, 100, java.awt.Image.SCALE_SMOOTH );
            scissors = new ImageIcon( newimg );

            rockhand = new ImageIcon( ImageIO.read( getClass().getResource( "rockhand.jpg" ) ) );
            paperhand = new ImageIcon( ImageIO.read( getClass().getResource( "paperhand.jpg" ) ) );
            scissorshand = new ImageIcon( ImageIO.read( getClass().getResource( "scissorshand.jpg" ) ) );

            image = rockhand.getImage();
            newimg = image.getScaledInstance( 80, 80, java.awt.Image.SCALE_SMOOTH );
            rockhand = new ImageIcon( newimg );

            image = paperhand.getImage();
            newimg = image.getScaledInstance( 80, 80, java.awt.Image.SCALE_SMOOTH );
            paperhand = new ImageIcon( newimg );

            image = scissorshand.getImage();
            newimg = image.getScaledInstance( 80, 80, java.awt.Image.SCALE_SMOOTH );
            scissorshand = new ImageIcon( newimg );

        } catch( IOException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        jf.setPreferredSize( new Dimension( 350, 350 ) );
        jb1.setPreferredSize( new Dimension( 100, 100 ) );
        jb2.setPreferredSize( new Dimension( 100, 100 ) );
        jb3.setPreferredSize( new Dimension( 100, 100 ) );
        jb4.setPreferredSize( new Dimension( 250, 50 ) );
        jb5.setPreferredSize( new Dimension( 250, 50 ) );
        jl1.setPreferredSize( new Dimension( 80, 80 ) );
        jl2.setPreferredSize( new Dimension( 80, 80 ) );

        jb1.addActionListener( this );
        jb2.addActionListener( this );
        jb3.addActionListener( this );

        jb1.setHorizontalTextPosition( JButton.CENTER );
        jb1.setVerticalTextPosition( JButton.CENTER );
        jb2.setHorizontalTextPosition( JButton.CENTER );
        jb2.setVerticalTextPosition( JButton.CENTER );
        jb3.setHorizontalTextPosition( JButton.CENTER );
        jb3.setVerticalTextPosition( JButton.CENTER );

        jb1.setIcon( rock );
        jb2.setIcon( paper );
        jb3.setIcon( scissors );
        jb1.setText( "Rock" );
        jb2.setText( "Paper" );
        jb3.setText( "Scissors" );
        jf.setTitle( "Pick one" );
        jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
        jp.setSize( 310, 310 );

        Color bg = Color.white;
        Color blue = Color.BLUE;

        jb1.setFont( new Font( "Arial", Font.PLAIN, 17 ) );
        jb1.setForeground( blue );
        jb2.setFont( new Font( "Arial", Font.PLAIN, 17 ) );
        jb2.setForeground( blue );
        jb3.setFont( new Font( "Arial", Font.PLAIN, 17 ) );
        jb3.setForeground( blue );

        jf.add( jp );
        jp.add( jb1 );
        jp.add( jb2 );
        jp.add( jb3 );
        jp.add( jl1 );
        jp.add( jl2 );
        jp.add( jb4 );
        jp.add( jb5 );
        jf.setVisible( true );

        jb4.setBackground( bg );
        jb5.setBackground( bg );
        jl1.setBackground( bg );
        jl2.setBackground( bg );
        jf.pack();

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        JButton buttonPressed = (JButton)arg0.getSource();
        int r = new Random().nextInt( 3 );

        Color red = Color.red;
        Color yellow = Color.yellow;
        Color green = Color.green;
       
        if( buttonPressed.equals( jb1 ) ) {
            if( r == 1 ) {
                jl1.setIcon( rockhand );
                jl2.setIcon( rockhand );
                jl1.setVisible( false );
                jl2.setVisible( false );
                jl1.setVisible( true );
                jl2.setVisible( true );

                jl1.repaint();
                jl2.repaint();

                // The value of 2000 represents the number of milliseconds to delay
                Timer t = new Timer(2000, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        jb4.setText( "Rock vs. Rock: Tie!" );
                        jb4.setBackground( yellow );
                        tie++;
                        jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
                    }
                });
                
                t.setRepeats( false );
                t.start();
            }

            else if( r == 2 ) {
                jl1.setIcon( rockhand );
                jl2.setIcon( paperhand );
                jl1.setVisible( false );
                jl2.setVisible( false );
                jl1.setVisible( true );
                jl2.setVisible( true );

                jl1.repaint();
                jl2.repaint();

                // The value of 2000 represents the number of milliseconds to delay
                Timer t = new Timer(2000, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        jb4.setText( "Rock vs. Paper: Loss!" );
                        jb4.setBackground( red );
                        loss++;
                        jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
                    }
                });
                
                t.setRepeats( false );
                t.start();
            }

            else {
                jl1.setIcon( rockhand );
                jl2.setIcon( scissorshand );

                jl1.repaint();
                jl2.repaint();

                // The value of 2000 represents the number of milliseconds to delay
                Timer t = new Timer(2000, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        jb4.setText( "Rock vs. Scissors: Win!" );
                        jb4.setBackground( green );
                        win++;
                        jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
                    }
                });
                
                t.setRepeats( false );
                t.start();
            }
        } else if( buttonPressed.equals( jb2 ) ) {
            if( r == 1 ) {
                jb4.setText( "Paper vs. Rock: Win!" );
                jb4.setBackground( green );
                win++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            } else if( r == 2 ) {
                jb4.setText( "Paper vs. Paper: Tie!" );
                jb4.setBackground( yellow );
                tie++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            } else {
                jb4.setText( "Paper vs. Scissors: Loose!" );
                jb4.setBackground( red );
                loss++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            }
        } else {
            if( r == 1 ) {
                jb4.setText( "Scissors vs. Rock: Loss!" );
                jb4.setBackground( red );
                loss++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            } else if( r == 2 ) {
                jb4.setText( "Scissors vs. Paper: Win!" );
                jb4.setBackground( green );
                win++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            } else {
                jb4.setText( "Scissors vs. Scissors: Tie!" );
                jb4.setBackground( yellow );
                tie++;
                jb5.setText( "wins: " + win + "  losses: " + loss + "  ties: " + tie );
            }
        }

        jf.pack();
    }
}
