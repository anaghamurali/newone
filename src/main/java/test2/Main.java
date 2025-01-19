package test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] a={5,7,9,5,5,4,9,9,9,2,5,5};

        Map<Integer,Integer> map= new HashMap<>();




        for(int i=0; i<a.length;i++){
            int count=0;

            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;

                }
            }
            if(count>1){
                map.put(a[i],count);

            }
            

        }  
       for (Integer i : map.keySet()) {
        System.out.println(i+" has occurred :"+map.get(i));
        
       }
    }
}