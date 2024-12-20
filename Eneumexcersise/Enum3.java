package Eneumexcersise;

public class Enum3 {
	 public static void main(String[] args) {
	        Day day1 = Day.TUESDAY;
	        Day day2 = Day.MONDAY;

	        int comparison = day1.compareTo(day2);
	        System.out.println(comparison);

	        if (comparison < 0) {
	            System.out.println(day1 + " comes before " + day2);
	        } else if (comparison > 0) {
	            System.out.println(day1 + " comes after " + day2);
	        } else {
	            System.out.println(day1 + " is the same as " + day2);
	        }
	    }
public enum Day {
    MONDAY,//0
    TUESDAY,//1
    WEDNESDAY,//2
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

   
}
}
// comparison =index of day1-index of day2
