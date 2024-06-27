
import java.util.Scanner;

/*
Uma loja que comercializa sapatos está promover uma grande promoção, está oferencer desconto especial
de acordo a idade do cliente.

Escreva um programa em JAVA para ler a idade do cliente e o preço do sapato. Calcule e exiba o 
valor do desconto e o preço final do sapato. 
idade <=18 -> 10
idade >18 -> 18 
*/
public class exercicio1_1 {
    Scanner entrada_dados= new Scanner(System.in);
    public void loja(){
      System.out.println("::::: Loja de Calçados :::::");
        System.out.println("");

       System.out.println("Insira a sua idade: ");
       int idade_cliente= entrada_dados.nextInt();
       System.out.println("Preço do Produto:");
       float preco_produto = entrada_dados.nextFloat();

       if(idade_cliente <=18){

        float desconto = (preco_produto * 10)/100;
        float preco_final = preco_produto - desconto;
        System.out.println("O desconto:"+desconto);
        System.out.println("Você tem "+idade_cliente+" de Idade.");
        System.out.println("Preço total do Produto: "+preco_final);

       }else if(idade_cliente >=19){
        float desconto = (preco_produto * 20)/100;
        float preco_final = preco_produto - desconto;
        System.out.println("O desconto:"+desconto);
        System.out.println("Você tem "+idade_cliente+" de Idade.");
        System.out.println("Preço total do Produto: "+preco_final);
       }
    } 
}
