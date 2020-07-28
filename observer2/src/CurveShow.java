import java.awt.Graphics;

import javax.swing.JPanel;


public class CurveShow extends JPanel implements ShowWindow{
	
	Data  data;
	public CurveShow( )
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
		g.drawLine(45, 100, 250, 100);
		g.drawLine(50, 20, 50, 350);
		for(int i=0;i<19;i++)g.drawLine(i*8+50,data.s[i]*8+100,(i+1)*8+50,data.s[i+1]*8+100);
	}
}
