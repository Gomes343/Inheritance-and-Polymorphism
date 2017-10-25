package Question3;

public class Mamifero extends Animal{
   
   String alimento;
    
   public Mamifero(String nome, String cor,String alimento, int comprimento, float velocidade){
      super.nome = nome;
      this.alimento = alimento;
      super.cor = cor;
      super.comprimento = comprimento;
      super.velocidade = velocidade;       
   }
   
   public void alterarAlimento(String a){
       alimento = a;
   }
   
   public String alimento(){
      return alimento;
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
              "Alimento: "+alimento+"\n";
   }  
  
   
}
