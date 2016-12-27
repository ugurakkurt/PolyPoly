
public class Player {
	
	private int score;
	private int falseAnswerRights = 3;
	private String name;
	private int location;
	private int consequtiveCorrects = 0;
	static Player player1,player2,player3,player4;
	static int numOfPlayers = 0;
	static int[] playerList;
	static int a = 0;

	public Player(String name, int score, int location) {
		
		this.name = name;
		this.score = score;
		this.location = location;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getConsequtiveCorrects() {
		return consequtiveCorrects;
	}

	public void setConsequtiveCorrects(int consequtiveCorrects) {
		this.consequtiveCorrects = consequtiveCorrects;
	}

	public void updateLocation(int x){
		this.location = x; 
	}
	
	public void setFalseAnswerRights(int falseAnswerRights){
		this.falseAnswerRights = falseAnswerRights;
	}
	public int getFalseAnswerRights(){
		return falseAnswerRights;
	}
	
	public void updateScore(int y){
		score =+ y;
	}
	
	public void OneStepFurther(){
		location++;
	}
	
	public boolean isItThreeCorrect(){ 
		boolean result = false;
		if(consequtiveCorrects == 3)
			result = true;
		return result;
			
	}
	
	public void isItMore100Points (int point){
		int temporary ;
		if(point>=200){
			this.location+= 2;
		    point = point - 200;
		}
		else if (point>=100){
			this.location++;
			point = point-100;
		}
		else if (point >= 300){
			this.location+= 3;
			point = point - 300;
		}
		temporary = point;
		
	}
}
