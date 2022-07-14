package maze;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

public class NewButton extends AllButton {
	
	ToolBar parent;
	NewButton(ToolBar p)
	{
		super(p);
		parent=p;
		this.label="·s¼W";
		this.setLabel(label);
	}

	public void doSomething()
	{	
		List frm = new List(this);
		frm.setSize(200,150);
		frm.setDefaultCloseOperation(1);
		frm.setVisible(true);
		/*System.out.println("GG!");
		NewPage n = new NewPage(this);
		this.parent.parent.add(n,BorderLayout.CENTER);
		this.parent.parent.revalidate();*/
		//n.setVisible(true);
	}
	
}
