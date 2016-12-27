import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class HelpPanel extends JPanel{
	
	public HelpPanel(){
		setLayout(null);
		String str1 = "There are two game mode in our game. When user click to new game button,  " ;
		String str2 = "there will appear two alternative ways to play: “Challenge Mode” and “Master it! ”";
		 setBackground(SystemColor.textHighlight);
		 setPreferredSize(new Dimension(500,800));
		 
		 JLabel instructions = new JLabel("-Instructions-");
		 JLabel help = new JLabel(str1);
		 JLabel help2 = new JLabel(str2);
		 add(instructions);
		 add(help);
		 add(help2);
		 
		 MainMenuPanel.backToMain = new JButton("back to main menu");
		 MainMenuPanel.backToMain.setBackground(SystemColor.textHighlight);
		 MainMenuPanel.backToMain.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		 MainMenuPanel.backToMain.setBounds(140, 118, 139, 23);
		 MainMenuPanel.backToMain.addActionListener(MainMenuPanel.listener);
		 add(MainMenuPanel.backToMain);
		
	}

	

}
