
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
public class Exercicio4 {
 
    Scanner teclado = new Scanner(System.in);
    int tamanho= 3;
    float altura [] = new float[tamanho];
    char sexo [] = new char[tamanho];
   
    

    public void mostrar(){
        
        for(int contador = 0; contador < tamanho; contador++){
            System.out.println("Insira a altura da pessoa:");
            altura[contador] = teclado.nextFloat();
            System.out.println("Inisira o sexo: ");
            sexo[contador] = teclado.next().charAt(0);  
        }
        float maiorAltura = altura[0]; 
        char sexoMaiorAltura= sexo[0];
        float menorAltura = altura[0];
        char sexoMenorAltura= sexo[0];
                 
        System.out.println("***********************************");
        for(int i = 1; i < tamanho; i++){
            
            if(altura[i] > maiorAltura){
              maiorAltura = altura[i];
              sexoMaiorAltura = sexo[i];
            }
          
            if(altura[i] < menorAltura){
               maiorAltura = altura[i];
               sexoMaiorAltura = sexo[i];
            }
            
        }
        System.out.println("**********************************");
        System.out.println("A maior altura e : " + maiorAltura +" Sexo: "+sexoMaiorAltura);
        System.out.println("A menor altua e : " + menorAltura +" Sexo: "+sexoMenorAltura);
    }
}
