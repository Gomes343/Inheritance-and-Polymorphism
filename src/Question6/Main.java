package Question6;
public class Main {
    public static void main(String[]args){
        Maquina m = new Maquina();
        Operador op = new Operador();
        
       op.adicionarProdutos("teste", 2);

       m.listarProdutos();
        
        System.out.println(op.produtos[0].nome);
        
    }
}
