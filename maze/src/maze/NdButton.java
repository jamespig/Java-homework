package maze;
import java.awt.*;

import javax.swing.UIManager;
public class NdButton extends AllButtonTwo{
	ToolBarTwo parent;
	
	NdButton(ToolBarTwo p)
	{
		super(p);
		parent=p;
		this.label="2¡G°_ÂI";
		this.setLabel(label);
		this.setBackground(Color.pink);
		
	}
	
	public void doSomething()
	{

		if(this.parent.parent.mainnewpage!=null)
		{
			this.parent.parent.mainnewpage.state=State.ndbuttonstate;
			this.setBackground(Color.green);
			System.out.println(this.parent.parent.mainnewpage.state);
			this.parent.stbtn.setBackground(Color.pink);
			this.parent.rdbtn.setBackground(Color.pink);
		}
	}
}
