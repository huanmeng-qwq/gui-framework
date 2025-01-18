package me.huanmeng.gui.api.click;

import me.huanmeng.gui.api.component.frame.GUIFrame;
import me.huanmeng.gui.api.click.type.ClickType;
import me.huanmeng.gui.api.component.Component;
import me.huanmeng.gui.api.pool.InventoryPool;
import me.huanmeng.gui.api.slot.GUISlot;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ClickMeta<T> {
    ClickMeta<Boolean> CANCELED = ClickMeta.of(Boolean.class, true);

    ClickMeta<InventoryPool> INVENTORY_POOL = ClickMeta.of(InventoryPool.class);
    ClickMeta<ContentHolder> INVENTORY = ClickMeta.of(ContentHolder.class);
    ClickMeta<me.huanmeng.gui.api.GUI> GUI = ClickMeta.of(me.huanmeng.gui.api.GUI.class);
    ClickMeta<GUIFrame> GUI_AREA = ClickMeta.of(GUIFrame.class);
    ClickMeta<Player> PLAYER = ClickMeta.of(Player.class);
    ClickMeta<Integer> CLICK_MODE = ClickMeta.of(Integer.class);
    ClickMeta<ClickType> CLICK_TYPE = ClickMeta.of(ClickType.class);
    ClickMeta<Component> COMPONENT = ClickMeta.of(Component.class);
    ClickMeta<GUISlot> SLOT = ClickMeta.of(GUISlot.class);
    ClickMeta<Integer> SLOT_NUM = ClickMeta.of(Integer.class);
    ClickMeta<Integer> HOT_BAR = ClickMeta.of(Integer.class);


    @NotNull
    Class<T> metaClass();

    boolean mutable();

    static <T> ClickMeta<T> mutable(@NotNull Class<T> metaClass) {
        return of(metaClass, true);
    }

    static <T> ClickMeta<T> of(@NotNull Class<T> metaClass) {
        return of(metaClass, false);
    }

    @NotNull
    static <T> ClickMeta<T> of(@NotNull Class<T> metaClass, boolean mutable) {
        return new ClickMeta<T>() {
            @Override
            public @NotNull Class<T> metaClass() {
                return metaClass;
            }

            @Override
            public boolean mutable() {
                return mutable;
            }
        };
    }
}
