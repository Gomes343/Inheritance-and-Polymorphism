package Question3;

import java.util.Scanner;

public class TesteAnimais2 {
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);       
      Peixe[] peixes = new Peixe[9];
      Mamifero[] mamiferos = new Mamifero[9];

      String nome,carac,teste = "sim",cor,alimento;
      int compr,patas;
      float velo;
      

      for(int i = 0 ; "sim".equals(teste); i++ ){
          
          System.out.println("Insira o Nome do Peixe: ");
          nome = sc.nextLine();
          System.out.println("Insira a Caracteristica do Peixe: ");
          carac = sc.nextLine();
          System.out.println("Insira o Comprimento do Peixe: ");
          compr = sc.nextInt();
          System.out.println("Insira a Velocidade do Peixe: ");
          velo = sc.nextFloat();
          
          
          peixes[i] = new Peixe(nome,carac,compr,velo);
          
          System.out.println("Peixe Criado e Adicionado ao Zoológico!");
          
          System.out.println("Gostaria de adicionar mais um? Lembrando limite de 10");
          sc.nextLine();
          teste = sc.nextLine();
           
      }
    
      
      for(int i = 0; i<mamiferos.length; i++){
          
          System.out.println("Insira o Nome do Mamifero: ");
          nome = sc.nextLine();
          System.out.println("Insira a Cor do Mamifero: ");
          cor = sc.nextLine();
          System.out.println("Insira qual o Alimento do Mamifero: ");
          alimento = sc.nextLine();
          System.out.println("Insira o Comprimento do Mamifero: ");
          compr = sc.nextInt();
          System.out.println("Insira a Velocidade do Mamifero: ");
          velo = sc.nextFloat();
          System.out.println("Insira a quantidade de Patas do Mamifero: ");
          patas = sc.nextInt();          
          
          mamiferos[i] = new Mamifero(nome,cor,alimento,compr,velo,patas);
          
          System.out.println("Mamifero Criado e Adicionado ao Zoológico!");

          System.out.println("Gostaria de adicionar mais um? Lembrando limite de 10");
          sc.nextLine();
          teste = sc.nextLine();
            if("nao".equals(teste)){
                break;
            }
      }

      
       for (Peixe peixe : peixes) {
           if(peixe){
               break;
           }
           peixe.dados();
       }
      
       for (Mamifero mamifero : mamiferos) {
           mamifero.dados();
       }

   }
}
