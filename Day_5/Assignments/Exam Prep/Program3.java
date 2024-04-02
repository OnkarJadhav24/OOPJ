import java.util.Scanner;

public class Program3 {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public Program3(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws Exception{
    	try {
    	   if(!(day<1 && day>31))
    	   {
             this.day = day;
    	   }
    	   else
    	   {
    		 throw new IllegalArgumentException();
    	   }
    	}
    	catch( IllegalArgumentException e)
    	{
    		throw new IllegalArgumentException(e);
    	}
    }
    

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%02d %02d:%02d", year, month, day, hour, minute);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter hour:");
        int hour = scanner.nextInt();
        System.out.println("Enter minute:");
        int minute = scanner.nextInt();

        Program3 dateTime = new Program3(year, month, day, hour, minute);
        System.out.println("Date and Time entered: " + dateTime);
    }
}