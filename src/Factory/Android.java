package Factory;

import Factory.components.AndroidButton;
import Factory.components.Button;

public class Android extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
