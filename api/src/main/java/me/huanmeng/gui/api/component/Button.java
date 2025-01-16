package me.huanmeng.gui.api.component;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Button extends Component {
    ItemStack showingItem(Player player);
}
