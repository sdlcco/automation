package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
import static org.junit.Assert.assertEquals;
//<IMPORTS>

public class feature11Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By AvaxButton = By.xpath("(//span[.='Avalanche Mainnet C-Chain'])[last()]");

public static By ClaimRewardsButton = By.xpath("//span[.='Claim Rewards']/..");

public static By ConfirmButton = By.xpath("//button[.='Confirm']");

public static By BinanceSmartChainButton = By.xpath("(//span[.='Binance Smart Chain'])[last()]");

public static By ConnectWalletButton = By.xpath("//button[.='Connect Wallet']");

public static By ConnectToMetamaskButton = By.xpath("//div[.='Connect to your MetaMask Wallet']");

public static By NextButton = By.xpath("//button[.='Next']");

public static By HydrateButton = By.xpath("//button[contains(.,'HYDRATE')]");

public static By ConnectButton = By.xpath("//button[.='Connect']");

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
