package FactoryDesignPattern;

import java.util.Objects;

public class UIFactoryFactory {
    public static UIFactory getUiFactory(SupportedPlatform supportedPlatform){
        if (Objects.requireNonNull(supportedPlatform).equals((SupportedPlatform.IOS))){
            return new IOSFactory();
        } else if (supportedPlatform == SupportedPlatform.ANDROID) {
            return new Androidfactory();
        } else if (supportedPlatform == SupportedPlatform.MAC) {
            return new Macfactory();
        }
        return null;

    }
}
// UIFactory -> manufactures -> UI components -> button, menu, dropdown etc.
// UIFactoryFactory -> manufacture -> UIFactory -> IOSFactory, AndroidFactory, MacFactory etc.