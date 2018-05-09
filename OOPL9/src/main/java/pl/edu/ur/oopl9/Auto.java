/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Auto {
    
    private String marka;
    private int cena;
    private int predkosc;
    private String nazwa;

    public Auto(String marka, int cena, int predkosc, String nazwa) {
        this.marka = marka;
        this.cena = cena;
        this.predkosc = predkosc;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Auto{" + "marka=" + marka + ", cena=" + cena + ", predkosc=" + predkosc + ", nazwa=" + nazwa + '}';
    }
    

        
         
        }
        
    
    

