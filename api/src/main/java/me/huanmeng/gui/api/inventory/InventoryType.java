package me.huanmeng.gui.api.inventory;

/**
 * 2025/1/17<br>
 * gui-framework<br>
 *
 * @author huanmeng_qwq
 */
public enum InventoryType {
    CUSTOM_1(1, 9),
    CUSTOM_2(2, 9),
    CUSTOM_3(3, 9),
    CUSTOM_4(4, 9),
    CUSTOM_5(5, 9),
    CUSTOM_6(6, 9),

    DISPENSER(3, 3),
    DROPPER(1, 9),
    FURNACE(3, 1, 3);
    private int row;
    private int column;
    private int size;

    InventoryType(int row, int column) {
        this(row, column, row * column);
    }

    InventoryType(int row, int column, int size) {
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
}
