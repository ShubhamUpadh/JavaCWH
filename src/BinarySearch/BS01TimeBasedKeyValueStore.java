package BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Pair{
    public int time;
    public String val;
    public Pair(int time, String val){
        this.time = time;
        this.val = val;
    }
}


public class BS01TimeBasedKeyValueStore {

}

class TimeMap{
    HashMap<String, ArrayList<Pair>> valStore = new HashMap<>();
    public TimeMap(){

    }

    public void set(String key, String value, int timestamp){
        
        // key doesn't exist
        if (!valStore.containsKey(key)) {
            valStore.put(key, new ArrayList<>());
        }

        valStore.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp){
        
        if (!valStore.containsKey(key)) return "";

        int low = valStore.get(key).getFirst().time;
        int high = valStore.get(key).getLast().time;

        if (timestamp < low) return "";
        if (timestamp == low) return valStore.get(key).getFirst().val;
        if (timestamp <= high) return valStore.get(key).getLast().val;
        
        ArrayList<Pair> lst = valStore.get(key);
        low = 0;
        high = lst.size()-1;

        while (low<=high){
            int mid = low + (high-low)/2;
            if (lst.get(mid).time <= timestamp) return lst.get(mid).val;
            else high = mid - 1;
        }



        return "";

    }
}
