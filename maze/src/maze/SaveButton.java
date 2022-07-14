package maze;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JFileChooser;

public class SaveButton extends AllButton{
	ToolBar parent;
	JFileChooser fileChooser = new JFileChooser();
	File file = new File(getName());
	SaveButton(ToolBar p)
	{
		super(p);
		parent=p;
		this.label="Àx¦s";
		this.setLabel(label);
		this.setEnabled(false);
	}
	
	public void doSomething()
	{
		if(this.parent.parent.mainnewpage!=null)
		{
			this.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					saveFileAs();
				}
			});
		}
	}
	
	public void saveFileAs() 
	{
		int option = fileChooser.showDialog(null,null);
		
		if(option == JFileChooser.APPROVE_OPTION)
		{
			File file = fileChooser.getSelectedFile();
			
			setName(file.toString());
			
			try
			{
				file.createNewFile();
				BufferedWriter buf = new BufferedWriter(new FileWriter(file));
				buf.close();
				saveFile();
			}
			catch(IOException e)
			{
				
			}
		}
	}
	
	public void saveFile()
	{
		File file = new File(getName());
		
		if(!file.exists()) 
		{
			saveFileAs();
		}
		else
		{
			try 
			{
				BufferedWriter buf = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<this.parent.parent.mainnewpage.array.size();i++)
				{
					buf.write(this.parent.parent.mainnewpage.array.get(i).getText());
				}
				buf.close();
			}
			catch(IOException e)
			{
				
			}
		}
	}
}
