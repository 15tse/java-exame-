package myexcers;

public class farea {
	public static void main(String[] args) {
		double radius=5;
		double width=5;
		double base=5;
		double hight=5;
		double length=5;
		System.out.println("circular " + shape.area(radius));
		System.out.println("rectangular " + shape.area(hight,base,length));
		System.out.println("triangular " + shape.area(width,base));
		
	}
public class shape {
	public static double area(double radius) {
		return Math.PI*radius*radius;
		
	}
	public static double area(double width,  double base) {
		return 0.5* width*base;
		
	}
	public static double area(double hight, double base, double length) {
		return hight*length;
		
	}
}

}