package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;
import FactoryDesignPattern.Practise.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Practise.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        Dropdown dropdown = uiComponentFactory.createDropdown();
        Menu menu = uiComponentFactory.createMenu();

    }
}
