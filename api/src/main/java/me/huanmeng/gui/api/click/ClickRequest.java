package me.huanmeng.gui.api.click;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ClickRequest {
    @Nullable
    <T> T meta(@NonNull ClickMeta<T> clickMeta);

    <T> void setMeta(@NonNull ClickMeta<T> meta, T value);

    boolean containMeta(@NonNull ClickMeta<?> meta);
}
