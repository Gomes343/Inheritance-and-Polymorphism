package Question3;
public class Animal{
   
   protected String nome;
   protected int comprimento;
   protected int patas;
   protected String cor;
   protected String ambiente;
   protected float velocidade;
   
   public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade){
       this.nome = nome;
       this.comprimento = comprimento;
       this.patas = patas;
       this.cor = cor;
       this.ambiente = ambiente;
       this.velocidade = velocidade;
   }
   
   public void alterarNome(String n){
      nome = n;
   }
   
   public void alterarComprimento(int c){
       comprimento = c;
   }
   
   public void alterarPatas(int p){
       patas = p;
   }
   
   public void alterarCor(String cc){
      cor = cc;
   }
   
   public void alterarAmbiente(String a){
       ambiente = a;
   }
   
   public void alterarVelocidade(float v){
       velocidade = v;
   }
   
   public String dados(){
      return 
              "------------------------------\n"+
              "Animal: "+nome+"\n"+
              "Comprimento: "+comprimento+"\n"+
              "Patas: "+patas+"\n"+
              "Cor: "+cor+"\n"+
              "Ambiente: "+ambiente+"\n"+
              "Velocidade: "+velocidade+"\n";
   }  
}
