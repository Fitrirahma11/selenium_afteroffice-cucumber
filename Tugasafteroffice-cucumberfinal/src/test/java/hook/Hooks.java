package hook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void setupAutomation() throws IOException{
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("X:/Booatcamp Selenium/selenium_afteroffice-cucumber/Tugasafteroffice-cucumberfinal/src/main/resources/GlobalData.properties");

        properties.load(fileInputStream);
        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")){
 

            System.setProperty("webdriver.chrome.driver", "X:/Booatcamp Selenium/chromedriver-win64/chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver =  new ChromeDriver();
        } else {
            // Driver firefox
            System.setProperty("webdriver.gecko.driver", "X:/Booatcamp Selenium/chromedriver-win64/geckodriver.exe");
            driver =  new FirefoxDriver();
        }
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public static void tearDownAutomation() {
        if (driver != null) {
            driver.close();
        }
    }

    public static WebDriver initializeDriver (){
        return driver;
    }

}
