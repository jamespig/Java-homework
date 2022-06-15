package puzzlegame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class List extends JFrame implements ListSelectionListener{
	String[] s = { "5*5",
				   "10*10",
				   "15*15"};
	JList list1 = new JList(s);
	JLabel label1 = new JLabel("點選地圖大小");
	
	List(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(list1,BorderLayout.CENTER);
		c.add(label1,BorderLayout.NORTH);
		
		list1.addListSelectionListener(this);
	}
	public static void main(String args[]) {
		List frm = new List();
		frm.setSize(200,150);
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e) {
		Object b;
		b = list1.getSelectedValue();
		label1.setText(String.valueOf(b));
	}
}
