package Factory;

import Factory.components.Button;
import Factory.components.IOSButton;

public class IOS extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
