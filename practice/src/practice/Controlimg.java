package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controlimg extends JFrame{
	JLabel j1;
	JLabel j2;
	public Controlimg() {
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		this.setLocation(100, 50);
		this.setSize(500, 500);
		
		ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\310\\Desktop\\³n¤u\\yellow.png");
		Image image = imageIcon1.getImage();
		Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
		imageIcon1 = new ImageIcon(newimg);
		
		
		j1 = new JLabel(imageIcon1);
		j1.setOpaque(true);
		ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\310\\Desktop\\³n¤u\\yellow.png");
		
		
		j2 = new JLabel(imageIcon2);
		j2.setOpaque(true);
		
		this.add(j1,BorderLayout.CENTER);
		//this.add(j2,BorderLayout.SOUTH);
	}
	
	public static void main(String args[]) {
		Controlimg frm = new Controlimg();
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
