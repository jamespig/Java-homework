package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BtnImage extends JFrame{
	ImageIcon ii = new ImageIcon("D:\\310\\Pictures\\Saved Pictures\\test2.jpg");
	JButton btn = new JButton(ii);
	JLabel label= new JLabel();
	boolean p = false;
	public BtnImage() {
		this.setLocation(300,50);
		this.setSize(1000,1000);
		this.setTitle("Btn Image");
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		
		label.setText("請點此處放置方塊");
		label.setOpaque(true); 
		label.setBackground(Color.red);
		this.add(label,layout.CENTER);
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(p==true) {
					Container c = getContentPane();
					Icon icon = new ImageIcon("d:\\310\\Pictures\\Saved Pictures\\test.jpg");
					label.setIcon(icon);
					c.add(label);
				}
			}
		});
		
		this.add(btn,layout.WEST);
		btn.addActionListener(new action1());
	}
	public static void main(String args[]) {
		BtnImage bi = new BtnImage();
		bi.setDefaultCloseOperation(EXIT_ON_CLOSE);
		bi.setVisible(true);
	}
	public class action1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			p = true;
		}
	}
}
