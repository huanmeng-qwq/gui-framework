package me.huanmeng.gui.api.component.button;

import org.jetbrains.annotations.NotNull;

/**
 * A button that is linked (or mapped) to another button
 */
public interface LinkedButton extends GUIButton {

    @NotNull GUIButton source();

}
