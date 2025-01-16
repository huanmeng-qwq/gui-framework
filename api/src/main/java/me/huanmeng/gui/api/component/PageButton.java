package me.huanmeng.gui.api.component;

import me.huanmeng.gui.api.area.PageArea;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface PageButton extends Button {
    @Unmodifiable
    List<PageArea> pageAreas();

    void changePage();
}
