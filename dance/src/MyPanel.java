import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MyPanel extends JPanel implements ActionListener{
	
	Action a;//
	Expression e;
	Timer t=new Timer();
	public MyPanel()
	{
		Context context=new Context();
		context.add('a',new RaiseHandR());
		context.add('b',new RaiseHandL());
		//a=new RaiseHandR();
		e=new Expressions(this);
		
		Expression e2=new Expression_word('b',this);Expression e1=new Expression_word('a',this);
		Expression e3=new Expression_word('b',this);Expression e4=new Expression_word('a',this);
		e.add(e1);e.add(e2);e.add(e3);e.add(e4);
		Expression e5=new Expression_word('b',this);Expression e6=new Expression_word('a',this);
		Expression e7=new Expression_word('b',this);Expression e8=new Expression_word('a',this);
		e.add(e5);e.add(e6);e.add(e7);e.add(e8);
		t.setP(this,e,context);
		t.start();
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);		
		a.action(g);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
			
	}
	
}
