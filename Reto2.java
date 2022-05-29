/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroPacinetesInt=0;//defino int y strigs que uso en el programa
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0, Fami = 0, STotal = 0, Coom = 0, CSalud = 0, SColmena = 0;
        String[] listaEnfermedades = {"cancer", "cardiovasculares", "respiratorias", "cerebrovasculares", "hipertension", "diabetes"};
        String[] listaEPS = {"Famisanar", "Salud Total", "Cafesalud", "Coomeva", "Salud Colmena"};
        String enfermedades, EPS;
        
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Ingrese el numero de pacientes: ");//pido el numero de pacientes en strings y lo convierto en int
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
        
        while(numeroPacinetesInt >0){
           numeroPacinetesInt--;
           
           //Leo los datos ingresados los separo por - y lo convierto en un vector y tomo el dato de la enfermedad en otra variable
           //System.out.println("Ingrese los datos del paciente: ");
           String datos = scanner.nextLine(); 
           String palabras[] = datos.split("-"); 
           enfermedades = palabras[5];
           EPS = palabras[4];
           
           switch(EPS){
               
               case "Famisanar":
                   Fami++;
                   break;
               case "Salud Total":
		   STotal++;
                   break;
               case "Cafesalud":
                   CSalud++;
                   break;
               case "Coomeva":
                   Coom++;
                   break;
               case "Salud Colmena":
                   SColmena++;
                   break;         
           }
           //utilizo los if para sumar las difeerentes enfermedades
           if(enfermedades.equalsIgnoreCase("cancer")){
                cancer++;
            } 
           else if(enfermedades.equalsIgnoreCase("cardiovasculares")){
                card++;
            }
           else if(enfermedades.equalsIgnoreCase("respiratorias")){
                respi++;
            }
           else if(enfermedades.equalsIgnoreCase("cerebrovasculares")){
                cereb++;
            }
           else if(enfermedades.equalsIgnoreCase("hipertension")){
                hiper++;
            }
           else if(enfermedades.equalsIgnoreCase("diabetes")){
                diab++;
            }
        }
        int[] numeroEPS = {Fami, STotal, CSalud, Coom, SColmena};
        
        
        int[] numeroEnfermedades = {cancer, card, respi, cereb, hiper, diab};
        int numeroMayor = 0, numeroMenor = 0;
        
        for(int i = 1; i < numeroEnfermedades.length;i++){
             if(numeroEnfermedades[i] > numeroEnfermedades[numeroMayor]){
                 numeroMayor = i;
             }        
        }
        for(int i = 1; i < numeroEnfermedades.length;i++ ){
             if(numeroEnfermedades[i] < numeroEnfermedades[numeroMenor]){
                 numeroMenor = i;             
             }
             
        }
        System.out.println(listaEnfermedades[numeroMayor]);
        System.out.println(listaEnfermedades[numeroMenor]);
        
        numeroMayor = 0;
        
        for(int i = 1; i < numeroEPS.length;i++){
             if(numeroEPS[i] > numeroEPS[numeroMayor]){
                 numeroMayor = i;
             }        
        }

        System.out.println(listaEPS[numeroMayor]);
    }
    
}
