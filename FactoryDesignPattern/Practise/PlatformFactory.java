package FactoryDesignPattern.Practise;

public class PlatformFactory {
    public static Platform getPlatform(String PlatformName) {
        if(PlatformName.equals("Android")){
            return new Android();
        }
        else if(PlatformName.equals("IOS")){
            return new IOS();
        }
        return null;
    }
}
