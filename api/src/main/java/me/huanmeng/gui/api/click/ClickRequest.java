package me.huanmeng.gui.api.click;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ClickRequest {
    @Nullable
    <T> T meta(@NotNull ClickMeta<T> clickMeta);

    <T> void setMeta(@NotNull ClickMeta<T> meta, T value);

    boolean containMeta(@NotNull ClickMeta<?> meta);
}
