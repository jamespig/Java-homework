package maze;

import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame{
	
	
	public ToolBar toolbar1; 
	public ToolBarTwo toolbar2;
	
	Dimension size=new Dimension(600,400);
	
	MainWindow()
	{
		this.setSize(size);
		toolbar1 = new ToolBar();
		
        this.setLayout(new BorderLayout());
        this.add(toolbar1,BorderLayout.NORTH);
		
        
        toolbar2 = new ToolBarTwo();
        this.add(toolbar2,BorderLayout.WEST);
               
        this.addWindowListener(new WindowAdapter()      
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        
        this.setVisible(true);
	}
}
