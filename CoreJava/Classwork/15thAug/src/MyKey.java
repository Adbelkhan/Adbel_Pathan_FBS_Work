
public class MyKey implements Comparable 
{
	int key;
	
	MyKey(int key) 
	{
		super();
		this.key= key;
	}

	@Override
	public int compareTo(Object o) {
		MyKey mk=(MyKey) o;
		return this.key-mk.key;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.key ;
	}

}
