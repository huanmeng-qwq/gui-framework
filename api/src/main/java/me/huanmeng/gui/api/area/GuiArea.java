package me.huanmeng.gui.api.area;

import me.huanmeng.gui.api.Gui;
import me.huanmeng.gui.api.draw.GuiDraw;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface GuiArea {
    GuiDraw draw();

    void refresh(Gui gui);
}
