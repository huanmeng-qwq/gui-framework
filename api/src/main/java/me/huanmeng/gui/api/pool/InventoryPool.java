package me.huanmeng.gui.api.pool;

import me.huanmeng.gui.api.inventory.Inventory;
import me.huanmeng.gui.api.inventory.InventoryType;
import org.bukkit.entity.Player;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
@SuppressWarnings("unused")
public interface InventoryPool {
    Inventory create(InventoryType type);

    Inventory getInventory(int id);

    void close();

    void openInventory(Player player, Inventory inventory);

    void closeInventory(Player player);
}
