package puzzlegame;
import java.awt.*;
import javax.swing.*;

public class NewPageButton extends AllButton{
	NewPageButton(ToolBar p){
		super(p);
		
		this.label = "New Page";
		this.setLabel(label);
	}
	
	public void doSomething() {
		System.out.println("GG!");
		NewWin n = new NewWin();
		n.setVisible(true);
	}
}
