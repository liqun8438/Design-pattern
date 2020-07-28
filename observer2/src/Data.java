import java.util.ArrayList;
import java.util.Iterator;


public class Data {
	
	int s[]=new int[20];
	int a=5;
	ArrayList showWindows=new ArrayList();
	public Data()	{
		changeData(a);	
	}
	public void changeData(int a)
	{
		for(int i=0;i<20;i++)
		{
			s[i]=(int)(a*Math.sin(2*Math.PI*i*5/100));
		}
		updatAllWindows();
	
	}
	public void attach(ShowWindow s1)
	{
		s1.setData(this);
		showWindows.add(s1);
	}
	
	public void updatAllWindows()
	{
		Iterator i=showWindows.iterator();
		while(i.hasNext())
			
		{		
			((ShowWindow)i.next()).update();
		}
		
	}

}
