package puzzlegame;
import java.awt.*;
import java.awt.event.*;

public class ToolBar extends Panel{
	MainWin parent;
	
	NewPageButton newPageBtn;
	
	ToolBar(MainWin p){
		parent = p;
		
		this.setBackground(Color.DARK_GRAY);
		
		newPageBtn = new NewPageButton(this);
		
		this.setLayout(new FlowLayout());
		
		this.add(newPageBtn);
	}
}
