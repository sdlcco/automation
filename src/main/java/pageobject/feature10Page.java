package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
//<IMPORTS>

public class feature10Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By SwitchChainButton = By.xpath("//i[@class='network-display__icon app-header__network-down-arrow']");

public static By AvaxNetworkButton = By.xpath("(//span[contains(.,'Avalanche Network')])[last()]");

public static By ThorClaimRewardsButton = By.xpath("//span[.='Claim Rewards']/..");

public static By ConfirmButton = By.xpath("//button[.='Confirm']");

public static By CompoundallButton = By.xpath("//button[contains(.,'Compound all')][last()]");

public static By CompoundAllButton = By.xpath("//button[contains(.,'Compound All')][last()]");

public static By BinanceSmartChainButton = By.xpath("(//span[contains(.,'Smart Chain')])[last()]");

public static By DripHydrateButton = By.xpath("//button[contains(.,'HYDRATE')]");

public static By PolygonMainnetButton = By.xpath("(//span[.='Polygon Mainnet'])[last()]");

public static By HarvestButton = By.xpath("(//h2[text()='DOGS/WBNB'])[last()]/../../..//button[.='Harvest']");

//<XPATHS>

/*Page Constructor*/
public feature10Page(){

}


public feature10Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
