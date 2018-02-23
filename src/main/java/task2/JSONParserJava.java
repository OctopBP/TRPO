package task2;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class JSONParserJava {

    private static final String DATA_URL = "http://www.neracoos.org/erddap/tabledap/E05_aanderaa_all.json?station,mooring_site_desc,water_depth,time,current_speed,current_speed_qc,current_direction,current_direction_qc,current_u,current_u_qc,current_v,current_v_qc,temperature,temperature_qc,conductivity,conductivity_qc,salinity,salinity_qc,sigma_t,sigma_t_qc,time_created,time_modified,longitude,latitude,depth&time%3E=2015-08-25T15:00:00Z&time%3C=2016-12-05T14:00:00Z";

    public static void main(String[] args) throws Exception {

        URL url = new URL(DATA_URL);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuilder json = new StringBuilder();
        String inputLine;
        for (int i = 0; (inputLine = in.readLine()) != null; i++) {
            System.out.println(i + inputLine);
            json.append(inputLine);
        }
        in.close();

        Gson gson = new Gson();
        BaseTable table = gson.fromJson(json.toString(), BaseTable.class);

        for (Object[] row : table.getTable().getRows()) {
            for (Object obj : row) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }

    }
}