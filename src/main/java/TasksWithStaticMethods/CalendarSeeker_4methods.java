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
        if (userInput==null){
            System.out.println("You shall not pass! Exception to be thrown");
            throw new NullPointerException();
        }

        Calendar c = Calendar.getInstance();
        c.set(userInput.year, userInput.month - 1, userInput.day);
        return c;
    }

    public static UserIntInput getUserInput() {
        Scanner input = new Scanner(System.in);
        UserIntInput userInput = new UserIntInput();
        boolean notInitialized = true;
        do {
            try {
                System.out.println("Please, enter the date using DD.MM.YYYY format");
                String[] stringArray = input.nextLine().split("\\.");
                userInput = new UserIntInput(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]));
                notInitialized = false;
            } catch (NumberFormatException e) {
                System.out.println("This date is incorrect");
            }
        } while (notInitialized);

        return userInput;
    }

    public static void printDayName(Calendar c) {
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String[] weekdays = dfs.getWeekdays();
        System.out.println(weekdays[c.get(Calendar.DAY_OF_WEEK)]);
    }


}
