package maze;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame.*;
import javax.swing.*;
public class AllButton extends Button{
	
	ToolBar parent;
	String label;
	
	AllButton(ToolBar p)
	{
		super();
		//parent = p;
		
        this.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                doSomething();
            }
        });
        
    }

    public void doSomething(){}
		
}
