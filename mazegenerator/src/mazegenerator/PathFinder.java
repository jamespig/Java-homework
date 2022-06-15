package mazegenerator;

import java.util.ArrayList;
import java.util.Stack;

public class PathFinder {
	private ArrayList<ArrayList<Grid>> grids;
	private Stack<Direct> path;
	private ArrayList<ArrayList<Boolean>> visited;
	
	int startRow, startColumn, endRow, endColumn;
	
	public PathFinder(ArrayList<ArrayList<Grid>> grids, int sr, int sc, int er, int ec) {
		this.grids = grids;
		this.path = new Stack<>();
		this.visited = new ArrayList<>();
		
		while (visited.size() < grids.size()) {
			visited.add(new ArrayList<Boolean>());
			for(int i = 0; i < grids.get(0).size(); i++) {
				visited.get(visited.size() - 1).add(false);
			}
		}
		
		this.startRow = sr;
		this.startColumn = sc;
		this.endRow = er;
		this.endColumn = ec;
	}
	
	public void find() {
		findLoop(this.startRow, this.startColumn);
	}
	
	// 利用遞迴找路線
	private boolean findLoop(int r, int c) {
		if(this.visited.get(r).get(c)) return false; // 忽略走過的格子
		this.visited.get(r).set(c, true);
		if(this.endRow == r && this.endColumn == c) return true; // 找到終點
		// 依序往各個方向走
		if(!this.grids.get(r).get(c).Wall_North) {
			path.push(Direct.NORTH);
			if(findLoop(r - 1, c)) return true;
			path.pop();
		}
		if(!this.grids.get(r).get(c).Wall_East) {
			path.push(Direct.EAST);
			if(findLoop(r, c + 1)) return true;
			path.pop();
		}
		if(!this.grids.get(r).get(c).Wall_West) {
			path.push(Direct.WEST);
			if(findLoop(r, c - 1)) return true;
			path.pop();
		}
		if(!this.grids.get(r).get(c).Wall_South) {
			path.push(Direct.SOUTH);
			if(findLoop(r + 1, c)) return true;
			path.pop();
		}
		
		this.visited.get(r).set(c, false);
		return false;
	}

	public Stack<Direct> getPath(){
		return this.path;
	}
	
}

enum Direct{
	NORTH, EAST, WEST, SOUTH
}
