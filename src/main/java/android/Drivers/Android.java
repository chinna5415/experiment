package android.Drivers;

import android.DeviceConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android extends Driver {

    private static AndroidDriver androidDriver;

    @Override
    public void initializeDriver() throws MalformedURLException {
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());
    }

    private DesiredCapabilities getDesiredCapabilities() {

        DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class);

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

    @Override
    public WebDriver getDriver() {
        return androidDriver;
    }
}