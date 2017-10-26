package Question3;
public class Main {
   public static void main (String[]args){
/*
Um animal contém um nome, comprimento, número de patas (o padrão é 4), uma cor, ambiente e uma velocidade (em m/s).
Um peixe é um animal, tem 0 patas, o seu ambiente é o mar (padrão), cor cinzenta (padrão). Além disso, o peixe tem como característica: barbatanas e cauda.
Um mamífero é um animal, o seu ambiente é a terra (padrão). Um urso é um mamífero, cor castanho e o seu alimento preferido é o mel.
Codifique as classes animal, peixe e mamífero.
       
a. Para a classe Animal, codifique os métodos:
Animal (String nome, String cor, String ambiente, int comprimento, float velocidade, int patas);
void alteraNome(String nome);
void alteraComprimento(int comprimento);
void alteraPatas(int patas);
void alteraCor(String cor);
void alteraAmbiente(String ambiente);
void alteraVelocidade(float elocidade);

b. E os seus atributos são:
String nome( );
int comprimento( );
int patas( );
String cor( );
String ambiente( );
float velocidade( );
void dados( ); // imprime os dados do animal

c. Para a classe Peixe, codifique:
Peixe(String nome, String caracteristica, int comprimento, float velocidade);
void alteraCaracteristica(String caracteristica);
String caracteristica( ); // retorna a características de um determinado peixe;
void dados( ); // imprimir na tela todos os dados

d. Para a classe Mamifero, codifique:
Mamifero(String nome,String cor,String alimento,int comprimento, float velocidade, int patas);

void alteraAlimento(String alimento);
String alimento( ); // retorna o alimento de um determinado uso;
void dados( ); // imprimir na tela todos os dados

e. Por último, crie um arquivo de teste (por exemplo TesteAnimais.java) de forma a ter um jardim zoológico com os seguintes animais: camelo, tubarão, urso-do-Canadá.

Exemplo de execução:
Zoo:
------------------------------ 
Animal: Camelo 
Comprimento: 150 cm 
Patas: 4 
Cor: amarelo 
Ambiente: Terra 
Velocidade: 2.0 m/s
------------------------------ 
Animal: Tubarão 
Comprimento: 300 cm 
Patas: 0 
Cor: Cinzento 
Ambiente: Mar 
Velocidade: 1.5 m/s 
Característica: Barbatanas e cauda. 
------------------------------ 
Animal: Urso-do-Canadá 
Comprimento: 180 cm 
Patas: 4 
Cor: Vermelho 
Ambiente: Terra 
Velocidade: 0.5 m/s 
Alimento: Mel 
------------------------------

f. Faça outro arquivo (TesteAnimais2.Java) para que possam ser incluídos quantos animais o usuário desejar, no máximo 10 animais de cada espécie.

*DICA: Utilize vetores de objetos
*/ 
   }
}
