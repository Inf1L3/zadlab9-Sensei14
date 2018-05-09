/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();

        //zad1
//        int [] tab1 = new int[100];
//        
//        for(int i=0; i<100; i++)
//        {
//            tab1[i] = r.nextInt(100);
//        }
//        
//       Arrays.sort(tab1);
//        
//       
//       for(int i=0; i<100; i++)
//       {
//           System.out.println(tab1[i]);
//       }


//       NewClass1 a = new NewClass1();
//       
//       a.add();
//       a.show();
        

        ArrayList<Auto> list1 = new ArrayList<Auto>();
        
        list1.add(new Auto("Volvo", 10000, 150, "v40"));
        list1.add(new Auto("Opel", 15000, 220, "Astra"));

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).toString());
        }
        
    }

}
