package mainTests;

import TasksWithStaticMethods.PrimeNumbers_4methods;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersTest {

    @Test
    public void hugeNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(1);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void negativeNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(-1);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void zeroNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(0);
        Assert.assertTrue(primeNumbersArray.size() == 0);
    }

    @Test
    public void minPrimeNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(2);
        Assert.assertTrue(primeNumbersArray.size() == 1 && primeNumbersArray.get(0) == 2);
    }

    @Test
    public void hundredNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(100);
        Assert.assertTrue(primeNumbersArray.size() == 25);
    }

    @Test
    public void thousandNumberTest() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(1000);
        Assert.assertTrue(primeNumbersArray.size() == 168);
    }

    @Test
    public void thousandNumberTest2() {
        List<Integer> primeNumbersArray = PrimeNumbers_4methods.getPrimeNumbersArray(8);
        Assert.assertTrue(primeNumbersArray.size() == 4);
        primeNumbersArray.forEach(System.out::println);
    }

}
