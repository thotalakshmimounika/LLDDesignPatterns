package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;
import FactoryDesignPattern.Practise.Components.Button.IOSButton;
import FactoryDesignPattern.Practise.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Practise.Components.Dropdown.IOSDropdown;
import FactoryDesignPattern.Practise.Components.Menu.IOSMenu;
import FactoryDesignPattern.Practise.Components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory {

    private Button IOSButton;
    private Dropdown IOSDropdown;
    private Menu IOSMenu;

    @Override
    public Button createButton() {
        return IOSButton;
    }

    @Override
    public Dropdown createDropdown() {
        return IOSDropdown;
    }

    @Override
    public Menu createMenu() {
        return IOSMenu;
    }
}
