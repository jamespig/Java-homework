package mazegenerator;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualization extends JFrame{
private static final long serialVersionUID = 1L;
	
	private int W, H, sx, sy, ex, ey;
	private	JPanel panel;
	private MazeGenerator mazeGenerator;
	private PathFinder pathFinder;
	private int width = 15;
	
	private Random random;
	
	public Visualization(int w, int W, int H) {
		this.width = w;
		this.W = W;
		this.H = H;
	}
	
	public void operate() {
		
		// ��JFrame�]�m
		this.setSize(width * W + 7, width * H + 30);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Maze Visualization");
		this.setResizable(false);
		
		// �H�����Ͱ_�I�M���I
		random = new Random();
		sx = random.nextInt(W);
		sy = random.nextInt(H);
		ex = random.nextInt(W);
		ey = random.nextInt(H);
		// ���Ͱg�c
		mazeGenerator = new MazeGenerator(H, W);
		mazeGenerator.generate(sy, sx);
		ArrayList<ArrayList<Grid>> grids = mazeGenerator.getGrids();
		// ���͸��u
		pathFinder = new PathFinder(grids, sy, sx, ey, ex);
		pathFinder.find();
		Stack<Direct> path = pathFinder.getPath();
		
		panel = new JPanel() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics g) {
				
				super.paint(g);
				
				// �ھ��𦳵L�e��
				for(int i = 0; i < H; i++) {
					for(int j = 0; j < W; j++) {
						if(grids.get(i).get(j).Wall_North) g.drawLine(width * j, width * i, width * (j + 1), width * i);
						if(grids.get(i).get(j).Wall_East) g.drawLine(width * (j + 1), width * i, width * (j + 1), width * (i + 1));
						if(grids.get(i).get(j).Wall_West) g.drawLine(width * j, width * i, width * j, width * (i + 1));
						if(grids.get(i).get(j).Wall_South) g.drawLine(width * j, width * (i + 1), width * (j + 1), width * (i + 1));
						
					}
				}
				
				// �_�I
				g.setColor(Color.GREEN);
				g.fillRect(width * sx + 5, width * sy + 5, width - 10, width - 10);
				// ���I
				g.setColor(Color.RED);
				g.fillRect(width * ex + 5, width * ey + 5, width - 10, width - 10);
				// ���u
				g.setColor(Color.MAGENTA);
				int x = width * sx + width / 2, y = width * sy + width / 2;
				for(Direct direct : path) {
					switch (direct) {
					case NORTH:
						g.drawLine(x, y, x, y - width);
						y = y - width;
						break;
					case EAST:
						g.drawLine(x, y, x + width, y);
						x = x + width;
						break;
					case WEST:
						g.drawLine(x, y, x - width, y);
						x = x - width;
						break;
					case SOUTH:
						g.drawLine(x, y, x, y + width);
						y = y + width;
						break;
					}
				}
				
			}
			
		};
		
		this.add(panel);
		
		this.setVisible(true);
	}
}
