package Eneumexcersise;

public class Eneum2 { 
	public static void main(String[] args) {
    Day today = Day.TUESDAY;
   // System.out.println(today);  // Outputs: MONDAY
    
    switch (today) {
    case MONDAY:
        System.out.println("It's Monday!");
        break;
    case TUESDAY:
        System.out.println("It's Tuesday!");
        break;
    // ...
}

}
	public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

}
