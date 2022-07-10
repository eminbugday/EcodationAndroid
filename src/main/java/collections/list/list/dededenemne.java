package collections.list.list;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class dededenemne{

        public static void main(String[] args) {
                Map<String, Object> mapList=new LinkedHashMap<>();
                mapList.put("1","Hamit");
                mapList.put("2","ahmet");
                mapList.put("3","ferhat");

                System.out.println("\n*********just key******");


                ///sadece----key
                for (String key : mapList.keySet() ){
                        System.out.println(key+" ");
                }
                //2-Sadece Value
                for (Object value :mapList.values() ){
                        System.out.println(value+" ");
                }
                //key value
                for (String key : mapList.keySet() ){
                        System.out.println(key+" "+mapList.get(key) +" ");
                }
                //M.E.L.ES
                for (Map.Entry<String,Object> templist :mapList.entrySet()){
                        System.out.println(templist);
                }
                System.out.println("**********************");
                //5 set loop
                Set set =mapList.keySet();
                Iterator yineleulen=set.iterator();
                while (yineleulen.hasNext()){
                        System.out.println(mapList.get(yineleulen.next()));
                }

                //forEach

                System.out.println("\n**********FOREACH*******");
                mapList.entrySet().forEach(System.out::println);


        }



        }


