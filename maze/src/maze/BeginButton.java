package maze;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BeginButton extends AllButton{
	
	ToolBar parent;
	public FrameTwoPanel frame2panel;
	JFrame playframe;
	static int interval; 
	static Timer timer; 
	
	BeginButton(ToolBar p)
	{
		super(p);
		parent=p;
		this.label="開始遊戲";
		this.setLabel(label);

	}
	
	public void doSomething()
	{
		if(this.parent.parent.mainnewpage!=null)
		{
			interval=10;
	        int delay = 1000; 
	        int period = 1000; 
			playframe = new JFrame();
	        playframe.setSize(1000, 800);
	        
			this.playframe.addWindowListener(new WindowAdapter()      
	        {
	            public void windowClosing(WindowEvent e)
	            {
	            	super.windowClosing(e);

	            	BeginButton.this.parent.parent.setVisible(true);
//	            	System.out.println(e.getID()+"closing="+e.getNewState()+","+e.getSource());
	            }
	        });
			
	        frame2panel = new FrameTwoPanel(this);
	        playframe.setLayout(new BorderLayout());
	        playframe.add(frame2panel,BorderLayout.CENTER);  
			
	        timer = new Timer(); 
	        playframe.setTitle("剩餘秒數："+String.valueOf(interval));
	        timer.scheduleAtFixedRate(new TimerTask() 
	        { 
	        	public void run() 
	        	{ 
        			BeginButton.this.playframe.setTitle("剩餘秒數："+String.valueOf(setInterval()));

	        		if(BeginButton.this.interval==0)
	        		{
	        			JLabel loser = new JLabel();
	        			loser.setText("Defeat!!");
	        			BeginButton.this.playframe.setLayout(new GridBagLayout());
	        			loser.setFont(new java.awt.Font("Lucida Grande", 1,50));
	        			loser.setForeground(Color.red);
	        			BeginButton.this.playframe.add(loser);
	        		}
	        		
	        		BeginButton.this.playframe.revalidate();
	  
	        	} 
	        	
	        }, delay, period); 
				        
	        this.parent.parent.setVisible(false);
	        playframe.setResizable(false);
	        playframe.setVisible(true);   
		}	
	}
	
	private static final int setInterval() 
	{ 
	    if (interval == 1) 
	    	timer.cancel(); 
	    return --interval; 
	} 
}
