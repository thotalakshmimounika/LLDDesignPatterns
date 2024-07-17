package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;

public class Android extends Platform{

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
