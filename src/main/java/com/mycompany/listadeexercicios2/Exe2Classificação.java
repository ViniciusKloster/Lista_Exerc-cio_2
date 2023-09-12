/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios2;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class Exe2Classificação {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int num1 = 5;
        
        System.out.println("Informe a idade do participante:");
        
        num1 = entrada.nextInt();
        
        if (num1 < 5){
            System.out.println("Não tem idade suficiente");
        }else if(num1 <= 7){
            System.out.println("Classificado na categoria INFANTÍL A");
        }else if(num1 <= 10){
            System.out.println("Classificado na categoria INFANTÍL B");
        }else if(num1 <= 13){
            System.out.println("Classificado na categoria JUVENIL A");
        }else if(num1 <= 17){
            System.out.println("Classificado na categoria JUVENIL B");
        }else if(num1 == 18){
            System.out.println("Classificado na categoria ADULTO");
        }
    }
    
}
