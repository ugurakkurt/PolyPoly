

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class BoardScreen2 extends JPanel {
	 static JButton seeQuestionforChallange = new JButton();
	 static JButton seeQuestionforMaster = new JButton();
	 static JPanel[] boxMaster;
	 static JPanel[] boxChallange;
	static ArrayList<BoardScreen2> players;
	 static int x;
	 Color c;
	private JLabel Time;
	private JLabel TimeLabel;
	private JButton roll;
	private JLabel ResultDiceLabel;
	
	static JLabel scoreLbl;
	static JLabel scoreLbl1;
	static JLabel scoreLbl2;
	static JLabel scoreLbl3;
	static JLabel scoreLbl4;
	/**
	 * Create the panel.
	 */
	 public BoardScreen2() {
		 x= 0;
         boxChallange = new JPanel[126];

         setPreferredSize(new Dimension(1200,800));
         setBackground(Color.WHITE);
         setLayout(null);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(10, 27, 63, 40);
         seeQuestionforChallange.addActionListener(new ButtonListener());
         boxChallange[x].add(seeQuestionforChallange);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(74, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(139, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]  = new JPanel();
         boxChallange[x].setBounds(203, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(268, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(332, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(397, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(461, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(525, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(589, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(653, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(717, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(781, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(845, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(909, 27, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 68, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 132, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 196, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 260, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 324, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 388, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 452, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(932, 516, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(740, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(676, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(612, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(548, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(484, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(420, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(356, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(292, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(228, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 539, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 475, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 411, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 347, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 283, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 219, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 155, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(36, 91, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(77, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(141, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(205, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(269, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(333, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(397, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(461, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(525, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(589, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(653, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(717, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(781, 91, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(845, 91, 63, 40);    
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 132, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 196, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 260, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 324, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 388, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(868, 452, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(740, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(676, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(612, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(548, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(484, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(420, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(356, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(292, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(228, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 475, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 411, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 347, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 283, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 219, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(100, 155, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(141, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(205, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(269, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(333, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(397, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(461, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(525, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(589, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(653, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(717, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(781, 155, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 196, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 260, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 324, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(804, 388, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(740, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(676, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(612, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(548, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(484, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(420, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(356, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(292, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(228, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 411, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 347, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 283, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(164, 219, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(205, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(269, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(333, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(397, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(461, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(525, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(589, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(653, 219, 63, 40);
         add(boxChallange[x++]);;

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(717, 219, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(740, 260, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(740, 324, 40, 63);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(676, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(612, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(548, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(484, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x]= new JPanel();
         boxChallange[x].setBounds(420, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(356, 347, 63, 40);
         add(boxChallange[x++]);

         boxChallange[x] = new JPanel();
         boxChallange[x].setBounds(292, 347, 63, 40);
         add(boxChallange[x++]);

         JLabel lblNewLabel = new JLabel("New label");
         lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u00D6zg\u00FCr\\Desktop\\CS102 POLYPOLYIMAGES\\2293239853_ddd6bc4ef4.jpg"));
         lblNewLabel.setBounds(228, 283, 63, 55);
         add(lblNewLabel);

//         boxChallange[x] = new JPanel();
//         boxChallange[x].setBounds(228, 347, 63, 40);
//         add(boxChallange[x++]);

         JButton Cardbutton = new JButton("Pick A Card! ");
         Cardbutton.setBounds(46, 598, 117, 23);
         add(Cardbutton);

         JLabel Cardlabel = new JLabel("Your Card is");
         Cardlabel.setHorizontalAlignment(SwingConstants.CENTER);
         Cardlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
         Cardlabel.setBounds(46, 632, 107, 14);
         add(Cardlabel);

         JLabel CardResultLabel = new JLabel("New label");
         CardResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
         CardResultLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
         CardResultLabel.setBounds(46, 657, 107, 14);
         add(CardResultLabel);

         JLabel NumberLabel = new JLabel("Your Lucky Number");
         NumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
         NumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
         NumberLabel.setBounds(767, 600, 141, 14);
         add(NumberLabel);

         JLabel ResultDiceLabel = new JLabel("5");
         ResultDiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
         ResultDiceLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
         ResultDiceLabel.setBounds(781, 598, 107, 73);
         add(ResultDiceLabel);

         //JButton DiceButton = new JButton("DICE");
 //        DiceButton.setBounds(898, 598, 72, 63);
 //        add(DiceButton);



             JButton roll = new JButton("roll");
             roll.setBounds(898, 598, 72, 63);
             final Die die = new Die(0,0, Roll.die());
             die.setBounds(1000, 600, 92, 73);

             class RollListener implements ActionListener
             {
                 public void actionPerformed(ActionEvent e)
                 {
                   die.roll();
                 }
             }
             RollListener listener = new RollListener();
             roll.addActionListener(listener);
             add(roll);
             add(die);


         JLabel TimeLabel = new JLabel("TIME");
         TimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
         TimeLabel.setBounds(332, 0, 87, 23);
         add(TimeLabel);

 }
 public JPanel[] getLabelChallange(){
         return boxChallange;
 }
public BoardScreen2(String field) {
		x = 0;
		boxMaster = new JPanel[126];
	
		c = new Color(0,0,0);
		if(field.equalsIgnoreCase("math"))
			c = Color.pink;
		else if(field.equalsIgnoreCase("history"))
			c = Color.cyan;
		else if(field.equalsIgnoreCase("biology"))
			c = Color.pink;
		else if(field.equalsIgnoreCase("generalCulture"))
			c = Color.yellow;
		else if(field.equalsIgnoreCase("physics"))
			c = Color.gray;
		if(field.equalsIgnoreCase("chemistry"))
			c = Color.red;
		

        setPreferredSize(new Dimension(1200,800));
        setBackground(Color.WHITE);
        setLayout(null);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(10, 27, 63, 40);
        seeQuestionforMaster.addActionListener(new ButtonListener());
        boxMaster[x] .add(seeQuestionforMaster);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(74, 27, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(139, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x]  = new JPanel();
        boxMaster[x].setBounds(203, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(268, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(332, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(397, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(461, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(525, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(589, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(653, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(717, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(781, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(845, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(909, 27, 63, 40);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 68, 40, 63);
        add( boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 132, 40, 63);
        add( boxMaster[x++]);
        
        
        
        
        //BURASI
        scoreLbl = new JLabel("SCORES");
        scoreLbl.setBounds(1050, 68, 80, 63);
        scoreLbl.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
        scoreLbl.setForeground(Color.MAGENTA);
        add(scoreLbl);
       
        if(Player.numOfPlayers == 1){
        scoreLbl1 = new JLabel("Player1");
        
        scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
        scoreLbl1.setBounds(1050, 98, 80, 63);
        scoreLbl1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
        scoreLbl1.setForeground(Color.MAGENTA);
        add(scoreLbl1);}
        
        else if(Player.numOfPlayers == 2){
        	  scoreLbl1 = new JLabel("Player1");
        	  
              scoreLbl1.setBounds(1050, 98, 80, 63);
              scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
              scoreLbl1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
              scoreLbl1.setForeground(Color.MAGENTA);
              add(scoreLbl1);
              
            scoreLbl2 = new JLabel("Player2");
            scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
            scoreLbl2.setBounds(1050, 128, 80, 63);
            scoreLbl2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl2.setForeground(Color.MAGENTA);
            add(scoreLbl2);}
        else if(Player.numOfPlayers == 3){
        	scoreLbl1 = new JLabel("Player1");
        	scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
            scoreLbl1.setBounds(1050, 98, 80, 63);
            scoreLbl1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl1.setForeground(Color.MAGENTA);
            add(scoreLbl1);
            
          scoreLbl2 = new JLabel("Player2");
          scoreLbl1.setText(Integer.toString(Player.player2.getScore()));
          scoreLbl2.setBounds(1050, 128, 80, 63);
          scoreLbl2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
          scoreLbl2.setForeground(Color.MAGENTA);
          add(scoreLbl2);
          
            scoreLbl3 = new JLabel("Player3");
            scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
            scoreLbl3.setBounds(1050, 158, 80, 63);
            scoreLbl3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl3.setForeground(Color.MAGENTA);
            add(scoreLbl3);}
        else if(Player.numOfPlayers == 4){
        	scoreLbl1 = new JLabel("Player1");
        	scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
            scoreLbl1.setBounds(1050, 98, 80, 63);
            scoreLbl1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl1.setForeground(Color.MAGENTA);
            add(scoreLbl1);
            
          scoreLbl2 = new JLabel("Player2");
          scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
          scoreLbl2.setBounds(1050, 128, 80, 63);
          scoreLbl2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
          scoreLbl2.setForeground(Color.MAGENTA);
          add(scoreLbl2);
          
            scoreLbl3 = new JLabel("Player3");
            scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
            scoreLbl3.setBounds(1050, 158, 80, 63);
            scoreLbl3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl3.setForeground(Color.MAGENTA);
            add(scoreLbl3);
            
            scoreLbl4 = new JLabel("Player4");
            scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
            scoreLbl4.setBounds(1050, 188, 80, 63);
            scoreLbl4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
            scoreLbl4.setForeground(Color.MAGENTA);
            add(scoreLbl4);}


        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 196, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 260, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 324, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 388, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 452, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(932, 516, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(740, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(676, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(612, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(548, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(484, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(420, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(356, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(292, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(228, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 539, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 475, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 411, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 347, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 283, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 219, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 155, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(36, 91, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(77, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(141, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(205, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(269, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(333, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(397, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(461, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(525, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(589, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(653, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(717, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(781, 91, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(845, 91, 63, 40);     //burda kaldý   //56
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 132, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 196, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 260, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 324, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 388, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(868, 452, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(740, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(676, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(612, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(548, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(484, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(420, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(356, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(292, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(228, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 475, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 411, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 347, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 283, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 219, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(100, 155, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(141, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(205, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(269, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(333, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(397, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(461, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(525, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(589, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(653, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(717, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(781, 155, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 196, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 260, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 324, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(804, 388, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(740, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(676, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(612, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(548, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(484, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(420, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(356, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(292, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(228, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 411, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 347, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 283, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(164, 219, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(205, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(269, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(333, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(397, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(461, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(525, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(589, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(653, 219, 63, 40);
        add(boxMaster[x++]);;

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(717, 219, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(740, 260, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(740, 324, 40, 63);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(676, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(612, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(548, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(484, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x]= new JPanel();
        boxMaster[x].setBounds(420, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(356, 347, 63, 40);
        add(boxMaster[x++]);

        boxMaster[x] = new JPanel();
        boxMaster[x].setBounds(292, 347, 63, 40);
        add(boxMaster[x++]);
        
        for(int i = 0;i<126;i++){
        	 boxMaster[i].setBackground(c);
        }

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u00D6zg\u00FCr\\Desktop\\CS102 POLYPOLYIMAGES\\2293239853_ddd6bc4ef4.jpg"));
        lblNewLabel.setBounds(228, 283, 63, 55);
        add(lblNewLabel);

//        boxChallange[x] = new JPanel();
//        boxChallange[x].setBounds(228, 347, 63, 40);
//        add(boxChallange[x++]);

        JButton Cardbutton = new JButton("Pick A Card! ");
        Cardbutton.setBounds(46, 598, 117, 23);
        add(Cardbutton);

        JLabel Cardlabel = new JLabel("Your Card is");
        Cardlabel.setHorizontalAlignment(SwingConstants.CENTER);
        Cardlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Cardlabel.setBounds(46, 632, 107, 14);
        add(Cardlabel);

        JLabel CardResultLabel = new JLabel("New label");
        CardResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CardResultLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        CardResultLabel.setBounds(46, 657, 107, 14);
        add(CardResultLabel);

        JLabel NumberLabel = new JLabel("Your Lucky Number");
        NumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        NumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        NumberLabel.setBounds(767, 600, 141, 14);
        add(NumberLabel);
        
     	x=0;
        roll = new JButton("roll");
        roll.setBounds(898, 598, 72, 63);
        final Die die = new Die(0,0, Roll.die());
        die.setBounds(1000, 600, 92, 73);

        //JButton DiceButton = new JButton("DICE");
//        DiceButton.setBounds(898, 598, 72, 63);
//        add(DiceButton);


       
      

        class RollListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("roll")){
            
             die.roll();
              if( die.getDie() == 1){
            	  
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 1);
	        	  
	        	  if(Player.player1.getLocation() > 126)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	  //add(boxMaster[Player.player1.getLocation()]);
	        	  try{
	               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	               BoardScreen2.seeQuestionforMaster.setVisible(true);
	              MainMenu.frame1.setVisible(true);
	               

	              
	          }
	          else if( die.getDie() == 2){
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 2);
	        	  if(Player.player1.getLocation() > 126)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	  //add(boxMaster[Player.player1.getLocation()]);
	        	  try{
		               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	              
	               BoardScreen2.seeQuestionforMaster.setVisible(true);
	               MainMenu.frame1.setVisible(true);
	               

	              
	          }
	          else if( die.getDie() == 3){
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 3);
	        	  if(Player.player1.getLocation() > 126)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	 // add(boxMaster[Player.player1.getLocation()]);
	        	  try{
		               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	               
	               BoardScreen2.seeQuestionforMaster.setVisible(true);
	               MainMenu.frame1.setVisible(true);
	              

	              
	          }
	          
	          else if( die.getDie() == 4){
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 4);
	        	  if(Player.player1.getLocation() > 126)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	 // add(boxMaster[Player.player1.getLocation()]);
	        	  try{
		               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	               BoardScreen2.seeQuestionforMaster.setVisible(true);
	              MainMenu.frame1.setVisible(true);
	               

	               
	          }
	          else if( die.getDie() == 5){
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 5);
	        	  if(Player.player1.getLocation() > 127)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	 // add(boxMaster[Player.player1.getLocation()]);
	        	  try{
		               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	               BoardScreen2.seeQuestionforMaster.setVisible(true);
	               MainMenu.frame1.setVisible(true);
	               

	              
	          }
	          else if( die.getDie() == 6){
	        	  BoardScreen2.seeQuestionforMaster.addActionListener(new RollListener());
	        	  BoardScreen2.seeQuestionforMaster.setVisible(false);
	        	  BoardScreen2.seeQuestionforMaster.repaint();
	        	  Player.player1.setLocation(Player.player1.getLocation() + 6);
	        	  if(Player.player1.getLocation() > 126)
	        	  {JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Congratulations!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);}
	        	 // add(boxMaster[Player.player1.getLocation()]);
	        	  try{
		               boxMaster[Player.player1.getLocation()].add(seeQuestionforMaster);}catch(ArrayIndexOutOfBoundsException e1){}
	        	  BoardScreen2.seeQuestionforMaster.setVisible(true);
	               MainMenu.frame1.setVisible(true);
	              

	               
	          }

            }
            }
                
            }
            

          /*  ResultDiceLabel = new JLabel("");
            ResultDiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
            ResultDiceLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
            ResultDiceLabel.setBounds(781, 598, 107, 73);
            ResultDiceLabel.setText((die.getDie()) +"");
            add(ResultDiceLabel);
            ResultDiceLabel.repaint();
            ResultDiceLabel.validate();*/


            RollListener listener = new RollListener();
            roll.addActionListener(listener);
            add(roll);
            add(die);

        	Time = new JLabel("PASSING TIME =");
			Time.setHorizontalAlignment(SwingConstants.CENTER);
			Time.setBounds(290, 0, 150, 23);
		    TimeLabel = new JLabel("");
			TimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
			TimeLabel.setBounds(422, 0, 200, 23);
			add(Time);
			add(TimeLabel);
			
			Timer t = new Timer(1000, new ActionListener() {
				private long time = 1000*60*60;
				private int j; 
				
				public void actionPerformed(ActionEvent e) {
					
					
				    if (time > 0) {
				        time += 1000;
				        j++;
				        int min = j/60;
				        int hour = min/60;
				        
				        TimeLabel.setText(Long.toString(hour) + " hours " + Long.toString(min) + " minute  " + Long.toString(j%60) + " seconds");

				    }
				      
				}
				});
		
			
			
			t.start();


//	public JPanel[] getLabelMaster(){
//        return boxMaster;
//	}
		
	}
}
