package kmarko;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {

    @DataProvider
    public static Object[][] dataForTests() {
        return new Object[][]{
                {"This is", " new line"},
        };
    }

    @Test(dataProvider = "dataForTests", priority = 1, invocationCount = 3)
    final public void testMethod0(final String firstString,
                                  final String secondString) {
        System.out.println("This is method 0");
        System.out.println(firstString + secondString);
    }

    @Test(dataProvider = "dataForTests",
            dependsOnMethods = {"testMethod0"}, invocationCount = 3)
    final public void testMethod1(final String firstString,
                                  final String secondString) {
        System.out.println("This is method 1");
        System.out.println(firstString + secondString);
    }

    @Test(dataProvider = "dataForTests",
            dependsOnMethods = {"testMethod1"}, invocationCount = 3)
    final public void testMethod2(final String firstString,
                                  final String secondString) {
        System.out.println("This is method 2");
        System.out.println(firstString + secondString);
    }

    @Test(dataProvider = "dataForTests",
            dependsOnMethods = {"testMethod2"}, invocationCount = 3)
    final public void testMethod3(final String firstString,
                                  final String secondString) {
        System.out.println("This is method 3");
        System.out.println(firstString + secondString);
    }

    @Test(dataProvider = "dataForTests",
            dependsOnMethods = {"testMethod3"}, invocationCount = 3)
    final public void testMethod4(final String firstString,
                                  final String secondString) {
        System.out.println("This is method 4");
        System.out.println(firstString + secondString);
    }
}
