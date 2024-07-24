// package demo;

// import org.checkerframework.checker.units.qual.A;
// import org.openqa.selenium.By;
// import org.openqa.selenium.NoSuchElementException;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeDriverService;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.logging.LogType;
// import org.openqa.selenium.logging.LoggingPreferences;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.annotations.AfterTest;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.BeforeTest;
// import org.testng.annotations.Test;
// import org.testng.asserts.SoftAssert;
// import org.testng.Assert;

// //import org.testng.Assert;

// import java.time.Duration;
// import java.util.logging.Level;

// import demo.utils.ExcelDataProvider;
// // import io.github.bonigarcia.wdm.WebDriverManager;
// import demo.wrappers.Wrappers;
// //import dev.failsafe.internal.util.Assert;

// public class TestCases extends ExcelDataProvider { // Lets us read the data
//         ChromeDriver driver;

//         /*
//          * TODO: Write your tests here with testng @Test annotation.
//          * Follow `testCase01` `testCase02`... format or what is provided in
//          * instructions
//          */

//         /*
//          * Do not change the provided methods unless necessary, they will help in
//          * automation and assessment
//          */
//         @BeforeTest
//         public void startBrowser() {
//                 System.setProperty("java.util.logging.config.file", "logging.properties");

//                 // NOT NEEDED FOR SELENIUM MANAGER
//                 // WebDriverManager.chromedriver().timeout(30).setup();

//                 ChromeOptions options = new ChromeOptions();
//                 LoggingPreferences logs = new LoggingPreferences();

//                 logs.enable(LogType.BROWSER, Level.ALL);
//                 logs.enable(LogType.DRIVER, Level.ALL);
//                 options.setCapability("goog:loggingPrefs", logs);
//                 options.addArguments("--remote-allow-origins=*");

//                 System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "build/chromedriver.log");

//                 driver = new ChromeDriver(options);

//                 driver.manage().window().maximize();
//         }

//         @AfterTest
//         public void endTest() {
//                 driver.close();
//                 driver.quit();

//         }

//         @Test
//         public void testCase01() throws InterruptedException {
                // System.out.println("Start test case 01");
                // try {
                //         driver.get("https://www.youtube.com/");
                //         // Thread.sleep(10000);

                //         Wrappers.waitForUrlToContain("youtube", 10);
                //         String currentUrl = driver.getCurrentUrl();
                //         // boolean status = currentUrl.contains("youtube")
                //         //validate the correct url
                //         Assert.assertTrue(currentUrl.contains("youtube"), "Navigated to YouTube successfully.");
                //         System.out.println("Navigated to YouTube successfully.");
                //         //locate the slidebar element
                //         WebElement slidebar = driver
                //                         .findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
                //         Wrappers.Click(slidebar);
                //         Thread.sleep(2000);
                //         // locate About element
                //         WebElement About = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/about/']"));
                //         Wrappers.Click(About);
                //         Thread.sleep(3000);
                //         // locate the content 
                //         WebElement Message = driver.findElement(By.xpath("//section[@class='ytabout__content']"));
                //         Wrappers.PrintMessage(Message);
                // } catch (Exception e) {
                //         e.printStackTrace();
                // }

                // System.out.println("end test case 01");
//         }

//          @Test
//         public void testCase02() throws InterruptedException {
//                 System.out.println("Start test case 02");
//                 try {
//                         driver.get("https://www.youtube.com/");
//                         Wrappers.waitForUrlToContain("youtube", 10);
//                         WebElement slidebar = driver.findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
//                         Wrappers.Click(slidebar);
//                         //locating moviebutton element
//                         WebElement Moviebutton = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Movies')]"));
//                         Wrappers.Click(Moviebutton);
                        

//                         //locating arrow element as per top selling movies
//                         WebElement RightArrow = driver.findElement(By.xpath("//span[@id='title' and contains(text(),'Top selling')]/../../../../../../following-sibling::div//button[@aria-label='Next']"));
//                         while(RightArrow.isDisplayed()){
//                                 Wrappers.Click(RightArrow);
//                         }
//                        // finding element to check if it is marked 'A'
//                         WebElement Amark = driver.findElement(By.xpath("(//div[contains(@class,'badge  badge-style-type-simple')]/p)[15]"));
//                         String AmarkText = Amark.getText();
//                         SoftAssert sf = new SoftAssert();
//                         sf.assertTrue(AmarkText.contains("A"));
//                         WebElement MovieType = driver.findElement(By.xpath("(//span[@class='grid-movie-renderer-metadata style-scope ytd-grid-movie-renderer'])[15]"));
//                         String MovieTypeText = MovieType.getText().trim().replaceAll("[^a-z][^A-Z]","");
//                         sf.assertTrue(MovieTypeText.contains("Comedy") || MovieTypeText.contains("Animation") || MovieTypeText.contains("Drama"));


