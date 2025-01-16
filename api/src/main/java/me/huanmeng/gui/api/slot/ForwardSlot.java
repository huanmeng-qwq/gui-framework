package me.huanmeng.gui.api.slot;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ForwardSlot extends Slot {
    @NonNull
    Slot target();
}
