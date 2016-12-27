
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Label;

public class CreditsPanel extends JPanel {
	public CreditsPanel() {
		
	//	getContentPane().setForeground(SystemColor.text);
	//	getContentPane().setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
	//	getContentPane().setBackground(SystemColor.textHighlight);
	//	setTitle("Credits");
	//	setType(Type.UTILITY);
	    setBackground(SystemColor.textHighlight);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(500,400));
	//	getContentPane().setLayout(null);
		
		
		//Labels of Credits screen.
		
		//TODO daha düzgün bir þeyler yazýlabilir, sadece canlandýrmak amacý ile yazdým.
		//TODO Burayý ana menüdeki Credits ekranýna baðlamak gerekiyor. 
		JTextArea txtrPolypolyTheGame = new JTextArea();
		txtrPolypolyTheGame.setEditable(false);
		txtrPolypolyTheGame.setLineWrap(true);
		txtrPolypolyTheGame.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtrPolypolyTheGame.setText("PolyPoly The Game. All rights reserved, 2013. Created by Bilkent University CS102 Students.\r\n\r\n\r\nU\u011Fur Akkurt\r\nUtku \u00DCnal\r\nSelin \u00D6zbilen\r\nNur \u015Eam\r\n\u00D6zg\u00FCr \u00D6ney\r\n\r\n\r\nSometimes you need to work hard to achieve goals. ");
		txtrPolypolyTheGame.setForeground(new Color(255, 255, 255));
		txtrPolypolyTheGame.setBackground(SystemColor.textHighlight);
		txtrPolypolyTheGame.setBounds(10, 11, 408, 336);
		setBounds(100, 100, 444, 392);
		add(txtrPolypolyTheGame);
		
		MainMenuPanel.backToMain = new JButton("back to main menu");
		MainMenuPanel.backToMain.setBackground(SystemColor.textHighlight);
		MainMenuPanel.backToMain.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		MainMenuPanel.backToMain.setBounds(140, 118, 139, 23);
		add(MainMenuPanel.backToMain);
		
		MainMenuPanel.backToMain.addActionListener(MainMenuPanel.listener);	 // there is only one button listener and it is defined in MainMenu Panel
	}
}
		
		
		
		
	    