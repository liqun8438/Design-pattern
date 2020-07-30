import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class Expressions extends Expression {

	
	
	public Expressions(MyPanel p1) {
		super(p1);
		
	}
	public ArrayList expressions=new ArrayList();
	
	public void add(Expression c)
	{
		expressions.add(c);
	}
	public void toDo(Context c)
	{
		
		Iterator i=expressions.iterator();
		while(i.hasNext())
		{
			((Expression)(i.next())).toDo(c);
			
			
		}
		
	}
	
	
}
