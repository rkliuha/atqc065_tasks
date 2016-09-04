package okornienko;


import org.testng.annotations.*;


public class TestNGPractice {
    @DataProvider
    public final Object[][] tablesData() {
        return new Object[][]{
                {15}
        };
    }

    @Test(dataProvider = "tablesData", invocationCount = 3)
    private static void testMethod0(final int parameter) {
        System.out.println("This is method 0 and it takes parameter - " + parameter);
    }

    @Test(dataProvider = "tablesData", dependsOnMethods = {"testMethod0"}, invocationCount = 3)
    private static void testMethod1(final int parameter) {
        System.out.println("This is method 1 and it takes parameter - " + parameter);
    }

    @Test(dependsOnMethods = "testMethod1", dataProvider = "tablesData", invocationCount = 3)
    private static void testMethod2(final int parameter) {
        System.out.println("This is method 2 and it takes parameter - " + parameter);
    }

    @Test(dependsOnMethods = "testMethod2", dataProvider = "tablesData", invocationCount = 3)
    private static void testMethod3(final int parameter) {
        System.out.println("This is method 3 and it takes parameter - " + parameter);
    }

    @Test(dependsOnMethods = "testMethod3", dataProvider = "tablesData", invocationCount = 3)
    private static void testMethod4(final int parameter) {
        System.out.println("This is method 4 and it takes parameter - " + parameter);
    }

}
