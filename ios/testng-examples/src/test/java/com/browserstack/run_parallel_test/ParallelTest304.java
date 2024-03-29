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


public class ParallelTest304 extends BrowserStackTestNGTest {

  @Test
  public void test() throws Exception {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    Wait<IOSDriver<MobileElement>> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NotFoundException.class);

            // "app": "bs://e07accbe46c8e861c740c5ba097b3609491212c2",

    MobileElement el1 = wait.until(d -> d.findElement(By.id("Allow")));
        el1.click();

        MobileElement el2 = wait.until(d -> d.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")));
        el2.setValue("7059791147");

        MobileElement el3 = wait.until(d -> d.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Get OTP\"]")));
        el3.click();

        Thread.sleep(5000);

        MobileElement el4 = wait.until(d -> d.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Tata Neu SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
        el4.click();
        el4.setValue("214263");

        Thread.sleep(10000);
        
          TouchAction touchAction = new TouchAction(driver);
          touchAction.tap(PointOption.point(190, 522)).perform();

        MobileElement el5 = wait.until(d -> d.findElement(By.id("Mobiles")));
        el5.click();

        Thread.sleep(9000);

        MobileElement el6 = wait.until(d -> d.findElement(By.id("Apple iPhone 13 ₹71,990")));
        el6.click();

        Thread.sleep(15000);

        Date waitTill = new Date(new Date().getTime() + 15000);

        while (driver.getContextHandles().size() <= 1 && waitTill.after(new Date())) {
            Thread.sleep(1000);
        }

        String contexts = driver.getContextHandles().toArray()[3].toString();
        driver.context(contexts);

        Thread.sleep(5000);

        MobileElement pincodeLbl = wait.until(d -> d.findElement(By.xpath("(//span[@class='header-pincode-edit pincode-s-edit pincode-pencil-icon'])[2]")));
        pincodeLbl.click();

        // Thread.sleep(5000);

        MobileElement pincodeTxb = wait.until(d -> d.findElement(By.xpath("//input[@class='formControl dark-input-pincode pinElem']")));
        pincodeTxb.clear();
        pincodeTxb.setValue("401107");

        MobileElement continueBtn = wait.until(d -> d.findElement(By.xpath("//button[contains(text(),\'Continue\')]")));
        continueBtn.click();

        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,300)", "");

        // TouchAction action2 = new TouchAction(driver);
        //   action2.press(PointOption.point(540, 600));
        //   action2.moveTo(PointOption.point(544, 517));
        //   action2.release();
        //   action2.perform();

          Thread.sleep(5000);

        MobileElement buyNowBtn = wait.until(d -> d.findElement(By.xpath("//button[contains(text(),\'buy now\')]")));
        buyNowBtn.click();

        Thread.sleep(10000);
        // MobileElement elp = driver.findElementByAccessibilityId("OK");
        // elp.click();
        (new TouchAction(driver)).tap(PointOption.point(197, 758)).perform();

        Thread.sleep(5000);

        jse.executeScript("window.scrollBy(0,300)", "");
       
        WebElement checkOutBtn = (WebElement) new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Checkout')]")));
        
        checkOutBtn.click();

        Thread.sleep(8000);

        jse.executeScript("window.scrollBy(0,300)", "");
        // TouchAction action4 = new TouchAction(driver);
        // action4.press(PointOption.point(115, 600));
        // action4.moveTo(PointOption.point(115, 350));
        // action4.release();
        // action4.perform();

        MobileElement el15 = wait.until(d -> d.findElementByXPath("//div[@id=\"payment_footer_container\"]/div/div/div/div/button"));
        el15.click();

        Thread.sleep(6000);
        driver.context("NATIVE_APP");
        MobileElement el18 = wait.until(d -> d.findElementByAccessibilityId("Skip"));
        el18.click();
        Thread.sleep(6000);
        MobileElement el16 = wait.until(d -> d.findElementByXPath("//XCUIElementTypeStaticText[@name='Smart & secure way to pay using Qik EMI, NeuCoins, saved cards & more']"));
        el16.click();
        
        Thread.sleep(6000);
        MobileElement el17 = wait.until(d -> d.findElementByAccessibilityId("Place Order & Pay"));
        el17.click();
        Thread.sleep(6000);
        MobileElement el19 = wait.until(d -> d.findElementByAccessibilityId("TataPay UPI"));
        // MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("TataPay UPI");
        el19.click();
        Thread.sleep(6000);
        MobileElement el14 = wait.until(d -> d.findElementByAccessibilityId("Savings A/C: XX XX19"));
        el14.click();
        Thread.sleep(9000);

        List<MobileElement> els1 = wait.until(d -> d.findElementsById("Pay ₹50,328"));
        els1.get(3).click();
        
        // MobileElement el20 = wait.until(d -> d.findElementByAccessibilityId("Pay ₹50,328"));
        // new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(el20));
        // el20.click();

        // new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(el20));
        
        Thread.sleep(20000);

        System.out.print("End of code ==========================");
    
  }
}
