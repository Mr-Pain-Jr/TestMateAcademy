
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Controller {
    
    public Integer compare(String s){
    Map<String, Integer> all = new HashMap<>();
        all.put("I", 1);
        all.put("II", 2);
        all.put("III", 3);
        all.put("IV", 4);
        all.put("V", 5);
        all.put("VI", 6);
        all.put("VII", 7);
        all.put("VIII", 8);
        all.put("IX", 9);
        all.put("X", 10);
        all.put("XI", 11);
        all.put("XII", 12);
        all.put("XIII", 13);
        all.put("XIV", 14);
        all.put("XV", 15);
        all.put("XVI", 16);
        all.put("XVII", 17);
        all.put("XVIII", 18);
        all.put("XIX", 19);
        all.put("XX", 20);        
        return all.get(s);
    }
    
    public String compare(Integer num){
    Map<String, Integer> all = new HashMap<>();
        all.put("I", 1);
        all.put("II", 2);
        all.put("III", 3);
        all.put("IV", 4);
        all.put("V", 5);
        all.put("VI", 6);
        all.put("VII", 7);
        all.put("VIII", 8);
        all.put("IX", 9);
        all.put("X", 10);
        all.put("XI", 11);
        all.put("XII", 12);
        all.put("XIII", 13);
        all.put("XIV", 14);
        all.put("XV", 15);
        all.put("XVI", 16);
        all.put("XVII", 17);
        all.put("XVIII", 18);
        all.put("XIX", 19);
        all.put("XX", 20);   
        List keyList = new ArrayList(all.keySet());
        String res = (String) keyList.get(num);
        return res;
    }
    
}