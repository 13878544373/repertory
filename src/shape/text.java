package shape;

public class text {

	public static void main(String[] args) {
		Shape s=new Circle(10);
		double area=s.area();
		System.out.println("Բ�������"+area);
		s=new Squareness(5,2);
		area=s.area();
		System.out.println("���������"+area);
		s=new Triangle(5.2,6.3);
		area=s.area();
		System.out.println("�����������"+area);
		s=new Square(5);
		area=s.area();
		System.out.println("�����������"+area);

	}

}
