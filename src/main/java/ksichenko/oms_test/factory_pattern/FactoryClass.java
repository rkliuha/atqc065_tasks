package ksichenko.oms_test.factory_pattern;


public class FactoryClass {

    public static void main(String[] args) {
        Factory factory = new Factory();

        PageObject userInfoPage = factory.getClass("UserInfoPage");

        userInfoPage.findElement();

        PageObject logInPage = factory.getClass("LogInPage");

        logInPage.click();
    }
}