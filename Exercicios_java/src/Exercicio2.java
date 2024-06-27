

/*
2. Escreva um algoritmo que receba o valor do salário bruto, calcule e apresente o valor de desconto do 
INSS e o valor do salário líquido (o salário bruto descontado do INSS), considerando que: 

Para um salário de até R$ 420, o desconto de INSS é de 8%; 
Para um salário de até R$ 420 até R$ 1350, o desconto de INSS é de 9%; 
Para um salário acima de R$ 1350,00, o desconto de INSS é de 10%; 

 */

import java.util.Scanner;

public class Exercicio2 {
    public void calcular_Salario(){
        Scanner entrada_dados= new Scanner(System.in);
       System.out.println("Digite o salário Bruto: ");
       float salario_bruto = entrada_dados.nextFloat();
       
       if(salario_bruto <420){
           float desconto = (salario_bruto * 8)/100;
           float salario_liquido= salario_bruto - desconto;
           System.out.println("O desconto de INSS de 8% corresponde:"+desconto);
           System.out.println("O salário bruto descontado do INSS é de: "+salario_liquido);
           
       }else if(salario_bruto >=420 && salario_bruto < 1350){
           float desconto = (salario_bruto * 9)/100;
           float salario_liquido= salario_bruto - desconto;
           
            System.out.println(" O desconto de INSS de 9% corresponde:"+desconto);
           System.out.println("O salário bruto descontado do INSS é de: "+salario_liquido);
           
       }else if(salario_bruto >1350 ){
           float desconto = (salario_bruto * 10)/100;
           float salario_liquido= salario_bruto - desconto;
            System.out.println("O desconto de INSS de 10% corresponde:"+salario_bruto);
           System.out.println("O salário bruto descontado do INSS é de: "+salario_liquido);
       }
    }
   
}
