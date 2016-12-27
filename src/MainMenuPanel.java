import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenuPanel extends JPanel {
//	JFrame frame4 = new JFrame("credits");
//	JFrame frame5 = new JFrame("new game");
	
	static JButton btnStartGame;
	static JButton creditsButton;
	static JButton btnScores;
	static JButton btnHelp;
	static JButton quitButton;
	static JButton backToMain;
	static ButtonListener listener = new ButtonListener();
	public MainMenuPanel(){
      		setLayout(null);
      		
      		//New Game butonu
      		btnStartGame = new JButton("NEW GAME");
      		btnStartGame.setBounds(140,80,139,23);
      		btnStartGame.setBackground(SystemColor.textHighlight);
      		btnStartGame.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
      		btnStartGame.addActionListener(listener);	
      		add(btnStartGame);
      		
      		//SCORES butonu.
      		btnScores = new JButton("SCORES");
      		btnScores.setBounds(140,118,139,23);
      		btnScores.setBackground(SystemColor.textHighlight);
      		btnScores.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
      		btnScores.setBounds(140, 118, 139, 23);
      		btnScores.addActionListener(listener);	
      		add(btnScores);
      		//CREDITS BUTTONU
      		creditsButton = new JButton("CREDITS");
      		creditsButton.setBounds(140,137,139,23);
      		creditsButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
      		creditsButton.setBackground(SystemColor.textHighlight);
      		creditsButton.setBounds(140, 187, 139, 23);
      		creditsButton.addActionListener(listener);
      	    add(creditsButton);

      		//HELP BUTTONU Oyunun ne üzerine olduðunu kullanýcya anlatmamýz gerekiyor. Burasý ellerinizden öper. 
      		btnHelp = new JButton("HELP");
      		btnHelp.setBounds(140,153,139,23);
      		btnHelp.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
      		btnHelp.setBackground(SystemColor.textHighlight);
      		btnHelp.setBounds(140, 153, 139, 23);
      		btnHelp.addActionListener(listener);
      		add(btnHelp);
      		
      		
      		
      		//TODO Quit butonu dolaylý olara EXIT_ON_CLOSE komutuna baðlanacak. Ýsterseniz tepedeki kapat butonunu kaldýrarak tüm yükü bu butona verebiliriz.
      		quitButton = new JButton("QUIT");
      		quitButton.setBounds(140,221,139,23);
      		quitButton.setBackground(SystemColor.textHighlight);
      		quitButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
      		//btnNewButton_1.setBounds(140, 221, 139, 23);
      		quitButton.addActionListener(listener);
      		add(quitButton);
      		
      		JLabel lblPolypoly = new JLabel("POLYPOLY! ");
      		lblPolypoly.setForeground(Color.ORANGE);
      		lblPolypoly.setFont(new Font("Showcard Gothic", Font.PLAIN, 32));
      		lblPolypoly.setBounds(120, 0, 275, 103);
      		add(lblPolypoly);
      		
      		//En alttaki þekilli yazý
      		JLabel lblAllRights = new JLabel("Copyright 2013, All rights reserved.\u00A9 ");
      		lblAllRights.setBounds(120, 417, 215, 14);
      		add(lblAllRights);
      		
      		setBackground(SystemColor.textHighlight);
      		setPreferredSize(new Dimension(500,300));
      		
      	}
	
}