package me.huanmeng.gui.api.component.frame;

import me.huanmeng.gui.api.GUI;
import me.huanmeng.gui.api.component.Component;
import org.jetbrains.annotations.NotNull;

import java.util.Set;


public interface GUIFrame extends Component {

    @NotNull GUI<?> parent();

    /**
     * All slots that this area will display
     *
     * @return slots used to display this area
     */
    Set<Integer> displaySlots();

    default int displaySize() {
        return displaySlots().size();
    }

}
