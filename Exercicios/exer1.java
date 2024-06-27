import java.util.Scanner;
public class exer1{
    
    public static void main(String[] args){
        Scanner Teclado = new Scanner(System.in);
        //Aqui vai ficar armazenado as variaveis
        double desconto;
        double precoFinal;
        //Aqui sera armazenado a variavel idade
        System.out.println("Digite a sua idade; ");
        int idade = Teclado.nextInt();
        //Aqui vai receber a variavel preco
        System.out.println("Digite o preco do sapato: ");
        double preco = Teclado.nextDouble();
        //Aqui sera feito a logica do programa com a condicao if else
        if(idade <= 18){
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.2;
        }
        precoFinal =   preco - desconto;
        System.out.println("O preco do desconto :"+desconto+" O preco final :"+precoFinal);
    }
}