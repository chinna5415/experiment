package android.Drivers;

public class DriversFactory {

    public Drivers getDriver(String driver) {
        switch (driver) {
            case "android": return new Android();
            default: return null;
        }
    }

}
