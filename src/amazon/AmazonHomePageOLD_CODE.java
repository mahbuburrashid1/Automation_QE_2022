package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePageOLD_CODE {

//
//    static WebDriver driver;
//    String browserName = "chrome";
//    String url = "https://www.amazon.com/";
//    static String actualText;
//
//    @BeforeTest
//    public void setUpAutomation() {
//        System.out.println("Automation Started");
//    }
//
//    @AfterTest
//    public void tearDownAutomation() {
//        driver.close();
//        System.out.println(" Automation End ");
//    }
//
//
//    @BeforeTest
//    public void setUp() {
//        if (this.browserName == "chrome") {
//            setUpChromeBrowser();
//        } else if (this.browserName == "fireFox") {
//            setUpFireFoxBrowser();
//        }
//        //  navigate to amazon.com
//        driver.get(this.url);
//        driver.manage().window().maximize();
//    }
//
//
//    public static void setUpChromeBrowser() {
//        String chromeDriverPath = "../LearnWebAutomation_QE_Winter2022/BrowserDriver/Windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//    }
//
//    public static void setUpFireFoxBrowser() {
//        String fireFoxDriverPath = "../LearnWebAutomation_QE_Winter2022/BrowserDriver/Windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        driver = new FirefoxDriver();
//    }
//
//    /**
//     * user should be able to search valid product in address bar
//     */
//    @Test
//    public static void ckAddressBar() {
//
//// user should be able to type in the edit box
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("T-shirt");
//        // user should be able to click on search box
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        // user should be able to verify selection page navigate successfully or not.
//        String expectedText = "\"T-Shirt\"";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        System.out.println("Expected Text : " + expectedText);
//
//        if (actualText.equals(expectedText)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//        driver.close();
//    }
//
//    /**
//     * This method allow user to change or select country or region.
//     */
//    @Test
//    public static void changeCountry() throws InterruptedException {
//        // user should be able to click on country or region on the top of amazon home page.
//        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[2]")).click();
//
//        Thread.sleep(4000);
//        // user should be able to select radio button to change country or region.
//        driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
//        // user should be able to verify selection page navigate successfully or not.
//        String expectedText = "Configuración de idioma";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"icp-language-heading\"]")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        //  driver.close();
//    }
//
//    /**
//     * This method allow user can  select Kindle books.
//     */
//    @Test
//    public static void checkKindleBooksLink() throws InterruptedException {
//        // user should be able  click on kindle books functionality on the top of amazon home page.
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[14]")).click();
//
////user should be able to select kindle unlimited eligible books .
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li/span/a/div/label/i"));
//
//        String expectedText = "Kindle Unlimited";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/div/span")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        // driver.close();
//    }
//
//    /**
//     * *This method allow user can  select prime.
//     */
//    @Test
//    public static void amazonPrime() throws InterruptedException {
//
//        //user should be able  click on prime functionality on the top of amazon home page.
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]")).click();
//        Thread.sleep(4000);
//
//        driver.findElement(By.xpath("//*[@id=\"prime-hero-module-planLinks\"]/span/a[1]")).click();
//
//        String expectedText = "Your Prime Student Benefits";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"subheader\"]")).getText();
//
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//
//      //  driver.close();
//    }
//
//    /**
//     * This method allow user can use books functionality .
//     */
//    @Test
//    public static void amazonBooks() throws InterruptedException {
//
//        //user should be able to  click on books functionality on the top of amazon home page.
//        Thread.sleep(4000);
//        driver.findElement(By.xpath(" //*[@id=\"nav-xshop\"]/a[9]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector("#contentGrid_449804 > div > div > div:nth-child(3) > div > div > a > img")).click();
//        Thread.sleep(4000);
//        String expectedText = "Best Children and Yong Adult Books";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"contentGrid_131759\"]/div/div[2]/div/div/div/img")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//      //  driver.close();
//    }
//
//    /**
//     * This method allow user can use fashion functionality .
//     */
//    @Test
//    public static void amazonFashion() throws InterruptedException {
//
//        //user should be able to click on fashion functionality on the top of amazon home page.
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]")).click();
//        Thread.sleep(4000);
//
//        String expectedText = "Featured categories";
//        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/span")).getText();
//        Thread.sleep(4000);
//
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//
//       // driver.close();
//    }
//
//
//    @Test//amazon GiftCards functionality should work properly)
//    public static void amazonGiftCards() throws InterruptedException {
//        Thread.sleep(4000);
////user able to click gift cards functionality
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[15]")).click();
//        Thread.sleep(4000);
//        //user able to click Furniture functionality
//        driver.findElement(By.xpath("//*[@id=\"contentGrid_804935\"]/div/div[2]/div[2]/div/div/a/img")).click();
//        Thread.sleep(4000);
////user able to click Best sellers text
//        String expectedText = "Best sellers";
//        driver.findElement(By.xpath("//*[@id=\"carousel_984230\"]/h2/span")).getText();
//        Thread.sleep(4000);
//
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//
//        driver.close();
//    }
//
//    /**
//     * This method allow user can use toys functionality .
//     */
//    @Test
//    public static void amazonToys() throws InterruptedException {
//
//        //user should be able to click on Toys functionality on the top of amazon home page.
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[16]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span")).click();
//        Thread.sleep(4000);
//        String expectedText = "Best Sellers in Toys & Games";
//        Thread.sleep(4000);
////        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
////        Thread.sleep(4000);
////        System.out.println("Actual Text : " + actualText);
////        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//      //  driver.close();
//
//    }
//
//    /**
//     * This method allow user can use home functionality .
//     */
//    @Test
//    public static void amazonHome() throws InterruptedException {
////User able to click on Amazon Home link
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
//
//        //User able to click on Amazon Furniture link
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span[1]")).click();
//
//        Thread.sleep(4000);
//        //User able to click on Amazon Tables link
//        driver.findElement(By.xpath("//img[@alt='Tables']")).click();
//        Thread.sleep(4000);
//
//        String expectedText = "\"Living Room Tables\"";
//
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        Thread.sleep(4000);
//
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//
//
//        Thread.sleep(1000);
//       // driver.close();
//
//
//    }
//
//    @Test///amazon Best Sellers functionality should work properly)
//    public static void amazonBestSellers() throws InterruptedException {
//        Thread.sleep(4000);
//        //User able to click on Amazon BestSellers link
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
//        Thread.sleep(4000);
//        //        String expectedText = "Best Sellers in Baby";
//        driver.findElement(By.xpath("//*[@id=\"zg_banner_text\"]")).click();
//        Thread.sleep(4000);
////        String expectedText = "Best Sellers in Toys & Games";
////        Thread.sleep(4000);
////        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
////        Thread.sleep(4000);
////        System.out.println("Actual Text : " + actualText);
////        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//      //  driver.close();
//
//
//    }
//
//    @Test///amazon Basics functionality should work properly)
//    public static void amazonBasics() throws InterruptedException {
//        Thread.sleep(4000);
//        //User able to click on Amazon Basics link
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
//        Thread.sleep(4000);
//        //  User able to click on Amazon New Arrivals  link
//        driver.findElement(By.xpath("//*[@id=\"k9rs2mhe3v\"]/div/div/div/a")).click();
//        Thread.sleep(4000);
////        String expectedText = "Best Sellers in Toys & Games";
////        Thread.sleep(4000);
////        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
////        Thread.sleep(4000);
////        System.out.println("Actual Text : " + actualText);
////        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//       // driver.close();
//
//
//    }
//
//    // NOTE:  "Sell" Link is not available in automation page
//    @Test
//    public static void check_Sell_Link() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[19]")).click();
//        Thread.sleep(4000);
//
//        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("m.rashid@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("mrashid");
//        driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();
//        // Verify successful login
//        String expectedText = "";
//
//        String actualText = driver.findElement(By.xpath("")).getText();
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found");
//       // driver.close();
//    }
//
//
//    @Test///amazon Todays Deals functionality should work properly)
//    public static void amazonTodaysDeals() throws InterruptedException {
//        Thread.sleep(4000);
//        //User able to click on Amazon Todays deals link
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
//        Thread.sleep(4000);
//        //  User able to click on Amazon Back to school  link
//        driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[1]/img")).click();
//        Thread.sleep(4000);
////        String expectedText = "Best Sellers in Toys & Games";
////        Thread.sleep(4000);
////        String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstanceshHuuTgO81KO1aDUtClM8w\"]/div[1]/h1")).getText();
////        Thread.sleep(4000);
////        System.out.println("Actual Text : " + actualText);
////        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//       // driver.close();
//
//
//    }
//
//
//    @Test///amazon Books functionality should work properly)
//    public static void amazonBooks2() throws InterruptedException {
//        Thread.sleep(4000);
//        //User able to click on Amazon Books  link
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
//        // Thread.sleep(4000);
//        // User able to click on Amazon book review  link
//        //driver.findElement(By.xpath("//*[@id=\"contentGrid_458414\"]/div/div/div[2]/div/div/a/img")).click();
//        // Thread.sleep(4000);
//        // String expectedText = "Best Sellers ";
//        //Thread.sleep(4000);
//        //  String actualText = driver.findElement(By.xpath("//*[@id=\"CardInstancegtTu9RQt2Nl24_w1S1aRXA\"]/div[1]/h2")).getText();
//        // Thread.sleep(4000);
////        System.out.println("Actual Text : " + actualText);
////        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//       // driver.close();
//
//
//
//
//    }
}
