package me.huanmeng.gui.api.component;

import me.huanmeng.gui.api.click.ClickRequest;
import me.huanmeng.gui.api.click.ClickResponse;
import org.jetbrains.annotations.Nullable;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface Component {
    @Nullable
    ClickResponse onClick(ClickRequest clickRequest);
}
