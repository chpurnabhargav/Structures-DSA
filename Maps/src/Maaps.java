import  java.util.*;
class Maaps{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Bhargav",1);
        hm.put("Airtel",2);
        hm.put("VI",3);
        hm.put("Jio",2);
        hm.put("AMith",3);
        hm.put("Nishanth",2);
        hm.put("GOwtham",4);

        System.out.println(hm.containsValue(2));
        for(String names:hm.keySet()){
            System.out.println(names);
            System.out.println(hm.get(names));
        }
    }
}