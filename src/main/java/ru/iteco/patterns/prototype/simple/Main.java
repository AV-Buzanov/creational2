package ru.iteco.patterns.prototype.simple;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

        var color = new Color("#ffffff", "white", new ColorSetting("", 0.0));
        System.out.println("Color: " + color);
        System.out.println("ColorSetting: " + color.getSetting());

        var clone = new Color(color);
        System.out.println("Clone: " + clone);
        System.out.println("ColorSetting: " + clone.getSetting());
    }
}
