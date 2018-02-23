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
    private Object[][] rows;

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

    public Object[][] getRows() {
        return rows;
    }

    public void setRows(Object[][] rows) {
        this.rows = rows;
    }
}

//class Row {
//    private String[] data;
//
//    public Row() {
//    }
//
//    public String[] getData() {
//        return data;
//    }
//
//    public void setData(String[] data) {
//        this.data = data;
//    }
//
//}
//
//class RowsObj {
//    private String station;
//    private String mooring_site_desc;
//    private float water_depth;
//    private String  time;
//    private float  current_speed;
//    private byte  current_speed_qc;
//    private float  current_direction;
//    private byte  current_direction_qc;
//    private float  current_u;
//    private byte  current_u_qc;
//    private float  current_v;
//    private byte  current_v_qc;
//    private float  temperature;
//    private byte  temperature_qc;
//    private float  conductivity;
//    private byte  conductivity_qc;
//    private float  salinity;
//    private byte  salinity_qc;
//    private float  sigma_t;
//    private byte  sigma_t_qc;
//    private String time_created;
//    private String time_modified;
//    private float longitude;
//    private float latitude;
//    private float depth;
//
//    public RowsObj() {
//    }
//}