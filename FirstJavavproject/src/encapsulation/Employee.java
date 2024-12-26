package encapsulation;

public class Employee {
	 private String name;
	  private int age;
	  private double salary;

	  // Constructor with name, age, and salary
	  public Employee(String name, int age, double salary) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	  }

	  // Constructor with only name and age (salary = 0)
	  public Employee(String name, int age) {
	    this(name, age, 0.0);
	  }

	  // Getter for name
	  public String getName() {
	    return name;
	  }

	  // Getter for age
	  public int getAge() {
	    return age;
	  }
	  // Getter for salary
	  public double getSalary() {
	    return salary;
	  }

	  // Method to increase salary
	  public void increaseSalary(double amount) {
	    if (amount > 0) {
	      salary += amount;
	    } else {
	      System.out.println("Invalid salary increase amount.");
	    }
	  
	  Employee employee = new Employee("John Doe", 30, 50000.0);
	  System.out.println("Name: " + employee.getName());
	  System.out.println("Age: " + employee.getAge());
	  System.out.println("Initial Salary: " + employee.getSalary());

	  employee.increaseSalary(10000.0);
	  System.out.println("Salary after increase: " + employee.getSalary());

	  }
}
