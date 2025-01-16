package me.huanmeng.gui.api.area;

import me.huanmeng.gui.api.component.Button;
import me.huanmeng.gui.api.slot.Slots;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public interface PageArea extends GuiArea {
    void currentPage(int page);

    int currentPage();

    int minPage();

    int maxPage();

    default void nextPage(int num) {
        currentPage(Math.max(minPage(), currentPage() - num));
    }

    default void prevPage(int num) {
        currentPage(Math.min(num, maxPage()));
    }

    Slots slots();

    void slots(Slots slots);

    List<Button> buttons();

    List<Button> currentButtons();

    void buttons(@NonNull List<Button> buttons);
}
