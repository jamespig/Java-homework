package maze;

import java.awt.*;

public class ToolBar extends Panel{
	
	ImportButton importbtn;
	SaveButton savebtn;
	NewButton newbtn;
	ClearButton clearbtn;
	BeginButton beginbtn;
	
	MainWindow parent;
	ToolBar(MainWindow p)
	{	
		parent=p;
		this.setBackground(Color.DARK_GRAY);
			
		importbtn = new ImportButton(this);
		savebtn = new SaveButton(this);
		newbtn = new NewButton(this);
		clearbtn = new ClearButton(this); 
		beginbtn = new BeginButton(this);
		
		this.setLayout(new FlowLayout());
		this.add(importbtn);
		this.add(savebtn);
		this.add(newbtn);
		this.add(clearbtn);
		this.add(beginbtn);
	}
}
