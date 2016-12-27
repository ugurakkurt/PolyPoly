
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class NewGamePanel extends JPanel implements  ItemListener, ActionListener	{
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JButton button1; 
	static JComboBox comboBox; 
	static JLabel lblPlayerName;
	static JLabel lblPlayerName_1;
	static JLabel lblPlayerName_2; 
	static JLabel lblPlayerName_3;

	/**
	 * Oyunun kaç oyunculu oynanacaðýnýn belirlendiði ekran. Mode'u seçtikten hemen sonra ekrana gelecek. 
	 */
	
	public NewGamePanel() {
		super(); 
		setToolTipText("POLYPOLY THE GAME");
		setForeground(SystemColor.textHighlight);
		setBackground(SystemColor.textHighlight);
		setPreferredSize(new Dimension(500,800));
		setLayout(null);
		
		//her ne kadar çalýþmasa da seçim butonu bu. içeriðini tam olarak anlayamadýðýmdan dolayý beceremedim ama öðreneceðim :)
		comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		//comboBox.setSelectedIndex(3);
		comboBox.setBackground(SystemColor.textHighlight);
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(171, 64, 87, 20);
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.setFocusable(false);
		comboBox.addItemListener(this);
		add(comboBox);
		
		//Labels for players' names
		JLabel lblPlayerNumber = new JLabel("Player Number");
		lblPlayerNumber.setForeground(SystemColor.text);
		lblPlayerNumber.setBackground(SystemColor.textHighlight);
		lblPlayerNumber.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblPlayerNumber.setBounds(146, 39, 156, 14);
		add(lblPlayerNumber);
		
		
		lblPlayerName = new JLabel("Player #1 Name");
		lblPlayerName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblPlayerName.setForeground(SystemColor.text);
		lblPlayerName.setBackground(SystemColor.textHighlight);
		lblPlayerName.setBounds(21, 123, 156, 30);
		add(lblPlayerName);
		lblPlayerName.setVisible(true);
		
		
		lblPlayerName_1 = new JLabel("Player #2 Name");
		lblPlayerName_1.setForeground(Color.WHITE);
		lblPlayerName_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblPlayerName_1.setBackground(SystemColor.textHighlight);
		lblPlayerName_1.setBounds(21, 158, 156, 30);
		lblPlayerName_1.setVisible(true);
		add(lblPlayerName_1); 
		lblPlayerName_1.setVisible(false);
		
		
		lblPlayerName_2 = new JLabel("Player #3 Name");
		lblPlayerName_2.setForeground(Color.WHITE);
		lblPlayerName_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblPlayerName_2.setBackground(SystemColor.textHighlight);
		lblPlayerName_2.setBounds(21, 197, 156, 30);
		add(lblPlayerName_2);
		lblPlayerName_2.setVisible(false);
		
		lblPlayerName_3 = new JLabel("Player #4 Name");
		lblPlayerName_3.setForeground(Color.WHITE);
		lblPlayerName_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblPlayerName_3.setBackground(SystemColor.textHighlight);
		lblPlayerName_3.setBounds(21, 238, 156, 30);
		add(lblPlayerName_3);
		lblPlayerName_3.setVisible(false);
		
		//Text fields for players' names. Players will write their names here.
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(172, 129, 86, 20);
		textField.addActionListener(this);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(171, 164, 86, 20);
		textField_1.addActionListener(this);
		add(textField_1);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(171, 203, 86, 20);
		textField_2.addActionListener(this);
		add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(171, 244, 86, 20);
		textField_3.addActionListener(this);
		add(textField_3);
		textField_3.setVisible(false);
		
		//button ok
		button1 = new JButton("OK");
		button1.setBackground(Color.WHITE);
		button1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		button1.setBounds(171, 279, 86, 20);
		button1.addItemListener(this);
		button1.addActionListener(new ButtonListener());
		add(button1);
		
		Player.numOfPlayers = 1;
	}  
	  public void itemStateChanged(ItemEvent e) { //comboBox ta secim islemi (utku)
		  try {
		    	Player.numOfPlayers = Integer.parseInt(comboBox.getActionCommand());
			} catch (NumberFormatException ignored) {}
		  	
		    if ((e.getStateChange() == ItemEvent.SELECTED)) {
		       int selection = comboBox.getSelectedIndex();
		            switch (selection){
		            
		            case 0: Player.numOfPlayers = 1;  textField_1.setVisible(true); lblPlayerName_1.setVisible(false); textField_2.setVisible(false); lblPlayerName_2.setVisible(false); textField_3.setVisible(false); lblPlayerName_3.setVisible(false); break;
		            case 1: Player.numOfPlayers = 2;  textField_1.setVisible(true); lblPlayerName_1.setVisible(true); textField_2.setVisible(false); lblPlayerName_2.setVisible(false); textField_3.setVisible(false); lblPlayerName_3.setVisible(false); break;
		            case 2: Player.numOfPlayers = 3;  textField_1.setVisible(true); lblPlayerName_1.setVisible(true); textField_2.setVisible(true); lblPlayerName_2.setVisible(true); textField_3.setVisible(false); lblPlayerName_3.setVisible(false); break;
		            case 3: Player.numOfPlayers = 4;  textField_1.setVisible(true); lblPlayerName_1.setVisible(true); textField_2.setVisible(true); lblPlayerName_2.setVisible(true); textField_3.setVisible(true); lblPlayerName_3.setVisible(true); break;
		            default: Player.numOfPlayers = 1; textField_1.setVisible(true); break;
		            
		     }
		}
			
			//playerSc = new Player [oSayi];	
		   
	  }


	@Override
	public void actionPerformed(ActionEvent e) {
		 //null pointer exception almadým eðer alýrsak unutmalayalým bu satýra dikkat bi for döngüsüyle içlerini null a set edelim(UTKU)
			
	}
}
