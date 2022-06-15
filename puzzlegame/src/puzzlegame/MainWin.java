package puzzlegame;
import java.awt.*;
import java.awt.event.*;

public class MainWin extends Frame{
	PuzzleGame parent;
	Dimension size = new Dimension(500, 400);
	public ToolBar toolBar;
	
	MainWin(PuzzleGame p){
		parent = p;
		
		this.setSize(size);
		toolBar = new ToolBar(this);
		
		this.setLayout(new BorderLayout());
		this.add(toolBar,BorderLayout.NORTH);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setVisible(true);
	}
}
