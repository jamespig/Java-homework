package maze;

import java.awt.Color;

public class ClearButton extends AllButton{
	ToolBar parent;
	ClearButton(ToolBar p)
	{
		super(p);
		parent=p;
		this.label="²M°£";
		this.setLabel(label);
		this.setEnabled(false);
	}

	public void doSomething()
	{
		if(this.parent.parent.mainnewpage!=null)
		{
			for(int i=0;i<this.parent.parent.mainnewpage.choice*this.parent.parent.mainnewpage.choice;i++)
			{
				this.parent.parent.mainnewpage.array.get(i).setText("0");
				this.parent.parent.mainnewpage.array.get(i).setBackground(Color.white);
			}
		}
		if(this.parent.parent.mainnewpage.savebtn2!=null)
		{
			this.parent.parent.toolbar2.ndbtn.setEnabled(true);
		}
		
		if(this.parent.parent.mainnewpage.savebtn3!=null)
		{
			this.parent.parent.toolbar2.rdbtn.setEnabled(true);
		}
		
		this.parent.parent.toolbar2.stbtn.setBackground(Color.pink);
		this.parent.parent.mainnewpage.state=null;
	}
	
}
