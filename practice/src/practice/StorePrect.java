package practice;

import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.util.ArrayList;

public class StorePrect extends JFrame{
	JLabel lbin;
	JLabel lbout;
	JTextField txf1;
	JTextField txf2;
	JButton btn1;
	JButton btn2;
	String str1;
	public StorePrect() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		lbin = new JLabel("請輸入檔案位置:");
		lbout = new JLabel();
		txf1 = new JTextField("");
		btn1 = new JButton("建立");
		btn2 = new JButton("開啟舊檔");	
		
		str1 = String.valueOf(txf1.getText());
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				System.out.println("有按到啦!!!");
				System.out.println(""+str1);
				saveFile();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				openFile();
			}
		});
		
		c.add(lbin);
		c.add(lbout);
		c.add(txf1);
		c.add(btn1);
		c.add(btn2);
	}
	public static void main(String[] args){
		StorePrect frm = new StorePrect();
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frm.setSize(500, 200);
		frm.setLocation(300, 300);
		frm.setVisible(true);	
	}
	public void saveFile() {
		File file = new File(getTitle());
		
		if(!file.exists()){
			saveFileAs();
		}
	}
	public void saveFileAs() {
		JFileChooser fileChooser = new JFileChooser(""+str1);
		int option = fileChooser.showDialog(null, null);
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
	public void openFile() {
		JFileChooser fileChooser = new JFileChooser("");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileChooser.showDialog(null, null);
		try{
			FileReader fr = new FileReader(fileChooser.getSelectedFile());
			StringBuffer sb = new StringBuffer("");
			BufferedReader buf = new BufferedReader(fr);
			String line;
			String temp;
			String[] tempArray = new String[5];
			ArrayList myList = new ArrayList();
			while((line=buf.readLine()) != null) {
				//System.out.print(line);
				
				temp = line;
				
				tempArray = temp.split("\\s");
				
				for(int i = 0;i<tempArray.length;i++) {
					System.out.print(tempArray[i]);
				}
				
				/*
				for(int i = 0;i<tempArray.length;i++) {
					myList.add(tempArray[i]);
					String t;
					t = String.valueOf(myList.get(i));
					System.out.print(t);
					
				}
				*/
				/*
				int k = myList.size()/5;
				int count = 0;
				int[][]trans_array = new int[k][5];
				
				for(int x=0;x<myList.size()/5;x++) {
					for(int y=0;y<5;y++) {
						trans_array[x][y]=Integer.parseInt((String)myList.get(count));
						count++;
						System.out.print(trans_array[x][y]);
						}
					System.out.print("\n");
				}
				*/
				/*line = line +"\n";
				System.out.print(line);*/
			}
		}
		catch(IOException e) {
			
		}
	}
}
