package methods;

public class temperature {
	public class TemperatureConverter { public static void main(String[] args) {
        double fahrenheit = 100.0;
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");

        double celsius2 = 37.5;
        double fahrenheit2 = TemperatureConverter.celsiusToFahrenheit(celsius2);
        System.out.println(celsius2 + "°C is equal to " + fahrenheit2 + "°F");
    }
	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5.0/9.0;
	    }

	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9.0/5.0) + 32;
	    }
	}
   

}
