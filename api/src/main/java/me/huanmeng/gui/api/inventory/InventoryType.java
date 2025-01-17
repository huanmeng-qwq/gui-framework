package me.huanmeng.gui.api.inventory;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 * <a href="https://minecraft.wiki/w/Minecraft_Wiki:Projects/wiki.vg_merge/Inventory">wiki/Inventory</a>
 *
 * @author huanmeng_qwq
 */
public enum InventoryType {
    CUSTOM_1("Chest", 0, 1, 9),
    CUSTOM_2("Chest", 1, 2, 9),
    CUSTOM_3("Chest", 2, 3, 9),
    CUSTOM_4("Chest", 3, 4, 9),
    CUSTOM_5("Chest", 4, 5, 9),
    CUSTOM_6("Chest", 5, 6, 9),

    DISPENSER("Dispenser", 6, 3, 3),
    DROPPER("Dropper", 6, 1, 9),
    FURNACE("Furnace", 14, 3, 1, 3);
    private final String type;
    private final int typeInt;
    private final int row;
    private final int column;
    private final int size;

    InventoryType(String type, int typeInt, int row, int column) {
        this(type, typeInt, row, column, row * column);
    }

    InventoryType(String type, int typeInt, int row, int column, int size) {
        this.type = type;
        this.typeInt = typeInt;
        this.row = row;
        this.column = column;
        this.size = size;
    }

    public int row() {
        return row;
    }

    public int column() {
        return column;
    }

    public int size() {
        return size;
    }

    public String type() {
        return type;
    }

    public int typeInt() {
        return typeInt;
    }
}
