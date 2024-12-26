package methods;

public class Invocationcounter{
	  private int invocationCount = 0;

	    public void invocationCounterMethod() {
	        invocationCount++;
	        System.out.println("Method invoked " + invocationCount + " times");
	    }

	    public static void main(String[] args) {
	        Invocationcounter counter = new Invocationcounter();
	        counter.invocationCounterMethod(); // Output: Method invoked 1 times
	        counter.invocationCounterMethod(); // Output: Method invoked 2 times
	        counter.invocationCounterMethod(); // Output: Method invoked 3 times
	    }


}
