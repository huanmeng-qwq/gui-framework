package me.huanmeng.gui.api;

import me.huanmeng.gui.api.component.frame.GUIFrame;
import me.huanmeng.gui.api.component.icon.GUIIcon;
import me.huanmeng.gui.api.data.GUIStatements;
import me.huanmeng.gui.api.draw.PreparedGUIIcon;
import me.huanmeng.gui.api.holder.InventoryWrapper;
import me.huanmeng.gui.api.slot.GUISlot;
import me.huanmeng.gui.api.slot.impl.AbstractSlotsHolder;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.Consumer;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface GUI<W extends InventoryWrapper<?>> extends Cloneable {

    /**
     * @return The original {@link InventoryWrapper}
     */
    W inventory();

    @NotNull GUIStatements flags();

    @NotNull
    default Set<Player> viewers() {
        return inventory().viewers();
    }

    /**
     * @return All registered {@link GUIFrame}s
     */
    List<GUIFrame> areas();

    @Unmodifiable
    @NotNull SortedMap<Integer, GUIIcon> icons();

    void open(Player player);

    void close(Player player);

    void update(@NotNull GUIIcon icon);

    void update(@NotNull GUIFrame area);

    default void update(Player player) {
        inventory().updateView(player);
    }

    default void update() {
        viewers().forEach(this::update);
    }

    void title(@NotNull String title);

    <T extends GUIIcon> PreparedGUIIcon<GUI<W>, ?> put(T icon);

    <T extends GUIFrame> void put(T area);

    void remove(@NotNull Consumer<AbstractSlotsHolder<?>> remover);

    void remove(@NotNull GUISlot slot, @NotNull GUISlot... slots);

    void remove(@NotNull GUIIcon icon);

    void remove(@NotNull GUIFrame area);

}
