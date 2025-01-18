package me.huanmeng.gui.api.component.button;

import me.huanmeng.gui.api.component.frame.PaginateFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * A button type that used to navigate between pages.
 */
public interface PaginateButton extends GUIButton {

    @Unmodifiable
    @NotNull List<PaginateFrame> linkedArea();

}
