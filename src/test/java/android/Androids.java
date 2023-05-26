package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Androids {

    @Test
    public void temp() throws MalformedURLException {
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());;
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
