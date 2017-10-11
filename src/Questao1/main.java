package Questao1;

import java.util.Scanner;

public class main{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.out.println("Insira o Valor Inicial da Conta");
        conta.saldo = sc.nextDouble();

    }
}


/*
Codifique um programa na Linguagem Java que:
a. Crie uma classe Conta;
b. Adicione o atributo saldo;
c. Crie os métodos getSaldo(), deposita(double) e saca(double);
d. Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida pelo usuário;
e. Crie as classes ContaCorrente e ContaPoupanca. Ambas são filhas da classe Conta: A ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve atualizar-se com o triplo da taxa. Além disso, a ContaCorrente deve reescrever o método deposita, a fim de retirar uma taxa bancária de dez centavos de cada depósito.
f. Reescreva o método atualiza na classe ContaCorrente, seguindo o item e.
Repare que, para acessar o atributo saldo herdado da classe Conta, você vai precisar trocar o modificador de visibilidade de saldo para protected.
g. Reescreva o método atualiza na classe ContaPoupanca, seguindo o item e:
h. Na classe ContaCorrente, reescreva o método deposita para descontar a taxa bancária de dez centavos;
i. Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado. Após imprimir o saldo (getSaldo()) de cada uma das contas, o que acontece?
j. Execute o código anterior da seguinte maneira:
Conta c = new Conta();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();
Compila? Roda? O que muda? Qual é a utilidade disso?
*/