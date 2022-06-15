package maze;

import java.awt.*;

public class ToolBar extends Panel{
	
	ExportButton exportbtn;
	ImportButton importbtn;
	SaveButton savebtn;
	NewButton newbtn;

	ToolBar()
	{	

		this.setBackground(Color.DARK_GRAY);
			
		exportbtn = new ExportButton(this);
		importbtn = new ImportButton(this);
		savebtn = new SaveButton(this);
		newbtn = new NewButton(this);
		
		this.setLayout(new FlowLayout());
		this.add(exportbtn);
		this.add(importbtn);
		this.add(savebtn);
		this.add(newbtn);
	}
}
