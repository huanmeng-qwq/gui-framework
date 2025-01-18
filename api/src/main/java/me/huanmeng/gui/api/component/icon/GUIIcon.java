package me.huanmeng.gui.api.component.icon;

import me.huanmeng.gui.api.component.Component;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

/**
 * Represents an icon in a GUI.
 */
public interface GUIIcon extends Component, Cloneable {

    static GUIIcon of(@NotNull Supplier<ItemStack> item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static GUIIcon of(@Nullable ItemStack item) {
        return of(() -> item);
    }

    /**
     * @return the displayed {@link ItemStack}  for the icon
     */
    @Nullable
    ItemStack item();

    /**
     * Set the displayed {@link ItemStack} for the icon
     *
     * @param supplier Supplied the {@link ItemStack} to display
     */
    void item(@NotNull Supplier<@Nullable ItemStack> supplier);

    /**
     * Set the displayed {@link ItemStack} for the icon
     *
     * @param item the {@link ItemStack} to display
     */
    default void item(@Nullable ItemStack item) {
        item(() -> item);
    }

}
