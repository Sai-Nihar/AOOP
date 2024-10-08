package gui.components.windows;

import gui.components.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}

