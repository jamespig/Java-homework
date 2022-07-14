package maze;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
public class AllButtonTwo extends Button{
	
	String label;
	AllButtonTwo(ToolBarTwo p)
	{
		super();
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
