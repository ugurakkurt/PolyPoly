package me.cs102.com;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSplitPane;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class QuestionScreen extends JPanel {

	public QuestionScreen() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel SoruPaneli = new JPanel();
		SoruPaneli.setBounds(0, 41, 390, 128);
		SoruPaneli.setBackground(SystemColor.textHighlight);
		add(SoruPaneli);
		SoruPaneli.setLayout(null);
		
		//BURAYI PROGRAM SORUYU OKUYUP DOLDURACAK!! 
		JLabel QuestionPanel = new JLabel("Where is the capital of Turkey?");
		QuestionPanel.setBounds(0, 11, 390, 106);
		QuestionPanel.setHorizontalAlignment(SwingConstants.CENTER);
		QuestionPanel.setForeground(SystemColor.textHighlightText);
		QuestionPanel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		SoruPaneli.add(QuestionPanel);
		
		
		JPanel DolacakPanel = new JPanel();
		DolacakPanel.setBounds(0, 169, 390, 48);
		DolacakPanel.setBackground(Color.DARK_GRAY);
		add(DolacakPanel);
		DolacakPanel.setLayout(null);
		
		JLabel ScoreLabel = new JLabel("Score ");
		ScoreLabel.setBounds(33, 1, 38, 18);
		ScoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ScoreLabel.setForeground(SystemColor.inactiveCaption);
		ScoreLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(ScoreLabel);
		
		JLabel TimeLabel = new JLabel("TIME");
		TimeLabel.setBounds(172, 3, 46, 14);
		TimeLabel.setForeground(SystemColor.inactiveCaption);
		TimeLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(TimeLabel);
		
		JLabel LevelLabel = new JLabel("Level");
		LevelLabel.setBounds(322, 2, 46, 14);
		LevelLabel.setForeground(SystemColor.inactiveCaption);
		LevelLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(LevelLabel);
		
		//BURALARI PROGRAM KENDÝ DOLDURACAK
		JLabel lblNewLabel = new JLabel("12123");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblNewLabel.setBounds(33, 23, 46, 14);
		DolacakPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("00:19");
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(172, 23, 46, 14);
		DolacakPanel.add(lblNewLabel_1);
		
		JLabel lblMedium = new JLabel("Medium");
		lblMedium.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblMedium.setBounds(310, 23, 70, 14);
		DolacakPanel.add(lblMedium);
		
		//SEÇENEKLER ÝÇÝN PANELLER VE LABELLAR. LABELLAR .TXT'den gelecek þeye baðlý olarak deðiþecek.
		
		JPanel A = new JPanel();
		A.setBounds(10, 228, 370, 48);
		A.setBackground(Color.DARK_GRAY);
		add(A);
		A.setLayout(null);
		
		JLabel ALabel = new JLabel("A SEÇENEÐÝ");
		ALabel.setForeground(Color.WHITE);
		ALabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		ALabel.setBounds(55, 11, 250, 26);
		A.add(ALabel);
		
		JPanel B = new JPanel();
		B.setLayout(null);
		B.setBackground(Color.DARK_GRAY);
		B.setBounds(10, 294, 370, 48);
		add(B);
		
		JLabel BLabel = new JLabel("B SEÇENEÐÝ");
		BLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		BLabel.setForeground(Color.WHITE);
		BLabel.setBounds(55, 11, 250, 26);
		B.add(BLabel);
		
		JPanel C = new JPanel();
		C.setLayout(null);
		C.setBackground(Color.DARK_GRAY);
		C.setBounds(10, 353, 370, 48);
		add(C);
		
		JLabel CLabel = new JLabel("C SEÇENEÐÝ");
		CLabel.setForeground(Color.WHITE);
		CLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		CLabel.setBounds(55, 11, 250, 26);
		C.add(CLabel);
		
		JPanel D = new JPanel();
		D.setLayout(null);
		D.setBackground(Color.DARK_GRAY);
		D.setBounds(10, 423, 370, 48);
		add(D);
		
		JLabel DLabel = new JLabel("D SEÇENEÐÝ");
		DLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		DLabel.setForeground(Color.WHITE);
		DLabel.setBounds(55, 11, 250, 26);
		D.add(DLabel);

	}
}
