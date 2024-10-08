package gui.components.windows;

import gui.components.GUIFactory;
import gui.components.Button;
import gui.components.Checkbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
