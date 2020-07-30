import java.util.HashMap;


public class Context {
	HashMap actions=new HashMap();
	public void add(char a,Action action)
	{
		actions.put(new Character(a),action);
	}
	public Action lookup(char a)
	{
		return (Action)actions.get(new Character(a));
	}

}
