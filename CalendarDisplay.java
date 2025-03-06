import java.util.Scanner;

public class CalendarDisplay {
    private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    private static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            if (day < 10) {
                System.out.print("  " + day + " ");
            } else {
                System.out.print(" " + day + " ");
            }
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        if (month < 0 || month > 11) {
            System.out.println("Invalid month input. Please enter a value between 1 and 12.");
        } else {
            displayCalendar(month, year);
        }
    }
}
/*
    Enter month (1-12): 3
    Enter year: 2002

    March 2002
    Sun Mon Tue Wed Thu Fri Sat
                        1   2
    3   4   5   6   7   8   9
    10  11  12  13  14  15  16
    17  18  19  20  21  22  23
    24  25  26  27  28  29  30
    31

*/
