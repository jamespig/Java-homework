package practice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FileChooseTest extends JFrame implements ActionListener{
  JButton open=null;
  public static void main(String[] args) {
    new FileChooseTest();
  }
  public FileChooseTest(){
    open=new JButton("open");
    this.add(open);
    this.setBounds(400, 200, 100, 100);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    open.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
	  	final Runtime runtime = Runtime.getRuntime();
		Process process = null;
		try {
			final String command = "notepad";// °O¨Æ¥»
			process = runtime.exec(command);
		} 
		catch (final Exception i) {
			
		}
	}
}