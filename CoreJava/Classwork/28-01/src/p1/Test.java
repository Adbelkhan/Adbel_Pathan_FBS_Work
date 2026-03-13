package p1;

interface Discount 
{
	void offer();
}

class Mall implements Discount
{
	@Override
	public void offer() {
		System.out.println("20% discount applied");
		
	}
}
class Test {

	public static void main(String[] args) {
		Mall m1 = new Mall();
		m1.offer();
		
		Mall m2 = new Mall();
		m2.offer();
		
		new Discount() {
			
			public void offer() {
				System.out.println("50% discount ");
			}
		}.offer();
		

	}

}
