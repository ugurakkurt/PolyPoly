import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MasterIt  {
	protected String level;
    protected String question;
    protected String answer;
    protected int time;
    protected Color c;
    protected String field;
      // masterýt buttonuna basýlmasýyla beraber bu dordu ýnýtýalze edýlecek (kullanýcý sayýsý kadarý tabi)
    protected String optionA,optionB,optionC,optionD;
	ArrayList<MasterIt> masterIt = new ArrayList <MasterIt>();
	static ArrayList<MasterIt> playerList = new ArrayList<MasterIt>();
	
	public MasterIt (String level, String question,String optionA,String optionB,String optionC,String optionD, String answer, int time, Color c){
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
	 // initialize the MasterIt mode ArrayList
	public MasterIt(String field){
		this.field = field;
		masterIt = new ArrayList <MasterIt>();
	}
	public ArrayList getMaster(){
		return masterIt;
	}
	public void addd(){
		Random generator = new Random();
		int a = 40;
		int x;
		//this for loop is used to fill the easy questions of all fields

		for(int i = 0;i<43;i++){
			x = generator.nextInt(a);  // to select a question from a set of questions
			if(field.equalsIgnoreCase("math")){
				masterIt.add(new MasterIt("easy", Questions.easyMath.get(x).getQuestion() ,Questions.easyMath.get(x).getOptionA(),Questions.easyMath.get(x).getOptionB(),
						Questions.easyMath.get(x).getOptionC(),Questions.easyMath.get(x).getOptionD(), Questions.easyMath.get(x).getAnswer() , 20 , Color.blue));
			//	Questions.easyMath.remove(x);
			}
			else if(field.equalsIgnoreCase("History")){
				masterIt.add(new MasterIt("easy", Questions.easyHistory.get(x).getQuestion() ,Questions.easyHistory.get(x).getOptionA(),Questions.easyHistory.get(x).getOptionB(),
						Questions.easyHistory.get(x).getOptionC(),Questions.easyHistory.get(x).getOptionD(), Questions.easyHistory.get(x).getAnswer() , 20 , Color.cyan));
			//	Questions.easyHistory.remove(x);
			}
			else if(field.equalsIgnoreCase("Biology")){
				masterIt.add(new MasterIt("easy", Questions.easyBiology.get(x).getQuestion() ,Questions.easyBiology.get(x).getOptionA(),Questions.easyBiology.get(x).getOptionB(),
						Questions.easyBiology.get(x).getOptionC(),Questions.easyBiology.get(x).getOptionD(), Questions.easyBiology.get(x).getAnswer() , 20 , Color.pink));
			//	Questions.easyBiology.remove(x);
			}
			else if(field.equalsIgnoreCase("GeneralCulture")){
				masterIt.add(new MasterIt("easy", Questions.easyGeneralCulture.get(x).getQuestion() ,Questions.easyGeneralCulture.get(x).getOptionA(),Questions.easyGeneralCulture.get(x).getOptionB(),
						Questions.easyGeneralCulture.get(x).getOptionC(),Questions.easyGeneralCulture.get(x).getOptionD(), Questions.easyGeneralCulture.get(x).getAnswer() , 20 , Color.yellow));
			//	Questions.easyGeneralCulture.remove(x);
			}
			else if(field.equalsIgnoreCase("Physics")){
				masterIt.add(new MasterIt("easy", Questions.easyPhysics.get(x).getQuestion() ,Questions.easyPhysics.get(x).getOptionA(),Questions.easyPhysics.get(x).getOptionB(),
						Questions.easyPhysics.get(x).getOptionC(),Questions.easyPhysics.get(x).getOptionD(), Questions.easyPhysics.get(x).getAnswer() , 20 , Color.gray));
			//	Questions.easyPhysics.remove(x);
			}
			else if(field.equalsIgnoreCase("Chemistry")){
				masterIt.add(new MasterIt("easy", Questions.easyChemistry.get(x).getQuestion() ,Questions.easyChemistry.get(x).getOptionA(),Questions.easyChemistry.get(x).getOptionB(),
						Questions.easyChemistry.get(x).getOptionC(),Questions.easyChemistry.get(x).getOptionD(), Questions.easyChemistry.get(x).getAnswer() , 20 , Color.red));
			//	Questions.easyChemistry.remove(x);
			}
		}
		a=40;
		//this for loop is used to fill the medium questions of all fields
		for(int i = 43;i<86;i++){
			x = generator.nextInt(a);  // to select a question from a set of questions
			if(field.equalsIgnoreCase("math")){
				masterIt.add(new MasterIt("medium", Questions.mediumMath.get(x).getQuestion() ,Questions.mediumMath.get(x).getOptionA(),Questions.mediumMath.get(x).getOptionB(),
						Questions.mediumMath.get(x).getOptionC(),Questions.mediumMath.get(x).getOptionD(), Questions.mediumMath.get(x).getAnswer() , 20 , Color.blue));
			//	Questions.easyMath.remove(x);
			}
			else if(field.equalsIgnoreCase("History")){
				masterIt.add(new MasterIt("medium", Questions.mediumHistory.get(x).getQuestion() ,Questions.mediumHistory.get(x).getOptionA(),Questions.mediumHistory.get(x).getOptionB(),
						Questions.mediumHistory.get(x).getOptionC(),Questions.mediumHistory.get(x).getOptionD(), Questions.mediumHistory.get(x).getAnswer() , 20 , Color.cyan));
			//	Questions.easyHistory.remove(x);
			}
			else if(field.equalsIgnoreCase("Biology")){
				masterIt.add(new MasterIt("medium", Questions.mediumBiology.get(x).getQuestion() ,Questions.mediumBiology.get(x).getOptionA(),Questions.mediumBiology.get(x).getOptionB(),
						Questions.mediumBiology.get(x).getOptionC(),Questions.mediumBiology.get(x).getOptionD(), Questions.mediumBiology.get(x).getAnswer() , 20 , Color.pink));
			//	Questions.easyBiology.remove(x);
			}
			else if(field.equalsIgnoreCase("GeneralCulture")){
				masterIt.add(new MasterIt("medium", Questions.mediumGeneralCulture.get(x).getQuestion() ,Questions.mediumGeneralCulture.get(x).getOptionA(),Questions.mediumGeneralCulture.get(x).getOptionB(),
						Questions.mediumGeneralCulture.get(x).getOptionC(),Questions.mediumGeneralCulture.get(x).getOptionD(), Questions.mediumGeneralCulture.get(x).getAnswer() , 20 , Color.yellow));
			//	Questions.easyGeneralCulture.remove(x);
			}
			else if(field.equalsIgnoreCase("Physics")){
				masterIt.add(new MasterIt("medium", Questions.mediumPhysics.get(x).getQuestion() ,Questions.mediumPhysics.get(x).getOptionA(),Questions.mediumPhysics.get(x).getOptionB(),
						Questions.mediumPhysics.get(x).getOptionC(),Questions.mediumPhysics.get(x).getOptionD(), Questions.mediumPhysics.get(x).getAnswer() , 20 , Color.gray));
			//	Questions.easyPhysics.remove(x);
			}
			else if(field.equalsIgnoreCase("Chemistry")){
				masterIt.add(new MasterIt("medium", Questions.mediumChemistry.get(x).getQuestion() ,Questions.mediumChemistry.get(x).getOptionA(),Questions.mediumChemistry.get(x).getOptionB(),
						Questions.mediumChemistry.get(x).getOptionC(),Questions.mediumChemistry.get(x).getOptionD(), Questions.mediumChemistry.get(x).getAnswer() , 20 , Color.red));
			//	Questions.easyChemistry.remove(x);
			}
		}
		a=40;
		//this for loop is used to fill the hard questions of all fields
		for(int i = 86;i<126;i++){ 
			x = generator.nextInt(a);  // to select a question from a set of questions
			if(field.equalsIgnoreCase("math")){
				masterIt.add(new MasterIt("hard", Questions.hardMath.get(x).getQuestion() ,Questions.hardMath.get(x).getOptionA(),Questions.hardMath.get(x).getOptionB(),
						Questions.hardMath.get(x).getOptionC(),Questions.hardMath.get(x).getOptionD(), Questions.hardMath.get(x).getAnswer() , 20 , Color.blue));
			//	Questions.easyMath.remove(x);
			}
			else if(field.equalsIgnoreCase("History")){
				masterIt.add(new MasterIt("hard", Questions.hardHistory.get(x).getQuestion() ,Questions.hardHistory.get(x).getOptionA(),Questions.hardHistory.get(x).getOptionB(),
						Questions.hardHistory.get(x).getOptionC(),Questions.hardHistory.get(x).getOptionD(), Questions.hardHistory.get(x).getAnswer() , 20 , Color.cyan));
			//	Questions.easyHistory.remove(x);
			}
			else if(field.equalsIgnoreCase("Biology")){
				masterIt.add(new MasterIt("hard", Questions.hardBiology.get(x).getQuestion() ,Questions.hardBiology.get(x).getOptionA(),Questions.hardBiology.get(x).getOptionB(),
						Questions.hardBiology.get(x).getOptionC(),Questions.hardBiology.get(x).getOptionD(), Questions.hardBiology.get(x).getAnswer() , 20 , Color.pink));
			//	Questions.easyBiology.remove(x);
			}
			else if(field.equalsIgnoreCase("GeneralCulture")){
				masterIt.add(new MasterIt("hard", Questions.hardGeneralCulture.get(x).getQuestion() ,Questions.hardGeneralCulture.get(x).getOptionA(),Questions.hardGeneralCulture.get(x).getOptionB(),
						Questions.hardGeneralCulture.get(x).getOptionC(),Questions.hardGeneralCulture.get(x).getOptionD(), Questions.hardGeneralCulture.get(x).getAnswer() , 20 , Color.yellow));
			//	Questions.easyGeneralCulture.remove(x);
			}
			else if(field.equalsIgnoreCase("Physics")){
				masterIt.add(new MasterIt("hard", Questions.hardPhysics.get(x).getQuestion() ,Questions.hardPhysics.get(x).getOptionA(),Questions.hardPhysics.get(x).getOptionB(),
						Questions.hardPhysics.get(x).getOptionC(),Questions.hardPhysics.get(x).getOptionD(), Questions.hardPhysics.get(x).getAnswer() , 20 , Color.gray));
			//	Questions.easyPhysics.remove(x);
			}
			else if(field.equalsIgnoreCase("Chemistry")){
				masterIt.add(new MasterIt("hard", Questions.hardChemistry.get(x).getQuestion() ,Questions.hardChemistry.get(x).getOptionA(),Questions.hardChemistry.get(x).getOptionB(),
						Questions.hardChemistry.get(x).getOptionC(),Questions.hardChemistry.get(x).getOptionD(), Questions.hardChemistry.get(x).getAnswer() , 20 , Color.red));
			//	Questions.easyChemistry.remove(x);
			}
		}
		
		
	}
	//setters
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
	public void setColor(Color c){
		this.c = c;
	}
	//getters
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
	public Color getColor(){
		return c;
	}
	public String toString(){
		return level + " " + question + " " + answer + " " +  Integer.toString(time);
	}
}
