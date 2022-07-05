package amazon;

import org.testng.annotations.Test;


public class HomePageTest extends HomePage {

    // Test class


    @Test
    public void testCkAddressBar() throws InterruptedException {
        ckAddressBar();
    }

    @Test
    public void testChangeCountry() throws InterruptedException {
        changeCountry();
    }

    @Test
    public void testCheckKindleBooksLink() throws InterruptedException {
        checkKindleBooksLink();
    }

    @Test(enabled = false)
    public void tesTamazonPrime() throws InterruptedException {
        amazonPrime();
    }

    @Test
    public void testCkAddressBarCustomXpath() throws InterruptedException {
        ckAddressBarCustomXpath();

    }
    @Test
     public void testCkBurgerMenuFunctionality() throws InterruptedException {
        ckBurgerMenuFunctionality();
}}