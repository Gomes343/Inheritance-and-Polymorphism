
package Question4;
public class Main {
   public static void main(String[]args){
      
       
      /* 
      Funcionario teste = new Funcionario();
      teste.salario = 2;
      notification: salario has private acess in Funcionario
      */
      
      Funcionario f1 = new Funcionario();
      Funcionario f2 = new Funcionario("Murilo");
      
      f2.setSalario(100);
       System.out.println(f2.getSalario());
   }
}
