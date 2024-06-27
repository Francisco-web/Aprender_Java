
import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
       //Inicializando os arrays para armazenar altura e sexos
       double[] alturas = new double[3];
       char[] sexos = new char[3];
       
       Scanner scanner = new Scanner(System.in);

       //Lendo e armazendo as alturas e sexos no arrays
       for(int i = 0; i < 3; i++){
        System.out.println("Digite a altura pessoa "+ (i+1) + ":");
        alturas[i] = scanner.nextDouble();
        System.out.println("Digite o sexo da pessoa "+(i+1) +"(M/F):");
        sexos[i] = scanner.next().charAt(0);
       }
       //armazernar as variavies 
       double maior_altura = alturas[0];
       char maior_sexos =sexos[0];
       double menor_altura = alturas[0];
       char menor_sexos = sexos[0];
       double soma_altura_masculina = 0;
       double soma_altura_femenino = 0;
       int quantidade_feminino = 0;
       int quantidade_masculina = 0;
       double media_altura_feminino =0;
       double media_altura_masculina = 0;
      double quantidade_total_genero =0;
  
       // aqui vamos utilizar a estrutura de repiticao FOR para se saber a maior altura e sexo
       for(int i = 0; i < 3; i++){
        // estrutura condicional para verificar a maior altura e sexo
        if(alturas[i] > maior_altura){
            maior_altura = alturas[i];
            maior_sexos = sexos[i];
        }
        // estrutura condicionar para determinar a menor altura e sexo;
         if(alturas[i] < maior_altura){
            menor_altura = alturas[i];
            menor_sexos = sexos[i];
        }
        // estrutura condicionar para determinar a quantidade de altura para feminino
         if(sexos[i] == 'F' || sexos[i] == 'f'){
            soma_altura_femenino += alturas[i];
            quantidade_feminino++;
          
        }
        //estrutura condicional para determinar a quantidade de altura masculino;
        else if(sexos[i] == 'M' || sexos[i]=='m'){
            soma_altura_masculina += alturas[i];
            quantidade_masculina++;
          

        }
     }//fim da estrutura de repeticao For;
     //aqui baixo iremos calcular a media da altura e do sexo ;
    if(soma_altura_femenino == 0){
        soma_altura_femenino = 0;
    } else
         media_altura_feminino = soma_altura_femenino / quantidade_feminino;
    
    if(soma_altura_masculina == 0){
        soma_altura_masculina = 0;
    }
     media_altura_masculina = soma_altura_masculina / quantidade_masculina;

     quantidade_total_genero = quantidade_feminino + quantidade_masculina ;

     //aqui iremos visualizar a saida dos dados
     System.out.println("Maior altura: "+maior_altura+ " - Sexo: "+maior_sexos);
     System.out.println("Menor altura: "+menor_altura+ " - Sexo: "+menor_sexos);
     System.out.println("Media de altura do sexo feminino: "+ media_altura_feminino);
     System.out.println("Media de altura masculino: "+media_altura_masculina);
     System.out.println("Total de sexo feminino:" +quantidade_feminino);
     System.out.println("Total de sexo masculino: " +quantidade_masculina);
    System.out.println("A quantidade de genero digitado: "+quantidade_total_genero);
     }
 }
