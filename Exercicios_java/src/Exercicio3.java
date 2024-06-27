
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Exercicio3 {
    int numero,maiorValor;
    
    public void calcular(){
        Scanner entrada_dados= new Scanner(System.in);
        System.out.println("Calcular maior valor Inserido");
        System.out.println("");

        System.out.println("Insira um numero:");
        while((numero= entrada_dados.nextInt()) != 0){
            
            if(numero > maiorValor){
                maiorValor=numero;
            }
        }
        System.out.println("O maior alor inserido e: "+ maiorValor);
    }
}
