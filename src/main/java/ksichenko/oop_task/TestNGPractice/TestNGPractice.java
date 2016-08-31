package ksichenko.oop_task.TestNGPractice;

import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {

    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"This is method 0"},
                {"This is method 1"},
                {"This is method 2"}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testMethod0(final String method) {

        System.out.println("This is : " + method);
    }

    @DataProvider(name = "dataProvider0")
    public Object[][] dataProviderMethod0() {
        return new Object[][]{
                {"This is method 3"},
                {"This is method 4"},
                {"This is method 5"}
        };
    }

    @Test(dataProvider = "dataProvider0", dependsOnMethods = {"testMethod0"})
    public static void testMethod1() {

        System.out.println("This is method 1");
    }

    @DataProvider(name = "dataProvider1")
    public Object[][] dataProviderMethod1() {
        return new Object[][]{
                {"This is method 6"},
                {"This is method 7"},
                {"This is method 8"}
        };
    }

    @Test(dataProvider = "dataProvider1", dependsOnMethods = {"testMethod1"})
    public static void testMethod2() {

        System.out.println("This is method 2");
    }

    @DataProvider(name = "dataProvider2")
    public Object[][] dataProviderMethod2() {
        return new Object[][]{
                {"This is method 6"},
                {"This is method 7"},
                {"This is method 8"}
        };
    }

    @Test(dataProvider = "dataProvider2", dependsOnMethods = {"testMethod2"})
    public static void testMethod3() {

        System.out.println("This is method 3");
    }

    @DataProvider(name = "dataProvider3")
    public Object[][] dataProviderMethod3() {
        return new Object[][]{
                {"This is method 9"},
                {"This is method 10"},
                {"This is method 11"}
        };
    }

    @Test(dataProvider = "dataProvider3", dependsOnMethods = {"testMethod3"})
    public static void testMethod4() {

        System.out.println("This is method 4");
    }

}
