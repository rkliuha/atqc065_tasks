package rkliuha;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {

    @Test(dataProvider = "dataProvider", invocationCount = 3)
    public final void testMethod0(final int testNumber) {
        System.out.println("This is method 0 takes " + testNumber);
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3,
            dependsOnMethods = "testMethod0")
    public final void testMethod1(final int testNumber) {
        System.out.println("This is method 1 takes " + testNumber);
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3,
            dependsOnMethods = "testMethod1")
    public final void testMethod2(final int testNumber) {
        System.out.println("This is method 2 takes " + testNumber);
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3,
            dependsOnMethods = "testMethod2")
    public final void testMethod3(final int testNumber) {
        System.out.println("This is method 3 takes " + testNumber);
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3,
            dependsOnMethods = "testMethod3")
    public final void testMethod4(final int testNumber) {
        System.out.println("This is method 4 takes " + testNumber);
    }

    @DataProvider
    public final Object[][] dataProvider() {
        return new Object[][]{{6711}};
    }
}
