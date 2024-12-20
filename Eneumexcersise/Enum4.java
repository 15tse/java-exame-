package Eneumexcersise;

public class Enum4 {

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.WEDNESDAY;

        int comparison = day1.compareTo(day2);

        if (comparison < 0) {
            System.out.println(day1 + " comes before " + day2);
        } else if (comparison > 0) {
            System.out.println(day1 + " comes after " + day2);
        } else {
            System.out.println(day1 + " is the same as " + day2);
        }
    }
}


}
