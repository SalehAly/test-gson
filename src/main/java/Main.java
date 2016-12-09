import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by Aly on 12/9/16.
 */
public class Main {

    public static void main(String args[]){
        String json = "{\"uid\":\"1\",\"streetName\":\"road\",\"city\":\"London\",\"speedLimit\":20}";
        JsonObject object = new JsonParser().parse(json).getAsJsonObject();
        System.out.println(object);
    }
}
