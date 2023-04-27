package stepdefs;

import org.openqa.selenium.By;

public interface Locator {
    By lSourceInpu=By.cssSelector(".form-control.input-lg");
    By lSourceButton=By.cssSelector(".btn.btn-default.btn-lg");
    By lProduct=By.xpath("//div[contains(@class,'product-layout')][last()]//div[@class='caption']/h4");
    By lOpencartUsername=By.xpath("//input[@name='username']");
    By lOpencartPassword=By.xpath("//input[@name='password']");
    By lOpencartLoginButton=By.xpath("//button[@type='submit']");
    By lAdminButton=By.xpath("(//span[contains(.,'Admin')])[1]");
    By lUsernameUnput=By.xpath("//div[contains(@class,'oxd-input-group')]//input[contains(@class,'oxd-input oxd')]");
}
