package task2;

class BaseTable {
    private TableJava table;

    public BaseTable() {
    }

    public TableJava getTable() {
        return table;
    }

    public void setTable(TableJava table) {
        this.table = table;
    }
}

class TableJava {
    private String[] columnNames;
    private String[] columnTypes;
    private String[] columnUnits;

    public TableJava() {
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public String[] getColumnTypes() {
        return columnTypes;
    }

    public void setColumnTypes(String[] columnTypes) {
        this.columnTypes = columnTypes;
    }

    public String[] getColumnUnits() {
        return columnUnits;
    }

    public void setColumnUnits(String[] columnUnits) {
        this.columnUnits = columnUnits;
    }
}
