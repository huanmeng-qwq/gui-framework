package me.huanmeng.gui.api.slot;

import me.huanmeng.gui.api.slot.type.SlotImpl;
import me.huanmeng.gui.api.util.SlotUtil;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Slot {
    static Slot chest(int row, int column) {
        return new SlotImpl(SlotUtil.getSlot(row, column));
    }

    static Slot index(int row, int column) {
        return new SlotImpl(SlotUtil.getSlot(row + 1, column + 1));
    }

    static Slot of(int index) {
        return new SlotImpl(index);
    }

    int getIndex();
}
