package maze;
import java.awt.*;

public class ToolBarTwo extends Panel{
	
	StButton stbtn;
	NdButton ndbtn;
	RdButton rdbtn;
	
	MainWindow parent;
	ToolBarTwo(MainWindow p)
	{
		parent=p;
		
		stbtn = new StButton(this);
		ndbtn = new NdButton(this);
		rdbtn = new RdButton(this);
		
		this.setLayout(new GridLayout(3,1));

		this.add(stbtn);
		this.add(ndbtn);
		this.add(rdbtn);
	}
}
