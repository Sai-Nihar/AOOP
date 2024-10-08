package gui.components.macos;

import gui.components.GUIFactory;
import gui.components.Button;
import gui.components.Checkbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
