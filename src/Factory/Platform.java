package Factory;

import Factory.components.Button;
import Factory.components.Dropdown;

public abstract class Platform {
//    platform will have other methods also

//    public abstract Button createButton();
//    public abstract Dropdown createDropdown();
    public abstract UIComponentFactory createUIComponentFactory();
}
