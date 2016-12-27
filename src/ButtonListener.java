import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ButtonListener implements ActionListener {
	private JComponent panel;
	private JButton roll;
	public static Die die;
	QuestionScreen ama,aba;
	static JFrame qFrame;
	int playerNo[] ;
	
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == MainMenuPanel.creditsButton){
				MainMenu.frame1.setVisible(false);
				MainMenu.frame1 = new JFrame("new Game");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(new CreditsPanel());
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
		}
		else if(event.getSource() == MainMenuPanel.btnStartGame){
			 	MainMenu.frame1.getContentPane().add(new NewGamePanel());
			    MainMenu.frame1.setVisible(false);
				MainMenu.frame1 = new JFrame("new Game");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(new NewGamePanel());
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
		}
		else if(event.getSource() == MainMenuPanel.backToMain){
			MainMenu.frame1.setVisible(false);
			
			
			int confirm = JOptionPane.showConfirmDialog(
			            MainMenu.frame1,
			            "Do you really want to back ?",
			            "PolyPoly",JOptionPane.YES_NO_OPTION);
			 
			  if(confirm == JOptionPane.YES_OPTION){
				  
				  MainMenu.frame1.dispose();
				  MainMenu.frame1 = new JFrame("Main Menu"); // baþka türlü olmuyor beyler visibilty deðiþtirince olmuyor 
				  MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // diðer türlüde panelelr üst üste ekleniyor herhangi bir hiyerarþi yapmadýðýmýz için (UTKU)
				  MainMenuPanel panel = new MainMenuPanel();
		      	  MainMenu.frame1.getContentPane().add(panel);
		      	  MainMenu.frame1.pack();
		      	  MainMenu.frame1.setVisible(true);		
		      		
			 }
			  else if(confirm == JOptionPane.NO_OPTION){
				
				  MainMenu.frame1.removeAll();
				  MainMenu.frame1 = new JFrame("new Game");
				  MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  MainMenu.frame1.getContentPane().add(new CreditsPanel());
				  MainMenu.frame1.pack();
				  MainMenu.frame1.setVisible(true);
			 }
		}
		else if(event.getSource() == MainMenuPanel.btnScores){
			// scorespanel classý olusturulacak
			MainMenu.frame1.setVisible(false);
			MainMenu.frame1 = new JFrame("SCORES");
			MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MainMenu.frame1.getContentPane().add(new ScoresPanel());
			MainMenu.frame1.pack();
			MainMenu.frame1.setVisible(true);
			
		}
		else if(event.getSource() == MainMenuPanel.btnHelp){
			MainMenu.frame1.setVisible(false);
			MainMenu.frame1 = new JFrame("HELP");
			MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MainMenu.frame1.getContentPane().add(new HelpPanel());
			MainMenu.frame1.pack();
			MainMenu.frame1.setVisible(true);
		}
		else if(event.getSource() == NewGamePanel.button1){
			{
				if(Player.numOfPlayers == 1 && NewGamePanel.textField.getText().equals("")){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Please Enter Name!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
				}
				else if((Player.numOfPlayers== 2) && (NewGamePanel.textField.getText().equals("") || NewGamePanel.textField_1.getText().equals(""))){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Please Enter Name!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
				}
				else if((Player.numOfPlayers == 3) && (NewGamePanel.textField.getText().equals("") || NewGamePanel.textField_1.getText().equals("") || 
						NewGamePanel.textField_2.getText().equals(""))){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Please Enter Name!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
				}
				else if((Player.numOfPlayers == 4) && (NewGamePanel.textField.getText().equals("") || NewGamePanel.textField_1.getText().equals("") || 
						NewGamePanel.textField_2.getText().equals("") || NewGamePanel.textField_3.getText().equals(""))){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Please Enter Name!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
				} 
				else if((Player.numOfPlayers == 0)  && (NewGamePanel.textField.getText().equals(""))){
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Please Enter Name!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
				}
				else{
				MainMenu.frame1.setVisible(false);
				MainMenu.frame1 = new JFrame("selection");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(new SelectionScreen());
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
				}
		     ArrayList<Player> playerList = new ArrayList <Player>();
				if (Player.numOfPlayers == 1){
					Player.player1 = new Player(NewGamePanel.textField.getText(),0,0);
					System.out.println("bir oyuncu" + Player.numOfPlayers);
					playerList.add(Player.player1);
					playerNo = new int[1];
					playerNo[0] = Player.player1.getScore();
					}
				else if (Player.numOfPlayers== 2){
					Player.player1 = new Player(NewGamePanel.textField.getText(),0,0);
					Player.player2 = new Player(NewGamePanel.textField_1.getText(),0,0);	
					System.out.println("iki oyuncu"+ Player.numOfPlayers);
					playerList.add(Player.player1);
					playerList.add(Player.player2);
					playerNo = new int[2];
					playerNo[0] = Player.player1.getScore();
					playerNo[1] = Player.player2.getScore();
					}
				else if (Player.numOfPlayers == 3){
					Player.player1 = new Player(NewGamePanel.textField.getText(),0,0);
					Player.player2 = new Player(NewGamePanel.textField_1.getText(),0,0);
					Player.player3 = new Player(NewGamePanel.textField_2.getText(),0,0);
					System.out.println("uc oyuncu"+ Player.numOfPlayers);
					playerList.add(Player.player1);
					playerList.add(Player.player2);
					playerList.add(Player.player3);
					playerNo = new int[3];
					playerNo[0] = Player.player1.getScore();
					playerNo[1] = Player.player2.getScore();
					playerNo[2] = Player.player3.getScore();
					}
				else if (Player.numOfPlayers== 4){
					Player.player1 = new Player(NewGamePanel.textField.getText(),0,0);
					Player.player2 = new Player(NewGamePanel.textField_1.getText(),0,0);
					Player.player3 = new Player(NewGamePanel.textField_2.getText(),0,0);
					Player.player4 = new Player(NewGamePanel.textField_3.getText(),0,0);
					System.out.println("dort oyuncu"+ Player.numOfPlayers);
					playerList.add(Player.player1);
					playerList.add(Player.player2);
					playerList.add(Player.player3);
					playerList.add(Player.player4);
					playerNo = new int[4];
					playerNo[0] = Player.player1.getScore();
					playerNo[1] = Player.player2.getScore();
					playerNo[2] = Player.player3.getScore();
					playerNo[3] = Player.player3.getScore();
				}
		else{
			Player.player1 = new Player(NewGamePanel.textField.getText(),0,0);
			System.out.println("niye buraya girdin ki");
			playerList.add(Player.player1);
		}
	}}
		else if(event.getSource() == SelectionScreen.challangeButton){
			//a=0;
			MainMenu.frame1.setVisible(false);
			if(Player.numOfPlayers== 1){
				ChallangeMode player1Challange;
				player1Challange = new ChallangeMode();
				player1Challange.addd();
				ChallangeMode.playerList.add(player1Challange);
			}
			else if(Player.numOfPlayers == 2){
				ChallangeMode player1Challange,player2Challange;
				player1Challange = new ChallangeMode();
				player1Challange.addd();
				player2Challange = new ChallangeMode();
				player2Challange.addd();
				ChallangeMode.playerList.add(player1Challange);
				ChallangeMode.playerList.add(player2Challange);
			}
			else if(Player.numOfPlayers== 3){
				ChallangeMode player1Challange,player2Challange,player3Challange;
				player1Challange = new ChallangeMode();
				player1Challange.addd();
				player2Challange = new ChallangeMode();
				player2Challange.addd();
				player3Challange = new ChallangeMode();
				player3Challange.addd();
				ChallangeMode.playerList.add(player1Challange);
				ChallangeMode.playerList.add(player2Challange);
				ChallangeMode.playerList.add(player3Challange);
			}
			else if(Player.numOfPlayers == 4){
				ChallangeMode player1Challange,player2Challange,player3Challange,player4Challange;
				player1Challange = new ChallangeMode();
				player1Challange.addd();
				player2Challange = new ChallangeMode();
				player2Challange.addd();
				player3Challange = new ChallangeMode();
				player3Challange.addd();
				player4Challange = new ChallangeMode();
				player4Challange.addd();
				ChallangeMode.playerList.add(player1Challange);
				ChallangeMode.playerList.add(player2Challange);
				ChallangeMode.playerList.add(player3Challange);
				ChallangeMode.playerList.add(player4Challange);
			}
			else{
				MasterIt player1Master;
				player1Master = new MasterIt("physics");
				player1Master.addd();
				MasterIt.playerList.add(player1Master);
			} 
			MainMenu.frame1 = new JFrame("Challange Mode Board");
			BoardScreen2 boardScreen = new BoardScreen2();
			MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MainMenu.frame1.getContentPane().add(boardScreen);
			MainMenu.frame1.pack();
			MainMenu.frame1.setVisible(true);
				
//				MainMenu.frame1 = new JFrame("Challange Mode");
//				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				BoardScreen2 boardScreen = new BoardScreen2();
//				MainMenu.frame1.getContentPane().add(boardScreen);
//				MainMenu.frame1.pack();
//				MainMenu.frame1.setVisible(true);
				
			}
			else if(event.getSource() == SelectionScreen.masterItButton){
				//a=0;
				System.out.println(Player.a);
				MainMenu.frame1.setVisible(false);
				MainMenu.frame1 = new JFrame("MasterIt Mode Select Field");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(new SelectionScreen2());
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
			else if(event.getSource() == SelectionScreen2.btnPhysics){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("physics");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("physics");
					player1Master.addd();
					player2Master = new MasterIt("physics");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("physics");
					player1Master.addd();
					player2Master = new MasterIt("physics");
					player2Master.addd();
					player3Master = new MasterIt("physics");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("physics");
					player1Master.addd();
					player2Master = new MasterIt("physics");
					player2Master.addd();
					player3Master = new MasterIt("physics");
					player3Master.addd();
					player4Master = new MasterIt("physics");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("physics");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("physics");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
			else if(event.getSource() == SelectionScreen2.btnMath){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("math");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("math");
					player1Master.addd();
					player2Master = new MasterIt("math");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("math");
					player1Master.addd();
					player2Master = new MasterIt("math");
					player2Master.addd();
					player3Master = new MasterIt("math");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("math");
					player1Master.addd();
					player2Master = new MasterIt("math");
					player2Master.addd();
					player3Master = new MasterIt("math");
					player3Master.addd();
					player4Master = new MasterIt("math");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("math");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("math");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
				
            }
		
		
		
		
		
		
			else if(event.getSource() == SelectionScreen2.btnChemistry){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("chemistry");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("chemistry");
					player1Master.addd();
					player2Master = new MasterIt("chemistry");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("chemistry");
					player1Master.addd();
					player2Master = new MasterIt("chemistry");
					player2Master.addd();
					player3Master = new MasterIt("chemistry");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("chemistry");
					player1Master.addd();
					player2Master = new MasterIt("chemistry");
					player2Master.addd();
					player3Master = new MasterIt("chemistry");
					player3Master.addd();
					player4Master = new MasterIt("chemistry");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("chemistry");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("chemistry");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
		
			else if(event.getSource() == SelectionScreen2.btnHistory){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("history");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("history");
					player1Master.addd();
					player2Master = new MasterIt("history");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("history");
					player1Master.addd();
					player2Master = new MasterIt("history");
					player2Master.addd();
					player3Master = new MasterIt("history");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("history");
					player1Master.addd();
					player2Master = new MasterIt("history");
					player2Master.addd();
					player3Master = new MasterIt("history");
					player3Master.addd();
					player4Master = new MasterIt("history");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("history");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("history");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
		
			else if(event.getSource() == SelectionScreen2.btnGeneral){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("generalculture");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("generalculture");
					player1Master.addd();
					player2Master = new MasterIt("generalculture");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("generalculture");
					player1Master.addd();
					player2Master = new MasterIt("generalculture");
					player2Master.addd();
					player3Master = new MasterIt("generalculture");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("generalculture");
					player1Master.addd();
					player2Master = new MasterIt("generalculture");
					player2Master.addd();
					player3Master = new MasterIt("generalculture");
					player3Master.addd();
					player4Master = new MasterIt("generalculture");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("generalculture");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("generalculture");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
		
			else if(event.getSource() == SelectionScreen2.btnBiology){
				MainMenu.frame1.setVisible(false);
				if(Player.numOfPlayers== 1){
					MasterIt player1Master;
					player1Master = new MasterIt("biology");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				}
				else if(Player.numOfPlayers == 2){
					MasterIt player1Master,player2Master;
					player1Master = new MasterIt("biology");
					player1Master.addd();
					player2Master = new MasterIt("biology");
					player2Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
				}
				else if(Player.numOfPlayers== 3){
					MasterIt player1Master,player2Master,player3Master;
					player1Master = new MasterIt("biology");
					player1Master.addd();
					player2Master = new MasterIt("biology");
					player2Master.addd();
					player3Master = new MasterIt("biology");
					player3Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
				}
				else if(Player.numOfPlayers == 4){
					MasterIt player1Master,player2Master,player3Master,player4Master;
					player1Master = new MasterIt("biology");
					player1Master.addd();
					player2Master = new MasterIt("biology");
					player2Master.addd();
					player3Master = new MasterIt("biology");
					player3Master.addd();
					player4Master = new MasterIt("biology");
					player4Master.addd();
					MasterIt.playerList.add(player1Master);
					MasterIt.playerList.add(player2Master);
					MasterIt.playerList.add(player3Master);
					MasterIt.playerList.add(player4Master);
				}
				else{
					MasterIt player1Master;
					player1Master = new MasterIt("biology");
					player1Master.addd();
					MasterIt.playerList.add(player1Master);
				} 
				MainMenu.frame1 = new JFrame("MasterIt Mode Board");
				BoardScreen2 boardScreen = new BoardScreen2("biology");
				MainMenu.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MainMenu.frame1.getContentPane().add(boardScreen);
				MainMenu.frame1.pack();
				MainMenu.frame1.setVisible(true);
			}
		
		
		
		
		
		
		
		
		
		
		
		
			else if(event.getSource() == BoardScreen2.seeQuestionforChallange){
				MainMenu.frame1.setVisible(false);
			    aba = new QuestionScreen();
			    qFrame= new JFrame("Master Mode Question");
				qFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				qFrame.getContentPane().add(aba);
				qFrame.pack();
				qFrame.setVisible(true);
			}
			else if(event.getSource() == BoardScreen2.seeQuestionforMaster){
				MainMenu.frame1.setVisible(false);
				ama = new QuestionScreen("math",0);
				qFrame= new JFrame("Master Mode Question");
				qFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				qFrame.getContentPane().add(ama);
				qFrame.pack();
				qFrame.setVisible(true);
			}
			
			else if(event.getSource() == QuestionScreen.buttonAMaster){
				if(Player.numOfPlayers == 4){
				
				if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}
			else if(event.getSource() == QuestionScreen.buttonBMaster){
				if(Player.numOfPlayers == 4){
				
				if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}else if(event.getSource() == QuestionScreen.buttonCMaster){
				if(Player.numOfPlayers == 4){
				
				if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}else if(event.getSource() == QuestionScreen.buttonDMaster){
				if(Player.numOfPlayers == 4){
				
				if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((MasterIt) MasterIt.playerList.get(Player.a).getMaster().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}
		
		
		
		
		
		
			else if(event.getSource() == QuestionScreen.buttonAChallange){
				if(Player.numOfPlayers == 4){
				
				if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("A")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}
			else if(event.getSource() == QuestionScreen.buttonBMaster){
				if(Player.numOfPlayers == 4){
				
				if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("B")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}else if(event.getSource() == QuestionScreen.buttonCMaster){
				if(Player.numOfPlayers == 4){
				
				if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("C")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}else if(event.getSource() == QuestionScreen.buttonDMaster){
				if(Player.numOfPlayers == 4){
				
				if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					
					
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					else if(Player.a==3){
						Player.player4.setScore(Player.player4.getScore() + 100);
						BoardScreen2.scoreLbl4.setText(Integer.toString(Player.player4.getScore()));
						BoardScreen2.scoreLbl4.repaint();
						
					}
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==4){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				}
				else if(Player.numOfPlayers ==3){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
						
					}
					else if(Player.a==2){
						Player.player3.setScore(Player.player3.getScore() + 100);
						BoardScreen2.scoreLbl3.setText(Integer.toString(Player.player3.getScore()));
						BoardScreen2.scoreLbl3.repaint();
						
					}
					
				
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==3){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);			
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
				
					
				}
				else if(Player.numOfPlayers ==2){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
					if(Player.a==0){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();
						
						}
					else if(Player.a==1){
						Player.player2.setScore(Player.player2.getScore() + 100);
						BoardScreen2.scoreLbl2.setText(Integer.toString(Player.player2.getScore()));
						BoardScreen2.scoreLbl2.repaint();
					}

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2)  
						Player.a = 0;
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					System.out.println(Player.a);
					}
					
				}
				else if(Player.numOfPlayers ==1){
					if(((ChallangeMode) ChallangeMode.playerList.get(Player.a).getChallange().get(QuestionScreen.index)).getAnswer().equalsIgnoreCase("D")){
						Player.player1.setScore(Player.player1.getScore() + 100);
						BoardScreen2.scoreLbl1.setText(Integer.toString(Player.player1.getScore()));
						BoardScreen2.scoreLbl1.repaint();	

					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Successful!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
							ButtonListener.qFrame.setVisible(false);
							MainMenu.frame1.setVisible(true);	
				}
				else{
					Player.a++;
					if(Player.a==2){   
						Player.a = 0;}
					JOptionPane.showConfirmDialog(
				            MainMenu.frame1,
				            "Wrong answer!",
				            "PolyPoly",JOptionPane.CLOSED_OPTION);
					System.out.println("yanlýþ yaptý" +Player.a);
					
					
					ButtonListener.qFrame.setVisible(false);
					MainMenu.frame1.setVisible(true);
					}		
	
}
				   	
			}
		
		
			
		else if(event.getSource() == MainMenuPanel.quitButton){
			//quit classý olusturulucak
			//quit classý neden oluþuturulacak bu tuþ çýkmak içinse dispose la halledelim bu olayý (Utku)
			//MainMenu.frame1.setVisible(false);
			System.exit(0);
		} 
		

	
			}}
