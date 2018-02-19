package task2;

import com.google.gson.Gson;

public class JSONParserJava {

    public static void main(String[] args) {

        String json =
                "{\n" +
                "   \"table\": {\n" +
                "       \"columnNames\": [\"station\", \"mooring_site_desc\", \"water_depth\", \"time\", \"current_speed\", \"current_speed_qc\", \"current_direction\", \"current_direction_qc\", \"current_u\", \"current_u_qc\", \"current_v\", \"current_v_qc\", \"temperature\", \"temperature_qc\", \"conductivity\", \"conductivity_qc\", \"salinity\", \"salinity_qc\", \"sigma_t\", \"sigma_t_qc\", \"time_created\", \"time_modified\", \"longitude\", \"latitude\", \"depth\"],\n" +
                "       \"columnTypes\": [\"String\", \"String\", \"float\", \"String\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"String\", \"String\", \"float\", \"float\", \"float\"],\n" +
                "       \"columnUnits\": [null, null, null, \"UTC\", \"cm/s\", \"1\", \"angular_degrees\", \"1\", \"cm/s\", \"1\", \"cm/s\", \"1\", \"celsius\", \"1\", \"msiemens/cm\", \"1\", \"psu\", \"1\", \"kg/m^3\", \"1\", \"UTC\", \"UTC\", \"degrees_east\", \"degrees_north\", \"m\"]\n" +
                "   }" +
                "}";


        Gson gson = new Gson();

        BaseTable table = gson.fromJson(json, BaseTable.class);

        System.out.println(table.getTable().getColumnNames()[1]);


        try {
            Class myClass = Class.forName("java.lang.String"); // table.getTable().getColumnTypes()[0]);
            System.out.println(myClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
