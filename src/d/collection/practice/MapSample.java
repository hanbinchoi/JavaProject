package d.collection.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {
    public static void main(String[] args){
        MapSample sample = new MapSample();
//        sample.checkHashMap();
        sample.checkTreeMap();
    }
    public void checkTreeMap(){
        TreeMap<String,String> tree = new TreeMap<String,String>();
        tree.put("A","a");
        tree.put("가","가");
        tree.put("C","c");
        tree.put("B","b");

        for(Map.Entry<String,String> temp : tree.entrySet()){
            System.out.println(temp.getKey()+" = "+temp.getValue());
        }

    }
    public void checkHashMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("A","1");
        map.put("D","1");
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(String key:map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
