import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScoresPanel extends JPanel {
	
	
	private JLabel  labelSc1;
	private JLabel  labelSc2;
	private JLabel  labelSc3;
	private JLabel  labelSc4;
	
	private JLabel labeltepe;
	private JLabel labelSc5;
	private JLabel labelSc6;
	private JLabel labelSc7;
	private JLabel labelSc8;
	
	
	public ScoresPanel(){
		
		super(); 
		
		setToolTipText("POLYPOLY THE GAME");
		setForeground(SystemColor.textHighlight);
		setBackground(SystemColor.textHighlight);
		setPreferredSize(new Dimension(500,400));
		setLayout(null);
		
		
		
		
		labeltepe = new JLabel("SUCCESS RATING");
		labeltepe.setForeground(SystemColor.text);
		labeltepe.setBackground(SystemColor.textHighlight);
		labeltepe.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labeltepe.setBounds(146, 39, 156, 14);
		add(labeltepe);
		
		
		labelSc1 = new JLabel("playerSc[i].getName()");
		labelSc1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc1.setForeground(SystemColor.text);
		labelSc1.setBackground(SystemColor.textHighlight);
		labelSc1.setBounds(21, 123, 156, 30);
		add(labelSc1);
		labelSc1.setVisible(false);
		
		labelSc5 = new JLabel("playerSc[i].getName()");
		labelSc5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc5.setForeground(SystemColor.text);
		labelSc5.setBackground(SystemColor.textHighlight);
		labelSc5.setBounds(172, 129, 86, 20);
		add(labelSc5);
		labelSc5.setVisible(false);
		
		labelSc2 = new JLabel("playerSc[i].getName()");
		labelSc2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc2.setForeground(SystemColor.text);
		labelSc2.setBackground(SystemColor.textHighlight);
		labelSc2.setBounds(21, 158, 156, 30);
		add(labelSc2);
		labelSc2.setVisible(false);
		
		labelSc6 = new JLabel("playerSc[i].getName()");
		labelSc6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc6.setForeground(SystemColor.text);
		labelSc6.setBackground(SystemColor.textHighlight);
		labelSc6.setBounds(171, 164, 86, 20);
		add(labelSc6);
		labelSc6.setVisible(false);
		
		labelSc3 = new JLabel("playerSc[i].getName()");
		labelSc3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc3.setForeground(SystemColor.text);
		labelSc3.setBackground(SystemColor.textHighlight);
		labelSc3.setBounds(21, 197, 156, 30);
		add(labelSc3);
		labelSc3.setVisible(false);
		
		labelSc7 = new JLabel("playerSc[i].getName()");
		labelSc7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc7.setForeground(SystemColor.text);
		labelSc7.setBackground(SystemColor.textHighlight);
		labelSc7.setBounds(171, 203, 86, 20);
		add(labelSc7);
		labelSc7.setVisible(false);
		
		labelSc4 = new JLabel("playerSc[i].getName()");
		labelSc4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc4.setForeground(SystemColor.text);
		labelSc4.setBackground(SystemColor.textHighlight);
		labelSc4.setBounds(21, 238, 156, 30);
		add(labelSc4);
		labelSc4.setVisible(false);
				
			
		labelSc8 = new JLabel("playerSc[i].getName()");
		labelSc8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		labelSc8.setForeground(SystemColor.text);
		labelSc8.setBackground(SystemColor.textHighlight);
		labelSc8.setBounds(171, 244, 86, 20);
		add(labelSc8);
		labelSc8.setVisible(false);
		
		 MainMenuPanel.backToMain = new JButton("back to main menu");
		 MainMenuPanel.backToMain.setBackground(SystemColor.textHighlight);
		 MainMenuPanel.backToMain.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		 MainMenuPanel.backToMain.setBounds(140, 265 , 139, 23);
		 MainMenuPanel.backToMain.addActionListener(MainMenuPanel.listener);
		 add(MainMenuPanel.backToMain);
		
		if(Player.numOfPlayers == 0){
			JOptionPane.showConfirmDialog(
		            MainMenu.frame1,
		            "There is no any scores",
		            null,JOptionPane.CLOSED_OPTION);
		}
		
		
		else if(Player.numOfPlayers == 1){
			labelSc1.setVisible(true);
			labelSc5.setVisible(true);
		}
		
		
		else if(Player.numOfPlayers == 2){
			labelSc2.setVisible(true);
			labelSc6.setVisible(true);
		}
		
		else if(Player.numOfPlayers == 3){
			labelSc3.setVisible(true);
			labelSc7.setVisible(true);
		}
		
		else if(Player.numOfPlayers == 4){
			labelSc3.setVisible(true);
			labelSc7.setVisible(true);
		}

	
		
		
	}

}
