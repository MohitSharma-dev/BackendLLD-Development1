package Factory;

public class PlatformFactory {
    public static Platform getPlatformByName(String platform) {
        Platform platformInstance = null;
        if(platform.equals("Android")){
            platformInstance = new Android();
        } else if(platform.equals("IOS")){
            platformInstance = new IOS();
        }
        return platformInstance;
    }
}
