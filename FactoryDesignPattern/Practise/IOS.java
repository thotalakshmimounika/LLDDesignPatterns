package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;

public class IOS extends Platform{

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}
