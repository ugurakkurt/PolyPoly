
import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;     

      import java.awt.BorderLayout;
import java.awt.EventQueue;

      import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSlider;
      //Ana menünün GUI'si.
 
      public class MainMenu extends JFrame {
    	  
       static JFrame frame1;
      
      	public static void main(String[] args) throws FileNotFoundException {

      		frame1 = new JFrame("POLYPOLY THE GAME");
      		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      		frame1.setBounds(100,100,426,480);
      		
      		MainMenuPanel panel = new MainMenuPanel();
      		frame1.getContentPane().add(panel);
      		frame1.pack();
      		frame1.setVisible(true);	
      		
      		Questions b = new Questions();
    		b.setAllQuestions();
    		b.setAllOptions();
    		b.setAllAnswers();
        //  b.printQuestions();
            
     }   		
}


