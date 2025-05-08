package utils;

import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;

    public static void initializePageObject() {
        loginPage = new LoginPage();
    }

}
