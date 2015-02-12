package Tasks;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarSeeker2 {
    public static void main(String[] args) {
        Calendar c = setUserDate();
        printDayName(c);
    }

    private static void printDayName(Calendar c) {
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String [] weekdays=dfs.getWeekdays();
        System.out.println(weekdays[c.get(Calendar.DAY_OF_WEEK)]);
    }

    private static Calendar setUserDate() {
        Calendar c = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        int year=0,month=0,day=0;
        do{
            try {
                System.out.println("Please, enter the date using DD.MM.YYYY format");
                String[] stringArray = input.nextLine().split("\\.");
                year = Integer.parseInt(stringArray[2]);
                month = Integer.parseInt(stringArray[1]);
                    if (month<1 || month>12) throw new NumberFormatException();
                day = Integer.parseInt(stringArray[0]);
                    if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                        if (day<1 || day>31) throw new NumberFormatException();
                    } else if(month==4 || month==6 || month==9 || month==11){
                        if (day<1 || day>30) throw new NumberFormatException();
                    }else if (year%4==0){
                        if (day<1 || day>29) throw new NumberFormatException();
                    } else if (day<1 || day>28) throw new NumberFormatException();
            }
            catch (NumberFormatException e){
                System.out.println("Please, use given format");
            }
        } while (year==0 || month==0 || day==0);
        c.set(year, month-1, day);
        return c;

    }

}
