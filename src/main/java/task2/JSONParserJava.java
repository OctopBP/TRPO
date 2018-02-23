package task2;

import com.google.gson.Gson;
import task2.varModul.*;
import java.util.ArrayList;

public class JSONParserJava {

    public static void main(String[] args) {

        String json =
                "{" +
                "  \"table\": {" +
                "    \"columnNames\": [\"station\", \"mooring_site_desc\", \"water_depth\", \"time\", \"current_speed\", \"current_speed_qc\", \"current_direction\", \"current_direction_qc\", \"current_u\", \"current_u_qc\", \"current_v\", \"current_v_qc\", \"temperature\", \"temperature_qc\", \"conductivity\", \"conductivity_qc\", \"salinity\", \"salinity_qc\", \"sigma_t\", \"sigma_t_qc\", \"time_created\", \"time_modified\", \"longitude\", \"latitude\", \"depth\"]," +
                "    \"columnTypes\": [\"String\", \"String\", \"float\", \"String\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"String\", \"String\", \"float\", \"float\", \"float\"]," +
                "    \"columnUnits\": [null, null, null, \"UTC\", \"cm/s\", \"1\", \"angular_degrees\", \"1\", \"cm/s\", \"1\", \"cm/s\", \"1\", \"celsius\", \"1\", \"msiemens/cm\", \"1\", \"psu\", \"1\", \"kg/m^3\", \"1\", \"UTC\", \"UTC\", \"degrees_east\", \"degrees_north\", \"m\"]," +
                "    \"rows\": [" +
                "           [\"E05\", \"near mouth of Damariscotta R\", 28.0, \"2015-08-25T15:00:00Z\", 55.727, 0, 191.9956, 0, -11.5821085, 0, -54.51012, 0, 16.739105, 0, 40.94116, 0, 31.778864, 0, 23.10481, 0, \"2015-08-25T22:30:58Z\", \"2015-08-25T22:30:58Z\", -69.56939, 43.84409, 2.0]," +
                "           [\"E05\", \"near mouth of Damariscotta R\", 28.0, \"2015-08-25T15:20:00Z\", 54.5538, 0, 183.5572, 0, -3.3847892, 0, -54.448692, 0, 17.118849, 0, 41.23412, 0, 31.731762, 0, 22.980778, 0, \"2015-08-25T22:30:58Z\", \"2015-08-25T22:30:58Z\", -69.56939, 43.84409, 2.0]" +
                "    ]" +
                "  }" +
                "}";


        Gson gson = new Gson();
        BaseTable table = gson.fromJson(json, BaseTable.class);

        for(Object[] row: table.getTable().getRows()) {
            for(Object obj: row) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }


//        ArrayList<BaseVar> varArr = new ArrayList<BaseVar>();
//
//        for (int i = 0; i < table.getTable().getColumnNames().length; i++) {
//            Object object = table.getTable().getRows()[0][i]; // [0]
//            String name = table.getTable().getColumnNames()[i];
//            String type = table.getTable().getColumnTypes()[i];
////            String unit = table.getTable().getColumnUnits()[i];
//            Types typeEnum = Types.valueOf(type.toUpperCase());
//
//            switch (typeEnum) {
//                case INT: varArr.add(new IntVar(name, Integer.valueOf((String) object))); break;
//                case STRING: varArr.add(new StringVar(name, (String) object)); break;
//                case FLOAT: varArr.add(new FloatVar(name, Float.valueOf((String) object))); break;
//                case BYTE: varArr.add(new ByteVar(name, Byte.parseByte((String) object))); break;
//            }
//        }
//
//        for (BaseVar baseVar: varArr) {
//        for (int i = 0; i < varArr.size(); i++) {
//            System.out.println("name: " + varArr.get(i).getName() + " type: " + varArr.get(i).getType());
//        }
    }

}
//
//enum Types {
//    INT,
//    STRING,
//    FLOAT,
//    BYTE
//}