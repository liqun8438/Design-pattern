import java.awt.Graphics;

import javax.swing.JPanel;


public class NumericShow extends JPanel implements ShowWindow {

	Data  data;
	public NumericShow( )
	{
		
	}
	public void setData(Data d)
	{
		data=d;
	}
	public void update()
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		drawWindow(g);
	
	
	}
	public void drawWindow(Graphics g)
	{
		for(int i=0;i<20;i++)
		{
			if(i<10)
			g.drawString(data.s[i]+"",10,20+i*20);
			else g.drawString(data.s[i]+"",50+50,20+(i-10)*20);
		}
	}
	
}
