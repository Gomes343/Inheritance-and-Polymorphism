package InheritanceAndPolymorphism;
public class main {
   public static void main(String[]args){
   
   Humano h = new Humano("Charles Darwin");
   Biologo b = new Biologo();
   
   //System.out.println(h.nome);
   
   b.analisar(h);
   
   
   }
}
