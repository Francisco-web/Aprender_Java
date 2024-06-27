
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FranKlin Clever
 */
public class Exercicio12 {
     Scanner entrada_dados = new Scanner(System.in);
    int num_cidade = 5,num_total_veiculo;
    int[] num_veiculo = new int[num_cidade],
            num_acidentes = new int[num_cidade];
    
    String[] cod_cidade = new String[num_cidade];
    
    //alinea C
        int num_total_acidentes_com_dois_mil_veiculo = num_acidentes[0];
        int num_cidade_com_dois_mil_veiculo = 0;
        float media_de_acidentes_com_dois_mil_veiculo = 0;
    //alinea C
    
    public void coletar(){
        System.out.println("=== Estatistica de Acidentes nas 5 cidades do brazil ===");
        //inserir dados as variáveis
        for(int i = 0 ; i < num_cidade ; i++)
        {
            System.out.println("Codigo da Cidade: ");
            cod_cidade[i] = entrada_dados.next();
            System.out.println("Número de veiculo de passeio: ");
            num_veiculo[i] = entrada_dados.nextInt();
            System.out.println("Número de Acidentes de trânsito com vitima: ");
            num_acidentes[i] = entrada_dados.nextInt();
            
            System.out.println("////////////////////////////////////////");
            
            num_total_veiculo += num_veiculo[i];
            
            if(num_veiculo[i] < 2000){
               num_cidade_com_dois_mil_veiculo ++;
                num_total_acidentes_com_dois_mil_veiculo += num_acidentes[i];
               
                media_de_acidentes_com_dois_mil_veiculo = 
                        num_total_acidentes_com_dois_mil_veiculo/num_cidade_com_dois_mil_veiculo;
            }
        }
        
        //encontrar o maior e menor indice de acidente e a repectiva cidade
        //alinea A
        int menor_indice_acidente = num_acidentes[0];
        int maior_indice_acidente = num_acidentes[0];
        String cod_cidade_maior_acidente = cod_cidade[0];
        String cod_cidade_menor_acidente = cod_cidade[0];
        //fim alinea A
        
        //alinea B
        float media_veiculos_cinco_cid = 0;
        //Fim linha B
        
        
        for (int j=0; j<num_cidade; j++){
            if(num_acidentes[j] < menor_indice_acidente){
                menor_indice_acidente = num_acidentes[j];
                cod_cidade_menor_acidente = cod_cidade[j];
            }
            if(num_acidentes[j] > maior_indice_acidente){
                maior_indice_acidente = num_acidentes[j];
                cod_cidade_maior_acidente = cod_cidade[j];
            }
        }
        

        System.out.println(" O maior indice de acidentes é: "+maior_indice_acidente
                +" Codigo da Cidade: "+cod_cidade_maior_acidente);
        
        System.out.println(" O menor indice de acidentes é: "+menor_indice_acidente
                +" Codigo da Cidade: "+cod_cidade_menor_acidente);
        
        System.out.println("b) Total de veiculos nas "+num_cidade+" cidades é: "+num_total_veiculo);
        media_veiculos_cinco_cid = num_total_veiculo/num_cidade;
        System.out.println("Média de veiculos nas"+num_cidade+" cidade: "+media_veiculos_cinco_cid);
        
         System.out.println("C) Total e Media de acidentes de transito nas cidade com menor de 2000 veiculos");
         System.out.println("Numero de cidade: "+num_cidade_com_dois_mil_veiculo);
         System.out.println("Total de Acidentes: "+num_total_acidentes_com_dois_mil_veiculo);
         System.out.println("Média de Acidentes: "+media_de_acidentes_com_dois_mil_veiculo);
    }
}
