import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

//import com.sun.prism.Image;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
public class palindromeUI extends menuControl {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField pali_input;
    private JTextField pali_resultIJ;
    private JTextField pali_resultRecursion;
    private JTextField pali_resultReplace;
    /**
     * Launch the application.
     */
    /*
    public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
    public void run() {
    try {
    palindromeUI frame = new palindromeUI();
    frame.setVisible(true);
    } catch (Exception e) {
    e.printStackTrace();
    }
    }
    });
    }
     */
    /**
     * Create the frame.
     */
    public palindromeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblPalindromeTester = new JLabel("Enter Palindrome Candidate");
        lblPalindromeTester.setBounds(6, 0, 184, 26);
        contentPane.add(lblPalindromeTester);
        pali_input = new JTextField();
        pali_input.setBounds(6, 21, 438, 26);
        contentPane.add(pali_input);
        pali_input.setColumns(10);
        JButton btnTestPalindrome = new JButton("Test");
        btnTestPalindrome.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    boolean PalRec = palindrome.isPal(pali_input.getText());
                    boolean PalIJ = palindrome.PaliIandJ(pali_input.getText());
                    boolean PalRev = palindrome.PaliReverse(pali_input.getText());
                    if (PalIJ){
                    pali_resultIJ.setText("This is a palindrome-Palindrome by IJ");
                }else{
                    pali_resultIJ.setText("This isn't a palindrome-Palindrome by IJ");
                }
                    if (PalRec){
                        pali_resultRecursion.setText("This is a palindrome-Palindrome by Recursion");
                    }else{
                        pali_resultRecursion.setText("This isn't a palindrome-Palindrome by Recursion");
                    }
                if (PalRev){   
                    pali_resultReplace.setText("This is a palindrome-Palindrome by Reversal");
                }else{
                    pali_resultReplace.setText("This isn't a palindrome-Palindrome by Reversal");  
                }
                }
            });
        btnTestPalindrome.setBounds(152, 49, 145, 29);
        contentPane.add(btnTestPalindrome);
        pali_resultIJ = new JTextField();
        pali_resultIJ.setEditable(false);
        pali_resultIJ.setBounds(6, 82, 438, 47);
        contentPane.add(pali_resultIJ);
        pali_resultIJ.setColumns(10);
        pali_resultRecursion = new JTextField();
        pali_resultRecursion.setEditable(false);
        pali_resultRecursion.setColumns(10);
        pali_resultRecursion.setBounds(6, 141, 438, 47);
        contentPane.add(pali_resultRecursion);
        pali_resultReplace = new JTextField();
        pali_resultReplace.setEditable(false);
        pali_resultReplace.setColumns(10);
        pali_resultReplace.setBounds(6, 200, 438, 47);
        contentPane.add(pali_resultReplace);
        
        getContentPane().setBackground(Color.RED);
    }
}