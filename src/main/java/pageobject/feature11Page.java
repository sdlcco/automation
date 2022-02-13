package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
//<IMPORTS>

public class feature11Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By button50 = By.xpath("//i[@class='network-display__icon app-header__network-down-arrow']");

public static By button70 = By.xpath("(//span[.='Avalanche Mainnet C-Chain'])[last()]");

public static By button90 = By.xpath("//span[.='Claim Rewards']/..");

public static By button120 = By.xpath("//button[.='Confirm']");

public static By button140 = By.xpath("(//span[.='Binance Smart Chain'])[last()]");

public static By button160 = By.xpath("//button[.='Connect Wallet']");

public static By button170 = By.xpath("//div[.='Connect to your MetaMask Wallet']");

public static By button190 = By.xpath("//button[contains(.,'HYDRATE')]");

public static By button230 = By.xpath("//button[.='Confirm']");

//<XPATHS>

/*Page Constructor*/
public feature11Page(){

}


public feature11Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
