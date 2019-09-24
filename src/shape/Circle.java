package shape;

public class Circle extends Shape{

	private double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle(double r) {
		super();
		this.r = r;
	}
	public Circle() {
		super();
	}
	@Override
	public double area() {
		double area=3.14*r*r;
		return area;
	}

}
