/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ander4;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Ander4 {

    public static void main(String[] args) {
        //calcular el area del triangulo,circulo
        //triangulo
        double base;
        double altura;
        double operacion;
        double radio;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingresar la base del triangulo: ");
        base = input.nextDouble();
        
        System.out.println("ingresar la altura del triangulo: ");
        altura = input.nextDouble();
        
        operacion = (base * altura) /2;
        System.out.println("El area del triangulo es: "+operacion);
        
        //circulo
        System.out.println("Ingrese el radio del circulo: ");
        radio = input.nextDouble();
        operacion = Math.PI * Math.pow(radio,2);
        System.out.println("el area del circulo es: "+operacion);
        
        
    }
}
