
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class MapDemo
{
 
    public static void main(String args[])
    {
        Map<String, String> map = new HashMap<String, String>();
 
        //Adding values to the HashMap
        map.put("test key 1", "test value 1");
        map.put("test key 2", "test value 2");
        map.put("test key 3", "test value 3");
 
        System.out.println("Retrieving values from HashMap");
        retrieveValuesFromListMethod(map);
        System.out.println("**********************\n\n");
 
 
    }
 
    /*This method retrieves values from Map
     */
    public static void retrieveValuesFromListMethod(Map<String, String> map)
    {
        Set<String> keys = map.keySet();
        Iterator<String> itr = keys.iterator();
      
 
        String key;
        String value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value = (String)map.get(key);
            System.out.println(key + " - "+ value);
        }
    }
}