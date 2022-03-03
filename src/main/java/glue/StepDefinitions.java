package glue;

import Docx.Docx;
import com.google.common.collect.Iterables;

import cucumber.api.PendingException;
import framework.Settings;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;
import org.openqa.selenium.*;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import framework.AADriver;
import framework.WebDriverFactory;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.previous;
import static org.junit.Assert.assertTrue;


import org.apache.commons.lang.RandomStringUtils;
import pageobject.feature11Page;
//<IMPORTS>

public class StepDefinitions {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
 private JavascriptExecutor jse;
private static Properties properties;
private String portal;
private String environment;
 private FileInputStream fis;
 private XWPFDocument file;
 private String filePath;
 private HashMap<String, String> invoiceData;
 private String hours;
 private String previousMonday;
 private String previousFriday;
 private String invoiceDate;


 public StepDefinitions(WebDriverFactory contentSteps){
this.driver = contentSteps.getDriver();
myDriver = new AADriver(driver);
properties = Settings.getProperties();
jse=(JavascriptExecutor)driver;
}


@After
public void tearDown(Scenario scenario) throws InterruptedException{
if (scenario.isFailed()) {
Set<String> windows = driver.getWindowHandles();
driver.switchTo().window(Iterables.getLast(windows));
try {
byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
scenario.write("Scenario Failed!");
scenario.embed(screenshot, "image/png");
} catch (Exception e) {
// TODO: handle exception
e.printStackTrace();

}
}
//Slow down the script
Thread.sleep(10000);

}



 @Given("^user switches to first tab$")
public void method0() throws Throwable {
// Write code here that turns the phrase above into concrete actions//navigation6
int count = driver.getWindowHandles().size();
driver.switchTo().window(driver.getWindowHandles().stream().findFirst().get());//<CODE>
}

 @And("^user waits \"([^\"]*)\" seconds$")
public void method1(String param21) throws Throwable {
// Write code here that turns the phrase above into concrete actions//waits1
 int seconds = Integer.parseInt(param21);
  int milliseconds = 1000;
  Thread.sleep(seconds * milliseconds);//<CODE>
}

 @When("^user navigates to \"([^\"]*)\"$")
public void method2(String param31) throws Throwable {
// Write code here that turns the phrase above into concrete actions//navigation2
driver.get(param31);//<CODE>
}

 @And("^user clicks \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method3(String param41, String param42) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param41, param42);//<CODE>
}

 @When("^user mousehover clicks \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method4(String param131, String param132) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param131, param132);//<CODE>
}

 @And("^user waits for \"([^\"]*)\" seconds$")
public void method5(String param151) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//<CODE>
}

 @And("^user switches to latest tab$")
public void method6() throws Throwable {
// Write code here that turns the phrase above into concrete actions
//<CODE>
}

 @And("^user refreshes tab$")
public void method7() throws Throwable {
// Write code here that turns the phrase above into concrete actions
//<CODE>
}

 //<METHOD>


}