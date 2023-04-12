package com.browserstack.run_parallel_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.URL;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Tap Flow with touch action working for all
public class ParallelTestIos16 extends BrowserStackTestNGTest {

  @Test
  public void test() throws Exception {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    Wait<IOSDriver<MobileElement>> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NotFoundException.class);

            // "app":"bs://d17e043f871277fb6f96a0b44c8866382e58f15d", bs://fb1e25dd6fe822253ce700477ef34c2b16898648
            Thread.sleep(5000);
            percy.screenshot("First Screenshot");
            if(driver.findElementByAccessibilityId("Allow While Using App").isDisplayed() )
            {
              MobileElement el1 = wait.until(d -> d.findElementByAccessibilityId("Allow While Using App"));
              el1.click();
            }
            Thread.sleep(5000);

            if(driver.findElementByAccessibilityId("Allow").isDisplayed() )
            {
              MobileElement el2 = wait.until(d -> d.findElementByAccessibilityId("Allow"));
              el2.click();
            }
            percy.screenshot("Second Screenshot");
MobileElement el3 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]"));
el3.click();
Thread.sleep(5000);
MobileElement el4 = wait.until(d -> d.findElementByAccessibilityId("Access your NeuCoins, orders and profile.\nYour NeuPass and lot more is waiting.\nLOGIN / SIGN UP"));
el4.click();
// XCUIElementTypeImage[@name="Access your NeuCoins, orders and profile. Your NeuPass and lot more is waiting. LOGIN / SIGN UP"]
MobileElement el5 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
el5.sendKeys("7059791147");
MobileElement el6 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeButton[@name=\"GET OTP\"]"));
el6.click();
MobileElement el7 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
el7.sendKeys("214263");
Thread.sleep(5000);

// Click on mobile

MobileElement elx =  wait.until(d -> d.findElementByAccessibilityId("tabInActiveExploreIcon"));
elx.click();

Thread.sleep(5000);
(new TouchAction(driver)).tap(PointOption.point(73, 199)).perform();

Thread.sleep(5000);
(new TouchAction(driver)).tap(PointOption.point(170, 399)).perform();

// MobileElement el8 = wait.until(d -> d.findElementByAccessibilityId("Mobiles"));
// Thread.sleep(20000);
// el8.isDisplayed();
// el8.click();
// Thread.sleep(5000);
//           MobileElement el9 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeImage"));
//           el9.click();


Thread.sleep(10000);
Set<String> contextNames = driver.getContextHandles();
System.out.println("Context========================");
System.out.println(contextNames);
String contexts = driver.getContextHandles().toArray()[4].toString();
System.out.println(driver.getContextHandles().toArray()[0]);
System.out.println(driver.getContextHandles().toArray()[1]);
System.out.println(driver.getContextHandles().toArray()[2]);
System.out.println(driver.getContextHandles().toArray()[4]);
System.out.println(contexts);
        driver.context(contexts);

        Thread.sleep(10000);
        MobileElement pincodeLbl = wait.until(d -> d.findElement(By.xpath("(//span[@class='header-pincode-edit pincode-s-edit pincode-pencil-icon'])[2]")));
        pincodeLbl.click();

        MobileElement pincodeTxb = wait.until(d -> d.findElement(By.xpath("//input[@class='formControl dark-input-pincode pinElem']")));
        pincodeTxb.clear();
        pincodeTxb.setValue("400610");

        MobileElement continueBtn = wait.until(d -> d.findElement(By.xpath("//button[contains(text(),\'Continue\')]")));
        continueBtn.click();

        Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,300)", "");
  
MobileElement el13 = wait.until(d -> d.findElementByXPath("//div[@id=\"add_to_cart_footer_container\"]/div/div/div[2]/div/button[1]"));
el13.click();
Thread.sleep(10000);
jse.executeScript("window.scrollBy(0,300)", "");
  
MobileElement el14 = wait.until(d -> d.findElementByXPath("//div[@id=\"payment_footer_container\"]/div/div/div/div/button"));
el14.click();
Thread.sleep(10000);
jse.executeScript("window.scrollBy(0,300)", "");

Thread.sleep(6000);
MobileElement el15 = wait.until(d -> d.findElementByXPath("//div[@id=\"payment_footer_container\"]/div/div/div/div/button"));
        el15.click();

        Thread.sleep(6000);
        driver.context("NATIVE_APP");
        if(driver.findElementByAccessibilityId("Skip").isDisplayed())
        {
        MobileElement el18 = wait.until(d -> d.findElementByAccessibilityId("Skip"));
        el18.click();
        }
//         MobileElement el16 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeStaticText[@name='Smart & secure way to pay using Qik EMI, NeuCoins, saved cards & more']"));
//         el16.click();
//         Thread.sleep(6000);
//         MobileElement el17 = wait.until(d -> d.findElementByAccessibilityId("Place Order & Pay"));
//         el17.click();

//         Thread.sleep(15000);
//         MobileElement el19 = wait.until(d -> d.findElementByAccessibilityId("Netbanking"));
// el19.click();
// MobileElement el20 = wait.until(d -> d.findElementByXPath("(//XCUIElementTypeStaticText[@name=\"Axis Bank\"])[1]"));
// el20.click();
// Thread.sleep(20000); 
// MobileElement el21  = wait.until(d -> d.findElementByAccessibilityId("Success"));
// el21.isDisplayed();
// el21.click();
         Thread.sleep(10000);

        System.out.print("End of code ==========================");
    
  }
}
