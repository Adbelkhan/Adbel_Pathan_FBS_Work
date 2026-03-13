import java.util.TreeMap;

class Player
{
	int jersynumber;
	String name;
	int runs;
	
	Player(int jersynumber, String name, int runs) 
	{
		super();
		this.jersynumber = jersynumber;
		this.name = name;
		this.runs = runs;
	}

	int getJersynumber() {
		return jersynumber;
	}

	void setJersynumber(int jersynumber) {
		this.jersynumber = jersynumber;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getRuns() {
		return runs;
	}

	void setRuns(int runs) {
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "\n [jersynumber=" + jersynumber + ", name=" + name + ",runs=" +runs +" ]";
	}

	
}
public class Demo {

	public static void main(String[] args) 
	{
		//TreeMap<Integer, Player> tn = new TreeMap<Integer,Player>();
		TreeMap tn = new TreeMap();
		tn.put(new MyKey(111), new Player(10,"Sachin",100));
		
		tn.put(new MyKey(101),  new Player(7,"Dhoni",99));
		
		tn.put(new MyKey(16), new Player(18,"Virat",198));
		
		System.out.println(tn);

	}

}
