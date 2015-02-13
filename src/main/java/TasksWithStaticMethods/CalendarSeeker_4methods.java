package TasksWithStaticMethods;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarSeeker_4methods {
    public static void main(String[] args) {
        printDayName(setUserDate(getUserInput()));
    }

    public static Calendar setUserDate(UserIntInput userInput) {
        Calendar c = Calendar.getInstance();
        c.set(userInput.year, userInput.month - 1, userInput.day);
        return c;
    }

    public static UserIntInput getUserInput() {
        Scanner input = new Scanner(System.in);
        UserIntInput userInput = new UserIntInput();
        do {
            try {
                System.out.println("Please, enter the date using DD.MM.YYYY format");
                String[] stringArray = input.nextLine().split("\\.");
                userInput.year = Integer.parseInt(stringArray[2]);
                userInput.month = Integer.parseInt(stringArray[1]);
                if (userInput.month < 1 || userInput.month > 12) throw new NumberFormatException();
                userInput.day = Integer.parseInt(stringArray[0]);
                if (userInput.month == 1 || userInput.month == 3 || userInput.month == 5 || userInput.month == 7 || userInput.month == 8 || userInput.month == 10 || userInput.month == 12) {
                    if (userInput.day < 1 || userInput.day > 31) throw new NumberFormatException();
                } else if (userInput.month == 4 || userInput.month == 6 || userInput.month == 9 || userInput.month == 11) {
                    if (userInput.day < 1 || userInput.day > 30) throw new NumberFormatException();
                } else if (userInput.year % 4 == 0 && userInput.year % 100 == 0 && userInput.year % 400 == 0) {
                    if (userInput.day < 1 || userInput.day > 29) throw new NumberFormatException();
                } else if (userInput.day < 1 || userInput.day > 28) throw new NumberFormatException();
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Please, use given format");
                userInput.day = 0;
            }
        } while (userInput.day == 0);
        return userInput;
    }

    public static void printDayName(Calendar c) {
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String[] weekdays = dfs.getWeekdays();
        System.out.println(weekdays[c.get(Calendar.DAY_OF_WEEK)]);
    }

    static class UserIntInput {
        int year;
        int month;
        int day;
    }

}
