package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePlay extends JFrame{
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JLabel lb6;
	JLabel lb7;
	JLabel lb8;
	JLabel lb9;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	public GamePlay(){
		lb1 = new JLabel("unused" ,JLabel.CENTER);
		lb2 = new JLabel("unused" ,JLabel.CENTER);
		lb3 = new JLabel("unused" ,JLabel.CENTER);
		lb4 = new JLabel("unused" ,JLabel.CENTER);
		lb5 = new JLabel("unused" ,JLabel.CENTER);
		lb6 = new JLabel("unused" ,JLabel.CENTER);
		lb7 = new JLabel("unused" ,JLabel.CENTER);
		lb8 = new JLabel("unused" ,JLabel.CENTER);
		lb9 = new JLabel("unused" ,JLabel.CENTER);
		
		BorderLayout bout = new BorderLayout();
		
		lb1.setOpaque(true);
		lb1.setBackground(Color.RED);

		lb2.setOpaque(true);
		lb2.setBackground(Color.GREEN);

		lb3.setOpaque(true);
		lb3.setBackground(Color.YELLOW);
		
		lb4.setOpaque(true);
		lb4.setBackground(Color.BLACK);
		
		lb5.setOpaque(true);
		lb5.setBackground(Color.BLUE);
		
		lb6.setOpaque(true);
		lb6.setBackground(Color.WHITE);
		
		lb7.setOpaque(true);
		lb7.setBackground(Color.GRAY);
		
		lb8.setOpaque(true);
		lb8.setBackground(Color.ORANGE);
		
		lb9.setOpaque(true);
		lb9.setBackground(Color.PINK);
		
		lb1.setPreferredSize(new Dimension(50,50));
		lb2.setPreferredSize(new Dimension(50,50));
		lb3.setPreferredSize(new Dimension(50,50));
		lb4.setPreferredSize(new Dimension(50,50));
		lb5.setPreferredSize(new Dimension(50,50));
		lb6.setPreferredSize(new Dimension(50,50));
		lb7.setPreferredSize(new Dimension(50,50));
		lb8.setPreferredSize(new Dimension(50,50));
		lb9.setPreferredSize(new Dimension(50,50));
		
		panel1 = new JPanel(new GridLayout(1,3));
		this.add(panel1,BorderLayout.NORTH);
		panel1.add(lb1);
		panel1.add(lb2);
		panel1.add(lb3);
		
		panel2 = new JPanel(new GridLayout(1,3));
		this.add(panel2,BorderLayout.CENTER);
		panel2.add(lb4);
		panel2.add(lb5);
		panel2.add(lb6);
		
		panel3 = new JPanel(new GridLayout(1,3));
		this.add(panel3,BorderLayout.SOUTH);
		panel3.add(lb7);
		panel3.add(lb8);
		panel3.add(lb9);
		
		lb5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lb5.setText("used");
			}
		});
		lb6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lb6.setText("used");
			}
		});
		
		lb5.addKeyListener(new KeyAdapter() {
			public void keyPresses(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					if(lb5.getText() == "used") {
						lb6.setText("used");
						lb6.setBackground(Color.BLUE);
						lb5.setText("unused");
					}
					break;
				case KeyEvent.VK_LEFT:
					if(lb5.getText() == "used") {
						lb4.setText("used");
						lb4.setBackground(Color.BLUE);
						lb5.setText("unused");
					}
					break;
				case KeyEvent.VK_UP:
					if(lb5.getText() == "used") {
						lb2.setText("used");
						lb2.setBackground(Color.BLUE);
						lb5.setText("unused");
					}
					break;
				case KeyEvent.VK_DOWN:
					if(lb5.getText() == "used") {
						lb8.setText("used");
						lb8.setBackground(Color.BLUE);
						lb5.setText("unused");
						}
					break;
				}
			}
		});
		
		if(lb6.getText() == "used") {
			lb6.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						lb5.setText("used");
						lb5.setBackground(Color.WHITE);
						lb6.setBackground(Color.WHITE);
						lb6.setText("unused");
						break;
					case KeyEvent.VK_UP:
						lb3.setText("used");
						lb3.setBackground(Color.WHITE);
						lb6.setBackground(Color.WHITE);
						lb6.setText("unused");
						break;
					case KeyEvent.VK_DOWN:
						lb9.setText("used");
						lb9.setBackground(Color.WHITE);
						lb6.setBackground(Color.WHITE);
						lb6.setText("unused");
						break;
					}
				}
			});
		}
		if(lb3.getText() == "used") {
			lb3.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						if(lb3.getText() == "used") {
							lb2.setText("used");
							lb2.setBackground(Color.YELLOW);
							lb3.setBackground(Color.YELLOW);
							lb3.setText("unused");
						}
						break;
					case KeyEvent.VK_DOWN:
						if(lb3.getText() == "used") {
							lb6.setText("used");
							lb6.setBackground(Color.YELLOW);
							lb3.setBackground(Color.YELLOW);
							lb3.setText("unused");
						}
						break;
					}
				}
			});
		}
		
	}
	public static void main(String[] args) {
		GamePlay frm = new GamePlay();
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frm.setSize(500, 500);
		frm.setLocation(300, 300);
		frm.setVisible(true);	
	}	
}
