package ksichenko.oms_test.factory_pattern;

public class Factory {

    public PageObject getClass(String ourClass) {

        if (ourClass == null) {
            return null;
        }

        if (ourClass.equals("UserInfoPage")) {

            return new UserInfoPage();

        }else if (ourClass.equals("LoginPage")){

            return new LogInPage();
        }
        return null;
    }
}
