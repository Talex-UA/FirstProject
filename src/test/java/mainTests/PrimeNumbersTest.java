package mainTests;

import TasksWithStaticMethods.PrimeNumbers_4methods;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrimeNumbersTest {

    @Test
    public void hugeNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(1);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void negativeNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(-1);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void zeroNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(0);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void minPrimeNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(2);
        Assert.assertTrue(primeNumbersArray.size() == 1 && primeNumbersArray.get(0) == 2);
    }

    @Test
    public void hundredNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(100);
        Assert.assertTrue(primeNumbersArray.size() == 25);
    }

    @Test
    public void thousandNumberTest() {
        ArrayList<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(1000);
        Assert.assertTrue(primeNumbersArray.size() == 168);
    }

}