//                         sf.assertAll();
//                 } catch (Exception e) {
//                         e.printStackTrace();
//                 }

//                 System.out.println("End test case 02");

//         }
// }


package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;
import com.google.common.base.Equivalence.Wrapper;
import java.time.Duration;
import java.util.logging.Level;
import demo.utils.ExcelDataProvider;
// import io.github.bonigarcia.wdm.WebDriverManager;
import demo.wrappers.Wrappers;

public class TestCases extends ExcelDataProvider{ // Lets us read the data
        ChromeDriver driver;

        /*
         * TODO: Write your tests here with testng @Test annotation.
         * Follow `testCase01` `testCase02`... format or what is provided in
         * instructions
         */

        /*
         * Do not change the provided methods unless necessary, they will help in
         * automation and assessment
         */

        

        @BeforeTest
        public void startBrowser() {
                System.setProperty("java.util.logging.config.file", "logging.properties");

                // NOT NEEDED FOR SELENIUM MANAGER
                // WebDriverManager.chromedriver().timeout(30).setup();

                ChromeOptions options = new ChromeOptions();
                LoggingPreferences logs = new LoggingPreferences();

                logs.enable(LogType.BROWSER, Level.ALL);
                logs.enable(LogType.DRIVER, Level.ALL);
                options.setCapability("goog:loggingPrefs", logs);
                options.addArguments("--remote-allow-origins=*");

                System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "build/chromedriver.log");

                driver = new ChromeDriver(options);

