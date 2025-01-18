package me.huanmeng.gui.api.draw;

import me.huanmeng.gui.api.click.ClickRequest;
import me.huanmeng.gui.api.component.button.GUIButton;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface PreparedButton {
    PreparedButton item(ItemStack item);

    PreparedButton item(Function<Player, ItemStack> item);

    PreparedButton item(Supplier<ItemStack> supplier);

    PreparedButton addClick(Consumer<ClickRequest> consumer);

    PreparedButton cancelClick();

    GUIButton build();
}
