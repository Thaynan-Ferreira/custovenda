/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.custovenda;
import java.util.Scanner;
/**
 *
 * @author Thaynan
 */
public class CustoVenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double custo, margem, venda;
        
        System.out.println("Digite o prço de custo do Produto: ");
        custo = entrada.nextDouble();
        
        System.out.println("Digite a margem de lucro desejada(%): ");
        margem = entrada.nextDouble();
        
        venda = custo + (custo *(margem/100));
        
        System.out.println("Custo = " + custo + "\nVenda = " + venda + "\nMargem de lucro: " + margem + "%");
    
    }
}
