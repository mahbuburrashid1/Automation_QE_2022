package amazon;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends TestBase {

    // Action method class

    static String actualText;


    /**
     * user should be able to search valid product in address bar
     */
    @Test
    public static void ckAddressBar() throws InterruptedException {

// user should be able to type in the edit box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("t-shirt");
        // user should be able to click on search box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        // user should be able to verify selection page navigate successfully or not.
        String expectedText = "\"T-Shirt\"";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        System.out.println("Actual Text : " + actualText);
        System.out.println("Expected Text : " + expectedText);

        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        driver.close();
    }

    /**
     * This method allow user to change or select country or region.
     */
    @Test
    public static void changeCountry() throws InterruptedException {
        // user should be able to click on country or region on the top of amazon home page.
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[2]")).click();

        Thread.sleep(4000);
        // user should be able to select radio button to change country or region.
        driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
        // user should be able to verify selection page navigate successfully or not.
        String expectedText = "Configuración de idioma";
        String actualText = driver.findElement(By.xpath("//*[@id=\"icp-language-heading\"]")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        //  driver.close();
    }

    /**
     * This method allow user can  select Kindle books.
     */
    @Test
    public static void checkKindleBooksLink() throws InterruptedException {
        // user should be able  click on kindle books functionality on the top of amazon home page.
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[14]")).click();

//user should be able to select kindle unlimited eligible books .
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li/span/a/div/label/i"));

        String expectedText = "Kindle Unlimited";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/div/span")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        // driver.close();
    }

    /**
     * *This method allow user can  select prime.
     */
    @Test
    public static void amazonPrime() throws InterruptedException {

        //user should be able  click on prime functionality on the top of amazon home page.
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"prime-hero-module-planLinks\"]/span/a[1]")).click();

        String expectedText = "Your Prime Student Benefits";
        String actualText = driver.findElement(By.xpath("//*[@id=\"subheader\"]")).getText();

        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");

        //  driver.close();
    }

    /**
     * This method allow user can use books functionality .
     */
    @Test
    public static void amazonBooks() throws InterruptedException {

        //user should be able to  click on books functionality on the top of amazon home page.
        Thread.sleep(4000);
        driver.findElement(By.xpath(" //*[@id=\"nav-xshop\"]/a[9]")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#contentGrid_449804 > div > div > div:nth-child(3) > div > div > a > img")).click();
        Thread.sleep(4000);
        String expectedText = "Best Children and Yong Adult Books";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"contentGrid_131759\"]/div/div[2]/div/div/div/img")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        //  driver.close();
    }

    /**
     * This method allow user can use fashion functionality .
     */
    @Test
    public static void amazonFashion() throws InterruptedException {

        //user should be able to click on fashion functionality on the top of amazon home page.
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]")).click();
        Thread.sleep(4000);

        String expectedText = "Featured categories";
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/span")).getText();
        Thread.sleep(4000);

        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");

        // driver.close();
    }


    @Test//amazon GiftCards functionality should work properly)
    public static void amazonGiftCards() throws InterruptedException {
        Thread.sleep(4000);
//user able to click gift cards functionality
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[15]")).click();
        Thread.sleep(4000);
        //user able to click Furniture functionality
        driver.findElement(By.xpath("//*[@id=\"contentGrid_804935\"]/div/div[2]/div[2]/div/div/a/img")).click();
        Thread.sleep(4000);
//user able to click Best sellers text
        String expectedText = "Best sellers";
        driver.findElement(By.xpath("//*[@id=\"carousel_984230\"]/h2/span")).getText();
        Thread.sleep(4000);

        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");

        driver.close();
    }

    /**
     * This method allow user can use toys functionality .
     */
    @Test
    public static void amazonToys() throws InterruptedException {

        //user should be able to click on Toys functionality on the top of amazon home page.
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[16]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span")).click();
        Thread.sleep(4000);
        String expectedText = "Best Sellers in Toys & Games";
        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
//        Thread.sleep(4000);
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        //  driver.close();

    }

    /**
     * This method allow user can use home functionality .
     */
    @Test
    public static void amazonHome() throws InterruptedException {
//User able to click on Amazon Home link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();

        //User able to click on Amazon Furniture link
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span[1]")).click();

        Thread.sleep(4000);
        //User able to click on Amazon Tables link
        driver.findElement(By.xpath("//img[@alt='Tables']")).click();
        Thread.sleep(4000);

        String expectedText = "\"Living Room Tables\"";

        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(4000);

        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");


        Thread.sleep(1000);
        // driver.close();


    }

    @Test///amazon Best Sellers functionality should work properly)
    public static void amazonBestSellers() throws InterruptedException {
        Thread.sleep(4000);
        //User able to click on Amazon BestSellers link
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(4000);
        //        String expectedText = "Best Sellers in Baby";
        driver.findElement(By.xpath("//*[@id=\"zg_banner_text\"]")).click();
        Thread.sleep(4000);
//        String expectedText = "Best Sellers in Toys & Games";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
//        Thread.sleep(4000);
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        //  driver.close();


    }

    @Test///amazon Basics functionality should work properly)
    public static void amazonBasics() throws InterruptedException {
        Thread.sleep(4000);
        //User able to click on Amazon Basics link
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        Thread.sleep(4000);
        //  User able to click on Amazon New Arrivals  link
        driver.findElement(By.xpath("//*[@id=\"k9rs2mhe3v\"]/div/div/div/a")).click();
        Thread.sleep(4000);
//        String expectedText = "Best Sellers in Toys & Games";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
//        Thread.sleep(4000);
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        // driver.close();


    }

    // **************************NOTE:  "Sell" Link is not available in automation page*****************************************
    // **************************NOTE:  "Sell" Link is not available in automation page*****************************************
    @Test
    public static void check_Sell_Link() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[19]")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("m.rashid@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("mrashid");
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();
        // Verify successful login
        String expectedText = "";

        String actualText = driver.findElement(By.xpath("")).getText();
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");
        // driver.close();
    }


    @Test///amazon Todays Deals functionality should work properly)
    public static void amazonTodaysDeals() throws InterruptedException {
        Thread.sleep(4000);
        //User able to click on Amazon Todays deals link
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        Thread.sleep(4000);
        //  User able to click on Amazon Back to school  link
        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[1]/img")).click();
        Thread.sleep(4000);
//        String expectedText = "Best Sellers in Toys & Games";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
//        Thread.sleep(4000);
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        // driver.close();


    }


    @Test///amazon Books functionality should work properly)
    public static void amazonBooks2() throws InterruptedException {
        Thread.sleep(4000);
        //User able to click on Amazon Books  link
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
        // Thread.sleep(4000);
        // User able to click on Amazon book review  link
        //driver.findElement(By.xpath("//*[@id=\"contentGrid_458414\"]/div/div/div[2]/div/div/a/img")).click();
        // Thread.sleep(4000);
        // String expectedText = "Skip to main search result"
        //Thread.sleep(4000);
        //  String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstancegtTu9RQt2Nl24_w1S1aRXA\"]/div[1]/h2")).getText();
        // Thread.sleep(4000);
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        // driver.close();

    }

    /**
     * This method will verify Address bar functionality
     *
     * @throws InterruptedException
     */
