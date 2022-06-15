package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewMove extends JFrame{
	boolean t[] = new boolean[10];
	
	public NewMove() {
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		this.setLocation(100, 50);
		this.setSize(500, 500);
		
		
		t[5] = true;
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent a) {
				switch (a.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					System.out.println("Press!");
					if(t[5] == true) {
						t[6] = true;
						t[5] = false;
						System.out.print("t[6]:");
						System.out.println(t[6]);
					}
					else if(t[4] == true) {
						t[5] = true;
						t[4] = false;
						System.out.print("t[5]:");
						System.out.println(t[5]);
					}
					else if(t[2] == true) {
						t[3] = true;
						t[2] = false;
						System.out.print("t[3]:");
						System.out.println(t[3]);
					}
					else if(t[1] == true) {
						t[2] = true;
						t[1] = false;
						System.out.print("t[2]:");
						System.out.println(t[2]);
					}
					else if(t[7] == true) {
						t[8] = true;
						t[7] = false;
						System.out.print("t[8]:");
						System.out.println(t[8]);
					}
					else if(t[8] == true) {
						t[9] = true;
						t[8] = false;
						System.out.print("t[9]:");
						System.out.println(t[9]);
					}
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("Press!");
					if(t[6] == true) {
						t[5] = true;
						t[6] = false;
						System.out.print("t[5]:");
						System.out.println(t[5]);
					}
					else if(t[5] == true) {
						t[4] = true;
						t[5] = false;
						System.out.print("t[4]:");
						System.out.println(t[4]);
					}
					else if(t[3] == true) {
						t[2] = true;
						t[3] = false;
						System.out.print("t[2]:");
						System.out.println(t[2]);
					}
					else if(t[2] == true) {
						t[1] = true;
						t[2] = false;
						System.out.print("t[1]:");
						System.out.println(t[1]);
					}
					else if(t[9] == true) {
						t[8] = true;
						t[9] = false;
						System.out.print("t[8]:");
						System.out.println(t[8]);
					}
					else if(t[8] == true) {
						t[7] = true;
						t[8] = false;
						System.out.print("t[7]:");
						System.out.println(t[7]);
					}
					break;
				case KeyEvent.VK_UP:
					System.out.println("Press!");
					if(t[4] == true) {
						t[1] = true;
						t[4] = false;
						System.out.print("t[1]:");
						System.out.println(t[1]);
					}
					else if(t[5] == true) {
						t[2] = true;
						t[5] = false;
						System.out.print("t[2]:");
						System.out.println(t[2]);
					}
					else if(t[6] == true) {
						t[3] = true;
						t[6] = false;
						System.out.print("t[3]:");
						System.out.println(t[3]);
					}
					else if(t[7] == true) {
						t[4] = true;
						t[7] = false;
						System.out.print("t[4]:");
						System.out.println(t[4]);
					}
					else if(t[8] == true) {
						t[5] = true;
						t[8] = false;
						System.out.print("t[5]:");
						System.out.println(t[5]);
					}
					else if(t[9] == true) {
						t[6] = true;
						t[9] = false;
						System.out.print("t[6]:");
						System.out.println(t[6]);
					}
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("Press!");
					if(t[1] == true) {
						t[4] = true;
						t[1] = false;
						System.out.print("t[4]:");
						System.out.println(t[4]);
					}
					else if(t[2] == true) {
						t[5] = true;
						t[2] = false;
						System.out.print("t[5]:");
						System.out.println(t[5]);
					}
					else if(t[3] == true) {
						t[6] = true;
						t[3] = false;
						System.out.print("t[6]:");
						System.out.println(t[6]);
					}
					else if(t[4] == true) {
						t[7] = true;
						t[4] = false;
						System.out.print("t[7]:");
						System.out.println(t[7]);
					}
					else if(t[5] == true) {
						t[8] = true;
						t[5] = false;
						System.out.print("t[8]:");
						System.out.println(t[8]);
					}
					else if(t[6] == true) {
						t[9] = true;
						t[6] = false;
						System.out.print("t[9]:");
						System.out.println(t[9]);
					}
					break;
				}
			}
		});
		
	}
	
	public static void main(String args[]) {
		NewMove frm = new NewMove();
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
