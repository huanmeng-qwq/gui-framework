package me.huanmeng.gui.api.component.button;

import me.huanmeng.gui.api.click.ClickRequest;
import me.huanmeng.gui.api.click.ClickResponse;
import me.huanmeng.gui.api.component.icon.GUIIcon;
import org.jetbrains.annotations.Nullable;

/**
 * A button that can be clicked.
 */
public interface GUIButton extends GUIIcon {

    @Nullable
    ClickResponse onClick(ClickRequest clickRequest);

}
