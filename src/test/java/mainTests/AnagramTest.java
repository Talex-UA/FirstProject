package mainTests;

import TasksWithStaticMethods.Anagram_4methods;
import TasksWithStaticMethods.UserInput;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void whiteSpaceTest() {
        String first = " ";
        String second = " ";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void emptySpaceTest() {
        String first = "";
        String second = "";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void withWhitespacesSpaceTest() {
        String first = "asd";
        String second = "a s d";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void bothWithWhitespacesTest() {
        String first = "a s d";
        String second = "a s d";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void notEqualStringsTest() {
        String first = "asd";
        String second = "sda";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void notEqualWithWhitespacesStringsTest() {
        String first = "asd";
        String second = "s d a";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void negativeDoubleStringTest() {
        String first = "asd";
        String second = "asdasd";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(!result);
    }

    @Test
    public void negativeDifferentStringTest() {
        String first = "asd";
        String second = "asdqwe";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(!result);
    }

    @Test
    public void withNumbersTest() {
        String first = "asd1";
        String second = "asd1";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void withDodsTest() {
        String first = "asd.";
        String second = "a.ds";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void withNumbersDodsAndWhitespacesTest() {
        String first = " a sd1. ";
        String second = " . s d a 1 ";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void withSymbolsTest() {
        String first = ":;{}\"|>?<[]'\\/.,\1234567890-=!@#$%^&*()_+";
        String second = ";:{}\"|>?<[]'\\./,\1234567890-=!@#$%^&*()_+";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void uppercaseLettersTest() {
        String first = "QWErTY";
        String second = "rTYQWE";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }

    @Test
    public void hugeStringsTest() {
        String first = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String second = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        boolean result = Anagram_4methods.areAnagrams(new UserInput(first, second));
        Assert.assertTrue(result);
    }
}
