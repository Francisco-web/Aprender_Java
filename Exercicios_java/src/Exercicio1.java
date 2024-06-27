
import java.util.Scanner;



public class Exercicio1 {
  
    
       
    public static void main(String[] args){
        Scanner entrada_dados= new Scanner(System.in);
        boolean contador= true;
        do{
            System.out.println("");
            System.out.println("Escolha os exercicios a Executar:");
            System.out.println("1.Exercicío");
            System.out.println("2.Exercicío");
            System.out.println("3.Exercicío");
            System.out.println("4.Exercicío");
            System.out.println("12.Exercicío");
            System.out.println("0.Sair");
            int opcao=entrada_dados.nextInt();

            switch(opcao){
            case 1:
                exercicio1_1 Ex1 = new exercicio1_1();
                Ex1.loja();
            break;
            case 2:
                Exercicio2 Ex2= new Exercicio2();
                Ex2.calcular_Salario();
            break;
            case 3:
                Exercicio3 Ex3= new Exercicio3();
                Ex3.calcular();
            break;
            case 4:
                Exercicio4 Ex4= new Exercicio4();
                Ex4.mostrar();
            break;
            case 12:
                Exercicio12 Ex12= new Exercicio12();
                Ex12.coletar();
            break;
            case 0:
                System.out.println("Você saiu do Sistema de Exercicio");
                contador= false;
            break;
            }
        }while(contador == true);
    }
}
   
