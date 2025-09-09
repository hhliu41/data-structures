import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /* The map interface is generic
         * the first type given is the key
         * the second type given is the value
         */
        Map<String, Color> favColor = new HashMap<>();

        favColor.put("Sreeram", Color.GREEN);
        favColor.put("Kaitlyn", Color.GREEN);
        favColor.put("Cam", Color.BLUE);
        favColor.put("Nimai", Color.RED);

        favColor.put("Cam", Color.ORANGE);

        Set<String> keys = favColor.keySet();

        for (String key: keys) {
            System.out.println(key + "(" + key.hashCode() + "): " + favColor.get(key));
        }
    }
}
