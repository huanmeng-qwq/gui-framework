package me.huanmeng.gui.api;

import me.huanmeng.gui.api.area.GuiArea;
import me.huanmeng.gui.api.inventory.Inventory;
import me.huanmeng.gui.api.inventory.InventoryType;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Set;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Gui {
    Inventory inventory();

    InventoryType type();

    List<GuiArea> areas();

    void open(Player player);

    void close(Player player);

    Set<Player> viewers();
}
