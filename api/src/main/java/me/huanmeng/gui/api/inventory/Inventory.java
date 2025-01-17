package me.huanmeng.gui.api.inventory;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Inventory {
    @NonNull
    InventoryType type();

    @Nullable
    ItemStack getItem(int slot);

    void setItem(int slot, @Nullable ItemStack item);

    @NonNull
    Component title();

    void title(@NonNull Component title);

    int id();
}
