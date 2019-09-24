package shape;

public class Triangle extends Shape{
	private double bottom;
	private double high;
	@Override
	public double area() {
		double area=(bottom*high)/2;
		return area;
	}
	public Triangle(double bottom, double high) {
		super();
		this.bottom = bottom;
		this.high = high;
	}
	public Triangle() {
		super();
	}
	

}
