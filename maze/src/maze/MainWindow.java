package maze;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends JFrame {

	
	
	public ToolBar toolbar1; 
	public ToolBarTwo toolbar2;
	//1300,1000
	Dimension size=new Dimension(1000,800);
	Maze parent;
	NewPage mainnewpage=null;
	
	MainWindow(Maze p)
	{	
		parent=p;
		this.setSize(size);
		
		
		toolbar1 = new ToolBar(this);
        this.setLayout(new BorderLayout());
        this.add(toolbar1,BorderLayout.NORTH);
        
        toolbar2 = new ToolBarTwo(this);
        this.add(toolbar2,BorderLayout.WEST);
		
        this.addWindowListener(new WindowAdapter()      
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        this.setResizable(false);
        this.setVisible(true);
	}
}
