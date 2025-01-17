package me.huanmeng.gui.api.click;

import me.huanmeng.gui.api.Gui;
import me.huanmeng.gui.api.area.GuiArea;
import me.huanmeng.gui.api.click.type.ClickType;
import me.huanmeng.gui.api.component.Component;
import me.huanmeng.gui.api.inventory.InventoryType;
import me.huanmeng.gui.api.slot.Slot;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ClickMeta<T> {
    ClickMeta<Boolean> CANCELED = ClickMeta.of(Boolean.class, true);

    ClickMeta<InventoryType> INVENTORY_TYPE = ClickMeta.of(InventoryType.class);
    ClickMeta<Gui> GUI = ClickMeta.of(Gui.class);
    ClickMeta<GuiArea> GUI_AREA = ClickMeta.of(GuiArea.class);
    ClickMeta<Player> PLAYER = ClickMeta.of(Player.class);
    ClickMeta<ClickType> CLICK_TYPE = ClickMeta.of(ClickType.class);
    ClickMeta<Component> COMPONENT = ClickMeta.of(Component.class);
    ClickMeta<Slot> SLOT = ClickMeta.of(Slot.class);
    ClickMeta<Integer> SLOT_NUM = ClickMeta.of(Integer.class);
    ClickMeta<Integer> HOT_BAR = ClickMeta.of(Integer.class);


    @NonNull
    Class<T> metaClass();

    boolean mutable();

    static <T> ClickMeta<T> of(@NonNull Class<T> metaClass) {
        return of(metaClass, false);
    }

    @NonNull
    static <T> ClickMeta<T> of(@NonNull Class<T> metaClass, boolean mutable) {
        return new ClickMeta<T>() {
            @Override
            public @NonNull Class<T> metaClass() {
                return metaClass;
            }

            @Override
            public boolean mutable() {
                return mutable;
            }
        };
    }
}
