import java.awt.Graphics;

import javax.swing.JPanel;


public class Expression_word extends Expression {

	char a;
	public Expression_word(char a1,MyPanel p)
    {
		super(p);
		a=a1;
	}
	public void toDo(Context c)
    {
		p.a=c.lookup(a);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		
		p.repaint();
		
		
    
    }
	
}
