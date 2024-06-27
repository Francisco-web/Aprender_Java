import java.util.Scanner;
public class exer2 {
 
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double desconto;
        double salario_liquido;
        System.out.println("Digite o seu salario bruto: ");
        double salario_bruto = teclado.nextDouble();
        if(salario_bruto < 420 ){
            desconto = salario_bruto * 0.08;
        }
        else if(salario_bruto == 420 && salario_bruto <=1350){
            desconto = salario_bruto * 0.09;
        }
        else{
            desconto = salario_bruto * 0.10;
        }
        salario_liquido = salario_bruto - desconto;
        System.out.println("O desconto do INSS e: "+desconto+" E o valor do salario liquido: "+salario_liquido);
    }
}
