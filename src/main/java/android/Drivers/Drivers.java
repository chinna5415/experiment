package android.Drivers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class Drivers {
    public abstract void initializeDriver() throws MalformedURLException;
    public abstract WebDriver getDriver();
}
