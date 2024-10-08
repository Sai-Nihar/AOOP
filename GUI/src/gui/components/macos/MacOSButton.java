package gui.components.macos;

import gui.components.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a MacOS style.");
    }
}
 