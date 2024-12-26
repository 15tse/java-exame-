package methods;
// over loading 
public class Area {
public static void main(String[] args) {
	double radius=5;
	int length =5;
	int width=5;
	double base=5;
	double hight =5;
	 System.out.println("Circle area: " + Shape.area(radius));
	 System.out.println("Rectangular area: " + Shape.area(width,length));
	 System.out.println("tringular area: " + Shape.area(base,hight));

	
}
public class Shape{
	public static  double area( double radius) {
		return Math.PI*radius*radius;
	}
	public static  int area ( int width, int length){
		return width*length;
	}

	public static  double area(double base,double hight){
		return 0.5*base*hight;
		}
	}
}

