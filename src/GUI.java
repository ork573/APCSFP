import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;  
import java.awt.*;
import javax.swing.*;    
import javax.swing.event.*;    
import java.io.*;
import chn.util.*;
import apcslib.*; 
import java.lang.String;
public class GUI {  
    /**
     * @wbp.parser.entryPoint
     */

    public static void gui(ArrayList<String> xxx) { 
        //Create and set up the window
        JFrame frame = new JFrame ("GUI");
        frame.setMinimumSize(new Dimension(500, 700));
        frame.setSize(1000,1000); //Size of terminal screen (width, length)
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.WHITE);
        JLabel textLabel = new JLabel("Click on a method to show its code, or Exit to exit." ,SwingConstants.CENTER); 
        textLabel.setPreferredSize(new Dimension(300, 100));
        textLabel.setBounds(0, 0, 300, 100);
        frame.getContentPane().add(textLabel);
        //Display the window

        //Exit button
        JButton exit=new JButton("Exit"); //Create a button with text
        exit.setBounds(50,100,150,30); //Button coordinates-change 3rd for length
        frame.getContentPane().add(exit); 
        exit.addActionListener(new ActionListener() //waiting for user to click button
            {
                public void actionPerformed(ActionEvent exit) { //if user clicks button
                    System.exit(0); //exit
                }   
            });
        DefaultListModel b = new DefaultListModel();;
        for(int i = 0; i < xxx.size(); i++){
            b.addElement(xxx.get(i));
        }
        JList a = new JList(b);
        a.setVisibleRowCount(5);
        a.setBounds(50, 150, 400, 500);
        frame.getContentPane().add(a);
        frame.pack();
        //a.setVisible(true);
        frame.setVisible(true); //Set the terminal to visible
        a.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent newValue) {
                String val = xxx.get(newValue.getFirstIndex());
                PrintCode.temporarycode(val);
            }
        });
    }
} 