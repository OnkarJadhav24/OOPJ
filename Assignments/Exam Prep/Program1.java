import java.time.DayOfWeek;
import java.time.LocalDate;

public class Program1 {
    private int day;
    private int month;
    private int year;

    public Program1() {
    }

    // Constructor
    public Program1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if the date is valid
    public boolean isValid() {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Method to get the day of the week
    public int getDayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getValue() % 7;
    }

    // Method to check if the year is a leap year
    public boolean isLeapYear() {
        return java.time.Year.of(year).isLeap();
    }

    // Method to get the next day
    public Program1 getNextDay() {
        LocalDate date = LocalDate.of(year, month, day).plusDays(1);
        return new Program1(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    // Method to get the previous day
    public Program1 getPreviousDay() {
        LocalDate date = LocalDate.of(year, month, day).minusDays(1);
        return new Program1(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    // Method to display the date
    @Override
    public String toString() {
        return String.format("%02d-%02d-%d", day, month, year);
    }

    // Main method for testing
    public static void main(String[] args) {
        Program1 date = new Program1(31, 12, 2022);
        System.out.println(date.isValid()); // true
        System.out.println(date.getDayOfWeek()); // 6 (Saturday)
        System.out.println(date.isLeapYear()); // false
        System.out.println(date.getNextDay()); // 01-01-2023
        System.out.println(date.getPreviousDay()); // 30-12-2022
    }
}