package ksichenko.oms_test.factory_pattern;

import org.openqa.selenium.WebElement;

public interface PageObject {

    abstract LogInPage logIn();

    abstract ksichenko.oms_test.factory_pattern.UserInfoPage logOut();

    abstract Object click();

    abstract WebElement findElement();

    abstract void inPut();
}
