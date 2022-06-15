package mazegenerator;

import java.util.ArrayList;
import java.util.Collections;

public class MazeGenerator {
	private ArrayList<ArrayList<Grid>> grids;
	private boolean isUnlocked = false;
	private int rows, columns;
	private int startR, staartC;
	
	public void generate(int sr, int sc) {
		
		if (!isUnlocked) {
			return;
		}
		
		this.startR = sr;
		this.staartC = sc;
		
		loopGen(this.startR, this.staartC);
		
	}
	
	// �H���j���覡�M���Ҧ���l
	private void loopGen(int r, int c) {
		
		grids.get(r).get(c).Walked = true;
		
		// �|�����y���L(�ŧi�ɤw�g���L�H���F)
		for(int i = 0; i < 4; i++) {
			int nr = 0, nc = 0;
			switch (grids.get(r).get(c).walls.get(i)) {
			case 0:
				nr = -1;
				nc = 0;
				break;
			case 1:
				nr = 0;
				nc = 1;
				break;
			case 2:
				nr = 0;
				nc = -1;
				break;
			case 3:
				nr = 1;
				nc = 0;
				break;
			}
			
			// �W�X�d��
			if(r + nr >= this.rows || r + nr < 0) continue;
			if(c + nc >= this.columns || c + nc < 0) continue;
			// �������L����l
			if(grids.get(r + nr).get(c + nc).Walked) continue;
			
			// �p�G�ŦX�i�H��������A�N���X�q�D
			switch(grids.get(r).get(c).walls.get(i)) {
			case 0:
				grids.get(r).get(c).Wall_North = false;
				grids.get(r + nr).get(c + nc).Wall_South = false;
				break;
			case 1:
				grids.get(r).get(c).Wall_East = false;
				grids.get(r + nr).get(c + nc).Wall_West = false;
				break;
			case 2:
				grids.get(r).get(c).Wall_West = false;
				grids.get(r + nr).get(c + nc).Wall_East = false;
				break;
			case 3:
				grids.get(r).get(c).Wall_South = false;
				grids.get(r + nr).get(c + nc).Wall_North = false;
				break;
			}
			loopGen(r +nr, c + nc);
		}
	}
	
	// Constructor
	public MazeGenerator(int r, int c) {
		this.rows = r;
		this.columns = c;
		this.grids = new ArrayList<>();
		
		for(int i = 0; i < r; i++) {
			this.grids.add(Grid.newArrayListGrids(c));
		}
		
		isUnlocked = true;
	}
	
	// Grids' getter
	public ArrayList<ArrayList<Grid>> getGrids(){
		return grids;
	}
}

class Grid{
	
	ArrayList<Integer> walls = new ArrayList<>();
	boolean Wall_North, Wall_East, Wall_West, Wall_South;
	boolean Walked;
	
	public Grid() {
		for(int i = 0; i < 4; i++) {
			walls.add(i);
		}
		Collections.shuffle(walls); // �H���վ㨫�k(���)
		Wall_North = true;
		Wall_East = true;
		Wall_West = true;
		Wall_South = true;
		this.Walked = false;
	}
	
	public static ArrayList<Grid> newArrayListGrids(int size) {
		ArrayList<Grid> newALG = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			newALG.add(new Grid());
		}
		return newALG;
	}
}
