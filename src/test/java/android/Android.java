package android;

import android.Drivers.Driver;
import android.Drivers.DriversFactory;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Android {

    @Test
    public void temp() throws MalformedURLException {
        Driver driver = new DriversFactory().getDriver("android");
        driver.initializeDriver();
        AndroidDriver androidDriver = (AndroidDriver) driver.getDriver();
    }

}