//************************ verification not pass
    @Test
    public static void ckAddressBarCustomXpath() throws InterruptedException {

// user should be able to type in the edit box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and@name='field-keywords']")).sendKeys("t-shirt");
        // user should be able to click on search box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button'and @class='nav-input nav-progressive-attribute']")).click();
        Thread.sleep(2000);
        //user should be able to see valid product displayed in the page
        String expectedText = "";
        Thread.sleep(4000);
        driver.findElement(By.xpath("\"t-shirt\"")).getText();
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//span[text()='\"t-shirt\"'and@class='a-color-state a-text-bold']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found");
        Thread.sleep(3000);
    }

    /**
     * this method will check burger(All) menu functionality Top left corner on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckBurgerMenuFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();
        // user should be able to click on Movers & Shakers link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/gp/movers-and-shakers/?ref_=nav_em_ms_0_1_1_4']")).click();
        Thread.sleep(2000);
        // user should be able to click on Amazon Launchpad link
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Launchpad')]")).click();
        Thread.sleep(5000);

//        //user should be able to see "Movers & Shakers in Baby" displayed
//        String expectedText = "Movers & Shakers in Baby";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//h2[contains(text(),'Movers & Shakers in Baby')]")).getText();
//        Thread.sleep(4000);
//       System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");

        Thread.sleep(1000);
    }

    /**
     * this method will check prime video menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckPrimeVideoFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();
        // user should be able to click on Prime Video link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Prime Video']")).click();
        Thread.sleep(2000);
        // user should be able to click on prime video channel link
        driver.findElement(By.xpath("//a[@href='/s/browse?filterId=OFFER_FILTER%3DSUBSCRIPTIONS&node=2858778011&ref_=nav_em__nav_sa_aos_0_2_2_4']")).click();
        Thread.sleep(5000);

        //user should be able to see "Prime Video" displayed
        String expectedText = "Prime Video";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//a[@class='av-retail-m-nav-text-logo']")).getText();
        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);


    }

    /**
     * this method will check amazon music menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckAmazonMusicFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();
        // user should be able to click on amazon music link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")).click();
        Thread.sleep(2000);
        // user should be able to click on amazon music unlimited link
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Music Unlimited')]")).click();
        Thread.sleep(5000);

        //user should be able to see" Starts at $8.99/month after. New subscribers only. Terms apply" displayed
        String expectedText = "Starts at $8.99/month after. New subscribers only. Terms apply.";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("(//div[@original-text='Starts at $[price HAWKFIRE_ALL_DEVICES_MONTHLY_DISCOUNTED]/month after. New subscribers only. Terms apply.'])[1]")).getText();

        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");

        Thread.sleep(1000);


    }

   /**
     * this method will check Fire TV menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckFireTvFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();
        // user should be able to click on Fire TV link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a/div")).click();
        Thread.sleep(2000);
        // user should be able to click on shop all fire tv devices link
      driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a")).click();
        Thread.sleep(5000);

        //user should be able to see "Amazon fire TV smart TVs" displayed
        String expectedText = "Amazon Fire TV smart TVs";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//span[contains(text(),' Amazon Fire TV smart TVs')]  ")).getText();
        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);

    }

    /**
     * this method will check Amazon Fresh menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckAmazonFreshFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();
        // user should be able to click on Amazon Fresh link
        //*[@id="hmenu-content"]/ul[1]/li[19]/a/div
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Amazon Fresh']")).click();
        Thread.sleep(2000);
        // user should be able to click on Frozen Foods link
        //*[@id="hmenu-content"]/ul[12]/li[7]/a
        driver.findElement(By.xpath("//a[text()='Frozen Foods']")).click();
        Thread.sleep(5000);

        //user should be able to see "Frozen" displayed
        String expectedText = "Frozen";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath(" //div[@class='fmc-local-page-header']")).getText();
        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);

    }
    /**
     * this method will check Amazon Movers&Shakers menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckAmazonMoversAndShakersFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();

        // user should be able to click on Amazon Movers&Shakers link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/gp/movers-and-shakers/?ref_=nav_em_ms_0_1_1_4']")).click();

        Thread.sleep(2000);
        // user should be able to click on Appliances link
        driver.findElement(By.xpath("//a[@href='/gp/movers-and-shakers/appliances/ref=zg_bsms_nav_0']")).click();
        Thread.sleep(5000);

        //user should be able to see "Movers&Shakers in Appliances
        String expectedText = "Frozen";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//h1[@class='a-size-large a-spacing-medium a-text-bold']")).getText();
        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);

    }

    /**
     * this method will check Amazon Fresh menu functionality under All  menu functionality on Amazon home page
     *
     * @throws InterruptedException
     */
    @Test
    public static void ckAmazonFunctionality() throws InterruptedException {

// user should be able to click on burger(All) menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/span[@class='hm-icon-label']")).click();

        // user should be able to click on Pharmacy link
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@data-menu-id='29']")).click();

        Thread.sleep(2000);
        // user should be able to click on Amazon Pharmacy link
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/b?node=23435487011&ref_=nav_em_0_2_29_1']")).click();
        Thread.sleep(5000);

        //user should be able to see "Shop common medications" displayed
        String expectedText = "Shop common medications";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("(//h2[@class='heading align-start color-squid font-family-ember heading-xsmall '])[1]")).getText();
        Thread.sleep(4000);
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
}





}