                driver.manage().window().maximize();
        }
       @Test(priority = 1,enabled = true, description = "URL assertion and about page message printing")
        public void testCase01() throws InterruptedException{
                

                System.out.println("Start test case 01");
                try {
                        driver.get("https://www.youtube.com/");
                        // Thread.sleep(10000);

                        Wrappers.waitForUrlToContain("youtube", 10,driver);
                        String currentUrl = driver.getCurrentUrl();
                        // boolean status = currentUrl.contains("youtube")
                        //validate the correct url
                        Assert.assertTrue(currentUrl.contains("youtube"), "Navigated to YouTube successfully.");
                        System.out.println("Navigated to YouTube successfully.");
                        //locate the slidebar element
                        WebElement slidebar = driver
                                        .findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
                        Wrappers.Click(slidebar);
                        Thread.sleep(2000);
                        // locate About element
                        WebElement About = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/about/']"));
                        Wrappers.Click(About);
                        Thread.sleep(3000);
                        // locate the content 
                        WebElement Message = driver.findElement(By.xpath("//section[@class='ytabout__content']"));
                        Wrappers.PrintMessage(Message);
                } catch (Exception e) {
                        e.printStackTrace();
                }

                
        }

        @Test(priority = 2,enabled = true, description = "Assertion for the movie is marked “A” for Mature or not and whether the movie is either “Comedy” or “Animation")
        public void testCase02() throws InterruptedException{
                
                try {
                        driver.get("https://www.youtube.com/");
                        Wrappers.waitForUrlToContain("youtube", 10,driver);
                        WebElement slidebar = driver.findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
                        Wrappers.Click(slidebar);
                        //locating moviebutton element
                        WebElement Moviebutton = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Movies')]"));
                        Wrappers.Click(Moviebutton);
                        

                        //locating arrow element as per top selling movies
                        WebElement RightArrow = driver.findElement(By.xpath("//span[@id='title' and contains(text(),'Top selling')]/../../../../../../following-sibling::div//button[@aria-label='Next']"));
                        while(RightArrow.isDisplayed()){
                                Wrappers.Click(RightArrow);
                        }
                       // finding element to check if it is marked 'A'
                        WebElement Amark = driver.findElement(By.xpath("(//div[contains(@class,'badge  badge-style-type-simple')]/p)[21]"));
                        String AmarkText = Amark.getText();
                        System.out.println(AmarkText);
                        SoftAssert sf = new SoftAssert();
                        sf.assertTrue(AmarkText.contains("A"));
                        WebElement MovieType = driver.findElement(By.xpath("(//span[@class='grid-movie-renderer-metadata style-scope ytd-grid-movie-renderer'])[21]"));
                        String MovieTypeText = MovieType.getText().trim().replaceAll("[^a-z][^A-Z]","").trim();
                        System.out.println(MovieTypeText);
                        sf.assertTrue(MovieTypeText.contains("Comedy") || MovieTypeText.contains("Animation") || MovieTypeText.contains("Drama"));


                        sf.assertAll();
                } catch (Exception e) {
                        e.printStackTrace();
                }

                System.out.println("End test case 02");

        }


        @Test(priority = 3, enabled = true,description = "URL assertion and about page message printing")
        public void testCase03() throws InterruptedException{
                System.out.println("Started testCase03");
                String URL = "https://www.youtube.com/";
                Assert.assertTrue(Wrappers.navigateToUrl(driver, URL),"Navigation to the URL failed.");
                WebElement slidebar = driver.findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
                        Wrappers.Click(slidebar);
                //Wrappers.clickOnTab(driver,"Music");
                WebElement Musictab = driver.findElement(By.xpath("//a[@title='Music']"));
                Wrappers.Click(Musictab);
                Wrappers.jumpToTheFirstSection(driver);
                Wrappers.clickOnNextButton(driver, "Biggest Hits",3);
                Wrappers.nameOfLastPlayList(driver,"Biggest Hits");
                Wrappers.noOfTracks(driver,"Biggest Hits","Bollywood Dance");
                System.out.println("Ended testCase03");
        }

        @Test(priority = 4, enabled = true, description = "URL assertion and about page message printing")
        public void testCase04() throws InterruptedException{
                System.out.println("Started testCase04");
                String URL = "https://www.youtube.com/";
                Assert.assertTrue(Wrappers.navigateToUrl(driver, URL),"Navigation to the URL failed.");
                WebElement slidebar = driver.findElement(By.xpath("(//button[@class='style-scope yt-icon-button'])[7]"));
                        Wrappers.Click(slidebar);


                WebElement Newstab = driver.findElement(By.xpath("//a[@title='News']"));
                Wrappers.Click(Newstab);
                //Wrappers.clickOnTab(driver, "News");
                Wrappers.titleOfNews(driver);
                Wrappers.sumOfTheLikes(driver);
                System.out.println("Ended testCase04");
        }

       @Test(dataProvider = "excelData",dataProviderClass = ExcelDataProvider.class,enabled = true,priority = 5)
        public void testCase05(String to_be_searched) throws InterruptedException {
                driver.get("https://www.youtube.com");
                Thread.sleep(1000);
                WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
                // searchBox.sendKeys(searchName);
                Wrappers.click(searchBox);
                Wrappers.sendKeys(searchBox, to_be_searched);

                WebElement search = driver.findElement(By.id("search-icon-legacy"));
                Wrappers.click(search);
                Thread.sleep(5000);
        
                long totalViews = 0;
                JavascriptExecutor js = (JavascriptExecutor) driver;
                while (totalViews < 1000000000) { // 10 Crore views
                    List<WebElement> videoElements = driver.findElements(By.xpath("//span[contains(@class,'inline-metadata') and contains(text(),'views')]"));
        
                    for (WebElement videoElement : videoElements) {
                        String viewsText = videoElement.getText();
                        if (viewsText.contains("views")) {
                            viewsText = viewsText.split(" ")[0]; // Get the number part
                            totalViews += parseViews(viewsText);
                        }
        
                        if (totalViews >= 1000000000) {
                            break;
                            
                        }
                    }
        
                    js.executeScript("window.scrollBy(0, 1000);");
                    Thread.sleep(2000); // Wait for new videos to load
                }
        
                System.out.println("Total views for " + to_be_searched + ": " + totalViews);
            }
        
            private long parseViews(String viewsText) {
                long views = 0;
                if (viewsText.endsWith("K")) {
                    views = (long) (Double.parseDouble(viewsText.replace("K", "")) * 1_000);
                } else if (viewsText.endsWith("M")) {
                    views = (long) (Double.parseDouble(viewsText.replace("M", "")) * 1_000_000);
                } else if (viewsText.endsWith("B")) {
                    views = (long) (Double.parseDouble(viewsText.replace("B", "")) * 1_000_000_000);
                } else {
                    views = Long.parseLong(viewsText.replace(",", ""));
                }
                return views;
            }

              @DataProvider(name = "excelData")
    public static Object[][] provideData() {
        // Example data, replace with your actual data retrieval logic
        return new Object[][] {
            {"Movies"},
            {"Music"},
            {"Games"},
            {"India"},
            {"UK"}
            // Add more data as needed
        };
    }




        @AfterTest
        public void endTest() {
                driver.close();
                driver.quit();

        }
}
