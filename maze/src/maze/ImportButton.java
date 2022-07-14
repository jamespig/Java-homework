package maze;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class ImportButton extends AllButton{
	ToolBar parent;
	JFileChooser fileChooser = new JFileChooser();
	ImportButton(ToolBar p)
	{
		super(p);
		parent=p;
		this.label="¶×¤J";
		this.setLabel(label);
	}
	
	public void doSomething()
	{
		if(this.parent.parent.mainnewpage==null)
		{
			openFile();
		}
	}
	
	public void openFile() 
	{
		
		int option = fileChooser.showDialog(null, null);
		if(option == JFileChooser.APPROVE_OPTION)
		{
			fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			try
			{
				FileReader fr = new FileReader(fileChooser.getSelectedFile());
				BufferedReader buf = new BufferedReader(fr);
			
				NewPage inewpage= new NewPage();
				this.parent.parent.mainnewpage=inewpage;
				inewpage.fixtoolbartwo=this.parent.parent.toolbar2;
			
				int k=0;
				String line;
				String idata=null;
				while((line=buf.readLine()) != null) 
				{
					idata=line;
				}

				
				if(idata.length()/5==5)
				{
					inewpage.choice=5;
				}
				else if(idata.length()/10==10)
				{
					inewpage.choice=10;
				}
				else if(idata.length()/15==15)
				{
					inewpage.choice=15;
				}

		
				inewpage.name=new char[inewpage.choice][];
				for(int i=0;i<inewpage.choice;i++)
				{
					inewpage.name[i] = new char[inewpage.choice];
					for(int j=0;j<inewpage.choice;j++)
					{
						inewpage.name[i][j] = idata.charAt(k);
						k++;
					}
				}
			
				inewpage.producesquare(inewpage.choice);
			
				for(int i=0; i<idata.length(); i++)
				{
					if(idata.charAt(i)=='1')
					{
						inewpage.array.get(i).setBackground(Color.yellow);
					}
					
					if(idata.charAt(i)=='2')
					{
						inewpage.savebtn2=inewpage.array.get(i);
						inewpage.savebtn2.setBackground(Color.green);
						inewpage.fixtoolbartwo.ndbtn.setEnabled(false);
					}
					
					if(idata.charAt(i)=='3')
					{
						inewpage.savebtn3=inewpage.array.get(i);
						inewpage.savebtn3.setBackground(Color.red);
						inewpage.fixtoolbartwo.rdbtn.setEnabled(false);
					}
				}
				
				inewpage.setBackground(Color.BLACK);
				this.parent.parent.add(inewpage,BorderLayout.CENTER);
				this.parent.newbtn.setEnabled(false);
				this.parent.savebtn.setEnabled(true);
				this.parent.clearbtn.setEnabled(true);
				this.setEnabled(false);
				this.parent.parent.revalidate();
			}
			catch(IOException e) 
			{
				
			}
		}
	}
}
