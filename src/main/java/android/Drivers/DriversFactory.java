package android.Drivers;

public class DriversFactory {

    public Driver getDriver(String driver) {
        switch (driver) {
            case "android": return new Android();
            default: return null;
        }
    }

}
