/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class POO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int edad = 80;
        Paciente PacienteEdad = new Paciente(edad);
        
        System.out.println("edad: "+PacienteEdad.edad+" aaa "+PacienteEdad.calcularEdad());
        
        
    }
}
