package encapsulation;

public class Rectangle {
	private double width;
	  private double height;

	  // Constructor with width and height
	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }

	  // Getter for width
	  public double getWidth() {
	    return width;
	  }

	  // Getter for height
	  public double getHeight() {
	    return height;
	  }

	  // Method to calculate area
	  public double calculateArea() {
	    return width * height;
	  }

	  // Method to calculate perimeter
	  public double calculatePerimeter() {
	    return 2 * (width + height);
	  }



Rectangle rectangle = new Rectangle(5.0, 3.0);
System.out.println("Width: " + rectangle.getWidth());
System.out.println("Height: " + rectangle.getHeight());
System.out.println("Area: " + rectangle.calculateArea());
System.out.println("Perimeter: " + rectangle.calculatePerimeter());
}