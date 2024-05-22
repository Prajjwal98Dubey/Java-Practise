import java.util.*;
class Main2{
    public static void main(String[] args){
        /*
        HashMap<String,String>cityCapital = new HashMap<String,String>();
        cityCapital.put("India","Delhi");
        cityCapital.put("Australia","Canberra");
        cityCapital.put("England","London");
        System.out.println(cityCapital);
        System.out.println(cityCapital.get("England"));
        System.out.print(cityCapital.get("America"));
        */
       // use Integer instead of int. Integer is a wrapper class.
       HashMap<Integer,String>map = new HashMap<Integer,String>();
       map.put(1,"one");
       map.put(2,"two");
       map.put(3,"three");
    //    System.out.println(map);
       String s = map.get(1);
       System.out.println(s);
       String s1 = map.getOrDefault(1,"Not Present.");
       String s2 = map.getOrDefault(10,"Not Present.");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(map.getClass().getName());
    }
}