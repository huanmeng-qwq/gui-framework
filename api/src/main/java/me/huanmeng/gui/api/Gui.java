package me.huanmeng.gui.api;

import me.huanmeng.gui.api.area.GuiArea;
import me.huanmeng.gui.api.inventory.InventoryType;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Gui {
    InventoryType type();

    List<GuiArea> areas();

    void open(Player player);

    void close(Player player);
}
