package me.huanmeng.gui.api.slot.type;

import me.huanmeng.gui.api.slot.Slot;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public class SlotImpl implements Slot {
    private final int index;

    public SlotImpl(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
