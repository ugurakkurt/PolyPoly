
public class Exit {
	
	boolean isGameOver = false;

	public void setIsGameOver(boolean isGameOver){
		this.isGameOver = isGameOver;
	}
	public boolean getIsGameOver(){
		return isGameOver;
	}
	
	public void exit(boolean isGameOver){
		this.isGameOver = true;
		
	}

}
 