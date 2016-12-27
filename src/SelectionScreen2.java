
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SelectionScreen2 extends JPanel {

	static JButton btnMath;
	static JButton btnPhysics;
	static JButton btnChemistry;
	static JButton btnBiology;
	static JButton btnHistory;
	static JButton btnGeneral;
	static JButton button_MainMenu;
	public SelectionScreen2() {
		setForeground(SystemColor.textHighlightText);
		setBackground(SystemColor.textHighlight);
		setPreferredSize(new Dimension(395,425));
		setLayout(null);
		
		btnMath = new JButton("Math");
		btnMath.setBackground(SystemColor.textHighlightText);
		btnMath.setBounds(128, 121, 119, 23);
		btnMath.addActionListener(new ButtonListener());
		add(btnMath);
		
		btnPhysics = new JButton("Physics");
		btnPhysics.setBackground(SystemColor.textHighlightText);
		btnPhysics.setBounds(128, 157, 119, 23);
		btnPhysics.addActionListener(new ButtonListener());
		add(btnPhysics);
		
		btnChemistry = new JButton("Chemistry");
		btnChemistry.setBackground(SystemColor.textHighlightText);
		btnChemistry.setBounds(128, 191, 119, 23);
		btnChemistry.addActionListener(new ButtonListener());
		add(btnChemistry);
		
		btnBiology = new JButton("Biology");
		btnBiology.addActionListener(new ButtonListener());
		btnBiology.setBackground(SystemColor.textHighlightText);
		btnBiology.setBounds(128, 225, 119, 23);
		add(btnBiology);
		
		btnHistory = new JButton("History");
		btnHistory.addActionListener(new ButtonListener());
		btnHistory.setBackground(SystemColor.textHighlightText);
		btnHistory.setBounds(128, 259, 119, 23);
		add(btnHistory);
		
		btnGeneral = new JButton("GeneralCulture");
		btnGeneral.addActionListener(new ButtonListener());
		btnGeneral.setBackground(SystemColor.textHighlightText);
		btnGeneral.setBounds(128, 293, 119, 23);
		add(btnGeneral);
		
		JButton button_MainMenu = new JButton("<Main Menu");
		button_MainMenu.addActionListener(new ButtonListener());
		button_MainMenu.setBackground(SystemColor.textHighlightText);
		button_MainMenu.setBounds(128, 327, 119, 23);
		add(button_MainMenu);
		
		JLabel BackGroundPic = new JLabel("");
		BackGroundPic.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\master.jpg"));
		BackGroundPic.setBounds(0, 0, 395, 425);
		add(BackGroundPic);

	}

}
