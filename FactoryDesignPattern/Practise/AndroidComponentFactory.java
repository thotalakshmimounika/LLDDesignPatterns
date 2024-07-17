package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;
import FactoryDesignPattern.Practise.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Practise.Components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    private Button AndroidButton;
    private Dropdown AndroidDropdown;
    private Menu AndroidMenu;
    @Override
    public Button createButton() {
        return AndroidButton;
    }

    @Override
    public Dropdown createDropdown() {
        return AndroidDropdown;
    }

    @Override
    public Menu createMenu() {
        return AndroidMenu;
    }
}
