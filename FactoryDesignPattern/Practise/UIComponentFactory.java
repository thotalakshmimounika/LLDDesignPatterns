package FactoryDesignPattern.Practise;

import FactoryDesignPattern.Practise.Components.Button.Button;
import FactoryDesignPattern.Practise.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Practise.Components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
