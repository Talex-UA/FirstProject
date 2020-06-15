package mainTests;

import TasksWithStaticMethods.CalendarSeeker_4methods;
import TasksWithStaticMethods.UserIntInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static java.util.Calendar.*;

public class CalendarTest {

    @Test
    public void positiveTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(10, 10, 2010));
        Assert.assertTrue(result.get(DAY_OF_WEEK) == 1);
    }

    @Test(expected = Exception.class)
    public void negativeInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(-10, -10, -2010));
    }

    @Test(expected = Exception.class)
    public void incorrectInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(1000, 1000, -20100));
    }

    @Test(expected = Exception.class)
    public void minusInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(10, 10, -20100));
    }
}
