package Factory;

import Factory.components.AndroidButton;
import Factory.components.AndroidDropdown;
import Factory.components.Button;
import Factory.components.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
