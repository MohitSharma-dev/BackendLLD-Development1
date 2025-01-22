package Factory;

import Factory.components.Button;
import Factory.components.Dropdown;

public interface UIComponentFactory {
     public Button createButton();
     public Dropdown createDropdown();
}
