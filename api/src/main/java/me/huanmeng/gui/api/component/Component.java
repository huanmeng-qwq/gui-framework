package me.huanmeng.gui.api.component;

import me.huanmeng.gui.api.GUI;
import org.jetbrains.annotations.NotNull;

public interface Component {

    void draw(@NotNull GUI<?> gui);

}
