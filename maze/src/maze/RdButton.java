package maze;
import java.awt.*;

import javax.swing.UIManager;
public class RdButton extends AllButtonTwo{
	ToolBarTwo parent;
	RdButton(ToolBarTwo p)
	{
		super(p);
		parent=p;
		this.label="3¡G²×ÂI";
		this.setLabel(label);
		this.setBackground(Color.pink);
	}
	
	public void doSomething()
	{
		if(this.parent.parent.mainnewpage!=null)
		{	
			this.parent.parent.mainnewpage.state=State.rdbuttonstate;
			this.setBackground(Color.red);
			System.out.println(this.parent.parent.mainnewpage.state);
			this.parent.stbtn.setBackground(Color.pink);
			this.parent.ndbtn.setBackground(Color.pink);
		}
	}
}
