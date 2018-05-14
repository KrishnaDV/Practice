/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Satish
 */
public class Arraysq2 { // Finding the duplicate elements in an array
    public static void main(String[] args) {
        int a[] = {1,3,1,3,1,6,3,2,7,7,7,2,1,4,65,5,343,3};
        
        List<Integer> al = new ArrayList<Integer>();
     
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0; i < a.length; i++){
        	
        	if(hm.containsKey(a[i])){
        		
        		hm.put(a[i],hm.get(a[i])+1);
        		
        		if(!al.contains(a[i])){
        		
        			al.add(a[i]);
        		}
        		
        	}
        	else{
        		
        		hm.put(a[i],1);
        	}
        	
        }
        
        System.out.println(al);
        
}
}