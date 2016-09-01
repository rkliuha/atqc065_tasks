package dshkliar;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"This is method", 0},
                {"This is method", 1},
        };
    }

    @Test(dataProvider = "testData", invocationCount = 3)
    public void testMethod0(final String string, final int number) {
        System.out.println(string + " " + number);
    }

    @Test(dataProvider = "testData", dependsOnMethods = {"testMethod0"}, invocationCount = 3)
    public void testMethod1(final String string, final int number) {
        System.out.println(number + ". " + string);
    }

    @Test(dependsOnMethods = {"testMethod1"}, invocationCount = 3)
    public void testMethod2() {
        System.out.println("This is method 2");
    }
}
