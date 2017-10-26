package Question3;
public class TesteAnimais{
   public static void main(String[]args){
      
      Mamifero a0 = new Mamifero("Camelo","amarelo","False",150,2,4);
      Peixe a1 = new Peixe("Tubarão","Barbatanas e cauda",300, (float)1.50);
      Mamifero a2 = new Mamifero("Urso-do-Canará","Vermelho","Mel",180,(float)0.5,4);
   
      System.out.println(a0.dados());
      System.out.println(a1.dados());
      System.out.println(a2.dados());
   }
}
