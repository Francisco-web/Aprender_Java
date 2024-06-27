import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pedir para digitar um valor qualquer inteiro;
        System.out.println("Digite um valor a ser inserido (maximo 10): ");
        int n = teclado.nextInt();

        //inicio da condicao 
        if(n > 0 && n <= 10){
            int[] numero = new int[n];

            //Solicitar ao usuario para intruduzir os valores
                for(int i = 0 ; i < n ; i++){
                    System.out.println("Digite o valor # "+(i+1)+":");
                        numero[i] = teclado.nextInt();

                }
                //Agora vamos encontrar o maior valor
                int menor =numero[0];
                int maior = numero[0];
                int soma = 0;

                for (int j=0; j<n; j++){
                    if(numero[j] < menor){
                        menor = numero[j];
                    }
                    if(numero[j] > maior){
                        maior = numero[j];
                    }
                    soma += numero[j];
                }

                //Calcular a media
                double media = (double) soma / n;

                //Apresentacao dos resultados
                System.out.println("Todos os numeros introduzidos: ");
                for( int num : numero){
                    System.out.print(num+" ");

                }
                System.out.println("\n Menor valor introduzido: "+menor);
                    System.out.println("Maior valor introduzido: "+maior);
                    System.out.println("Media dos valores introduzidos: "+media);
        }//fim da condicao IF
        else{
            System.out.println("A quantidade de valores inseridos nao e valido.O programa sera encerrado.");
        }
        teclado.close();
    }
}
