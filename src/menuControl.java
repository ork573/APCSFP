import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JMenuBar;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JLabel;


import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.awt.Color;

import java.awt.SystemColor;

import javax.swing.UIManager;

//import com.sun.prism.Image;

import javax.swing.ImageIcon;


public class menuControl extends JFrame {

    /**

     * 

     */

    private static final long serialVersionUID = 1L;

    /**

     * Launch the application.

     */

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

                public void run() {

                    try {

                        menuControl frame = new menuControl();

                        frame.setVisible(true);

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }

            });

    }

    /**

     * Create the frame.

     */

    public menuControl() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();

        setJMenuBar(menuBar);

        JLabel pic = new JLabel("");        
        //java.awt.Image image = new ImageIcon(this.getClass().getResource("../images/emoji.png")).getImage();
        java.awt.Image image = new ImageIcon("images/spongebob-icon.png").getImage();
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(100, 100, 128, 128);

        getContentPane().add(pic);
        //Color lightBlue= new Color(0,0,182,155);
        getContentPane().setBackground(new Color(100,100,255));
        JMenuItem mntmCalc = new JMenuItem("Calculator");

        mntmCalc.setForeground(Color.WHITE);

        mntmCalc.setBackground(Color.PINK);

        mntmCalc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                calculator frame = new calculator();

                frame.setVisible(true);

            }

        });

        

        JMenuItem menuItem_4 = new JMenuItem("     | | |");
        menuItem_4.setBackground(Color.WHITE);
        menuBar.add(menuItem_4);

        menuBar.add(mntmCalc);

        

        JMenuItem mntmPalindrome = new JMenuItem("Palindrome");

        mntmPalindrome.setBackground(Color.PINK);

        mntmPalindrome.setForeground(Color.WHITE);
        mntmPalindrome.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                palindromeUI frame = new palindromeUI();

                frame.setVisible(true);

            }

        });

        menuBar.add(mntmPalindrome);

        

        JMenuItem menuItem_3 = new JMenuItem("     FileIO");

        menuItem_3.setForeground(Color.WHITE);

        menuItem_3.setBackground(Color.PINK);

        menuItem_3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                MethodSearch.scan("Vow");

            }

        });

        menuBar.add(menuItem_3);

        

        JMenuItem menuItem_2 = new JMenuItem("Algorithm");

        menuItem_2.setBackground(Color.PINK);

        menuItem_2.setForeground(Color.WHITE);

        menuItem_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                algoMiniLab.run();

            }

        });

        menuBar.add(menuItem_2);

    }

}