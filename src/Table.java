public class Table {
    private static final int MAX_ENTRIES_COUNT = 10;

    private TableEntry[] entries;
    private int rowsCount;

    private int keyWidth;
    private int valueWidth;

    public Table(int keyWidth, int valueWidth) {
        this.entries = new TableEntry[MAX_ENTRIES_COUNT];
        this.keyWidth = keyWidth;
        this.valueWidth = valueWidth;
    }

    public void put(String key, int value) {
        if (rowsCount < MAX_ENTRIES_COUNT) {
            TableEntry entry = new TableEntry(key, value);
            entries[rowsCount] = entry;
            rowsCount++;
        } else {
            System.err.println("Места больше нет");
        }
    }

    // вложенный класс
    private static class TableEntry {
        String key = "DEFAULT";
        int value;

        TableEntry(String key, int value) {
            if (key != null) {
                this.key = key;
            }
            this.value = value;
        }
    }

    // внутренний класс
    class TablePrinter {
        public void print() {
            System.out.printf("|%" + keyWidth + "s|%" + valueWidth + "s|\n", "Ключ", "Значение");
            for (int i = 0; i < rowsCount; i++) {
                System.out.printf("|%" + keyWidth + "s|%" + valueWidth + "d|\n", entries[i].key, entries[i].value);
            }
        }
    }

}
