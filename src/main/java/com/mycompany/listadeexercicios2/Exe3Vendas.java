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
public class Exe3Vendas {
    public static void main(String args[]){
     
        Scanner entrada = new Scanner(System.in);
        
        int opcao, num1, num2, num3, num4, num5;
        
        double Caneta = 10, Mouse = 15.5, Fone = 30, Canudofrito = 4, Chaveiro = 15, resultado;
        
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|Opção|  Produtos      |    Valores   |");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|  1  |    Caneta      |      10      |");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|  2  |     Mouse      |     15,5     |");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|  3  |     Fone       |      30      |");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|  4  |  Canudo frito  |       4      |");
        System.out.println("|-----|----------------|--------------|");
        System.out.println("|  5  |    Chaveiro    |      15      |");
        System.out.println("|-----|----------------|--------------|");
        
        System.out.println("Informe o produto desejado:");
       
        opcao = entrada.nextInt();
        
        if (opcao == 1){
            System.out.println("Informe a quantidade");
        num1 = entrada.nextInt();
        resultado = Caneta * num1;
        System.out.println("VAlor total: " + resultado);
        }else if(opcao == 2){
            System.out.println("Informe a quantidade");
        num2 = entrada.nextInt();
        resultado = Mouse * num2;
        System.out.println("VAlor total: " + resultado);
        }else if(opcao == 3){
            System.out.println("Informe a quantidade");
        num3 = entrada.nextInt();
        resultado = Fone * num3;
        System.out.println("VAlor total: " + resultado);
        }else if(opcao == 4){
            System.out.println("Informe a quantidade");
        num4 = entrada.nextInt();
        resultado = Canudofrito * num4;
        System.out.println("VAlor total: " + resultado);
        }else if(opcao == 5){
            System.out.println("Informe a quantidade");
        num5 = entrada.nextInt();
        resultado = Chaveiro * num5;
        System.out.println("VAlor total: " + resultado);
        }
    }
}
