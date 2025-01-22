package Factory;

import Factory.components.Button;
import Factory.components.Dropdown;
import Factory.components.IOSButton;
import Factory.components.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory {

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
