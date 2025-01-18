package me.huanmeng.gui.api.draw;

import me.huanmeng.gui.api.slot.GUISlot;

import java.util.function.Consumer;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface GuiDraw {
    GuiDraw button(GUISlot GUISlot, Consumer<PreparedButton> consumer);

    void commit();
}
