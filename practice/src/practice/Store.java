package practice;

import java.io.*;

public class Store {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileWriter fw2 = null;
		FileWriter fw3 = null;
		FileReader fr = null;
		FileReader fr2 = null;
		FileReader fr3 = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		BufferedReader br3 = null;
		String buffer = "";
		String tempString = "";
		String y = "------";
		
		try {
			fr = new FileReader("E:/txtfile/maze.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("E:/txtfile/temp.txt");
			fw2 = new FileWriter("E:/txtfile/temp.txt",true);
			fw3 = new FileWriter("E:/txtfile/temp.txt",true);
			while((buffer = br.readLine())!=null) {
				fw.write(y);
				fw2.write("n" + new String(buffer)+ "n");
				fw3.write(y);
			}
		}catch(Exception e) {} finally {
			try {
				fw.close();
				fw2.close();
				fw3.close();
				fr.close();
				br.close();
			}catch(Exception e){}
		}
		try{
			fr2= new FileReader("E:/txtfile/temp.txt");
			br2= new BufferedReader(fr2);
			while((tempString = br2.readLine())!=null) {
				System.out.println(tempString);
			}
		}catch(Exception ex) {}finally {
			try {
				br2.close();
				fr2.close();
			}catch(Exception e) {}
		}
		char[] buffer2 = new char[1];
		try {
			int n = 0;
			fr3 = new FileReader("E:/txtfile/temp.txt");
			while(fr3.read(buffer2)!=-1) {
				n+=buffer2.length;
			}
			System.out.println("n該檔案字元共" + n + "個");
		}catch(Exception e) {} finally {
			try {
				fr3.close();
			}catch(Exception e) {}
		}
	}
}
