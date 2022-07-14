package maze;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class StButton extends AllButtonTwo{
	ToolBarTwo parent;
	
	StButton(ToolBarTwo p)
	{
		super(p);
		parent=p;
		this.label="1¡GÀð¾À";
		this.setLabel(label);
		this.setBackground(Color.pink);
		
	}

	public void doSomething()
	{
		if(this.parent.parent.mainnewpage!=null)
		{
			this.parent.parent.mainnewpage.state=State.stbuttonstate;
			this.setBackground(Color.yellow);
			System.out.println(this.parent.parent.mainnewpage.state);
			this.parent.ndbtn.setBackground(Color.pink);
			this.parent.rdbtn.setBackground(Color.pink);
/*			if(((this.parent.parent.mainnewpage.state==null)||
				(this.parent.parent.mainnewpage.state==State.ndbuttonstate)||
				(this.parent.parent.mainnewpage.state==State.rdbuttonstate)))
			{
				this.parent.parent.mainnewpage.state=State.stbuttonstate;
				this.setBackground(Color.yellow);
				System.out.println(this.parent.parent.mainnewpage.state);
			}
			else if(this.parent.parent.mainnewpage.state==State.stbuttonstate)
			{
				this.parent.parent.mainnewpage.state=null;
				this.setBackground(UIManager.getColor("Button.background"));
				System.out.println(this.parent.parent.mainnewpage.state);
			}*/
			
/*			this.parent.parent.mainnewpage.name[0][1]=1;
			
			for(int i=0;i<25;i++)
			{
				System.out.println(this.parent.parent.mainnewpage.array.get(i).getText());
			}
			this.parent.parent.mainnewpage.array.get(5).setText(String.valueOf(1));*/
			//this.parent.parent.mainnewpage.setVisible(true);
			//this.parent.parent.n.revalidate();
	
		}
	}
}