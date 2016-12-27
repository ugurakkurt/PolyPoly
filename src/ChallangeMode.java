import java.util.ArrayList;

import java.util.Random;
import java.awt.*;

public class ChallangeMode {
	protected String level;
    protected String question;
    protected String answer;
    protected int time;
    protected Color c;
	protected String field;
	protected String optionA,optionB,optionC,optionD;
	static ChallangeMode player1Challange,player2Challange,player3Challange,player4Challange; 
	static ArrayList<ChallangeMode> playerList = new ArrayList<ChallangeMode>();// challange buttonuna basýlmasýyla beraber bu dordu ýnýtýalze edýlecek(kullanýcý sayýsý kadarý tabi)
	
	ArrayList<ChallangeMode> challangeMode = new ArrayList <ChallangeMode>();
	
	public ArrayList getChallange(){
		return challangeMode;
		
	}
	public ChallangeMode (String level, String question,String optionA,String optionB,String optionC,String optionD, String answer, int time, Color c){
		// super();
		this.level = level;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.time = time;
		this.c = c;
	}
	 // initalize the challangeMode ArrayList
	public ChallangeMode(){
		challangeMode = new ArrayList <ChallangeMode>();
	}		
	public void addd(){
		Random generator = new Random();
		int x,y;
		for(int i = 0;i<42;i++){
			x = generator.nextInt(40);  // to select a question from a set of questions
			y= generator.nextInt(6);   // to select a field
			if(y==0){
				challangeMode.add(new ChallangeMode("easy", Questions.easyMath.get(x).getQuestion() ,Questions.easyMath.get(x).getOptionA(),Questions.easyMath.get(x).getOptionB(),
						Questions.easyMath.get(x).getOptionC(),Questions.easyMath.get(x).getOptionD(), Questions.easyMath.get(x).getAnswer() , 20 , Color.blue));
			}
			else if(y==1){
				challangeMode.add(new ChallangeMode("easy", Questions.easyHistory.get(x).getQuestion() ,Questions.easyHistory.get(x).getOptionA(),Questions.easyHistory.get(x).getOptionB(),
						Questions.easyHistory.get(x).getOptionC(),Questions.easyHistory.get(x).getOptionD(), Questions.easyHistory.get(x).getAnswer() , 20 , Color.cyan));
			}
			else if(y==2){
				challangeMode.add(new ChallangeMode("easy", Questions.easyBiology.get(x).getQuestion() ,Questions.easyBiology.get(x).getOptionA(),Questions.easyBiology.get(x).getOptionB(),
						Questions.easyBiology.get(x).getOptionC(),Questions.easyBiology.get(x).getOptionD(), Questions.easyBiology.get(x).getAnswer() , 20 , Color.pink));
			}
			else if(y==3){
				challangeMode.add(new ChallangeMode("easy", Questions.easyGeneralCulture.get(x).getQuestion() ,Questions.easyGeneralCulture.get(x).getOptionA(),Questions.easyGeneralCulture.get(x).getOptionB(),
						Questions.easyGeneralCulture.get(x).getOptionC(),Questions.easyGeneralCulture.get(x).getOptionD(), Questions.easyGeneralCulture.get(x).getAnswer() , 20 , Color.yellow));
			}
			else if(y==4){
				challangeMode.add(new ChallangeMode("easy", Questions.easyPhysics.get(x).getQuestion() ,Questions.easyPhysics.get(x).getOptionA(),Questions.easyPhysics.get(x).getOptionB(),
						Questions.easyPhysics.get(x).getOptionC(),Questions.easyPhysics.get(x).getOptionD(), Questions.easyPhysics.get(x).getAnswer() , 20 , Color.gray));
			}
			else if(y==5){
				challangeMode.add(new ChallangeMode("easy", Questions.easyChemistry.get(x).getQuestion() ,Questions.easyChemistry.get(x).getOptionA(),Questions.easyChemistry.get(x).getOptionB(),
						Questions.easyChemistry.get(x).getOptionC(),Questions.easyChemistry.get(x).getOptionD(), Questions.easyChemistry.get(x).getAnswer() , 20 , Color.red));
			}
		}
		
		
	}
	// setters
	public void setField(String field){
		this.field = field;
	}
	public void setQuestion(String question){
		this.question = question;
	}
	public void setAnswers(String answer){
		this.answer = answer;
	}
	public void setTime(int time){
		this.time = time;
	}
	
	public String getQuestion(){
		return question;
	}
	public String getOptionA(){
		return optionA;
	}
	public String getOptionB(){
		return optionB;
	}
	public String getOptionC(){
		return optionC;
	}
	public String getOptionD(){
		return optionD;
	}
	public String getAnswer(){
		return answer;
	}
	public int getTime(){
		return time;
	}
	public String getField(){
		return field;
	}
	public Color getcolor(){
		return c;
	}
	public String toString(){   // this is just to see all questions
		return level + " " + question + " " + answer + " " +  Integer.toString(time) + " " + field;
	}
}
