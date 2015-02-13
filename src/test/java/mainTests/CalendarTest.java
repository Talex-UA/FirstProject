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

    @Test
    public void negativeInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(-10, -10, -2010));
        Assert.assertTrue(result.get(DAY_OF_WEEK) == 4);
    }

    @Test
    public void futureInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(10, 10, -20100));
        Assert.assertTrue(result.get(DAY_OF_WEEK) == 6);
    }

    @Test
    public void incorrectInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(1000, 1000, -20100));
        Assert.assertTrue(result.get(DAY_OF_WEEK) == 6);
    }

    @Test
    public void zeroInputTest() {
        Calendar result = CalendarSeeker_4methods.setUserDate(new UserIntInput(0, 0, 0));
        Assert.assertTrue(result.get(DAY_OF_WEEK) == 1);
    }
}
