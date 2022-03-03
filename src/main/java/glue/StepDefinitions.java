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



 //<METHOD>


}
