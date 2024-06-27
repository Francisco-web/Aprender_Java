import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior=0;
        while (true){
            System.out.println("Digite um valor inteiro: ");
            int numero = teclado.nextInt();
            if(numero == 0){
                break;
            }
            else if(numero > maior){
                maior = numero;
            }

        }
        System.out.println("O maior numero digitado foi: "+maior);

    }
}
