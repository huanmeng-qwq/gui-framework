package me.huanmeng.gui.api.component.frame;

import me.huanmeng.gui.api.component.button.GUIButton;
import me.huanmeng.gui.api.component.icon.GUIIcon;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public interface ContainedFrame extends GUIFrame {

    /**
     * @return The icons contained in this area
     */
    @NotNull
    List<GUIIcon> contents();

    void contents(@NotNull List<GUIButton> icon);

    default void contents(@NotNull GUIButton... icon) {
        contents(Arrays.asList(icon));
    }

    void add(@NotNull GUIIcon icon, @NotNull GUIIcon... icons);

    default void add(@NotNull ItemStack item, @NotNull ItemStack... items) {
        add(GUIIcon.of(item));
        Arrays.stream(items).map(GUIIcon::of).forEachOrdered(this::add);
    }

    void remove(@NotNull GUIIcon icon);

}
