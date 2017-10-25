package Question3;
public class Peixe extends Animal{
   
   String caracteristica;
   
   public Peixe(String nome, String caracteristica, int comprimento, float velocidade) { 
       super.nome = nome;
       this.caracteristica = caracteristica;
       super.comprimento = comprimento;
       super.velocidade = velocidade;
   }
   
   public void alterarCaracteristica(String c) {
       caracteristica = c;
   }
   
   public String caracteristica(){
       return caracteristica;
   }
   
   public String dados(){
      return 
              "------------------------------\n"+
              "Animal: "+super.nome+"\n"+
              "Comprimento: "+super.comprimento+"\n"+
              "Patas: "+super.patas+"\n"+
              "Cor: "+super.cor+"\n"+
              "Ambiente: "+super.ambiente+"\n"+
              "Velocidade: "+super.velocidade+"\n"+
              "Caracteristica: "+caracteristica+"\n";
   }  
   
}
