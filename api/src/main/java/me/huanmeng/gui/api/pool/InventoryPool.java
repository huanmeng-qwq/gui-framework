package me.huanmeng.gui.api.pool;

import me.huanmeng.gui.api.inventory.Inventory;
import me.huanmeng.gui.api.inventory.InventoryType;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface InventoryPool {
    Inventory create(InventoryType type);

    Inventory getInventory(int id);
}
