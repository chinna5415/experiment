package com.mv.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Androids {

    /*@Test
    public void temp() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());

        WebElement webElement = driver.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']"));
        webElement.click();

        Thread.sleep(100);
        webElement = driver.findElement(By.xpath("//android.widget.Button[@text='No thanks']"));
        webElement.click();
    }*/

    @Test
    public void cal() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());

        /*
            device_name=Chinna
            automation_name=UiAutomator2
            platform_name=Android
            platform_version=12
            app_package=com.android.chrome
            app_activity=com.google.android.apps.chrome.Main
            uuid=emulator-5554
        */

        Thread.sleep(100);
        WebElement webElement = driver.findElement(By.xpath("//android.widget.Button[@text='1']"));
        webElement.click();

        Thread.sleep(10);
        webElement = driver.findElement(By.xpath("//android.widget.Button[@text='+']"));
        webElement.click();

        Thread.sleep(10);
        webElement = driver.findElement(By.xpath("//android.widget.Button[@text='2']"));
        webElement.click();

        Thread.sleep(10);
        webElement = driver.findElement(By.xpath("//android.widget.Button[@text='-']"));
        webElement.click();

        Thread.sleep(10);
        webElement = driver.findElement(By.xpath("//android.widget.Button[@text='3']"));
        webElement.click();


    }

    private DesiredCapabilities getDesiredCapabilities() {

        Device deviceConfig = ConfigFactory.create(Device.class);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities() {{

            setCapability(MobileCapabilityType.DEVICE_NAME, deviceConfig.device_name());
            setCapability(MobileCapabilityType.AUTOMATION_NAME, deviceConfig.automation_name());
            setCapability(MobileCapabilityType.PLATFORM_NAME, deviceConfig.platform_name());
            setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceConfig.platform_version());
            setCapability("appPackage", deviceConfig.app_package());
            setCapability("appActivity", deviceConfig.app_activity());
            setCapability(MobileCapabilityType.UDID, deviceConfig.uuid());

        }};

        return desiredCapabilities;
    }

}
