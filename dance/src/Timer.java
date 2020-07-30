import javax.swing.JPanel;


public class Timer extends Thread {

	//public static Timer t=new Timer();
	JPanel p;
	Expression e;
	Context c;
	public void setP(MyPanel p,Expression e,Context c)
	{
		this.e=e;
		this.p=p;this.c=c;
	}
	public void run()
	{
		e.toDo(c);
		
	}
}
