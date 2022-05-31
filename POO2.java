/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.List; 
import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class POO2 {

    public static void main(String[] args){
        int longitud;        
        String[] lista = {"1", "2", "3", "4", "5"};
        
        lista[2] = "25";
        
        longitud = lista.length;
        
        for(int i = 0;i< longitud; i++ ){
            System.out.println("v["+i+"] = " + lista[i]);
        }

                
    }
}
