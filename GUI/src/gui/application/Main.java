package gui.application;

import gui.components.GUIFactory;
import gui.components.windows.WindowsFactory;
import gui.components.macos.MacOSFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        Application app;

        // Test Windows GUI
        factory = new WindowsFactory();
        app = new Application(factory);
        app.paint();

        // Test MacOS GUI	
        factory = new MacOSFactory();
        app = new Application(factory);
        app.paint();
    }
}
