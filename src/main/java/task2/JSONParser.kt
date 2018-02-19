package task2

import java.net.URL

class JSONParser {

    val json: String = "{\n" +
            "  \"table\": {\n" +
            "    \"columnNames\": [\"station\", \"mooring_site_desc\", \"water_depth\", \"time\", \"current_speed\", \"current_speed_qc\", \"current_direction\", \"current_direction_qc\", \"current_u\", \"current_u_qc\", \"current_v\", \"current_v_qc\", \"temperature\", \"temperature_qc\", \"conductivity\", \"conductivity_qc\", \"salinity\", \"salinity_qc\", \"sigma_t\", \"sigma_t_qc\", \"time_created\", \"time_modified\", \"longitude\", \"latitude\", \"depth\"],\n" +
            "    \"columnTypes\": [\"String\", \"String\", \"float\", \"String\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"float\", \"byte\", \"String\", \"String\", \"float\", \"float\", \"float\"],\n" +
            "    \"columnUnits\": [null, null, null, \"UTC\", \"cm/s\", \"1\", \"angular_degrees\", \"1\", \"cm/s\", \"1\", \"cm/s\", \"1\", \"celsius\", \"1\", \"msiemens/cm\", \"1\", \"psu\", \"1\", \"kg/m^3\", \"1\", \"UTC\", \"UTC\", \"degrees_east\", \"degrees_north\", \"m\"],\n" +
            "    \"rows\": [\n" +
            "      [\"E05\", \"near mouth of Damariscotta R\", 28.0, \"2015-08-25T15:00:00Z\", 55.727, 0, 191.9956, 0, -11.5821085, 0, -54.51012, 0, 16.739105, 0, 40.94116, 0, 31.778864, 0, 23.10481, 0, \"2015-08-25T22:30:58Z\", \"2015-08-25T22:30:58Z\", -69.56939, 43.84409, 2.0],\n" +
            "      [\"E05\", \"near mouth of Damariscotta R\", 28.0, \"2015-08-25T15:20:00Z\", 54.5538, 0, 183.5572, 0, -3.3847892, 0, -54.448692, 0, 17.118849, 0, 41.23412, 0, 31.731762, 0, 22.980778, 0, \"2015-08-25T22:30:58Z\", \"2015-08-25T22:30:58Z\", -69.56939, 43.84409, 2.0],\n" +
            "    ]" +
            "  }" +
            "}"

//    fun main(args: Array<String>) {
//
//    }
}