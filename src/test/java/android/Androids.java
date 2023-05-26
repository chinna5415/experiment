package android;

import android.Drivers.Drivers;
import android.Drivers.DriversFactory;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Androids {

    @Test
    public void temp() throws MalformedURLException {
        Drivers driver = new DriversFactory().getDriver("android");
        driver.initializeDriver();
        AndroidDriver androidDriver = (AndroidDriver) driver.getDriver();
    }

}
