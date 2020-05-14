package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class Steps {

    WebDriver driver;
    @Given("^Open the Human benchmark$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fogelvogel-win\\IdeaProjects\\BDD_Login\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://humanbenchmark.com/tests/reactiontime");
    }

    @When("^Measure reaction time$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class^=\"view-splash\"]")));
        driver.findElement(By.cssSelector("[class^=\"view-splash\"]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class^=\"view-waiting\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class^=\"view-go\"]")));
        driver.findElement(By.cssSelector("[class^=\"view-go\"]")).click();

    }

    @Then("^Close the Human benchmark$")
    public void Reset_the_credential() throws Throwable
    {
        driver.quit();
    }

}