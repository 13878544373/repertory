package shape;

public class Squareness extends Shape{
	private int length;
	private int width;

	public Squareness(int length,int width) {
		super();
		this.length = length;
		this.width=width;
	}

	public Squareness() {
		super();
	}
	
	public int getlength() {
		return length;
	}

	public void setlength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		double area=length*width;
		return area;
	}
	

}
