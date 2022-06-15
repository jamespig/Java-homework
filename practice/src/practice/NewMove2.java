package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class NewMove2 extends JFrame{
	int a = 3;
	int b = 3;
	int c = a*b;
	boolean t[] = new boolean[c+1];
	
	
	
	public NewMove2() {
		//Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		int n = 3;
		t[n] = true;
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);
		this.setLocation(100, 50);
		this.setSize(500, 500);
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent a) {
				switch (a.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					if(n+1>=1 && n+1<=c) {
						t[n+1] = true;
						t[n] = false;
						//n = n+1;
						System.out.print("t[n+1]:");
						System.out.print(n+1);
						System.out.print("=");
						System.out.println(t[n+1]);
					}
					break;
				case KeyEvent.VK_LEFT:
					if(n-1>=1 && n-1<=c) {
						t[n-1] = true;
						t[n] = false;
						//n = n-1;
						System.out.print("t[n-1]:");
						System.out.print(n-1);
						System.out.print("=");
						System.out.println(t[n-1]);
					}
					break;
				case KeyEvent.VK_UP:
					if(n-3>=1 && n-3<=c) {
						t[n-3] = true;
						t[n] = false;
						//n = n-3;
						System.out.print("t[n-3]:");
						System.out.print(n-3);
						System.out.print("=");
						System.out.println(t[n-3]);
					}
					break;
				case KeyEvent.VK_DOWN:
					if(n+3>=1 && n+3<=c) {
						t[n+3] = true;
						t[n] = false;
						//n = n+3;
						System.out.print("t[n+3]:");
						System.out.print(n+3);
						System.out.print("=");
						System.out.println(t[n+3]);
					}
					break;
				}
			}
		});
	}
	
	public static void main(String args[]) {
		NewMove2 frm = new NewMove2();
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
