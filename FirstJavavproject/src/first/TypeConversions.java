package first;

public class TypeConversions {
	public static void main(String[] args) {
		 // Implicit type conversions (automatic)
        int intVal = 10;
        float floatVal = intVal; // int to float
        double doubleVal = floatVal; // float to double

        System.out.println("Implicit type conversions:");
        System.out.println("int to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);
        // Explicit type conversions (casting)
        double doubleVal2 = 3.14;
        float floatVal2 = (float) doubleVal2; // double to float
        int intVal2 = (int) floatVal2; // float to int

        System.out.println("\nExplicit type conversions (casting):");
        System.out.println("double to float: " + floatVal2);
        System.out.println("float to int: " + intVal2);


}

}
