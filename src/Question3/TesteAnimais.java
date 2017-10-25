package Question3;
public class TesteAnimais {
   public static void testeAnimais(String[]args){
      
      Animal[] animais = new Animal[2];   
      Animal a0 = new Animal("Camelo",150,4,"amarelo","Terra",2);
      Animal a1 = new Animal("Tubarão",300,0,"Cinzento","Mar", (float)1.50);
      Animal a2 = new Animal("Urso-do-Canará",180,4,"Vermelho","Terra", (float)0.5);
      
      animais[0] = a0;
      animais[1] = a1;
      animais[2] = a2;

      for (int i = 0; i < 2; i++){
        animais[i].dados();
      }
   }
}
