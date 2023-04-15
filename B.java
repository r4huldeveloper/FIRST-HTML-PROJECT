package mypack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class B {
    public static void main(String[] args) {
      pack.A a = new pack.A();
      a.msg();
      ArrayList<String> list = new ArrayList<>();
      list.add("rahul");
      list.add("lovi");

      String s  = list.get(0);

      Iterator<String> itr = list.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
      System.out.println();

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "papa");
        map.put(2, "maa");
        map.put(3, "nitin");

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr1 = set.iterator();
        while(itr1.hasNext()){
            Map.Entry e = itr1.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
      }
    }

