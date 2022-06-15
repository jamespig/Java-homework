package maze;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import javax.swing.*;
public class NewButton extends AllButton implements ActionListener{

	NewButton(ToolBar p)
	{
		super(p);
		
		this.label="·s¼W";
		this.setLabel(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		Graphics g = getGraphics();
		int x0 = 50;
		int y0 = 50;
		
		for (int i=0;i<=8;i++) {
			g.drawLine(x0+50*i, y0, x0+50*i, y0+200);
		}
		for (int i=0;i<=4;i++) {
			g.drawLine(x0, y0+50*i, x0+400, y0+i*50);
		}
	}
	
	public void doSomething()
	{
		super();
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		
		this.add(btn,layout.SOUTH);
		btn.addActionListener(this);
	}
	
}
