package android;

import org.aeonbits.owner.Config;

/********************************
 Created by M.HIMAMANIKANTA
 ********************************/

@Config.Sources({"file:${user.dir}/src/main/resources/mobileDevice.properties"})
public interface DeviceConfig extends Config {

    String device_name();
    String automation_name();
    String platform_name();
    String platform_version();
    String app_package();
    String app_activity();
    String uuid();

}
