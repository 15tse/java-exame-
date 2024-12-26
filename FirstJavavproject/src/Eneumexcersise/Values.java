package Eneumexcersise;

public class Values {
	public enum Color {
	    RED,
	    GREEN,
	    BLUE,
	    YELLOW,
	    PURPLE,
	    
		}

	    public static void printAllColors() {
	        for (Color color : Color.values()) {
	            System.out.println(color);
	        }
	    }

	    public static void main(String[] args) {
	        printAllColors();
	    }
	}



