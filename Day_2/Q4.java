import java.util.Scanner;

class Q4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 System.out.print("Enter weekday number (1-7): ");
        int weekdayNum = scanner.nextInt();
        String weekdayName;
        switch (weekdayNum) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                System.out.println("Invalid weekday number");
                return;
        }
        System.out.println("Weekday: " + weekdayName);

}

}