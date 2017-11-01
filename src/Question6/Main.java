package Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);        
        Maquina m = new Maquina();
        Operador op = new Operador(m);
        int choice = 0;
        
        op.adicionarProdutos("CocaCola", 4);
        op.adicionarProdutos("Chocolate", 3);
        op.adicionarProdutos("Bolacha", 2);

        System.out.println("Seja Bem vindo ao Caixa Automático!");
        System.out.println("-----------------------------------");
        
        for (String a = null; a != "fim";){
        System.out.println("Digite o número da opção desejada:");
        System.out.println("1. LISTAR PRODUTOS");
        System.out.println("2. INSERIR MOEDAS");
        System.out.println("3. SAIR");
        
        choice = sc.nextInt();
        
            switch (choice) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("----- PRODUTOS -----");
                    m.listarProdutos();  
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    System.out.println("Insira a quantidade de moedas: ");                    
                    m.inserirMoeda(sc.nextInt());
                    break;
                case 3:
                    a = "fim";
                    break;
                default:
                    System.out.println("Esta não é uma opção válida!");
            }
        }
    }
}
