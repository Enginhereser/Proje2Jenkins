package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

import static stepdefs.Locator.*;

public class Proje extends BaseSteps{
    @Given("user navigate {string}")
    public void userNavigate(String url) {
        driver.get(url);
    }

    @When("user source {string}")
    public void userSource(String product) {
        sendkeys(lSourceInpu,product);
        click(lSourceButton);
    }

    @And("user save Product to System.setProperty")
    public void userSaveProductToSystemSetProperty() {
        String text = driver.findElement(lProduct).getText();
        System.setProperty("Product",text);
    }
    String firsWindow;
    @And("user navigate new Window {string}")
    public void userNavigateNewWindow(String url) {
        firsWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB).get(url);
    }

    @And("user log in")
    public void userLogIn() {
        sendkeys(lOpencartUsername,"Admin");
        sendkeys(lOpencartPassword,"admin123");
        click(lOpencartLoginButton);
        wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
    }

    @And("user click admin")
    public void userClickAdmin() {
        click(lAdminButton);

    }

    @And("user write on username input this Product")
    public void userWriteOnUsernameInputThisProduct() {
        sendkeys(lUsernameUnput, System.getProperty("Product"));
    }

    @Then("user save Screen")
    public void userSaveScreen() {
        getScreenshot("Proje");
        Set<String> windowHandles = driver.getWindowHandles();
        for (String wh : windowHandles) {
            if (wh.equalsIgnoreCase(firsWindow))
                driver.switchTo().window(firsWindow);
        }
    }


}
