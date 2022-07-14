package maze;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrameTwoPanel extends Panel{
	
	BeginButton parent;
	ArrayList<JLabel> array2 = new ArrayList<JLabel>();
	int data[];
	int starpoint=-1;
	int endpoint=-1;

	
	FrameTwoPanel(BeginButton p)
	{
		parent=p;
		
        int k=0;
        int data[] = new int[this.parent.parent.parent.mainnewpage.choice*this.parent.parent.parent.mainnewpage.choice];
        this.setLayout(new GridBagLayout());
        for(int i=0;i<this.parent.parent.parent.mainnewpage.choice;i++)
        {
        	for(int j=0;j<this.parent.parent.parent.mainnewpage.choice;j++)
        	{
        		JLabel n5 = new JLabel();
        		n5.setOpaque(true);
        		n5.setText(this.parent.parent.parent.mainnewpage.array.get(k).getText());
        		n5.setBackground(this.parent.parent.parent.mainnewpage.array.get(k).getBackground());
	            GridBagConstraints c5 = new GridBagConstraints();
	            c5.fill = GridBagConstraints.BOTH;
	            c5.gridx = j;
	            c5.gridy = i;
	            c5.gridwidth = 1;
	            c5.gridheight = 1;
	            c5.weightx = 5;
	            c5.weighty = 5;
	            array2.add(n5);
	            n5.setFont(new java.awt.Font("Lucida Grande", 1, 0));
	            data[k]=Integer.valueOf(this.parent.parent.parent.mainnewpage.array.get(k).getText());
	            k++;
	            this.add(n5, c5);

        	}
        }

		for(int i=0;i<this.parent.parent.parent.mainnewpage.choice*this.parent.parent.parent.mainnewpage.choice;i++)
		{
			if(data[i]==2)
			{
				starpoint=i;
			}
			if(data[i]==3)
			{
				endpoint=i;
			}
		}
        
		this.parent.playframe.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent e) 
			{
				switch (e.getKeyCode())
				{
					case KeyEvent.VK_RIGHT:
						if((data[starpoint]!=data[endpoint])&&(FrameTwoPanel.this.parent.interval>0))
						{
							move(starpoint,endpoint,KeyEvent.VK_RIGHT,data);
						}
						break;
					case KeyEvent.VK_LEFT:
						if((data[starpoint]!=data[endpoint])&&(FrameTwoPanel.this.parent.interval>0))
						{
							move(starpoint,endpoint,KeyEvent.VK_LEFT,data);
						}
						break;
					case KeyEvent.VK_UP:
						if((data[starpoint]!=data[endpoint])&&(FrameTwoPanel.this.parent.interval>0))
						{
							move(starpoint,endpoint,KeyEvent.VK_UP,data);
						}
						break;
					case KeyEvent.VK_DOWN:
						if((data[starpoint]!=data[endpoint])&&(FrameTwoPanel.this.parent.interval>0))
						{
							move(starpoint,endpoint,KeyEvent.VK_DOWN,data);
						}
				}
			}
		});
		
	}
	
	public void move(int a,int b,int c,int data[])
	{
		if(starpoint!=-1)
		{
			if(endpoint!=-1)
			{
				if((c==39)&&(a<this.parent.parent.parent.mainnewpage.choice*this.parent.parent.parent.mainnewpage.choice-1)&&((a+1)%this.parent.parent.parent.mainnewpage.choice!=0)&&(data[a+1]!=1))
				{	
						array2.get(a).setText("0");
						array2.get(a).setBackground(Color.white);
						array2.get(a+1).setText("2");
						array2.get(a+1).setBackground(Color.green);
						starpoint++;
						if(starpoint==b)
						{
							bevictory();
						}
				}
				if((c==37)&&(a>0)&&((a+1)%this.parent.parent.parent.mainnewpage.choice!=1)&&(data[a-1]!=1))
				{
					array2.get(a).setText("0");
					array2.get(a).setBackground(Color.white);
					array2.get(a-1).setText("2");
					array2.get(a-1).setBackground(Color.green);
					starpoint--;
					if(starpoint==b)
					{
						bevictory();
					}
				}
				if((c==38)&&(a>=this.parent.parent.parent.mainnewpage.choice)&&(data[a-this.parent.parent.parent.mainnewpage.choice]!=1))
				{
					array2.get(a).setText("0");
					array2.get(a).setBackground(Color.white);
					array2.get(a-this.parent.parent.parent.mainnewpage.choice).setText("2");
					array2.get(a-this.parent.parent.parent.mainnewpage.choice).setBackground(Color.green);
					starpoint-=this.parent.parent.parent.mainnewpage.choice;
					if(starpoint==b)
					{
						bevictory();
					}
				}
				if((c==40)&&(a+this.parent.parent.parent.mainnewpage.choice<this.parent.parent.parent.mainnewpage.choice*this.parent.parent.parent.mainnewpage.choice)&&(data[a+this.parent.parent.parent.mainnewpage.choice]!=1))
				{
					array2.get(a).setText("0");
					array2.get(a).setBackground(Color.white);
					array2.get(a+this.parent.parent.parent.mainnewpage.choice).setText("2");
					array2.get(a+this.parent.parent.parent.mainnewpage.choice).setBackground(Color.green);
					starpoint+=this.parent.parent.parent.mainnewpage.choice;
					if(starpoint==b)
					{
						bevictory();
					}
				}
			}
			else
			{
				
			}
		}
		else
		{
			
		}
		
	}
	
	public void bevictory()
	{
		
		JLabel winner = new JLabel();
		winner.setText("Victory!!");
		this.setLayout(new GridBagLayout());
		winner.setFont(new java.awt.Font("Lucida Grande", 1,50));
		winner.setForeground(Color.red);
        this.add(winner);
        this.parent.timer.cancel();
     //   this.parent.playframe.revalidate();
     //   this.parent.playframe.setDefaultCloseOperation(this.parent.playframe.EXIT_ON_CLOSE);
	 /*       this.parent.playframe.addWindowListener(new WindowAdapter()      
	        {
	            public void windowClosing(WindowEvent e)
	            {
	            	super.windowClosing(e);
	               // System.exit(0);
	            	System.out.println(e.getID()+"closing="+e.getNewState()+","+e.getSource());
	            	//((JFrame)(e.getSource())).getParent().getParent().getParent().setVisible(true);
	            }
	        });*/
/*	    this.parent.playframe.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	            Object[] options = { "確定", "取消" };
	            JOptionPane pane2 = new JOptionPane("真想退出嗎?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, null, options, options[1]);
	            JDialog dialog = pane2.createDialog("警告");
	            dialog.setVisible(true);
	            Object selectedValue = pane2.getValue();
	            if (selectedValue == null || selectedValue == options[1]) 
	            {
	              dialog.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
	            } 
	            else if (selectedValue == options[0]) 
	            {
	              dialog.setDefaultCloseOperation(dialog.EXIT_ON_CLOSE);
	            }
	        }
	      });*/
	}

	
}
