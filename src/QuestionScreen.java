
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JSplitPane;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;



public class QuestionScreen extends JPanel {
	static int c = 0;
	
	static JButton buttonAMaster,buttonBMaster,buttonCMaster,buttonDMaster;
	static JButton buttonAChallange,buttonBChallange,buttonCChallange,buttonDChallange;
	static JLabel timelb;
	JTextArea QuestionHighlight;
	JLabel label1,label2,label3,label4,label5,label6;
	static int index;
	Random generator = new Random();
	  int j = 20;
	  
	 JPanel DolacakPanel,ScoreLabel,TimeLabel,LevelLabel;
	 QuestionScreen ama,aba;

	JLabel lblNewLabel;
	 JPanel A;
	JLabel ALabel;

	JPanel B;

	 JLabel BLabel;
	 JPanel C;

	 JLabel CLabel;

	JPanel D;
	private Timer t;
	  static int x = 0; // this is the index of question
	  public static void setX(int x){
		  QuestionScreen.x = x;
	  }

	public QuestionScreen() {
		index = generator.nextInt(40);
		
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel SoruPaneli = new JPanel();
		SoruPaneli.setBounds(0, 41, 390, 128);
		SoruPaneli.setBackground(SystemColor.textHighlight);
		add(SoruPaneli);
		setPreferredSize(new Dimension(500,800));

		
		
		JTextArea QuestionHighlight = new JTextArea(((ChallangeMode) ChallangeMode.playerList.get(c).getChallange().get(index)).getQuestion());   // playerList.get(0) is the first player (player1Master) defýned ýn buttonscreen
		QuestionHighlight.setEditable(false);
		QuestionHighlight.setWrapStyleWord(true);
		QuestionHighlight.setForeground(SystemColor.textHighlightText);
		QuestionHighlight.setBackground(SystemColor.textHighlight);
		QuestionHighlight.setLineWrap(true);
		QuestionHighlight.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		QuestionHighlight.setBounds(0, 0, 390, 128);
		SoruPaneli.add(QuestionHighlight);
	
		
		
		JPanel DolacakPanel = new JPanel();
		DolacakPanel.setBounds(0, 169, 390, 48);
		DolacakPanel.setBackground(Color.DARK_GRAY);
		add(DolacakPanel);
		DolacakPanel.setLayout(null);
		
		JLabel ScoreLabel = new JLabel("Score ");
		ScoreLabel.setBounds(33, 1, 38, 18);
		ScoreLabel.setBackground(Color.yellow);
		ScoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ScoreLabel.setForeground(SystemColor.inactiveCaption);
		ScoreLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(ScoreLabel);
		
		JLabel TimeLabel = new JLabel("TIME");
		TimeLabel.setBounds(172, 3, 46, 14);
		TimeLabel.setBackground(Color.yellow);
		TimeLabel.setForeground(SystemColor.inactiveCaption);
		TimeLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(TimeLabel);
		
		JLabel LevelLabel = new JLabel("Level");
		LevelLabel.setBounds(322, 2, 46, 14);
		LevelLabel.setBackground(Color.yellow);
		LevelLabel.setForeground(SystemColor.inactiveCaption);
		LevelLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(LevelLabel);
		
		//BURALARI PROGRAM KENDÝ DOLDURACAK
		JLabel lblNewLabel = new JLabel("12123");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblNewLabel.setBounds(33, 23, 46, 14);
		DolacakPanel.add(lblNewLabel);
		
		

		timelb = new JLabel("");
		timelb.setBackground(Color.yellow);
		timelb.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		timelb.setForeground(Color.WHITE);
		timelb.setBounds(172, 23, 46, 14);
		DolacakPanel.add(timelb);
		
		t = new Timer(1000, new ActionListener() {
			private long time = 1000*60*60;
			
			public void actionPerformed(ActionEvent e) {
				if(ButtonListener.qFrame.isVisible() == false){
					t.removeActionListener(this);
					t.restart();
					t.stop();}
					
				else if(ButtonListener.qFrame.isVisible()){
				if(j <= 0){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Time is Over!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					
					ButtonListener.qFrame.dispose();
					MainMenu.frame1.setVisible(true);
					}
				
				else if (time > 0) {
			        time += 1000;
			        j--;
			        timelb.setText(Long.toString(j));

			    }}
			}
			});
		t.start();
		
		JLabel lblMedium = new JLabel("Medium");
		lblMedium.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblMedium.setBounds(310, 23, 70, 14);
		DolacakPanel.add(lblMedium);
		
		//SEÇENEKLER ÝÇÝN PANELLER VE LABELLAR. LABELLAR .TXT'den gelecek þeye baðlý olarak deðiþecek.
		
		JPanel A = new JPanel();
		A.setBounds(0, 228, 370, 48);
		A.setBackground(Color.DARK_GRAY);
		A.setLayout(null);
		add(A);
		
		
		JLabel ALabel = new JLabel(((ChallangeMode) ChallangeMode.playerList.get(0).getChallange().get(index)).getOptionA());
		ALabel.setForeground(Color.WHITE);
		ALabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		ALabel.setBounds(55, 11, 250, 26);
		buttonAChallange = new JButton("A");
		buttonAChallange.setBounds(0,11,50,48);
		A.add(buttonAChallange);
		buttonAChallange.addActionListener(new ButtonListener());
		A.add(ALabel);
		
		JPanel B = new JPanel();
		B.setBackground(Color.DARK_GRAY);
		B.setBounds(0, 294, 370, 48);
		B.setLayout(null);
		add(B);
		
		JLabel BLabel = new JLabel(((ChallangeMode) ChallangeMode.playerList.get(0).getChallange().get(index)).getOptionB());
		BLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		BLabel.setForeground(Color.WHITE);
		BLabel.setBounds(55, 11, 250, 26);
		buttonBChallange = new JButton("B"); 
		buttonBChallange.setBounds(0,11,50,48);
		B.add(buttonBChallange);
		buttonBChallange.addActionListener(new ButtonListener());
		B.add(BLabel);
		
		
	
		
		JPanel C = new JPanel();
		C.setBackground(Color.DARK_GRAY);
		C.setBounds(0, 353, 370, 48);
		C.setLayout(null);
		add(C);
		
		JLabel CLabel = new JLabel(((ChallangeMode) ChallangeMode.playerList.get(0).getChallange().get(index)).getOptionC());
		CLabel.setForeground(Color.WHITE);
		CLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		CLabel.setBounds(55, 11, 250, 26);
		
		buttonCChallange = new JButton("C");
		buttonCChallange.setBounds(0,11,50,48);	
		buttonCChallange.addActionListener(new ButtonListener());
		
		C.add(buttonCChallange);
		C.add(CLabel);
		
	
		
		JPanel D = new JPanel();
		D.setBackground(Color.DARK_GRAY);
		D.setBounds(0, 423, 370, 48);
		D.setLayout(null);
		add(D);
		
		JLabel DLabel = new JLabel (((ChallangeMode) ChallangeMode.playerList.get(0).getChallange().get(index)).getOptionD());
		DLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		DLabel.setForeground(Color.WHITE);
		DLabel.setBounds(55, 11, 250, 26);
		buttonDChallange = new JButton("D");
		buttonDChallange.setBounds(0,11,50,48);
		buttonDChallange.addActionListener(new ButtonListener());
		D.add(buttonDChallange);
		D.add(DLabel);
		
		label1 = new JLabel("");
		label1.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Skip.jpg"));
		label1.setBounds(170,3,39,30);
		add(label1);
		
		label2 = new JLabel("");
		label2.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Yari.jpg"));
		label2.setBounds(219,3,35,29);
		add(label2);
		
		label3 = new JLabel("");
		label3.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\%50.jpg"));
		label3.setBounds(73,3,87,31);
		add(label3);
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label4.setBounds(250,3,61,48);
		add(label4);
		
		label5 = new JLabel("");
		label5.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label5.setBounds(291,3,61,48);
		add(label5);
		
		label6 = new JLabel("");
		label6.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label6.setBounds(329,3,61,48);
		add(label6);
		
		
	

	}
	public QuestionScreen(String field,int a) {
		index = generator.nextInt(40);
		int c;  // c represents playerNumber
		if(a== 0) c=0;
		else if(a==1) c=1;
		else if(a==2) c=2;
		else if (a==3) c=3;
		else c=0;
		
		
		System.out.println("number of players: "  + Player.numOfPlayers);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel SoruPaneli = new JPanel();
		SoruPaneli.setBounds(0, 41, 390, 128);
		SoruPaneli.setBackground(SystemColor.textHighlight);
		add(SoruPaneli);
		setPreferredSize(new Dimension(500,800));
		SoruPaneli.setLayout(null);
		
		
		JTextArea QuestionHighlight = new JTextArea(((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getQuestion());   // playerList.get(0) is the first player (player1Master) defýned ýn buttonscreen
		QuestionHighlight.setEditable(false);
		QuestionHighlight.setWrapStyleWord(true);
		QuestionHighlight.setForeground(SystemColor.textHighlightText);
		QuestionHighlight.setBackground(SystemColor.textHighlight);
		QuestionHighlight.setLineWrap(true);
		QuestionHighlight.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		QuestionHighlight.setBounds(0, 0, 390, 128);
		SoruPaneli.add(QuestionHighlight);
		
		
		JPanel DolacakPanel = new JPanel();
		DolacakPanel.setBounds(0, 169, 390, 48);
		DolacakPanel.setBackground(Color.DARK_GRAY);
		add(DolacakPanel);
		DolacakPanel.setLayout(null);
		
		JLabel ScoreLabel = new JLabel("Score ");
		ScoreLabel.setBounds(33, 1, 38, 18);
		ScoreLabel.setBackground(Color.yellow);
		ScoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ScoreLabel.setForeground(SystemColor.inactiveCaption);
		ScoreLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(ScoreLabel);
		
		JLabel TimeLabel = new JLabel("TIME");
		TimeLabel.setBounds(172, 3, 46, 14);
		TimeLabel.setBackground(Color.yellow);
		TimeLabel.setForeground(SystemColor.inactiveCaption);
		TimeLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(TimeLabel);
		
		JLabel LevelLabel = new JLabel("Level");
		LevelLabel.setBounds(322, 2, 46, 14);
		LevelLabel.setBackground(Color.yellow);
		LevelLabel.setForeground(SystemColor.inactiveCaption);
		LevelLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		DolacakPanel.add(LevelLabel);
		
		//BURALARI PROGRAM KENDÝ DOLDURACAK
				lblNewLabel = new JLabel("12123");
				
				lblNewLabel.setBackground(Color.yellow);
				lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
				lblNewLabel.setBounds(33, 23, 46, 14);
				lblNewLabel.setForeground(Color.WHITE);
				DolacakPanel.add(lblNewLabel);
				
				timelb = new JLabel("");
				timelb.setBackground(Color.yellow);
				timelb.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
				timelb.setForeground(Color.WHITE);
				timelb.setBounds(172, 23, 46, 14);
				DolacakPanel.add(timelb);
				
				timelb = new JLabel("");
				timelb.setBackground(Color.yellow);
				timelb.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
				timelb.setForeground(Color.WHITE);
				timelb.setBounds(172, 23, 46, 14);
				DolacakPanel.add(timelb);
				
				t = new Timer(1000, new ActionListener() {
					private long time = 1000*60*60;
					
					public void actionPerformed(ActionEvent e) {
						if(ButtonListener.qFrame.isVisible() == false){
							t.removeActionListener(this);
							t.restart();
							t.stop();}
							
						else if(ButtonListener.qFrame.isVisible()){
						if(j <= 0){
							JOptionPane.showConfirmDialog(
						            MainMenu.frame1,
						            "Time is Over!",
						            "PolyPoly",JOptionPane.CLOSED_OPTION);
							
							ButtonListener.qFrame.dispose();
							MainMenu.frame1.setVisible(true);
							}
						
						else if (time > 0) {
					        time += 1000;
					        j--;
					        timelb.setText(Long.toString(j));

					    }}
					}
					});
				t.start();
				
				JLabel lblMedium = new JLabel("Medium");
				lblMedium.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
				lblMedium.setBounds(310, 23, 70, 14);
				lblMedium.setForeground(Color.WHITE);
				DolacakPanel.add(lblMedium);
				
				//SEÇENEKLER ÝÇÝN PANELLER VE LABELLAR. LABELLAR .TXT'den gelecek þeye baðlý olarak deðiþecek.
		
			
		JPanel A = new JPanel();
		A.setBounds(0, 228, 370, 48);
		A.setBackground(Color.DARK_GRAY);
		A.setLayout(null);
		add(A);

		JLabel ALabel = new JLabel(((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getOptionA());
		ALabel.setForeground(Color.WHITE);
		ALabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		ALabel.setBounds(55, 11, 250, 26);
		buttonAMaster = new JButton("A");
		buttonAMaster.setBounds(0,11,50,48);
		buttonAMaster.setLayout(null);
		A.add(buttonAMaster);
		buttonAMaster.addActionListener(new ButtonListener());
		A.add(ALabel);
		
		JPanel B = new JPanel();
		B.setBackground(Color.DARK_GRAY);
		B.setBounds(0, 294, 370, 48);
		B.setLayout(null);
		add(B);
		
		JLabel BLabel = new JLabel(((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getOptionB());
		BLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		BLabel.setForeground(Color.WHITE);
		BLabel.setBounds(55, 11, 250, 26);
		buttonBMaster = new JButton("B"); 
		buttonBMaster.setBounds(0,11,50,48);
		buttonBMaster.setLayout(null);
		B.add(buttonBMaster);
		buttonBMaster.addActionListener(new ButtonListener());
		B.add(BLabel);

		
		JPanel C = new JPanel();
		C.setBackground(Color.DARK_GRAY);
		C.setBounds(0, 353, 370, 48);
		C.setLayout(null);
		add(C);
		
		JLabel CLabel = new JLabel(((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getOptionC());
		CLabel.setForeground(Color.WHITE);
		CLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		CLabel.setBounds(55, 11, 250, 26);
		
		buttonCMaster = new JButton("C");
		buttonCMaster.setBounds(0,11,50,48);	
		buttonCMaster.setLayout(null);
		buttonCMaster.addActionListener(new ButtonListener());
		
		C.add(buttonCMaster);
		C.add(CLabel);
		
	
		
		JPanel D = new JPanel();
		D.setBackground(Color.DARK_GRAY);
		D.setBounds(0, 423, 370, 48);
		D.setLayout(null);
		add(D);
		
		JLabel DLabel = new JLabel (((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getOptionD());
		DLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		DLabel.setForeground(Color.WHITE);
		DLabel.setBounds(55, 11, 250, 26);
		buttonDMaster = new JButton("D");
		buttonDMaster.setBounds(0,11,50,48);
		buttonDMaster.setLayout(null);
		buttonDMaster.addActionListener(new ButtonListener());
		D.add(buttonDMaster);
		D.add(DLabel);
		
		
		QuestionHighlight = new JTextArea(((MasterIt) MasterIt.playerList.get(0).getMaster().get(index)).getQuestion());
		QuestionHighlight.setEditable(false);
		QuestionHighlight.setWrapStyleWord(true);
		QuestionHighlight.setForeground(SystemColor.textHighlightText);
		QuestionHighlight.setBackground(SystemColor.textHighlight);
		QuestionHighlight.setLineWrap(true);
		QuestionHighlight.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		QuestionHighlight.setBounds(0, 0, 390, 128);
		SoruPaneli.add(QuestionHighlight);
		
		
		label1 = new JLabel("");
		label1.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Skip.jpg"));
		label1.setBounds(170,3,39,30);
		add(label1);
		
		label2 = new JLabel("");
		label2.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Yari.jpg"));
		label2.setBounds(219,3,35,29);
		add(label2);
		
		label3 = new JLabel("");
		label3.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\%50.jpg"));
		label3.setBounds(73,3,87,31);
		add(label3);
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label4.setBounds(250,3,61,48);
		add(label4);
		
		label5 = new JLabel("");
		label5.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label5.setBounds(291,3,61,48);
		add(label5);
		
		label6 = new JLabel("");
		label6.setIcon(new ImageIcon("C:\\Users\\q\\Desktop\\Eclipse\\PolyPoly\\src\\Heart.jpg"));
		label6.setBounds(329,3,61,48);
		add(label6);
		
	}
}
