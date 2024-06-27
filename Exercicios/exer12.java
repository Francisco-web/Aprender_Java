import java.util.Scanner;
public class exer12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cidades = 3;
        String[] codigo_cidade = new String[cidades];
        int[] numeros_de_veiculos = new int[cidades];
        int[] numero_de_acidentes= new int[cidades];

        int contador=0;
        while(contador < cidades){
            System.out.println("Digite o codigo da cidade:");
            codigo_cidade[contador] = entrada.nextLine();
            System.out.println("Digite o numero de veiculos:");
            numeros_de_veiculos[contador] = entrada.nextInt();
            System.out.println("Digite o codigo da cidade:");
            numero_de_acidentes[contador] = entrada.nextInt();
            contador++;

        }

for(int i=0; i<cidades;i++)
{
    System.out.println(codigo_cidade[i]+numero_de_acidentes[i]+numeros_de_veiculos[i]);
}
        
        
    }
    
}
