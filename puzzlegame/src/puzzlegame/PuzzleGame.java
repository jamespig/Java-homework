package puzzlegame;

public class PuzzleGame {
	private String name = "Puzzle Game";
	private String version = "1";
	public MainWin mainWin;
	
	public void setTitle(String title) {
		
	}
	
	PuzzleGame(){
		mainWin = new MainWin(this);
	}
}
