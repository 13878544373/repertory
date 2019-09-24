package Abstract;

public class Dog extends Animal{
	


	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String type, String cry) {
		super(type, cry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getType()+"µÄ½ÐÉùÊÇ£º"+getCry());
		
	}
	

}
