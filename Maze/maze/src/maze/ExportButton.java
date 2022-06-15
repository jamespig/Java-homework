package maze;
import java.awt.*;
import java.io.*;
public class ExportButton extends AllButton{
	
	ExportButton(ToolBar p)
	{
		super(p);
		
		this.label="¶×¥X";
		this.setLabel(label);
	}
	
	public void doSomething()
	{
		try 
		{
			FileWriter fw = new FileWriter("HW.txt",true);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
