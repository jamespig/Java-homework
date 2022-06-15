package practice;

import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFileChooser;

public class StoreFile extends JFrame{
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JLabel lb6;
	JLabel lb7;
	JLabel lb8;
	JLabel lb9;
	String s[];
	JButton btn1;
	JButton btn2;
	JMenuBar menubar;
	JPanel panel;
	
	JFileChooser fileChooser = new JFileChooser();
	
	public StoreFile() {
		BorderLayout Blayout = new BorderLayout();
		this.setLayout(Blayout);
		
		menubar = new JMenuBar();
		btn1 = new JButton("另存新檔");
		btn2 = new JButton("儲存檔案");
		menubar.add(btn1);
		menubar.add(btn2);
		this.add(menubar,BorderLayout.NORTH);
		
		lb1=new JLabel("1",JLabel.CENTER);
		lb2=new JLabel("2",JLabel.CENTER);
		lb3=new JLabel("3",JLabel.CENTER);
		lb4=new JLabel("4",JLabel.CENTER);
		lb5=new JLabel("1221",JLabel.CENTER);
		lb6=new JLabel("6",JLabel.CENTER);
		lb7=new JLabel("7",JLabel.CENTER);
		lb8=new JLabel("8",JLabel.CENTER);
		lb9=new JLabel("9",JLabel.CENTER);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		this.add(panel,BorderLayout.CENTER);
		panel.add(lb1);
		panel.add(lb2);
		panel.add(lb3);
		panel.add(lb4);
		panel.add(lb5);
		panel.add(lb6);
		panel.add(lb7);
		panel.add(lb8);
		panel.add(lb9);
		
		s = new String[9];
		s[0] = lb1.getText();
		s[1] = lb2.getText();
		s[2] = lb3.getText();
		s[3] = lb4.getText();
		s[4] = lb5.getText();
		s[5] = lb6.getText();
		s[6] = lb7.getText();
		s[7] = lb8.getText();
		s[8] = lb9.getText();
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				saveFileAs();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				saveFile();
			}
		});
	}
	
	public static void main(String[] args) {
		StoreFile frm = new StoreFile();
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frm.setSize(900, 900);
		frm.setLocation(300, 300);
		frm.setVisible(true);	
	}
	
	public void saveFileAs() {
		int option = fileChooser.showDialog(null,null);
		
		if(option == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			
			setTitle(file.toString());
			
			try {
				file.createNewFile();
				saveFile();
			}
			catch(IOException e) {
				
			}
		}
	}
	
	public void saveFile() {
		File file = new File(getTitle());
		
		if(!file.exists()) {
			saveFileAs();
		}
		else {
			try {
				BufferedWriter buf = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<9;i++) {
					buf.write(s[i]);
				}
				buf.close();
			}
			catch(IOException e) {
				
			}
		}
	}
}
