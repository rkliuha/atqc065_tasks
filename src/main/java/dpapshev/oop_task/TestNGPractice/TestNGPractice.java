package dpapshev.oop_task.TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPractice {


    @DataProvider(name = "dataProvider")
    final public Object[][] dataCenter() {

        return new Object[][]
                {
                        {"Hello World"}
                };
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3, priority = 4)
    public void testMethod0(final String inputParameter) {
        System.out.println("This is method 0 ");
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3, priority = 3)
    public void testMethod1(final String inputParameter) {
        System.out.println("This is method 1");
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3, priority = 2)
    public void testMethod2(final String inputParameter) {
        System.out.println("This is method 2 " + inputParameter);
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3, priority = 1)
    public void testMethod3(final String inputParameter) {
        System.out.println("This is method 3");
    }

    @Test(dataProvider = "dataProvider", invocationCount = 3, priority = 0)
    public void testMethod4(final String inputParameter) {
        System.out.println("This is method 4 " + inputParameter);
    }
}

