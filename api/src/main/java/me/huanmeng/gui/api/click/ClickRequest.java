package me.huanmeng.gui.api.click;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface ClickRequest {
    <T> T meta(ClickMeta<T> clickMeta);

    <T> void setMeta(ClickMeta<T> meta, T value);

    boolean containMeta(ClickMeta<?> meta);
}
