package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.AndroidButton;
import FactoryDesignPattern.Practise.Components.Button.Button;

public abstract class Platform {
    public void setRefershRate(){

    }
    public void setTheme(){

    }
//    public Button createButton(){
////        if(this is an instance of Android){
////            return new AndroidButton();
////        }
////        else if(this is an instance of IOS){
////            return new IOSButton();
////        }
////    }
    //similary will go with Dropdown and Menu. Lot of if else's- Here we use Factory DP

//    public abstract Button createButton(); this will ask the exteded classes to implement which again the bulk code
    // Android should have theor features and manages their comoponents. they should not worry for creating components implementation.

    //If more components more implementation in extended classes. Instead we use separate Factory Interface to do implement these
    //componenets and be available to different platforms.
    public static Platform createPlatform(String PlatformName){
        return PlatformFactory.getPlatform(PlatformName);
    }
    public abstract UIComponentFactory createUIComponentFactory();
}
