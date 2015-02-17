package mainTests;

import TasksWithStaticMethods.ArrayNeighbors_4methods;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class ArrayNeighborsTest {

    @Rule
    public Timeout timeout = new Timeout(1000);

    @Test
    public void negativeNumbersTest() {
        int[] array = new int[]{-1, 1};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void oneNegativeNumberArrayTest() {
        int[] array = new int[]{-1};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == -1);
    }

    @Test
    public void onePositiveNumberArrayTest() {
        int[] array = new int[]{1};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == -1);
    }

    @Test
    public void firstMinNumberTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 0);
    }
    @Test
    public void firstMinNextNumberTest() {
        int[] array = new int[]{10, 15, 2, 3, 4, 50};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 2);
    }

    @Test
    public void sameNumbersTest() {
        int[] array = new int[]{1, 1, 3, 4, 5};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void zeroDistanceTest() {
        int[] array = new int[]{100, -1, 0, 0, 3, 4, 5};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 2);
    }

    @Test
    public void sameNegativeTest() {
        int[] array = new int[]{-1, -1, 1, 1};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void criticalNumbersTest() {
        int[] array = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        int result = ArrayNeighbors_4methods.findNeighborsIndex(array);
        Assert.assertTrue(result == 0);
    }
}
