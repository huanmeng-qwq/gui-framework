package me.huanmeng.gui.api.inventory;

import org.bukkit.inventory.ItemStack;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Inventory {
    InventoryType type();

    ItemStack getItem(int slot);

    void setItem(int slot, ItemStack item);
}
