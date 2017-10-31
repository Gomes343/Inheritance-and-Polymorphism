package Question6;
public class Maquina{
    
    public Produtos[] produtos = new Produtos[10];
    protected float dinheiro;
    int contadorProdutos = 0;
    
    /*
    public void adicionarProdutos(String n, int v){
        produtos[contadorProdutos] = new Produtos(n,v);
        contadorProdutos =+ 1;
    }  */ 

    public void listarProdutos(){
        for(int i = 0; i < contadorProdutos ; i++){
            System.out.println("Nome Produto: "+produtos[i].nome+"  Valor Produto: "+produtos[i].valor);
        }

    }


    
}
