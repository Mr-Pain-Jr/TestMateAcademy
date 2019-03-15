import static java.lang.Math.E;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Controller {
    
    
    public String compare(Integer n){
    Map<Integer,String> all = new HashMap<>();
        all.put(1,"I");
        all.put(2,"II");
        all.put(3,"III");
        all.put(4,"IV");
        all.put(5,"V");
        all.put(6,"VI");
        all.put(7,"VII");
        all.put(8,"VIII");
        all.put(9,"IX");
        all.put(10,"X");
        all.put(11,"XI");
        all.put(12,"XII");
        all.put(13,"XIII");
        all.put(14,"XIV");
        all.put(15,"XV");
        all.put(16,"XVI");
        all.put(17,"XVII");
        all.put(18,"XVIII");
        all.put(19,"XIX");
        all.put(20,"XX");           
        return all.get(n);
    }
    
    public int compare(String s){
    Map<String,Integer> all = new HashMap<>();
        all.put("I",1);
        all.put("II",2);
        all.put("III",3);
        all.put("IV",4);
        all.put("V",5);
        all.put("VI",6);
        all.put("VII",7);
        all.put("VIII",8);
        all.put("IX",9);
        all.put("X",10);
        all.put("XI",11);
        all.put("XII",12);
        all.put("XIII",13);
        all.put("XIV",14);
        all.put("XV",15);
        all.put("XVI",16);
        all.put("XVII",17);
        all.put("XVIII",18);
        all.put("XIX",19);
        all.put("XX",20);
        return all.get(s);        
    }
    
}