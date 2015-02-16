package TasksWithStaticMethods;

public class UserIntInput {
    int year;
    int month;
    int day;

    UserIntInput(){}

    public UserIntInput(int day, int month, int year){
        if (month < 1 || month > 12) throw new NumberFormatException();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day < 1 || day > 31) throw new NumberFormatException();
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) throw new NumberFormatException();
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            if (day < 1 || day > 29) throw new NumberFormatException();
        } else if (day < 1 || day > 28) throw new NumberFormatException();

        this.day=day;
        this.month=month;
        this.year=year;
    }
}
