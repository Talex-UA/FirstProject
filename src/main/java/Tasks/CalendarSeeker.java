package Tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalendarSeeker {
        @SuppressWarnings("deprecation")
        public static void main(String[] args) {
            Date date = getdate();
            printDay(date);
        }

    private static void printDay(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        System.out.println(dateFormat.format(date));
    }

    @SuppressWarnings("deprecation")
    private static Date getdate() {
        Scanner input = new Scanner(System.in);
        Date date = null;
        System.out.println("Please, enter the date using DD MMM YYYY format (e.g. 11 February 2015)");
        boolean b=true;
        while (b) {
            try {
                date = new Date(input.nextLine());
                b=false;
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println("Please, try again");
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Something went wrong, closing");
                System.exit(0);
            }
        }
        return date;
    }
}
