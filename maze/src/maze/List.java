package maze;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class List extends JFrame implements ListSelectionListener{
	NewButton parent;
	Object b;
	String[] s = { "5*5",
			   "10*10",
			   "15*15"};
	JList list1 = new JList(s);
	JLabel label1 = new JLabel("點選地圖大小");

	
	List(NewButton p)
	{
		parent=p;
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(list1,BorderLayout.CENTER);
		c.add(label1,BorderLayout.NORTH);
		
		list1.addListSelectionListener(this);
	}
	
	
	public void valueChanged(ListSelectionEvent e) {
		
		b = list1.getSelectedValue();
		//label1.setText(String.valueOf(b));
		if(this.parent.parent.parent.mainnewpage==null)
		{
			NewPage newpage= new NewPage();
			newpage.arrytwo(newpage.CtrlSize(String.valueOf(b)));
			newpage.producesquare(newpage.CtrlSize(String.valueOf(b)));
			newpage.setBackground(Color.BLACK);
			this.parent.parent.parent.add(newpage,BorderLayout.CENTER);
			this.parent.parent.parent.mainnewpage=newpage;
			newpage.fixtoolbartwo=this.parent.parent.parent.toolbar2;
			this.parent.setEnabled(false);
			this.parent.parent.importbtn.setEnabled(false);
			this.parent.parent.savebtn.setEnabled(true);
			this.parent.parent.clearbtn.setEnabled(true);
	        this.setVisible(false);
			this.parent.parent.parent.revalidate();
		}
	}
}
