/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author juanj
 */
public class Paciente { 
    
    int edad;
    String edadString;
    
    
    public Paciente(int edad) {
        this.edad = edad;
        //System.out.println("1 SI");
    }
    
    public String calcularEdad(){
        //System.out.println("2 SI");
        if(edad >= 21 && edad <= 30){
            edadString = "Joven adulto";          
        }
        else if(edad > 30 && edad <= 60){
            edadString = "Adulto";
        }
        else if(edad > 60){
            edadString = "Tercera edad";
        }
        else{
            //System.out.println("NO 3");
        }
        return edadString;
    }
    
    /*private String calcularEdad(String edad){
        this.edadString = edad;
        System.out.println("AAAAAAAAAAAAAAA");
        return edadString;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(){
        if(edad >= 21 && edad <= 30){
            edadString = "Joven adulto";          
        }
        else if(edad > 30 && edad <= 60){
            edadString = "Adulto";
        }
        else if(edad < 60){
            edadString = "Tercera edad";
        }   
    }*/
    
    
        

 
}
