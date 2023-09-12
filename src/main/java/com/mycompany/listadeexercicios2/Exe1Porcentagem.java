/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios2;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe1Porcentagem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float num1, num2, resultado;
        
        System.out.println("Informe o valor:");
        
        num1 = entrada.nextFloat();
        
        System.out.println("Informe a porcentagem");
        
        num2 = entrada.nextFloat();
        
        resultado = num1 * num2;
        
        resultado = resultado / 100;
        
        System.out.println(resultado);
    
    }
        
}
