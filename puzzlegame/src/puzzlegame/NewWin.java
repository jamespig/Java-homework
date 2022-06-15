package puzzlegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewWin extends JFrame implements ActionListener{
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();
	JButton btn10 = new JButton();
	
	public NewWin() {
		this.setLocation(100,50);
		this.setSize(500,400);
		
		GridLayout layout1 = new GridLayout(2,5,5,5);
		this.setLayout(layout1);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		this.add(btn10);
		
		btn1.addActionListener(this);
	}
	public static void main(String args[]) {
		
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
}