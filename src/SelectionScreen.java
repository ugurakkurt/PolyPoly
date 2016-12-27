
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SelectionScreen extends JPanel {
	static JButton masterItButton;
	static JButton challangeButton;


	public SelectionScreen() {
		setLayout(null);
		setBounds(100, 100, 450, 500);
		setToolTipText("POLYPOLY THE GAME");
		setForeground(SystemColor.text);
		setBackground(SystemColor.textHighlight);
		setPreferredSize(new Dimension(500,800));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Çýkan yazýlar için kullandýðým labellar.
		JLabel lblTryToComplete = new JLabel("Try to complete questions from...");
		lblTryToComplete.setHorizontalAlignment(SwingConstants.LEFT);
		lblTryToComplete.setForeground(SystemColor.text);
		lblTryToComplete.setBackground(SystemColor.textHighlight);
		lblTryToComplete.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblTryToComplete.setBounds(10, 102, 395, 33);
		add(lblTryToComplete);
		
		JLabel lbldifferentAreasAs = new JLabel("...different areas as fast as possible! ");
		lbldifferentAreasAs.setForeground(SystemColor.text);
		lbldifferentAreasAs.setBackground(SystemColor.textHighlight);
		lbldifferentAreasAs.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lbldifferentAreasAs.setBounds(66, 146, 339, 14);
		add(lbldifferentAreasAs);
		//Challenge mode'u seçmek içim kullandýðým button
		challangeButton = new JButton("CHALLENGE!");
		challangeButton.setForeground(SystemColor.desktop);
		challangeButton.setBackground(SystemColor.textHighlight);
		challangeButton.setBounds(136, 188, 141, 33);
		add(challangeButton);
		//Ýkinci yazý sýrasý için kullandýðým labellar
		JLabel lblOrSelectYour = new JLabel("Or select your interest...");
		lblOrSelectYour.setForeground(SystemColor.text);
		lblOrSelectYour.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblOrSelectYour.setBackground(SystemColor.textHighlight);
		lblOrSelectYour.setBounds(10, 263, 395, 33);
		add(lblOrSelectYour);
		
		JLabel lblAndBecome = new JLabel("... and become a master of it!");
		lblAndBecome.setForeground(SystemColor.text);
		lblAndBecome.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblAndBecome.setBackground(SystemColor.textHighlight);
		lblAndBecome.setBounds(66, 307, 339, 14);
		add(lblAndBecome);
		//Master It! mode için kullanýlacak button
		masterItButton = new JButton("MASTER IT!");
		masterItButton.setBackground(SystemColor.textHighlight);
		masterItButton.setBounds(136, 347, 141, 33);
		add(masterItButton);
		challangeButton.addActionListener(MainMenuPanel.listener);
		masterItButton.addActionListener(MainMenuPanel.listener);
		
	}

}
