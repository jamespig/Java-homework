package maze;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JLabel;

public class NewPage extends Panel {

	char name[][];
	ToolBarTwo fixtoolbartwo=null;
	ArrayList<JLabel> array = new ArrayList<JLabel>();
	int choice;
	State state=null;
	JLabel savebtn2=null;
	JLabel savebtn3=null;
	
	NewPage()
	{
	}
	
	public int CtrlSize(String s)
	{
		if(s == "5*5")
		{
			choice=5;
			return 5;
		}
		else if(s == "10*10")
		{
			choice=10;
			return 10;
		}
		else if(s == "15*15")
		{
			choice=15;
			return 15;
		}
		else
		{
			return 0;
		}
	}
	
	public void arrytwo(int n)
	{
		this.name=new char[n][];
		for(int i=0;i<n;i++)
		{
			this.name[i] = new char[n];
			for(int j=0;j<n;j++)
			{
				this.name[i][j] = '0';
			}
		}
	}
	
	public void producesquare(int n)
	{
	    this.setLayout(new GridBagLayout());
		for (int i = 0; i<n; i++) 
		{
			for(int j=0;j<n;j++)
			{	//String.valueOf(this.name[i][j])
	            JLabel n5 = new JLabel(String.valueOf(this.name[i][j]),JLabel.CENTER);
	            n5.setOpaque(true);
	            n5.setBackground(Color.WHITE);
	            GridBagConstraints c5 = new GridBagConstraints();
	            c5.fill = GridBagConstraints.BOTH;
	            c5.insets = new Insets(5,5,0,0);
	            c5.gridx = j;
	            c5.gridy = i;
	            c5.gridwidth = 1;
	            c5.gridheight = 1;
	            c5.weightx = 5;
	            c5.weighty = 5;
	            array.add(n5);
	            this.add(n5, c5);
	            n5.setFont(new java.awt.Font("Lucida Grande", 1, 0)); 
	            n5.addMouseListener(new MouseAdapter()
	            {
	                public void mouseClicked(MouseEvent e)
	                {
	                	if((state==state.stbuttonstate))
	    	            {
	                		JLabel n5=(JLabel) e.getSource();
	                		n5.setText("1");
	                		n5.setBackground(Color.yellow);
	                		if(n5==savebtn2)
	                		{
	                			fixtoolbartwo.ndbtn.setEnabled(true);
	                			savebtn2=null;
	                		}
	                		if(n5==savebtn3)
	                		{
	                			fixtoolbartwo.rdbtn.setEnabled(true);
	                			savebtn3=null;
	                		}
	    	            }
	    	            else if(state==state.ndbuttonstate)
	    	            {
	    	            	JLabel n5=(JLabel) e.getSource();
	                		n5.setText("2");
	                		n5.setBackground(Color.green);
	                		savebtn2=n5;
	                		fixtoolbartwo.ndbtn.setEnabled(false);
	                		fixtoolbartwo.ndbtn.setBackground(Color.pink);
	                		state=null;
	    	            }
	    	            else if(state==state.rdbuttonstate)
	    	            {
	    	            	JLabel n5=(JLabel) e.getSource();
	                		n5.setText("3");
	                		n5.setBackground(Color.red);
	                		savebtn3=n5;
	                		fixtoolbartwo.rdbtn.setEnabled(false);
	                		fixtoolbartwo.rdbtn.setBackground(Color.pink);
	                		state=null;
	    	            }
	    	            else if(state==null)
	    	            {
	    	            /*	JLabel n5=(JLabel) e.getSource();
	                		n5.setText("0");
	                		if(n5==savebtn2)
	                		{
	                			fixtoolbartwo.ndbtn.setEnabled(true);
	                			savebtn2=null;
	                		}
	                		if(n5==savebtn3)
	                		{
	                			fixtoolbartwo.rdbtn.setEnabled(true);
	                			savebtn3=null;
	                		}*/
	    	            }
	                }
	            });
			}
        }
	}
	
	
//    public void paint(Graphics g)
//    {

		/*List frm = new List(this);
		frm.setSize(200,150);
		frm.setDefaultCloseOperation(3);
		frm.setVisible(true);
    	*/
//        g.setColor(Color.black);
//		int x0 = 0;
//		int y0 = 0;
		
//		for (int i=0;i<=10;i++) {
//			g.drawLine(x0+50*i, y0, x0+50*i, y0+730);
//		}
//		for (int i=0;i<=10;i++) {
//			g.drawLine(x0, y0+50*i, x0+400+100, y0+i*50);
//	} 
 //   }	
    
}
