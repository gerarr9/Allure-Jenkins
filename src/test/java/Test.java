public class Test extends BaseTest {

    @org.junit.jupiter.api.Test
    public void test()  {
        basePage.navigateTo("https://www.google.ru/");
        mainPage.search("Лига");
    }
}

