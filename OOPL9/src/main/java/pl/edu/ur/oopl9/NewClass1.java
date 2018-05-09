/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class NewClass1 {
    
    
    Random r = new Random();
    
    TreeSet<Integer> t1 = new TreeSet<>();
    
    void add()
    {
    for(int i=0; i<100; i++)
    {
        t1.add(r.nextInt(100));
    }
    }
    
    
    void show()
    {
        Iterator iter = t1.iterator();
                
                
                
                while(iter.hasNext())
                {
                    System.out.println(iter.next());
                    
                }
    }
    
}
